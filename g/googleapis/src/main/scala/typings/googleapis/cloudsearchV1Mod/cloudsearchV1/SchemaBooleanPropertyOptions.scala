package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for boolean properties.
  */
@js.native
trait SchemaBooleanPropertyOptions extends js.Object {
  /**
    * If set, describes how the boolean should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaBooleanOperatorOptions] = js.native
}

object SchemaBooleanPropertyOptions {
  @scala.inline
  def apply(operatorOptions: SchemaBooleanOperatorOptions = null): SchemaBooleanPropertyOptions = {
    val __obj = js.Dynamic.literal()
    if (operatorOptions != null) __obj.updateDynamic("operatorOptions")(operatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBooleanPropertyOptions]
  }
}

