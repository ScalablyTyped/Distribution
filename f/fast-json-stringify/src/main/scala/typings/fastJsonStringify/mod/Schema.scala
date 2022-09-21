package typings.fastJsonStringify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fastJsonStringify.mod.RefSchema
  - typings.fastJsonStringify.mod.StringSchema
  - typings.fastJsonStringify.mod.IntegerSchema
  - typings.fastJsonStringify.mod.NumberSchema
  - typings.fastJsonStringify.mod.NullSchema
  - typings.fastJsonStringify.mod.BooleanSchema
  - typings.fastJsonStringify.mod.ArraySchema
  - typings.fastJsonStringify.mod.TupleSchema
  - typings.fastJsonStringify.mod.ObjectSchema
*/
trait Schema extends StObject
object Schema {
  
  inline def ArraySchema(items: Schema | js.Object): typings.fastJsonStringify.mod.ArraySchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.fastJsonStringify.mod.ArraySchema]
  }
  
  inline def BooleanSchema(): typings.fastJsonStringify.mod.BooleanSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[typings.fastJsonStringify.mod.BooleanSchema]
  }
  
  inline def IntegerSchema(): typings.fastJsonStringify.mod.IntegerSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.fastJsonStringify.mod.IntegerSchema]
  }
  
  inline def NullSchema(): typings.fastJsonStringify.mod.NullSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("null")
    __obj.asInstanceOf[typings.fastJsonStringify.mod.NullSchema]
  }
  
  inline def NumberSchema(): typings.fastJsonStringify.mod.NumberSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.fastJsonStringify.mod.NumberSchema]
  }
  
  inline def ObjectSchema(): typings.fastJsonStringify.mod.ObjectSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("object")
    __obj.asInstanceOf[typings.fastJsonStringify.mod.ObjectSchema]
  }
  
  inline def RefSchema($ref: String): typings.fastJsonStringify.mod.RefSchema = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.fastJsonStringify.mod.RefSchema]
  }
  
  inline def StringSchema(): typings.fastJsonStringify.mod.StringSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.fastJsonStringify.mod.StringSchema]
  }
  
  inline def TupleSchema(items: js.Array[Schema]): typings.fastJsonStringify.mod.TupleSchema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.fastJsonStringify.mod.TupleSchema]
  }
}
