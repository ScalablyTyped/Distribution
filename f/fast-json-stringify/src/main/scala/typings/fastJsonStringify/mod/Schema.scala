package typings.fastJsonStringify.mod

import typings.fastJsonStringify.fastJsonStringifyStrings.`null`
import typings.fastJsonStringify.fastJsonStringifyStrings.`object`
import typings.fastJsonStringify.fastJsonStringifyStrings.array
import typings.fastJsonStringify.fastJsonStringifyStrings.boolean
import typings.fastJsonStringify.fastJsonStringifyStrings.integer
import typings.fastJsonStringify.fastJsonStringifyStrings.number
import typings.fastJsonStringify.fastJsonStringifyStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait Schema extends js.Object
object Schema {
  
  @scala.inline
  def TupleSchema(items: js.Array[Schema], `type`: array): Schema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def RefSchema($ref: String): Schema = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def BooleanSchema(`type`: boolean): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def NullSchema(`type`: `null`): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def ObjectSchema(`type`: `object`): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def NumberSchema(`type`: number): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def StringSchema(`type`: string): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def ArraySchema(items: Schema | js.Object, `type`: array): Schema = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  @scala.inline
  def IntegerSchema(`type`: integer): Schema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}
