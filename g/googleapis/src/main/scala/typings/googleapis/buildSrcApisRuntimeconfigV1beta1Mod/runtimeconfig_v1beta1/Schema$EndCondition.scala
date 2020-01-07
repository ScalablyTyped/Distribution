package typings.googleapis.buildSrcApisRuntimeconfigV1beta1Mod.runtimeconfig_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The condition that a Waiter resource is waiting for.
  */
@js.native
trait Schema$EndCondition extends js.Object {
  /**
    * The cardinality of the `EndCondition`.
    */
  var cardinality: js.UndefOr[Schema$Cardinality] = js.native
}

object Schema$EndCondition {
  @scala.inline
  def apply(cardinality: Schema$Cardinality = null): Schema$EndCondition = {
    val __obj = js.Dynamic.literal()
    if (cardinality != null) __obj.updateDynamic("cardinality")(cardinality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EndCondition]
  }
}

