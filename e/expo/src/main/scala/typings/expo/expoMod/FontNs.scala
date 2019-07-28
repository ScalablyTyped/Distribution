package typings.expo.expoMod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.expoMod.FontNs.FontMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Font")
@js.native
object FontNs extends js.Object {
  def loadAsync(map: FontMap): js.Promise[Unit] = js.native
  def loadAsync(name: String, url: String): js.Promise[Unit] = js.native
  type FontMap = StringDictionary[RequireSource]
}

