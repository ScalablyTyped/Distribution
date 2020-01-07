package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An environment variable to set for an action.
  */
@js.native
trait Schema$EnvVariable extends js.Object {
  /**
    * Deprecated, do not use.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * The name of the environment variable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the variable.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$EnvVariable {
  @scala.inline
  def apply(hidden: js.UndefOr[Boolean] = js.undefined, name: String = null, value: String = null): Schema$EnvVariable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EnvVariable]
  }
}

