package typings.atExpoVectorDashIcons.atExpoVectorDashIconsMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashVectorDashIcons.evilIconsMod.default
import typings.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/vector-icons", "EvilIcons")
@js.native
class EvilIcons () extends default

/* static members */
@JSImport("@expo/vector-icons", "EvilIcons")
@js.native
object EvilIcons extends js.Object {
  @js.native
  class Button ()
    extends typings.reactDashNativeDashVectorDashIcons.evilIconsMod.default.Button
  
  @js.native
  class TabBarItem ()
    extends typings.reactDashNativeDashVectorDashIcons.evilIconsMod.default.TabBarItem
  
  @js.native
  class TabBarItemIOS ()
    extends typings.reactDashNativeDashVectorDashIcons.evilIconsMod.default.TabBarItemIOS
  
  @js.native
  class ToolbarAndroid ()
    extends typings.reactDashNativeDashVectorDashIcons.evilIconsMod.default.ToolbarAndroid
  
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

