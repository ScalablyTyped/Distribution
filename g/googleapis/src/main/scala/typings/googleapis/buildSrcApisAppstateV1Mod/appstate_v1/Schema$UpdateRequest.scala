package typings.googleapis.buildSrcApisAppstateV1Mod.appstate_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a requests which update app state
  */
@js.native
trait Schema$UpdateRequest extends js.Object {
  /**
    * The new app state data that your application is trying to update with.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string appstate#updateRequest.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$UpdateRequest {
  @scala.inline
  def apply(data: String = null, kind: String = null): Schema$UpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateRequest]
  }
}

