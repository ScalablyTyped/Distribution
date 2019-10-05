package typings.enzyme.enzymeMod

import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", "shallow")
@js.native
object shallow extends js.Object {
  def apply[P](node: ReactElement): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  def apply[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
}

