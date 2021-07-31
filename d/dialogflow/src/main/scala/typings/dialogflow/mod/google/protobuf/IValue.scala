package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Value. */
trait IValue extends StObject {
  
  /** Value boolValue */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Value listValue */
  var listValue: js.UndefOr[IListValue | Null] = js.undefined
  
  /** Value nullValue */
  var nullValue: js.UndefOr[
    NullValue | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.NullValue * / any */ String) | Null
  ] = js.undefined
  
  /** Value numberValue */
  var numberValue: js.UndefOr[Double | Null] = js.undefined
  
  /** Value stringValue */
  var stringValue: js.UndefOr[String | Null] = js.undefined
  
  /** Value structValue */
  var structValue: js.UndefOr[IStruct | Null] = js.undefined
}
object IValue {
  
  @scala.inline
  def apply(): IValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValue]
  }
  
  @scala.inline
  implicit class IValueMutableBuilder[Self <: IValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setListValue(value: IListValue): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListValueNull: Self = StObject.set(x, "listValue", null)
    
    @scala.inline
    def setListValueUndefined: Self = StObject.set(x, "listValue", js.undefined)
    
    @scala.inline
    def setNullValue(
      value: NullValue | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.NullValue * / any */ String)
    ): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueNull: Self = StObject.set(x, "nullValue", null)
    
    @scala.inline
    def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    @scala.inline
    def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberValueNull: Self = StObject.set(x, "numberValue", null)
    
    @scala.inline
    def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    @scala.inline
    def setStructValue(value: IStruct): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructValueNull: Self = StObject.set(x, "structValue", null)
    
    @scala.inline
    def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
  }
}
