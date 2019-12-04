package typings.dojo.dijit.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.ChildWidgetProperties
import typings.dojo.dojoStrings.activeSizing
import typings.dojo.dojoStrings.orientation
import typings.dojo.dojoStrings.persist
import typings.dojo.dojoStrings.sizerWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/SplitContainer.html
  *
  * Deprecated.  Use dijit/layout/BorderContainer instead.
  * A Container widget with sizing handles in-between each child.
  * Contains multiple children widgets, all of which are displayed side by side
  * (either horizontally or vertically); there's a bar between each of the children,
  * and you can adjust the relative size of each child by dragging the bars.
  * 
  * You must specify a size (width and height) for the SplitContainer.
  * 
  * See SplitContainer.ChildWidgetProperties for details on the properties that can be set on
  * children of a SplitContainer.
  * 
  */
@JSGlobal("dijit.layout.SplitContainer")
@js.native
class SplitContainer_ () extends _LayoutWidget {
  /**
    * These properties can be specified for the children of a SplitContainer.
    * 
    */
  var ChildWidgetProperties: js.Object = js.native
  /**
    * If true, the children's size changes as you drag the bar;
    * otherwise, the sizes don't change until you drop the bar (by mouse-up)
    * 
    */
  var activeSizing: Boolean = js.native
  /**
    * either 'horizontal' or vertical; indicates whether the children are
    * arranged side-by-side or up/down.
    * 
    */
  var orientation: String = js.native
  /**
    * Save splitter positions in a cookie
    * 
    */
  var persist: Boolean = js.native
  /**
    * Size in pixels of the bar between each child
    * 
    */
  var sizerWidth: Double = js.native
  /**
    * Begin dragging the splitter between child[i] and child[i+1]
    * 
    * @param e             
    * @param i             
    */
  def beginSizing(e: js.Any, i: js.Any): Unit = js.native
  /**
    * Called on mousemove while dragging the splitter
    * 
    * @param e             
    */
  def changeSizing(e: js.Any): Unit = js.native
  /**
    * 
    */
  def endSizing(): Unit = js.native
  @JSName("get")
  def get_ChildWidgetProperties(property: ChildWidgetProperties): js.Object = js.native
  @JSName("get")
  def get_activeSizing(property: activeSizing): Boolean = js.native
  @JSName("get")
  def get_orientation(property: orientation): String = js.native
  @JSName("get")
  def get_persist(property: persist): Boolean = js.native
  @JSName("get")
  def get_sizerWidth(property: sizerWidth): Double = js.native
  /**
    * Remove sizer, but only if widget is really our child and
    * we have at least one sizer to throw away
    * 
    * @param widget             
    */
  def removeChild(widget: js.Any): Unit = js.native
  @JSName("set")
  def set_ChildWidgetProperties(property: ChildWidgetProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_activeSizing(property: activeSizing, value: Boolean): Unit = js.native
  @JSName("set")
  def set_orientation(property: orientation, value: String): Unit = js.native
  @JSName("set")
  def set_persist(property: persist, value: Boolean): Unit = js.native
  @JSName("set")
  def set_sizerWidth(property: sizerWidth, value: Double): Unit = js.native
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
  def watch_activeSizing(
    property: activeSizing,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_orientation(
    property: orientation,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_persist(
    property: persist,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_sizerWidth(
    property: sizerWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

