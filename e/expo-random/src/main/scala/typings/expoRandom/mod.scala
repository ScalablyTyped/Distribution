package typings.expoRandom

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-random", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getRandomBytesAsync(byteCount: Double): js.Promise[Uint8Array] = js.native
}

