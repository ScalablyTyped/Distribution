package typings.dojo.dojox.sketch

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.figure
import typings.dojo.dojoStrings.plugins
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/sketch/Toolbar.html
  *
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.sketch.Toolbar")
@js.native
class Toolbar ()
  extends typings.dojo.dijit.Toolbar {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var figure: js.Object = js.native
  /**
    *
    */
  var plugins: js.Object = js.native
  /**
    *
    * @param item
    * @param group
    */
  def addGroupItem(item: _Plugin, group: js.Any): Unit = js.native
  @JSName("get")
  def get_figure(property: figure): js.Object = js.native
  @JSName("get")
  def get_plugins(property: plugins): js.Object = js.native
  /**
    *
    */
  def reset(): Unit = js.native
  /**
    *
    * @param f
    */
  def setFigure(f: js.Any): Unit = js.native
  @JSName("set")
  def set_figure(property: figure, value: js.Object): Unit = js.native
  @JSName("set")
  def set_plugins(property: plugins, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_figure(
    property: figure,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_plugins(
    property: plugins,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

