package typings.dojo.dijit

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.defaults
import typings.dojo.dojoStrings.mixins
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.widgetClass
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Declaration.html
  *
  * The Declaration widget allows a developer to declare new widget
  * classes directly from a snippet of markup.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.Declaration")
@js.native
class Declaration () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * 
    */
  var defaults: js.Object = js.native
  /**
    * List containing the prototype for this widget, and also any mixins,
    * ex: ["dijit._Widget", "dijit._Container"]
    * 
    */
  var mixins: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    * 
    */
  @JSName("style")
  var style_Declaration: String = js.native
  /**
    * Name of class being declared, ex: "acme.myWidget"
    * 
    */
  var widgetClass: String = js.native
  @JSName("get")
  def get_defaults(property: defaults): js.Object = js.native
  @JSName("get")
  def get_mixins(property: mixins): js.Object = js.native
  @JSName("get")
  def get_widgetClass(property: widgetClass): String = js.native
  @JSName("set")
  def set_defaults(property: defaults, value: js.Object): Unit = js.native
  @JSName("set")
  def set_mixins(property: mixins, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_widgetClass(property: widgetClass, value: String): Unit = js.native
  @JSName("watch")
  def watch_defaults(
    property: defaults,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_mixins(
    property: mixins,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_widgetClass(
    property: widgetClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

