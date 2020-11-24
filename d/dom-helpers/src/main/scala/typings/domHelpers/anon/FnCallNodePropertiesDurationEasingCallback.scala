package typings.domHelpers.anon

import typings.domHelpers.addEventListenerMod.EventHandler
import typings.domHelpers.animateMod.AnimateProperties
import typings.domHelpers.animateMod.Cancel
import typings.domHelpers.animateMod.Options
import typings.domHelpers.domHelpersStrings.transitionend
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallNodePropertiesDurationEasingCallback extends js.Object {
  
  def apply(node: HTMLElement, properties: AnimateProperties, duration: Double): Cancel = js.native
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
  def apply(options: Options): Cancel = js.native
}
