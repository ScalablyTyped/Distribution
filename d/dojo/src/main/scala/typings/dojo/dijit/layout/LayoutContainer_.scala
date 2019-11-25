package typings.dojo.dijit.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.ChildWidgetProperties
import typings.dojo.dojoStrings.design
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/LayoutContainer.html
  *
  * A LayoutContainer is a box with a specified size, such as style="width: 500px; height: 500px;",
  * that contains a child widget marked region="center" and optionally children widgets marked
  * region equal to "top", "bottom", "leading", "trailing", "left" or "right".
  * Children along the edges will be laid out according to width or height dimensions. The remaining
  * space is designated for the center region.
  * 
  * The outer size must be specified on the LayoutContainer node.  Width must be specified for the sides
  * and height for the top and bottom, respectively.  No dimensions should be specified on the center;
  * it will fill the remaining space.  Regions named "leading" and "trailing" may be used just like
  * "left" and "right" except that they will be reversed in right-to-left environments.
  * 
  * For complex layouts, multiple children can be specified for a single region.   In this case, the
  * layoutPriority flag on the children determines which child is closer to the edge (low layoutPriority)
  * and which child is closer to the center (high layoutPriority).   layoutPriority can also be used
  * instead of the design attribute to control layout precedence of horizontal vs. vertical panes.
  * 
  * See LayoutContainer.ChildWidgetProperties for details on the properties that can be set on
  * children of a LayoutContainer.
  * 
  * If layoutPriority is not set, lays out each child in the natural order the children occur in.
  * Basically each child is laid out into the "remaining space", where "remaining space" is initially
  * the content area of this widget, but is reduced to a smaller rectangle each time a child is added.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.layout.LayoutContainer")
@js.native
class LayoutContainer_ () extends _LayoutWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * These properties can be specified for the children of a LayoutContainer.
    * 
    */
  var ChildWidgetProperties: js.Object = js.native
  /**
    * Which design is used for the layout:
    * 
    * "headline" (default) where the top and bottom extend the full width of the container
    * "sidebar" where the left and right sides extend from top to bottom.
    * 
    */
  var design: String = js.native
  @JSName("get")
  def get_ChildWidgetProperties(property: ChildWidgetProperties): js.Object = js.native
  @JSName("get")
  def get_design(property: design): String = js.native
  @JSName("set")
  def set_ChildWidgetProperties(property: ChildWidgetProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_design(property: design, value: String): Unit = js.native
  @JSName("watch")
  def watch_ChildWidgetProperties(
    property: ChildWidgetProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_design(
    property: design,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

