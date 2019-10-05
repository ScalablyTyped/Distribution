package typings.atExpoVectorDashIcons.atExpoVectorDashIconsMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashVectorDashIcons.fontAwesomeMod.default
import typings.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/vector-icons", "FontAwesome")
@js.native
class FontAwesome () extends default

/* static members */
@JSImport("@expo/vector-icons", "FontAwesome")
@js.native
object FontAwesome extends js.Object {
  @js.native
  class Button ()
    extends typings.reactDashNativeDashVectorDashIcons.fontAwesomeMod.default.Button
  
  @js.native
  class TabBarItem ()
    extends typings.reactDashNativeDashVectorDashIcons.fontAwesomeMod.default.TabBarItem
  
  @js.native
  class TabBarItemIOS ()
    extends typings.reactDashNativeDashVectorDashIcons.fontAwesomeMod.default.TabBarItemIOS
  
  @js.native
  class ToolbarAndroid ()
    extends typings.reactDashNativeDashVectorDashIcons.fontAwesomeMod.default.ToolbarAndroid
  
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

