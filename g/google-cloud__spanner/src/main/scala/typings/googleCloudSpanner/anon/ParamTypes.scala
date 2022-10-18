package typings.googleCloudSpanner.anon

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.common.IStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamTypes extends StObject {
  
  var paramTypes: StringDictionary[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.Type */ Any
  ]
  
  var params: IStruct
}
object ParamTypes {
  
  inline def apply(
    paramTypes: StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.Type */ Any
    ],
    params: IStruct
  ): ParamTypes = {
    val __obj = js.Dynamic.literal(paramTypes = paramTypes.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamTypes]
  }
  
  extension [Self <: ParamTypes](x: Self) {
    
    inline def setParamTypes(
      value: StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify spannerClient.spanner.v1.Type */ Any
        ]
    ): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    inline def setParams(value: IStruct): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
