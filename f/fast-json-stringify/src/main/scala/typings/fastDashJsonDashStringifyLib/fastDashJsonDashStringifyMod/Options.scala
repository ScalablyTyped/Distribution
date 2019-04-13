package typings
package fastDashJsonDashStringifyLib.fastDashJsonDashStringifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Configure Ajv, which is used to evaluate conditional schemas and combined (anyOf) schemas
    */
  var ajv: js.UndefOr[ajvLib.ajvMod.Options] = js.undefined
  /**
    * Optionally add an external definition to reference from your schema
    */
  var schema: js.UndefOr[stdLib.Record[java.lang.String, Schema]] = js.undefined
  /**
    * Uglify the generated serialization function to get a performance increase on Node.js versions lower than 8.3.0
    */
  var uglify: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ajv: ajvLib.ajvMod.Options = null,
    schema: stdLib.Record[java.lang.String, Schema] = null,
    uglify: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ajv != null) __obj.updateDynamic("ajv")(ajv)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (!js.isUndefined(uglify)) __obj.updateDynamic("uglify")(uglify)
    __obj.asInstanceOf[Options]
  }
}

