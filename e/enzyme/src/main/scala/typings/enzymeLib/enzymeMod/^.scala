package typings
package enzymeLib.enzymeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def configure(options: enzymeLib.Anon_Adapter): scala.Unit = js.native
  def mount[P](node: reactLib.reactMod.ReactNs.ReactElement[P]): enzymeLib.enzymeMod.ReactWrapper[P, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def mount[P](node: reactLib.reactMod.ReactNs.ReactElement[P], options: enzymeLib.enzymeMod.MountRendererProps): enzymeLib.enzymeMod.ReactWrapper[P, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  @JSName("mount")
  def mount_CComponentPS[C /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */, P, S](node: reactLib.reactMod.ReactNs.ReactElement[P]): enzymeLib.enzymeMod.ReactWrapper[P, S, C] = js.native
  @JSName("mount")
  def mount_CComponentPS[C /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */, P, S](node: reactLib.reactMod.ReactNs.ReactElement[P], options: enzymeLib.enzymeMod.MountRendererProps): enzymeLib.enzymeMod.ReactWrapper[P, S, C] = js.native
  @JSName("mount")
  def mount_PS[P, S](node: reactLib.reactMod.ReactNs.ReactElement[P]): enzymeLib.enzymeMod.ReactWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  @JSName("mount")
  def mount_PS[P, S](node: reactLib.reactMod.ReactNs.ReactElement[P], options: enzymeLib.enzymeMod.MountRendererProps): enzymeLib.enzymeMod.ReactWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def render[P, S](node: reactLib.reactMod.ReactNs.ReactElement[P]): cheerioLib.Cheerio = js.native
  def render[P, S](node: reactLib.reactMod.ReactNs.ReactElement[P], options: js.Any): cheerioLib.Cheerio = js.native
  def shallow[P](node: reactLib.reactMod.ReactNs.ReactElement[P]): enzymeLib.enzymeMod.ShallowWrapper[P, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  def shallow[P](node: reactLib.reactMod.ReactNs.ReactElement[P], options: enzymeLib.enzymeMod.ShallowRendererProps): enzymeLib.enzymeMod.ShallowWrapper[P, _, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  @JSName("shallow")
  def shallow_CComponentPS[C /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */, P, S](node: reactLib.reactMod.ReactNs.ReactElement[P]): enzymeLib.enzymeMod.ShallowWrapper[P, S, C] = js.native
  @JSName("shallow")
  def shallow_CComponentPS[C /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */, P, S](node: reactLib.reactMod.ReactNs.ReactElement[P], options: enzymeLib.enzymeMod.ShallowRendererProps): enzymeLib.enzymeMod.ShallowWrapper[P, S, C] = js.native
  @JSName("shallow")
  def shallow_PS[P, S](node: reactLib.reactMod.ReactNs.ReactElement[P]): enzymeLib.enzymeMod.ShallowWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
  @JSName("shallow")
  def shallow_PS[P, S](node: reactLib.reactMod.ReactNs.ReactElement[P], options: enzymeLib.enzymeMod.ShallowRendererProps): enzymeLib.enzymeMod.ShallowWrapper[P, S, reactLib.reactMod.Component[js.Object, js.Object, _]] = js.native
}

