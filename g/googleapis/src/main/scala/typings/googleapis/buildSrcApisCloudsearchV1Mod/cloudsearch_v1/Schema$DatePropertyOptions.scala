package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for date properties.
  */
@js.native
trait Schema$DatePropertyOptions extends js.Object {
  /**
    * If set, describes how the date should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[Schema$DateOperatorOptions] = js.native
}

object Schema$DatePropertyOptions {
  @scala.inline
  def apply(operatorOptions: Schema$DateOperatorOptions = null): Schema$DatePropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DatePropertyOptions]
  }
}

