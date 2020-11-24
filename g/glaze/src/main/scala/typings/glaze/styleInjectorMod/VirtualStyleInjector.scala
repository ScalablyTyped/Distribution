package typings.glaze.styleInjectorMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glaze/dist-types/StyleInjector", "VirtualStyleInjector")
@js.native
class VirtualStyleInjector () extends StyleInjector {
  
  var cssTexts: js.Any = js.native
  
  def getStyleElement(): Element = js.native
  
  def nullifyRule(): Unit = js.native
}
