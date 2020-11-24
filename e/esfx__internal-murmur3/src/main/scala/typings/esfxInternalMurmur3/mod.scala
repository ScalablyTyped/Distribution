package typings.esfxInternalMurmur3

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@esfx/internal-murmur3", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createSeed(): Double = js.native
  
  val defaultSeed: Double = js.native
  
  def hash(buffer: ArrayBuffer, seed: Double): Double = js.native
}
