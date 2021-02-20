package typings.domHelpers

import typings.std.HTMLElement
import typings.std.TransitionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionEndMod {
  
  @JSImport("dom-helpers/cjs/transitionEnd", JSImport.Default)
  @js.native
  def default(element: HTMLElement, handler: Listener): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/transitionEnd", JSImport.Default)
  @js.native
  def default(element: HTMLElement, handler: Listener, duration: js.UndefOr[scala.Nothing], padding: Double): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/transitionEnd", JSImport.Default)
  @js.native
  def default(element: HTMLElement, handler: Listener, duration: Double): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/transitionEnd", JSImport.Default)
  @js.native
  def default(element: HTMLElement, handler: Listener, duration: Double, padding: Double): js.Function0[Unit] = js.native
  @JSImport("dom-helpers/cjs/transitionEnd", JSImport.Default)
  @js.native
  def default(element: HTMLElement, handler: Listener, duration: Null, padding: Double): js.Function0[Unit] = js.native
  
  type Listener = js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, js.Any]
}
