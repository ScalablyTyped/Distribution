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
    val __obj = js.Dynamic.literal(url = url)
    if (length != null) __obj.updateDynamic("length")(length)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Enclosure]
  }
}

