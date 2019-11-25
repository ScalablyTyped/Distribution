package typings.feedparser.feedparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enclosure extends js.Object {
  var length: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: String
}

object Enclosure {
  @scala.inline
  def apply(url: String, length: String = null, `type`: String = null): Enclosure = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enclosure]
  }
}

