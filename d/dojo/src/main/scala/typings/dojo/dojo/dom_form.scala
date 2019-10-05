package typings.dojo.dojo

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dom-form.html
  *
  * This module defines form-processing functions.
  *
  */
@js.native
trait dom_form extends js.Object {
  /**
    * Serialize a form field to a JavaScript object.
    * Returns the value encoded in a form field as
    * as a string or an array of strings. Disabled form elements
    * and unchecked radio and checkboxes are skipped. Multi-select
    * elements are returned as an array of string values.
    *
    * @param inputNode
    */
  def fieldToObject(inputNode: String): js.Object = js.native
  /**
    * Serialize a form field to a JavaScript object.
    * Returns the value encoded in a form field as
    * as a string or an array of strings. Disabled form elements
    * and unchecked radio and checkboxes are skipped. Multi-select
    * elements are returned as an array of string values.
    *
    * @param inputNode
    */
  def fieldToObject(inputNode: HTMLElement): js.Object = js.native
  /**
    * Create a serialized JSON string from a form node or string
    * ID identifying the form to serialize
    *
    * @param formNode
    * @param prettyPrint               Optional
    */
  def toJson(formNode: String): String = js.native
  def toJson(formNode: String, prettyPrint: Boolean): String = js.native
  /**
    * Create a serialized JSON string from a form node or string
    * ID identifying the form to serialize
    *
    * @param formNode
    * @param prettyPrint               Optional
    */
  def toJson(formNode: HTMLElement): String = js.native
  def toJson(formNode: HTMLElement, prettyPrint: Boolean): String = js.native
  /**
    * Serialize a form node to a JavaScript object.
    * Returns the values encoded in an HTML form as
    * string properties in an object which it then returns. Disabled form
    * elements, buttons, and other non-value form elements are skipped.
    * Multi-select elements are returned as an array of string values.
    *
    * @param formNode
    */
  def toObject(formNode: String): js.Object = js.native
  /**
    * Serialize a form node to a JavaScript object.
    * Returns the values encoded in an HTML form as
    * string properties in an object which it then returns. Disabled form
    * elements, buttons, and other non-value form elements are skipped.
    * Multi-select elements are returned as an array of string values.
    *
    * @param formNode
    */
  def toObject(formNode: HTMLElement): js.Object = js.native
  /**
    * Returns a URL-encoded string representing the form passed as either a
    * node or string ID identifying the form to serialize
    *
    * @param formNode
    */
  def toQuery(formNode: String): String = js.native
  /**
    * Returns a URL-encoded string representing the form passed as either a
    * node or string ID identifying the form to serialize
    *
    * @param formNode
    */
  def toQuery(formNode: HTMLElement): String = js.native
}

