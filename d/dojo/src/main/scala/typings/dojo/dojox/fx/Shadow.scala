package typings.dojo.dojox.fx

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.Widget
import typings.dojo.dojoStrings.animate
import typings.dojo.dojoStrings.node
import typings.dojo.dojoStrings.opacity
import typings.dojo.dojoStrings.shadowOffset
import typings.dojo.dojoStrings.shadowPng
import typings.dojo.dojoStrings.shadowThickness
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/Shadow.html
  *
  * Adds a drop-shadow to a node.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.fx.Shadow")
@js.native
class Shadow () extends Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * A toggle to disable animated transitions
    *
    */
  var animate: Boolean = js.native
  /**
    * The node we will be applying this shadow to
    *
    */
  var node: HTMLElement = js.native
  /**
    * Overall opacity of the shadow
    *
    */
  var opacity: Double = js.native
  /**
    * How deep to make the shadow appear to be
    *
    */
  var shadowOffset: Double = js.native
  /**
    * Base location for drop-shadow images
    *
    */
  var shadowPng: String = js.native
  /**
    * How wide (in px) to make the shadow
    *
    */
  var shadowThickness: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Shadow: String = js.native
  @JSName("get")
  def get_animate(property: animate): Boolean = js.native
  @JSName("get")
  def get_node(property: node): HTMLElement = js.native
  @JSName("get")
  def get_opacity(property: opacity): Double = js.native
  @JSName("get")
  def get_shadowOffset(property: shadowOffset): Double = js.native
  @JSName("get")
  def get_shadowPng(property: shadowPng): String = js.native
  @JSName("get")
  def get_shadowThickness(property: shadowThickness): Double = js.native
  /**
    * Resizes the shadow based on width and height.
    *
    * @param args
    */
  def resize(args: js.Object): Unit = js.native
  /**
    * enable / disable the shadow
    *
    * @param disabled
    */
  def setDisabled(disabled: Boolean): Unit = js.native
  /**
    * set the opacity of the underlay
    *
    * @param n
    * @param animArgs               Optional
    */
  def setOpacity(n: Double, animArgs: js.Object): Unit = js.native
  @JSName("set")
  def set_animate(property: animate, value: Boolean): Unit = js.native
  @JSName("set")
  def set_node(property: node, value: HTMLElement): Unit = js.native
  @JSName("set")
  def set_opacity(property: opacity, value: Double): Unit = js.native
  @JSName("set")
  def set_shadowOffset(property: shadowOffset, value: Double): Unit = js.native
  @JSName("set")
  def set_shadowPng(property: shadowPng, value: String): Unit = js.native
  @JSName("set")
  def set_shadowThickness(property: shadowThickness, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: typings.dojo.dojoStrings.style, value: String): Unit = js.native
  @JSName("watch")
  def watch_animate(
    property: animate,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_node(
    property: node,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[HTMLElement], 
      /* newValue */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_opacity(
    property: opacity,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_shadowOffset(
    property: shadowOffset,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_shadowPng(
    property: shadowPng,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_shadowThickness(
    property: shadowThickness,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

