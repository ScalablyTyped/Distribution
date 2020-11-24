package typings.emberTestHelpers.triggerKeyEventMod

import typings.emberTestHelpers.mod.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/test-helpers/dom/trigger-key-event", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(target: Target, eventType: KeyEvent, key: String): js.Promise[Unit] = js.native
  def apply(target: Target, eventType: KeyEvent, key: String, modifiers: KeyModifiers): js.Promise[Unit] = js.native
  def apply(target: Target, eventType: KeyEvent, key: Double): js.Promise[Unit] = js.native
  def apply(target: Target, eventType: KeyEvent, key: Double, modifiers: KeyModifiers): js.Promise[Unit] = js.native
}
