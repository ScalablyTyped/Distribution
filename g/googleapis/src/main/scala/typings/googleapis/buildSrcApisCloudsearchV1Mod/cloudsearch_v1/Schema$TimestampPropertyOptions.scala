package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for timestamp properties.
  */
@js.native
trait Schema$TimestampPropertyOptions extends js.Object {
  /**
    * If set, describes how the timestamp should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[Schema$TimestampOperatorOptions] = js.native
}

object Schema$TimestampPropertyOptions {
  @scala.inline
  def apply(operatorOptions: Schema$TimestampOperatorOptions = null): Schema$TimestampPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimestampPropertyOptions]
  }
}

