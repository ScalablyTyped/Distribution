package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArgument extends StObject {
  
  /**
    * Optional. Defaults to FIXED_TYPE.
    */
  var argumentKind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required unless argument_kind = ANY_TYPE.
    */
  var dataType: js.UndefOr[SchemaStandardSqlDataType] = js.undefined
  
  /**
    * Optional. Specifies whether the argument is input or output. Can be set for procedures only.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The name of this argument. Can be absent for function return argument.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaArgument {
  
  inline def apply(): SchemaArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArgument]
  }
  
  extension [Self <: SchemaArgument](x: Self) {
    
    inline def setArgumentKind(value: String): Self = StObject.set(x, "argumentKind", value.asInstanceOf[js.Any])
    
    inline def setArgumentKindNull: Self = StObject.set(x, "argumentKind", null)
    
    inline def setArgumentKindUndefined: Self = StObject.set(x, "argumentKind", js.undefined)
    
    inline def setDataType(value: SchemaStandardSqlDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
