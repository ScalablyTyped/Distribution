package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for boolean properties.
  */
@js.native
trait Schema$BooleanPropertyOptions extends js.Object {
  /**
    * If set, describes how the boolean should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[Schema$BooleanOperatorOptions] = js.native
}

object Schema$BooleanPropertyOptions {
  @scala.inline
  def apply(operatorOptions: Schema$BooleanOperatorOptions = null): Schema$BooleanPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BooleanPropertyOptions]
  }
}

