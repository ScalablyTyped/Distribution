package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Href extends js.Object {
  var href: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Anon_Href {
  @scala.inline
  def apply(href: String = null, `type`: String = null): Anon_Href = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Href]
  }
}

