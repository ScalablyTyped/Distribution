package typings.fpTs.mod

import typings.fpTs.libBoundedMod.Bounded
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
  
  inline def clamp[A](B: Bounded[A]): js.Function1[/* a */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(B.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, A]]
  
  inline def reverse[A](B: Bounded[A]): Bounded[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(B.asInstanceOf[js.Any]).asInstanceOf[Bounded[A]]
}
