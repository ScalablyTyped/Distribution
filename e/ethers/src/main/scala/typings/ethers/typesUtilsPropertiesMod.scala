package typings.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsPropertiesMod {
  
  @JSImport("ethers/types/utils/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defineProperties[T](
    target: T,
    values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? T[K]} */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(target.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def defineProperties[T](
    target: T,
    values: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? T[K]} */ js.Any,
    types: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? string} */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(target.asInstanceOf[js.Any], values.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveProperties[T](
    value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P] | std.Promise<T[P]>} */ js.Any
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
}
