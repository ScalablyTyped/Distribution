package typings.formstate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("formstate/lib/internal/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce[T /* <: js.Function */](func: T, milliseconds: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def debounce[T /* <: js.Function */](func: T, milliseconds: Double, immediate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def isMapLike(thing: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMapLike")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromiseLike(arg: js.Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromiseLike")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
}
