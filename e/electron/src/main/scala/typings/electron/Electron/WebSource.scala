package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSource extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/web-source
  var code: String
  /**
    * Default is 1.
    */
  var startLine: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object WebSource {
  @scala.inline
  def apply(code: String, startLine: Int | Double = null, url: String = null): WebSource = {
    val __obj = js.Dynamic.literal(code = code)
    if (startLine != null) __obj.updateDynamic("startLine")(startLine.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebSource]
  }
}

