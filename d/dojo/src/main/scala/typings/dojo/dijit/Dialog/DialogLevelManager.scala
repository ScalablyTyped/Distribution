package typings.dojo.dijit.Dialog

import typings.dojo.dijit.WidgetBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Dialog._DialogLevelManager.html
  *
  * Controls the various active "levels" on the page, starting with the
  * stuff initially visible on the page (at z-index 0), and then having an entry for
  * each Dialog shown.
  * 
  */
trait DialogLevelManager extends js.Object {
  /**
    * Called when the specified dialog is hidden/destroyed, after the fade-out
    * animation ends, in order to reset page focus, fix the underlay, etc.
    * If the specified dialog isn't open then does nothing.
    * 
    * Caller is responsible for either setting display:none on the dialog domNode,
    * or calling dijit/popup.hide(), or removing it from the page DOM.
    * 
    * @param dialog             
    */
  def hide(dialog: WidgetBase): Unit
  /**
    * Returns true if specified Dialog is the top in the task
    * 
    * @param dialog             
    */
  def isTop(dialog: WidgetBase): Boolean
  /**
    * Call right before fade-in animation for new dialog.
    * Saves current focus, displays/adjusts underlay for new dialog,
    * and sets the z-index of the dialog itself.
    * 
    * New dialog will be displayed on top of all currently displayed dialogs.
    * 
    * Caller is responsible for setting focus in new dialog after the fade-in
    * animation completes.
    * 
    * @param dialog             
    * @param underlayAttrs             
    */
  def show(dialog: WidgetBase, underlayAttrs: js.Object): Unit
}

object DialogLevelManager {
  @scala.inline
  def apply(hide: WidgetBase => Unit, isTop: WidgetBase => Boolean, show: (WidgetBase, js.Object) => Unit): DialogLevelManager = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction1(hide), isTop = js.Any.fromFunction1(isTop), show = js.Any.fromFunction2(show))
    __obj.asInstanceOf[DialogLevelManager]
  }
}

