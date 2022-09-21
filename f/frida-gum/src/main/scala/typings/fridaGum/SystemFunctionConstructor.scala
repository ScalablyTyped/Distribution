package typings.fridaGum

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemFunctionConstructor
  extends StObject
     with Instantiable3[
      /* address */ NativePointerValue, 
      /* retType */ NativeFunctionReturnType, 
      /* argTypes */ js.Array[Any | NativeFunctionArgumentType], 
      SystemFunction[
        GetNativeFunctionReturnValue[NativeFunctionReturnType], 
        ResolveVariadic[
          Extract[
            GetNativeFunctionArgumentValue[js.Array[Any | NativeFunctionArgumentType]], 
            js.Array[Any]
          ]
        ]
      ]
    ]
     with Instantiable4[
      /* address */ NativePointerValue, 
      /* retType */ NativeFunctionReturnType, 
      /* argTypes */ js.Array[Any | NativeFunctionArgumentType], 
      (/* abiOrOptions */ NativeABI) | (/* abiOrOptions */ NativeFunctionOptions), 
      SystemFunction[
        GetNativeFunctionReturnValue[NativeFunctionReturnType], 
        ResolveVariadic[
          Extract[
            GetNativeFunctionArgumentValue[js.Array[Any | NativeFunctionArgumentType]], 
            js.Array[Any]
          ]
        ]
      ]
    ]
