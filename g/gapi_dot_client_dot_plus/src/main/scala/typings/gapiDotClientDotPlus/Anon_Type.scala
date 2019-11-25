package typings.gapiDotClientDotPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  /** Media type of the link. */
  var `type`: js.UndefOr[String] = js.undefined
  /** URL of the link. */
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Type {
  @scala.inline
  def apply(`type`: String = null, url: String = null): Anon_Type = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type]
  }
}

