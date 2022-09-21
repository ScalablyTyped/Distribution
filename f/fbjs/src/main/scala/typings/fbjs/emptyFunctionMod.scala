package typings.fbjs

import typings.fbjs.fbjsBooleans.`false`
import typings.fbjs.fbjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyFunctionMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("fbjs/lib/emptyFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def thatReturns[T](arg: T): js.Function1[/* repeated */ Any, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("thatReturns")(arg.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, T]]
  
  inline def thatReturnsArgument[T](arg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("thatReturnsArgument")(arg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def thatReturnsFalse(): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("thatReturnsFalse")().asInstanceOf[`false`]
  
  inline def thatReturnsNull(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("thatReturnsNull")().asInstanceOf[Null]
  
  inline def thatReturnsThis(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("thatReturnsThis")().asInstanceOf[Any]
  
  inline def thatReturnsTrue(): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("thatReturnsTrue")().asInstanceOf[`true`]
}
