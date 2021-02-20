package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordType extends Type_ {
  
  var fields: js.Array[Type_] = js.native
  
  var `type`: typings.doctrine.doctrineStrings.RecordType = js.native
}
object RecordType {
  
  @scala.inline
  def apply(fields: js.Array[Type_], `type`: typings.doctrine.doctrineStrings.RecordType): RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordType]
  }
  
  @scala.inline
  implicit class RecordTypeMutableBuilder[Self <: RecordType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[Type_]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Type_ *): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.RecordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
