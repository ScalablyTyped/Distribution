package typings.durandal.pluginsDialogMod

import typings.durandal.DurandalActivator
import typings.durandal.DurandalPromise
import typings.durandal.compositionMod.CompositionContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  @JSName("activator")
  var activator_Original: DurandalActivator[_] = js.native
  var context: DialogContext = js.native
  var host: HTMLElement = js.native
  var owner: js.Any = js.native
  var settings: CompositionContext = js.native
  def activator(): js.Any = js.native
  def activator(value: js.Any): Unit = js.native
  def close(): DurandalPromise[_] = js.native
}

