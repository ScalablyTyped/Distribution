package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Struct. */
@js.native
trait IStruct extends StObject {
  
  /** Struct fields */
  var fields: js.UndefOr[StringDictionary[IValue] | Null] = js.native
}
object IStruct {
  
  @scala.inline
  def apply(): IStruct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStruct]
  }
  
  @scala.inline
  implicit class IStructMutableBuilder[Self <: IStruct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[IValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
