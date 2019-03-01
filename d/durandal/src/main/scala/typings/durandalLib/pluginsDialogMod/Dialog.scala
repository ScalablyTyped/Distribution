package typings
package durandalLib.pluginsDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dialog extends js.Object {
  var activator: durandalLib.DurandalActivator[_]
  var context: DialogContext
  var host: stdLib.HTMLElement
  var owner: js.Any
  var settings: durandalLib.compositionMod.CompositionContext
  def close(): durandalLib.DurandalPromise[_]
}

object Dialog {
  @scala.inline
  def apply(
    activator: durandalLib.DurandalActivator[_],
    close: js.Function0[durandalLib.DurandalPromise[_]],
    context: DialogContext,
    host: stdLib.HTMLElement,
    owner: js.Any,
    settings: durandalLib.compositionMod.CompositionContext
  ): Dialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activator")(activator)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[Dialog]
  }
}

