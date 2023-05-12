package typings.glimmerUtil

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibPlatformUtilsMod {
  
  @JSImport("@glimmer/util/dist/types/lib/platform-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@glimmer/util/dist/types/lib/platform-utils", "HAS_NATIVE_PROXY")
  @js.native
  val HAS_NATIVE_PROXY: Boolean = js.native
  
  @JSImport("@glimmer/util/dist/types/lib/platform-utils", "HAS_NATIVE_SYMBOL")
  @js.native
  val HAS_NATIVE_SYMBOL: Boolean = js.native
  
  inline def enumerableSymbol(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerableSymbol")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def exhausted(value: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("exhausted")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def expect[T](
    `val`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Maybe<T> */ Any,
    message: String
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expect")(`val`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def keys[T](obj: T): js.Array[/* keyof T */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[/* keyof T */ String]]
  
  @JSImport("@glimmer/util/dist/types/lib/platform-utils", "symbol")
  @js.native
  val symbol: js.Function1[/* key */ String, Any] = js.native
  
  inline def tuple[T /* <: js.Array[Lit] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def unreachable(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("unreachable")().asInstanceOf[js.Error]
  inline def unreachable(message: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("unreachable")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def unwrap[T](
    `val`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Maybe<T> */ Any
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  type Factory[T] = Instantiable1[/* args (repeated) */ Any, T]
  
  type Lit = js.UndefOr[String | Double | Boolean | Null | Unit | js.Object]
}
