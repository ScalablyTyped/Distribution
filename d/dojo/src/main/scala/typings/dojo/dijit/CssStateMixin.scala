package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_CssStateMixin.html
  *
  * Mixin for widgets to set CSS classes on the widget DOM nodes depending on hover/mouse press/focus
  * state changes, and also higher-level state changes such becoming disabled or selected.
  * By mixing this class into your widget, and setting the this.baseClass attribute, it will automatically
  * maintain CSS classes on the widget root node (this.domNode) depending on hover,
  * active, focus, etc. state.   Ex: with a baseClass of dijitButton, it will apply the classes
  * dijitButtonHovered and dijitButtonActive, as the user moves the mouse over the widget and clicks it.
  * 
  * It also sets CSS like dijitButtonDisabled based on widget semantic state.
  * 
  * By setting the cssStateNodes attribute, a widget can also track events on subnodes (like buttons
  * within the widget).
  * 
  */
@JSGlobal("dijit._CssStateMixin")
@js.native
class CssStateMixin () extends js.Object {
  /**
    * True if mouse was pressed while over this widget, and hasn't been released yet
    * 
    */
  var active: Boolean = js.native
  /**
    * Subclasses may define a cssStateNodes property that lists sub-nodes within the widget that
    * need CSS classes applied on mouse hover/press and focus.
    * 
    * Each entry in this optional hash is a an attach-point name (like "upArrowButton") mapped to a CSS class name
    * (like "dijitUpArrowButton"). Example:
    * 
    * {
    *     "upArrowButton": "dijitUpArrowButton",
    *     "downArrowButton": "dijitDownArrowButton"
    * }
    * The above will set the CSS class dijitUpArrowButton to the this.upArrowButton DOMNode when it
    * 
    * is hovered, etc.
    * 
    */
  var cssStateNodes: js.Object = js.native
  /**
    * True if cursor is over this widget
    * 
    */
  var hovering: Boolean = js.native
}

