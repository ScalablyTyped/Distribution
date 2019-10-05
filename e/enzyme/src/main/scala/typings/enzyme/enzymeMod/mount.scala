package typings.enzyme.enzymeMod

import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", "mount")
@js.native
object mount extends js.Object {
  def apply[P](node: ReactElement): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  def apply[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
}

