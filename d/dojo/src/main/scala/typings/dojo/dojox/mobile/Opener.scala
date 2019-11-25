package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.`lazy`
import typings.dojo.dojoStrings.requires
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Opener.html
  *
  * A non-templated popup widget that will use either Tooltip or
  * Overlay depending on screen size.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.Opener")
@js.native
class Opener () extends Tooltip {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If true, the content of the widget, which includes dojo markup,
    * is instantiated lazily. That is, only when the widget is opened
    * by the user, the required modules are loaded and the content
    * widgets are instantiated.
    *
    */
  var `lazy`: String = js.native
  /**
    * Comma-separated required module names to be lazily loaded. This
    * is effective only when lazy=true. All the modules specified with
    * dojoType and their depending modules are automatically loaded
    * when the widget is opened. However, if you need other extra
    * modules to be loaded, use this parameter.
    *
    */
  var requires: String = js.native
  @JSName("get")
  def get_lazy(property: `lazy`): String = js.native
  @JSName("get")
  def get_requires(property: requires): String = js.native
  def hide(`val`: js.Any): Unit = js.native
  /**
    *
    * @param node
    * @param v
    */
  def onHide(node: HTMLElement, v: js.Any): Unit = js.native
  /**
    *
    * @param node
    */
  def onShow(node: HTMLElement): Unit = js.native
  @JSName("set")
  def set_lazy(property: `lazy`, value: String): Unit = js.native
  @JSName("set")
  def set_requires(property: requires, value: String): Unit = js.native
  /**
    *
    * @param node
    * @param positions
    */
  def show(node: js.Any, positions: js.Any): js.Any = js.native
  @JSName("watch")
  def watch_lazy(
    property: `lazy`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_requires(
    property: requires,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

