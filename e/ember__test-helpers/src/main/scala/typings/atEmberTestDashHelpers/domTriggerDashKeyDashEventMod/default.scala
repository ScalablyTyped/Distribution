package typings.atEmberTestDashHelpers.domTriggerDashKeyDashEventMod

import typings.atEmberTestDashHelpers.atEmberTestDashHelpersMod.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test-helpers/dom/trigger-key-event", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(target: Target, eventType: KeyEvent, key: String): js.Promise[Unit] = js.native
  def apply(target: Target, eventType: KeyEvent, key: String, modifiers: KeyModifiers): js.Promise[Unit] = js.native
  def apply(target: Target, eventType: KeyEvent, key: Double): js.Promise[Unit] = js.native
  def apply(target: Target, eventType: KeyEvent, key: Double, modifiers: KeyModifiers): js.Promise[Unit] = js.native
}

