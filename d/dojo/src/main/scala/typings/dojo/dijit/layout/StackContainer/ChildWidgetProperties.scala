package typings.dojo.dijit.layout.StackContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/StackContainer.ChildWidgetProperties.html
  *
  * These properties can be specified for the children of a StackContainer.
  * 
  */
trait ChildWidgetProperties extends js.Object {
  /**
    * True if user can close (destroy) this child, such as (for example) clicking the X on the tab.
    * 
    */
  var closable: Boolean
  /**
    * Specifies that the button to select this pane should be disabled.
    * Doesn't affect programmatic selection of the pane, nor does it deselect the pane if it is currently selected.
    * 
    */
  var disabled: Boolean
  /**
    * CSS Class specifying icon to use in label associated with this pane.
    * 
    */
  var iconClass: String
  /**
    * Specifies that this widget should be the initially displayed pane.
    * Note: to change the selected child use dijit/layout/StackContainer.selectChild
    * 
    */
  var selected: Boolean
  /**
    * When true, display title of this widget as tab label etc., rather than just using
    * icon specified in iconClass
    * 
    */
  var showTitle: Boolean
}

object ChildWidgetProperties {
  @scala.inline
  def apply(closable: Boolean, disabled: Boolean, iconClass: String, selected: Boolean, showTitle: Boolean): ChildWidgetProperties = {
    val __obj = js.Dynamic.literal(closable = closable, disabled = disabled, iconClass = iconClass, selected = selected, showTitle = showTitle)
  
    __obj.asInstanceOf[ChildWidgetProperties]
  }
}

