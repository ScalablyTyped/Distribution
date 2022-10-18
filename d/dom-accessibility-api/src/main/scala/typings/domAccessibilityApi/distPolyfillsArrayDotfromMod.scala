package typings.domAccessibilityApi

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPolyfillsArrayDotfromMod {
  
  @JSImport("dom-accessibility-api/dist/polyfills/array.from", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](iterable: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def default[T](iterable: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
