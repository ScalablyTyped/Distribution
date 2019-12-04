package typings.domDashHelpers.cjsAnimateMod

import typings.domDashHelpers.cjsAddEventListenerMod.EventHandler
import typings.domDashHelpers.domDashHelpersStrings.transitionend
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/animate", JSImport.Default)
@js.native
object default_transitionend extends js.Object {
  def apply(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
  def apply(
    node: HTMLElement,
    properties: AnimateProperties,
    duration: Double,
    easing: String,
    callback: EventHandler[transitionend]
  ): Cancel = js.native
}

