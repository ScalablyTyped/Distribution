package typings.focusLock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UtilsSafeMod {
  
  @JSImport("focus-lock/dist/es5/utils/safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def safeProbe[T](cb: js.Function0[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeProbe")(cb.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
