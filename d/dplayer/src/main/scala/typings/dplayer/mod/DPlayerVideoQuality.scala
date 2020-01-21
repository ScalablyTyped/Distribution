package typings.dplayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerVideoQuality extends js.Object {
  var name: String
  var `type`: js.UndefOr[String] = js.undefined
  var url: String
}

object DPlayerVideoQuality {
  @scala.inline
  def apply(name: String, url: String, `type`: String = null): DPlayerVideoQuality = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerVideoQuality]
  }
}

