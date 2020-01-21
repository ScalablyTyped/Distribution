package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for double properties.
  */
@js.native
trait SchemaDoublePropertyOptions extends js.Object {
  /**
    * If set, describes how the double should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaDoubleOperatorOptions] = js.native
}

object SchemaDoublePropertyOptions {
  @scala.inline
  def apply(operatorOptions: SchemaDoubleOperatorOptions = null): SchemaDoublePropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDoublePropertyOptions]
  }
}

