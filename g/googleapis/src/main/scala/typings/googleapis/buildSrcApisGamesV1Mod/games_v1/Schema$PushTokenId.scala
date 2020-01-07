package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.googleapis.Anon_Apnsdevicetoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a push token ID resource.
  */
@js.native
trait Schema$PushTokenId extends js.Object {
  /**
    * A push token ID for iOS devices.
    */
  var ios: js.UndefOr[Anon_Apnsdevicetoken] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#pushTokenId.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$PushTokenId {
  @scala.inline
  def apply(ios: Anon_Apnsdevicetoken = null, kind: String = null): Schema$PushTokenId = {
    val __obj = js.Dynamic.literal()
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PushTokenId]
  }
}

