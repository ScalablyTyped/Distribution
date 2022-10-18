package typings.fpTs

import typings.fpTs.libIOMod.IO_
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRandomMod {
  
  @JSImport("fp-ts/lib/Random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Random", "random")
  @js.native
  val random: IO_[Double] = js.native
  
  @JSImport("fp-ts/lib/Random", "randomBool")
  @js.native
  val randomBool: IO_[Boolean] = js.native
  
  inline def randomElem[A](as: ReadonlyNonEmptyArray_[A]): IO_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomElem")(as.asInstanceOf[js.Any]).asInstanceOf[IO_[A]]
  
  inline def randomInt(low: Double, high: Double): IO_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[IO_[Double]]
  
  inline def randomRange(min: Double, max: Double): IO_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomRange")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[IO_[Double]]
}
