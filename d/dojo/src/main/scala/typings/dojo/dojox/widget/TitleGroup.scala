package typings.dojo.dojox.widget

import typings.dojo.dijit.TitlePane
import typings.dojo.dijit.Widget
import typings.dojo.dojoStrings.style
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/TitleGroup.html
  *
  * A container which controls a series of dijit.TitlePanes,
  * allowing one to be visible and hiding siblings
  * A container which controls a series of dijit.TitlePanes,
  * allowing one to be visible and hiding siblings. Behaves similarly
  * to a dijit.layout.AccordionContainer in that the children
  * are all stacked, though merges the TitlePane behavior of
  * variable height
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.widget.TitleGroup")
@js.native
class TitleGroup () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_TitleGroup: String = js.native
  /**
    * Add a passed widget reference to this container at an optional
    * position index.
    *
    * @param widget A widget reference to add
    * @param position               OptionalAn optional index or position to pass. defaults to "last"
    */
  def addChild(widget: TitlePane, position: String): js.Any = js.native
  /**
    * Add a passed widget reference to this container at an optional
    * position index.
    *
    * @param widget A widget reference to add
    * @param position               OptionalAn optional index or position to pass. defaults to "last"
    */
  def addChild(widget: TitlePane, position: Double): js.Any = js.native
  /**
    * Remove the passed widget from this container. Does not destroy
    * child.
    *
    * @param widget
    */
  def removeChild(widget: js.Any): js.Any = js.native
  /**
    * close all found titlePanes within this group, excluding
    * the one the we pass to select
    *
    * @param widget
    */
  def selectChild(widget: js.Any): js.Any = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
}

