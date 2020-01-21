package typings.googleapisCommon.schemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaItem extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  var additionalProperties: js.UndefOr[StringDictionary[SchemaItem]] = js.native
  var default: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var format: js.UndefOr[ParameterFormat] = js.native
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[StringDictionary[SchemaItem]] = js.native
  var properties: js.UndefOr[StringDictionary[SchemaItem]] = js.native
  var `type`: js.UndefOr[SchemaType] = js.native
}

