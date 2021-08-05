package typings.fpTs

import typings.fpTs.functionMod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod {
  
  @JSImport("fp-ts/lib/boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fold[A](onFalse: Lazy[A], onTrue: Lazy[A]): js.Function1[/* value */ Boolean, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onFalse.asInstanceOf[js.Any], onTrue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Boolean, A]]
}
