package typings.fpTs.mod

import typings.fpTs.boundedMod.Bounded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bounded {
  
  @JSImport("fp-ts", "bounded")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "bounded.boundedNumber")
  @js.native
  val boundedNumber: Bounded[Double] = js.native
  
  inline def clamp[T](B: Bounded[T]): js.Function1[/* a */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(B.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ T, T]]
  
  inline def reverse[T](B: Bounded[T]): Bounded[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(B.asInstanceOf[js.Any]).asInstanceOf[Bounded[T]]
}
