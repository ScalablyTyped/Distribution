package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UpdateSchemaRequest extends js.Object {
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[Schema$DebugOptions] = js.native
  /**
    * The new schema for the source.
    */
  var schema: js.UndefOr[Schema$Schema] = js.native
  /**
    * If true, the request will be validated without side effects.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}

object Schema$UpdateSchemaRequest {
  @scala.inline
  def apply(
    debugOptions: Schema$DebugOptions = null,
    schema: Schema$Schema = null,
    validateOnly: js.UndefOr[Boolean] = js.undefined
  ): Schema$UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateSchemaRequest]
  }
}

