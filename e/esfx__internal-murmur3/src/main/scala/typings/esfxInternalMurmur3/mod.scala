package typings.esfxInternalMurmur3

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-murmur3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createSeed(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("createSeed")().asInstanceOf[Double]
  
  @JSImport("@esfx/internal-murmur3", "defaultSeed")
  @js.native
  val defaultSeed: Double = js.native
  
  @scala.inline
  def hash(buffer: ArrayBuffer, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(buffer.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
}
