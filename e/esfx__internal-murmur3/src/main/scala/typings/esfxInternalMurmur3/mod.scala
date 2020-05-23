package typings.esfxInternalMurmur3

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/internal-murmur3", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val defaultSeed: Double = js.native
  def createSeed(): Double = js.native
  def hash(buffer: ArrayBuffer, seed: Double): Double = js.native
}

