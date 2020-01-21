package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for date properties.
  */
@js.native
trait SchemaDatePropertyOptions extends js.Object {
  /**
    * If set, describes how the date should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaDateOperatorOptions] = js.native
}

object SchemaDatePropertyOptions {
  @scala.inline
  def apply(operatorOptions: SchemaDateOperatorOptions = null): SchemaDatePropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatePropertyOptions]
  }
}

