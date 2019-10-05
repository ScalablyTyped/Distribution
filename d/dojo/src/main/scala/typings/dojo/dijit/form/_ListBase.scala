package typings.dojo.dijit.form

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/form/_ListBase.html
  *
  * Focus-less menu to handle UI events consistently.
  * Abstract methods that must be defined externally:
  * 
  * onSelect: item is active (mousedown but not yet mouseup, or keyboard arrow selected but no Enter)
  * onDeselect:  cancels onSelect
  * 
  */
@JSGlobal("dijit.form._ListBase")
@js.native
class _ListBase () extends js.Object {
  /**
    * currently selected node
    * 
    */
  var selected: HTMLElement = js.native
  /**
    * Select the first displayed item in the list.
    * 
    */
  def selectFirstNode(): Unit = js.native
  /**
    * Select the last displayed item in the list
    * 
    */
  def selectLastNode(): Unit = js.native
  /**
    * Select the item just below the current selection.
    * If nothing selected, select first node.
    * 
    */
  def selectNextNode(): Unit = js.native
  /**
    * Select the item just above the current selection.
    * If nothing selected, select last node (if
    * you select Previous and try to keep scrolling up the list).
    * 
    */
  def selectPreviousNode(): Unit = js.native
}

