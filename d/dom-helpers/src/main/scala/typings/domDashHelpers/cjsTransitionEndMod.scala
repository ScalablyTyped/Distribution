package typings.domDashHelpers

import typings.domDashHelpers.cjsTransitionEndMod.Listener
import typings.std.HTMLElement
import typings.std.TransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/transitionEnd", JSImport.Namespace)
@js.native
object cjsTransitionEndMod extends js.Object {
  val TRANSITION_SUPPORTED: Boolean = js.native
  def default(element: HTMLElement, handler: Listener): js.Function0[Unit] = js.native
  def default(element: HTMLElement, handler: Listener, duration: Double): js.Function0[Unit] = js.native
  def emulateTransitionEnd(element: HTMLElement, duration: Double): js.Function0[Unit] = js.native
  def emulateTransitionEnd(element: HTMLElement, duration: Double, padding: Double): js.Function0[Unit] = js.native
  def parseDuration(node: HTMLElement): Double = js.native
  type Listener = js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, js.Any]
}

