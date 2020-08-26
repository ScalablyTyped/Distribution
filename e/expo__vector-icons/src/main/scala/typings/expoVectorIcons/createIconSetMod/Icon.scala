package typings.expoVectorIcons.createIconSetMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon[G /* <: String */, FN /* <: String */]
  extends Instantiable1[/* props */ IconProps[G], Component[IconProps[G], js.Object, js.Any]] {
  var Button: ComponentClass[IconButtonProps[G], ComponentState] = js.native
  var defaultProps: js.Any = js.native
  var font: StringDictionary[js.Any] = js.native
  var glyphMap: GlyphMap[G] = js.native
  var propTypes: js.Any = js.native
  def getFontFamily(): FN = js.native
  def getRawGlyphMap(): GlyphMap[G] = js.native
  def loadFont(): js.Promise[Unit] = js.native
}

