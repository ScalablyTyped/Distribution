package typings
package extjsLib.ExtNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.core.DomQuery")
@js.native
class DomQuery () extends js.Object

@JSGlobal("Ext.core.DomQuery")
@js.native
object DomQuery extends js.Object {
  /** [Property] (Object) */
  var matchers: js.Any = js.native
  /** [Property] (Object) */
  var operators: js.Any = js.native
  /** [Property] (Object) */
  var pseudos: js.Any = js.native
  /** [Method] Compiles a selector xpath query into a reusable function
  		* @param selector String The selector/xpath query
  		* @param type String Either "select" or "simple" for a simple selector match
  		* @returns Function
  		*/
  def compile(): js.Any = js.native
  /** [Method] Compiles a selector xpath query into a reusable function
  		* @param selector String The selector/xpath query
  		* @param type String Either "select" or "simple" for a simple selector match
  		* @returns Function
  		*/
  def compile(selector: java.lang.String): js.Any = js.native
  /** [Method] Compiles a selector xpath query into a reusable function
  		* @param selector String The selector/xpath query
  		* @param type String Either "select" or "simple" for a simple selector match
  		* @returns Function
  		*/
  def compile(selector: java.lang.String, `type`: java.lang.String): js.Any = js.native
  /** [Method] Filters an array of elements to only include matches of a simple selector e g
  		* @param el HTMLElement[] An array of elements to filter
  		* @param selector String The simple selector to test
  		* @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  def filter(): extjsLib.ExtNs.Array = js.native
  /** [Method] Filters an array of elements to only include matches of a simple selector e g
  		* @param el HTMLElement[] An array of elements to filter
  		* @param selector String The simple selector to test
  		* @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  def filter(el: extjsLib.ExtNs.Array): extjsLib.ExtNs.Array = js.native
  /** [Method] Filters an array of elements to only include matches of a simple selector e g
  		* @param el HTMLElement[] An array of elements to filter
  		* @param selector String The simple selector to test
  		* @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  def filter(el: extjsLib.ExtNs.Array, selector: java.lang.String): extjsLib.ExtNs.Array = js.native
  /** [Method] Filters an array of elements to only include matches of a simple selector e g
  		* @param el HTMLElement[] An array of elements to filter
  		* @param selector String The simple selector to test
  		* @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  def filter(el: extjsLib.ExtNs.Array, selector: java.lang.String, nonMatches: scala.Boolean): extjsLib.ExtNs.Array = js.native
  /** [Method] Returns true if the passed element s match the passed simple selector e g
  		* @param el String/HTMLElement/HTMLElement[] An element id, element or array of elements
  		* @param selector String The simple selector to test
  		* @returns Boolean
  		*/
  def is(): scala.Boolean = js.native
  /** [Method] Returns true if the passed element s match the passed simple selector e g
  		* @param el String/HTMLElement/HTMLElement[] An element id, element or array of elements
  		* @param selector String The simple selector to test
  		* @returns Boolean
  		*/
  def is(el: js.Any): scala.Boolean = js.native
  /** [Method] Returns true if the passed element s match the passed simple selector e g
  		* @param el String/HTMLElement/HTMLElement[] An element id, element or array of elements
  		* @param selector String The simple selector to test
  		* @returns Boolean
  		*/
  def is(el: js.Any, selector: java.lang.String): scala.Boolean = js.native
  /** [Method] Selects an array of DOM nodes using JavaScript only implementation
  		* @param selector String The selector/xpath query (can be a comma separated list of selectors)
  		* @param root HTMLElement/String The start of the query.
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  def jsSelect(): extjsLib.ExtNs.Array = js.native
  /** [Method] Selects an array of DOM nodes using JavaScript only implementation
  		* @param selector String The selector/xpath query (can be a comma separated list of selectors)
  		* @param root HTMLElement/String The start of the query.
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  def jsSelect(selector: java.lang.String): extjsLib.ExtNs.Array = js.native
  /** [Method] Selects an array of DOM nodes using JavaScript only implementation
  		* @param selector String The selector/xpath query (can be a comma separated list of selectors)
  		* @param root HTMLElement/String The start of the query.
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  def jsSelect(selector: java.lang.String, root: js.Any): extjsLib.ExtNs.Array = js.native
  /** [Method] Selects an array of DOM nodes by CSS XPath selector
  		* @param path String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
  		* @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
  		* @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
  		*/
  def select(): extjsLib.ExtNs.Array = js.native
  /** [Method] Selects an array of DOM nodes by CSS XPath selector
  		* @param path String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
  		* @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
  		* @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
  		*/
  def select(path: java.lang.String): extjsLib.ExtNs.Array = js.native
  /** [Method] Selects an array of DOM nodes by CSS XPath selector
  		* @param path String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
  		* @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
  		* @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
  		*/
  def select(path: java.lang.String, root: stdLib.HTMLElement): extjsLib.ExtNs.Array = js.native
  /** [Method] Selects an array of DOM nodes by CSS XPath selector
  		* @param path String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
  		* @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
  		* @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
  		*/
  def select(path: java.lang.String, root: stdLib.HTMLElement, `type`: java.lang.String): extjsLib.ExtNs.Array = js.native
  /** [Method] Selects an array of DOM nodes by CSS XPath selector
  		* @param path String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
  		* @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
  		* @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
  		*/
  def select(path: java.lang.String, root: stdLib.HTMLElement, `type`: java.lang.String, single: scala.Boolean): extjsLib.ExtNs.Array = js.native
  /** [Method] Selects a single element
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @returns HTMLElement The DOM element which matched the selector.
  		*/
  def selectNode(): stdLib.HTMLElement = js.native
  /** [Method] Selects a single element
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @returns HTMLElement The DOM element which matched the selector.
  		*/
  def selectNode(selector: java.lang.String): stdLib.HTMLElement = js.native
  /** [Method] Selects a single element
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @returns HTMLElement The DOM element which matched the selector.
  		*/
  def selectNode(selector: java.lang.String, root: stdLib.HTMLElement): stdLib.HTMLElement = js.native
  /** [Method] Selects the value of a node parsing integers and floats
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param defaultValue Number When specified, this is return as empty value.
  		* @returns Number
  		*/
  def selectNumber(): scala.Double = js.native
  /** [Method] Selects the value of a node parsing integers and floats
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param defaultValue Number When specified, this is return as empty value.
  		* @returns Number
  		*/
  def selectNumber(selector: java.lang.String): scala.Double = js.native
  /** [Method] Selects the value of a node parsing integers and floats
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param defaultValue Number When specified, this is return as empty value.
  		* @returns Number
  		*/
  def selectNumber(selector: java.lang.String, root: stdLib.HTMLElement): scala.Double = js.native
  /** [Method] Selects the value of a node parsing integers and floats
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param defaultValue Number When specified, this is return as empty value.
  		* @returns Number
  		*/
  def selectNumber(selector: java.lang.String, root: stdLib.HTMLElement, defaultValue: scala.Double): scala.Double = js.native
  /** [Method] Selects the value of a node optionally replacing null with the defaultValue
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param defaultValue String When specified, this is return as empty value.
  		* @returns String
  		*/
  def selectValue(): java.lang.String = js.native
  /** [Method] Selects the value of a node optionally replacing null with the defaultValue
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param defaultValue String When specified, this is return as empty value.
  		* @returns String
  		*/
  def selectValue(selector: java.lang.String): java.lang.String = js.native
  /** [Method] Selects the value of a node optionally replacing null with the defaultValue
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param defaultValue String When specified, this is return as empty value.
  		* @returns String
  		*/
  def selectValue(selector: java.lang.String, root: stdLib.HTMLElement): java.lang.String = js.native
  /** [Method] Selects the value of a node optionally replacing null with the defaultValue
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement The start of the query.
  		* @param defaultValue String When specified, this is return as empty value.
  		* @returns String
  		*/
  def selectValue(selector: java.lang.String, root: stdLib.HTMLElement, defaultValue: java.lang.String): java.lang.String = js.native
}

