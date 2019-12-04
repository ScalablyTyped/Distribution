package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.shadow
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/RoundRect.html
  *
  * A simple round rectangle container.
  * RoundRect is a simple round rectangle container for any HTML
  * and/or widgets. You can achieve the same appearance by just
  * applying the -webkit-border-radius style to a div tag. However,
  * if you use RoundRect, you can get a round rectangle even on
  * non-CSS3 browsers such as (older) IE.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mobile.RoundRect")
@js.native
class RoundRect () extends Container {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * If true, adds a shadow effect to the container element by adding
    * the CSS class "mblShadow" to widget's domNode. The default value
    * is false. Note that changing the value of the property after
    * the widget creation has no effect.
    *
    */
  var shadow: Boolean = js.native
  @JSName("get")
  def get_shadow(property: shadow): Boolean = js.native
  @JSName("set")
  def set_shadow(property: shadow, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_shadow(
    property: shadow,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

