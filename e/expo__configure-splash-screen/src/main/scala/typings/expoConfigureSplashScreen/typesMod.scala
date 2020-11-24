package typings.expoConfigureSplashScreen

import org.scalablytyped.runtime.TopLevel
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/configure-splash-screen/build/validators/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  type DeepRequired[T] = NonNullable[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: -? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.DeepRequired<T[K]> * / object}
    */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.DeepRequired with TopLevel[js.Any])
  
  type IsNever[T, Positive, Negative] = Negative | Positive
  
  type JsonShape[T] = IsNever[
    T, 
    scala.Nothing, 
    SNB | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.JsonShape<T[P]> * / object}
    */ typings.expoConfigureSplashScreen.expoConfigureSplashScreenStrings.JsonShape with TopLevel[js.Any]) | (js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @expo/configure-splash-screen.@expo/configure-splash-screen/build/validators/types.JsonShape<T[number]> */ js.Object
    ])
  ]
  
  type NonPrimitiveAndNonArrayKeys[T] = /* keyof T */ String
  
  type OptionalPromise[T] = js.Promise[T] | T
  
  type Primitive = js.UndefOr[SNB | js.BigInt | js.Symbol | Null]
  
  type SNB = String | Double | Boolean
}
