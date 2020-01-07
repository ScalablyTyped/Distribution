package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arg matchers for the mock function.
  */
@js.native
trait Schema$Arg extends js.Object {
  /**
    * Argument matches any value provided.
    */
  var anyValue: js.UndefOr[Schema$Empty] = js.native
  /**
    * Argument exactly matches value provided.
    */
  var exactValue: js.UndefOr[js.Any] = js.native
}

object Schema$Arg {
  @scala.inline
  def apply(anyValue: Schema$Empty = null, exactValue: js.Any = null): Schema$Arg = {
    val __obj = js.Dynamic.literal()
    if (anyValue != null) __obj.updateDynamic("anyValue")(anyValue.asInstanceOf[js.Any])
    if (exactValue != null) __obj.updateDynamic("exactValue")(exactValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Arg]
  }
}

