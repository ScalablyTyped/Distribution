package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneChildContainer extends js.Object {
  /** The zone's nickname for the child container. */
  var nickname: js.UndefOr[String] = js.undefined
  /** The child container's public id. */
  var publicId: js.UndefOr[String] = js.undefined
}

object ZoneChildContainer {
  @scala.inline
  def apply(nickname: String = null, publicId: String = null): ZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (publicId != null) __obj.updateDynamic("publicId")(publicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneChildContainer]
  }
}

