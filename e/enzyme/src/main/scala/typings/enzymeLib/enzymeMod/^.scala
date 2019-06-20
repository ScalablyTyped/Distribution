package typings
package enzymeLib.enzymeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def configure(options: enzymeLib.Anon_Adapter): scala.Unit = js.native
  def mount[P](node: reactLib.reactMod.ReactElement): ReactWrapper[P, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def mount[P](node: reactLib.reactMod.ReactElement, options: MountRendererProps): ReactWrapper[P, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  @JSName("mount")
  def mount_CComponentPS[C /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */, P, S](node: reactLib.reactMod.ReactElement): ReactWrapper[P, S, C] = js.native
  @JSName("mount")
  def mount_CComponentPS[C /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */, P, S](node: reactLib.reactMod.ReactElement, options: MountRendererProps): ReactWrapper[P, S, C] = js.native
  @JSName("mount")
  def mount_PS[P, S](node: reactLib.reactMod.ReactElement): ReactWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  @JSName("mount")
  def mount_PS[P, S](node: reactLib.reactMod.ReactElement, options: MountRendererProps): ReactWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def render[P, S](node: reactLib.reactMod.ReactElement): cheerioLib.Cheerio = js.native
  def render[P, S](node: reactLib.reactMod.ReactElement, options: js.Any): cheerioLib.Cheerio = js.native
  def shallow[P](node: reactLib.reactMod.ReactElement): ShallowWrapper[P, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def shallow[P](node: reactLib.reactMod.ReactElement, options: ShallowRendererProps): ShallowWrapper[P, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  @JSName("shallow")
  def shallow_CComponentPS[C /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */, P, S](node: reactLib.reactMod.ReactElement): ShallowWrapper[P, S, C] = js.native
  @JSName("shallow")
  def shallow_CComponentPS[C /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */, P, S](node: reactLib.reactMod.ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, C] = js.native
  @JSName("shallow")
  def shallow_PS[P, S](node: reactLib.reactMod.ReactElement): ShallowWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  @JSName("shallow")
  def shallow_PS[P, S](node: reactLib.reactMod.ReactElement, options: ShallowRendererProps): ShallowWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
}

