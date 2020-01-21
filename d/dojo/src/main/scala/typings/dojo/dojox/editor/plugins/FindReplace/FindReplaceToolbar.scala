package typings.dojo.dojox.editor.plugins.FindReplace

import typings.dojo.dijit.Toolbar
import typings.dojo.dijit.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/editor/plugins/FindReplace._FindReplaceToolbar.html
  *
  * A toolbar that derived from dijit.Toolbar, which
  * eliminates some unnecessary event response such as LEFT_ARROW pressing
  * and click bubbling.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.editor.plugins.FindReplace._FindReplaceToolbar")
@js.native
class FindReplaceToolbar () extends Toolbar {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Add a child to our _Container and prevent the default
    * arrow key navigation function. This function may bring in
    * side effect
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: Widget, insertIndex: Double): Unit = js.native
}

