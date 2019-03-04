package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSource extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/web-source
  var code: java.lang.String
  /**
    * Default is 1.
    */
  var startLine: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object WebSource {
  @scala.inline
  def apply(code: java.lang.String, startLine: scala.Int | scala.Double = null, url: java.lang.String = null): WebSource = {
    val __obj = js.Dynamic.literal(code = code)
    if (startLine != null) __obj.updateDynamic("startLine")(startLine.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebSource]
  }
}

