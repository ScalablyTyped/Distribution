package typings.googleCloudSpanner.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Type
import typings.protobufjs.mod.common.IStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamTypes extends StObject {
  
  var paramTypes: StringDictionary[Type]
  
  var params: IStruct
}
object ParamTypes {
  
  inline def apply(paramTypes: StringDictionary[Type], params: IStruct): ParamTypes = {
    val __obj = js.Dynamic.literal(paramTypes = paramTypes.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamTypes]
  }
  
  extension [Self <: ParamTypes](x: Self) {
    
    inline def setParamTypes(value: StringDictionary[Type]): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    inline def setParams(value: IStruct): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
