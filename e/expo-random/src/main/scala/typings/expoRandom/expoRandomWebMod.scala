package typings.expoRandom

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-random/build/ExpoRandom.web", JSImport.Namespace)
@js.native
object expoRandomWebMod extends js.Object {
  @js.native
  object default extends js.Object {
    val name: String = js.native
    def getRandomBytesAsync(length: Double): js.Promise[Uint8Array] = js.native
  }
  
}

