package typings.googleapis.buildSrcApisCloudfunctionsV1Mod.cloudfunctions_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the `CallFunction` method.
  */
@js.native
trait Schema$CallFunctionRequest extends js.Object {
  /**
    * Input to be passed to the function.
    */
  var data: js.UndefOr[String] = js.native
}

object Schema$CallFunctionRequest {
  @scala.inline
  def apply(data: String = null): Schema$CallFunctionRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CallFunctionRequest]
  }
}

