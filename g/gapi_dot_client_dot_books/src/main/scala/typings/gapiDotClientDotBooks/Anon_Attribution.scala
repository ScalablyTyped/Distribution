package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribution extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Attribution {
  @scala.inline
  def apply(attribution: String = null, url: String = null): Anon_Attribution = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Attribution]
  }
}

