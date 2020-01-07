package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a child container of a Zone.
  */
@js.native
trait Schema$ZoneChildContainer extends js.Object {
  /**
    * The zone&#39;s nickname for the child container.
    */
  var nickname: js.UndefOr[String] = js.native
  /**
    * The child container&#39;s public id.
    */
  var publicId: js.UndefOr[String] = js.native
}

object Schema$ZoneChildContainer {
  @scala.inline
  def apply(nickname: String = null, publicId: String = null): Schema$ZoneChildContainer = {
    val __obj = js.Dynamic.literal()
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (publicId != null) __obj.updateDynamic("publicId")(publicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ZoneChildContainer]
  }
}

