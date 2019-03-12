package typings
package durandalLib.pluginsDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  @JSName("activator")
  var activator_Original: durandalLib.DurandalActivator[_] = js.native
  var context: DialogContext = js.native
  var host: stdLib.HTMLElement = js.native
  var owner: js.Any = js.native
  var settings: durandalLib.compositionMod.CompositionContext = js.native
  def activator(): js.Any = js.native
  def activator(value: js.Any): scala.Unit = js.native
  def close(): durandalLib.DurandalPromise[_] = js.native
}

