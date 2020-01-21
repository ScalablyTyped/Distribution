package typings.expoVectorIcons.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNativeVectorIcons.iconMod.Icon
import typings.reactNativeVectorIcons.iconMod.IconButtonProps
import typings.reactNativeVectorIcons.iconMod.ImageSource
import typings.reactNativeVectorIcons.iconMod.TabBarItemIOSProps
import typings.reactNativeVectorIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/vector-icons", "AntDesign")
@js.native
class AntDesign () extends Icon

/* static members */
@JSImport("@expo/vector-icons", "AntDesign")
@js.native
object AntDesign extends js.Object {
  @js.native
  class Button ()
    extends Component[IconButtonProps, js.Any, js.Any]
  
  @js.native
  class TabBarItem ()
    extends Component[TabBarItemIOSProps, js.Any, js.Any]
  
  @js.native
  class TabBarItemIOS ()
    extends Component[TabBarItemIOSProps, js.Any, js.Any]
  
  @js.native
  class ToolbarAndroid ()
    extends Component[ToolbarAndroidProps, js.Any, js.Any]
  
  def getImageSource(name: String): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
  def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
  def getRawGlyphMap(): StringDictionary[Double] = js.native
  def hasIcon(name: String): Boolean = js.native
  def loadFont(): js.Promise[Unit] = js.native
  def loadFont(file: String): js.Promise[Unit] = js.native
}

