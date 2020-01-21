package typings.googleapis.appstateV1Mod.appstateV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a requests which update app state
  */
@js.native
trait SchemaUpdateRequest extends js.Object {
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

object SchemaUpdateRequest {
  @scala.inline
  def apply(data: String = null, kind: String = null): SchemaUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateRequest]
  }
}

