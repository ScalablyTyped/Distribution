package typings.expoDashFont

import org.scalablytyped.runtime.StringDictionary
import typings.expoDashAsset.expoDashAssetMod.Asset
import typings.expoDashFont.expoDashFontMod.FontSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-font", JSImport.Namespace)
@js.native
object expoDashFontMod extends js.Object {
  def isLoaded(name: String): Boolean = js.native
  def isLoading(name: String): Boolean = js.native
  def loadAsync(nameOrMap: String): js.Promise[Unit] = js.native
  def loadAsync(nameOrMap: String, source: FontSource): js.Promise[Unit] = js.native
  def loadAsync(nameOrMap: StringDictionary[FontSource]): js.Promise[Unit] = js.native
  def loadAsync(nameOrMap: StringDictionary[FontSource], source: FontSource): js.Promise[Unit] = js.native
  def processFontFamily(): String | Null = js.native
  def processFontFamily(name: String): String | Null = js.native
  /**
    * A font source can be a URI, a module ID, or an Expo Asset.
    */
  type FontSource = String | Double | Asset
}

