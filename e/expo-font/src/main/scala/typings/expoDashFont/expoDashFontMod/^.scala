package typings.expoDashFont.expoDashFontMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-font", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isLoaded(name: String): Boolean = js.native
  def isLoading(name: String): Boolean = js.native
  def loadAsync(nameOrMap: String): js.Promise[Unit] = js.native
  def loadAsync(nameOrMap: String, source: FontSource): js.Promise[Unit] = js.native
  def loadAsync(nameOrMap: StringDictionary[FontSource]): js.Promise[Unit] = js.native
  def loadAsync(nameOrMap: StringDictionary[FontSource], source: FontSource): js.Promise[Unit] = js.native
  def processFontFamily(): String | Null = js.native
  def processFontFamily(name: String): String | Null = js.native
}

