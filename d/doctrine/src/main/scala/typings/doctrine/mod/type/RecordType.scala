package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordType
  extends StObject
     with Type_ {
  
  var fields: js.Array[Type_]
  
  var `type`: typings.doctrine.doctrineStrings.RecordType
}
object RecordType {
  
  @scala.inline
  def apply(fields: js.Array[Type_]): RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RecordType")
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
