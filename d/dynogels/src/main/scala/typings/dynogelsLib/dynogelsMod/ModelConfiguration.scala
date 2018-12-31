package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelConfiguration extends js.Object {
  var createdAt: js.UndefOr[scala.Boolean] = js.undefined
  var hashKey: java.lang.String
  var indexes: js.UndefOr[js.Array[_]] = js.undefined
  var log: js.UndefOr[Log] = js.undefined
  var rangeKey: js.UndefOr[java.lang.String] = js.undefined
  var schema: js.UndefOr[SchemaType] = js.undefined
  var tableName: js.UndefOr[java.lang.String | tableResolve] = js.undefined
  var timestamps: js.UndefOr[scala.Boolean] = js.undefined
  var updatedAt: js.UndefOr[java.lang.String] = js.undefined
  var validation: js.UndefOr[joiLib.joiMod.ValidationOptions] = js.undefined
}

