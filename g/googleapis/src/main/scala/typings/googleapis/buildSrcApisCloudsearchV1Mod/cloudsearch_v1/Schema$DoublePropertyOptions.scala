package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for double properties.
  */
@js.native
trait Schema$DoublePropertyOptions extends js.Object {
  /**
    * If set, describes how the double should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[Schema$DoubleOperatorOptions] = js.native
}

object Schema$DoublePropertyOptions {
  @scala.inline
  def apply(operatorOptions: Schema$DoubleOperatorOptions = null): Schema$DoublePropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DoublePropertyOptions]
  }
}

