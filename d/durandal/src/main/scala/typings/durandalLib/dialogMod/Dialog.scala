package typings
package durandalLib.dialogMod

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

