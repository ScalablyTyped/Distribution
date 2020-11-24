package typings.fluentuiReactFocus.focusZoneTypesMod

import typings.std.HTMLElement
import typings.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFocusZone extends js.Object {
  
  /**
    * Sets focus to the first tabbable item in the zone.
    * @param forceIntoFirstElement - If true, focus will be forced into the first element, even
    * if focus is already in the focus zone.
    * @returns True if focus could be set to an active element, false if no operation was taken.
    */
  def focus(): Boolean = js.native
  def focus(forceIntoFirstElement: Boolean): Boolean = js.native
  
  /**
    * Sets focus to a specific child element within the zone. This can be used in conjunction with
    * shouldReceiveFocus to create delayed focus scenarios (like animate the scroll position to the correct
    * location and then focus.)
    * @param childElement - The child element within the zone to focus.
    * @param forceAlignment - If true, focus alignment will be set according to the element provided.
    * @returns True if focus could be set to an active element, false if no operation was taken.
    */
  def focusElement(): Boolean = js.native
  def focusElement(childElement: js.UndefOr[scala.Nothing], forceAlignment: Boolean): Boolean = js.native
  def focusElement(childElement: HTMLElement): Boolean = js.native
  def focusElement(childElement: HTMLElement, forceAlignment: Boolean): Boolean = js.native
  
  /**
    * Sets focus to the last tabbable item in the zone.
    * @returns True if focus could be set to an active element, false if no operation was taken.
    */
  def focusLast(): Boolean = js.native
  
  /**
    * Forces horizontal alignment in the context of vertical arrowing to use specific point as the reference, rather
    * than a center based on the last horizontal motion.
    * @param point - the new reference point.
    */
  def setFocusAlignment(point: Point): Unit = js.native
}
