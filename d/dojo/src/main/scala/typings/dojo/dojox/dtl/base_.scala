package typings.dojo.dojox.dtl

import typings.dojo.dojo.base.url
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/_base.html
  *
  *
  */
@js.native
trait base_ extends js.Object {
  /**
    *
    */
  var BOOLS: js.Object = js.native
  /**
    *
    */
  var TOKEN_ATTR: Double = js.native
  /**
    *
    */
  var TOKEN_BLOCK: Double = js.native
  /**
    *
    */
  var TOKEN_CHANGE: Double = js.native
  /**
    *
    */
  var TOKEN_COMMENT: Double = js.native
  /**
    *
    */
  var TOKEN_CUSTOM: Double = js.native
  /**
    *
    */
  var TOKEN_NODE: Double = js.native
  /**
    *
    */
  var TOKEN_TEXT: Double = js.native
  /**
    *
    */
  var TOKEN_VAR: Double = js.native
  /**
    *
    */
  var data: js.Object = js.native
  /**
    *
    */
  var date: js.Object = js.native
  /**
    *
    */
  var dates: js.Object = js.native
  /**
    *
    */
  var dijit: js.Object = js.native
  /**
    *
    */
  var dom: js.Object = js.native
  /**
    *
    */
  var html: js.Object = js.native
  /**
    *
    */
  var htmlstrings: js.Object = js.native
  /**
    *
    */
  var integers: js.Object = js.native
  /**
    *
    */
  var lists: js.Object = js.native
  /**
    *
    */
  var loader: js.Object = js.native
  /**
    *
    */
  var logic: js.Object = js.native
  /**
    *
    */
  var loop: js.Object = js.native
  /**
    *
    */
  var misc: js.Object = js.native
  /**
    *
    */
  var objects: js.Object = js.native
  /**
    * A register for filters and tags.
    *
    */
  var register: js.Object = js.native
  /**
    *
    */
  var strings: js.Object = js.native
  /**
    *
    */
  var text: js.Object = js.native
  /**
    *
    * @param key
    * @param value
    */
  def AttributeNode(key: js.Any, value: js.Any): Unit = js.native
  /**
    * Changes the parent during render/unrender
    *
    * @param node
    * @param up               Optional
    * @param root
    */
  def ChangeNode(node: js.Any, up: Boolean, root: Boolean): Unit = js.native
  /**
    * Represents a runtime context used by DTL templates.
    *
    * @param dict
    */
  def Context(dict: js.Object): Unit = js.native
  /**
    * Allows the manipulation of DOM
    * Use this to append a child, change the parent, or
    * change the attribute of the current node.
    *
    * @param parent The parent node.
    */
  def DomBuffer(parent: HTMLElement): Unit = js.native
  /**
    *
    * @param args
    * @param node
    */
  def DomInline(args: js.Any, node: js.Any): Unit = js.native
  /**
    * The template class for DOM templating.
    *
    * @param obj
    */
  def DomTemplate(obj: String): Unit = js.native
  /**
    * The template class for DOM templating.
    *
    * @param obj
    */
  def DomTemplate(obj: url): Unit = js.native
  /**
    * The template class for DOM templating.
    *
    * @param obj
    */
  def DomTemplate(obj: HTMLElement): Unit = js.native
  /**
    *
    * @param args
    * @param node
    */
  def Inline(args: js.Any, node: js.Any): Unit = js.native
  /**
    * The base class for text-based templates.
    *
    * @param template The string or location of the string touse as a template
    * @param isString Indicates whether the template is a string or a url.
    */
  def Template(template: String, isString: Boolean): Unit = js.native
  /**
    * The base class for text-based templates.
    *
    * @param template The string or location of the string touse as a template
    * @param isString Indicates whether the template is a string or a url.
    */
  def Template(template: url, isString: Boolean): Unit = js.native
  /**
    *
    * @param value
    */
  def mark_safe(value: js.Any): Unit = js.native
  /**
    *
    * @param str
    */
  def quickFilter(str: js.Any): Unit = js.native
}

