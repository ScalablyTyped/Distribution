package typings.enzyme.enzymeMod

import typings.cheerio.Cheerio
import typings.enzyme.Anon_Adapter
import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def configure(options: Anon_Adapter): Unit = js.native
  def mount[P](node: ReactElement): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  def mount[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSName("mount")
  def mount_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement): ReactWrapper[P, S, C] = js.native
  @JSName("mount")
  def mount_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, C] = js.native
  @JSName("mount")
  def mount_PS[P, S](node: ReactElement): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  @JSName("mount")
  def mount_PS[P, S](node: ReactElement, options: MountRendererProps): ReactWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  def render[P, S](node: ReactElement): Cheerio = js.native
  def render[P, S](node: ReactElement, options: js.Any): Cheerio = js.native
  def shallow[P](node: ReactElement): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  def shallow[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, _, Component[js.Object, js.Object, _]] = js.native
  @JSName("shallow")
  def shallow_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement): ShallowWrapper[P, S, C] = js.native
  @JSName("shallow")
  def shallow_C_ComponentObjectObjectWildcardPS[C /* <: Component[js.Object, js.Object, _] */, P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, C] = js.native
  @JSName("shallow")
  def shallow_PS[P, S](node: ReactElement): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
  @JSName("shallow")
  def shallow_PS[P, S](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object, _]] = js.native
}

