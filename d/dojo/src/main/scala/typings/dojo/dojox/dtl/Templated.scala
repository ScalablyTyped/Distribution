package typings.dojo.dojox.dtl

import typings.dojo.dijit.TemplatedMixin
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_Templated.html
  *
  * The base-class for DTL-templated widgets.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified, replace srcNodeRef with my generated DOM tree.
  */
@JSGlobal("dojox.dtl._Templated")
@js.native
class Templated () extends TemplatedMixin {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Layer for dijit._Templated.getCachedTemplate
    *
    * @param templatePath
    * @param templateString
    * @param alwaysUseString
    */
  def getCachedTemplate(templatePath: js.Any, templateString: js.Any, alwaysUseString: js.Any): js.Any = js.native
  /**
    * Renders the widget.
    *
    */
  def render(): Unit = js.native
  /**
    *
    */
  def startup(): Unit = js.native
}

