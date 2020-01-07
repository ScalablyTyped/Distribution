package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible result values from the function mock invocation.
  */
@js.native
trait Schema$Result extends js.Object {
  /**
    * The result is undefined, meaning the result could not be computed.
    */
  var undefined: js.UndefOr[Schema$Empty] = js.native
  /**
    * The result is an actual value. The type of the value must match that of
    * the type declared by the service.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object Schema$Result {
  @scala.inline
  def apply(undefined: Schema$Empty = null, value: js.Any = null): Schema$Result = {
    val __obj = js.Dynamic.literal()
    if (undefined != null) __obj.updateDynamic("undefined")(undefined.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Result]
  }
}

