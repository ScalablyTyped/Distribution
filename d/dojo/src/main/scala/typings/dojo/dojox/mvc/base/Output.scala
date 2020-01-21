package typings.dojo.dojox.mvc.base

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.WidgetBase
import typings.dojo.dojoStrings.exprchar
import typings.dojo.dojoStrings.style
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/_base.Output.html
  *
  * A simple widget that displays templated output, parts of which may
  * be data-bound.
  * Simple output example:
  *
  * <span data-dojo-type="dojox/mvc/Output" data-dojo-props="value: at(model, 'balance')"></span>
  * Another simple output example:
  *
  * <span data-dojo-type="dojox/mvc/Output" data-dojo-props="value: at(model, 'balance')">
  *   Your balance is: ${this.value}
  * </span>
  * The output widget being data-bound, if the balance changes in the
  * model, the content within the <span> will be
  * updated accordingly.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.mvc._base.Output")
@js.native
class Output () extends WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Character to use for a substitution expression, for a substitution string like ${this.value}
    * If this class is declared in a template HTML and exprchar is used in in-line template of this class, something other than $ should be specified to avoid conflict with exprchar of outer-template.
    *
    */
  var exprchar: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Output: String = js.native
  @JSName("get")
  def get_exprchar(property: exprchar): js.Object = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Override and save template from body.
    *
    * @param params
    * @param srcNodeRef
    */
  def postscript(params: js.Any): Unit = js.native
  def postscript(params: js.Any, srcNodeRef: js.Any): Unit = js.native
  @JSName("set")
  def set_exprchar(property: exprchar, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("watch")
  def watch_exprchar(
    property: exprchar,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

