package typings.atExpoVectorDashIcons

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Component
import typings.reactDashNativeDashVectorDashIcons.Anon_Button
import typings.reactDashNativeDashVectorDashIcons.iconMod.Icon
import typings.reactDashNativeDashVectorDashIcons.iconMod.IconButtonProps
import typings.reactDashNativeDashVectorDashIcons.iconMod.ImageSource
import typings.reactDashNativeDashVectorDashIcons.iconMod.TabBarItemIOSProps
import typings.reactDashNativeDashVectorDashIcons.iconMod.ToolbarAndroidProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@expo/vector-icons", JSImport.Namespace)
@js.native
object atExpoVectorDashIconsMod extends js.Object {
  @js.native
  class AntDesign () extends Icon
  
  def createIconSet(glyphMap: js.Object, fontFamily: String): Anon_Button = js.native
  def createIconSet(glyphMap: js.Object, fontFamily: String, fontFile: String): Anon_Button = js.native
  def createIconSetFromFontello(config: js.Object): Anon_Button = js.native
  def createIconSetFromFontello(config: js.Object, fontName: String): Anon_Button = js.native
  def createIconSetFromFontello(config: js.Object, fontName: String, fontFile: String): Anon_Button = js.native
  def createIconSetFromIcoMoon(config: js.Object): Anon_Button = js.native
  def createIconSetFromIcoMoon(config: js.Object, fontName: String): Anon_Button = js.native
  def createIconSetFromIcoMoon(config: js.Object, fontName: String, fontFile: String): Anon_Button = js.native
  /* static members */
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
  
}

