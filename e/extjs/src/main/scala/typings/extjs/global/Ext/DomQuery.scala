package typings.extjs.global.Ext

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.DomQuery")
@js.native
open class DomQuery ()
  extends StObject
     with typings.extjs.Ext.DomQuery
/* static members */
object DomQuery {
  
  @JSGlobal("Ext.DomQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Compiles a selector xpath query into a reusable function
    * @param selector String The selector/xpath query
    * @param type String Either "select" or "simple" for a simple selector match
    * @returns Function
    */
  inline def compile(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")().asInstanceOf[Any]
  inline def compile(selector: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def compile(selector: java.lang.String, `type`: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def compile(selector: Unit, `type`: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(selector.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Filters an array of elements to only include matches of a simple selector e g
    * @param el HTMLElement[] An array of elements to filter
    * @param selector String The simple selector to test
    * @param nonMatches Boolean If true, it returns the elements that DON'T match the selector instead of the ones that match
    * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
    */
  inline def filter(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(el: Unit, selector: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(el: Unit, selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(el: Unit, selector: Unit, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(el: typings.extjs.Ext.Array): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(el: typings.extjs.Ext.Array, selector: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(el: typings.extjs.Ext.Array, selector: java.lang.String, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def filter(el: typings.extjs.Ext.Array, selector: Unit, nonMatches: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], nonMatches.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Returns true if the passed element s match the passed simple selector e g
    * @param el String/HTMLElement/HTMLElement[] An element id, element or array of elements
    * @param selector String The simple selector to test
    * @returns Boolean
    */
  inline def is(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
  inline def is(el: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def is(el: Any, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def is(el: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Selects an array of DOM nodes using JavaScript only implementation
    * @param selector String The selector/xpath query (can be a comma separated list of selectors)
    * @param root HTMLElement/String The start of the query.
    * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
    */
  inline def jsSelect(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")().asInstanceOf[typings.extjs.Ext.Array]
  inline def jsSelect(selector: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def jsSelect(selector: java.lang.String, root: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def jsSelect(selector: Unit, root: Any): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("jsSelect")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Property] (Object) */
  @JSGlobal("Ext.DomQuery.matchers")
  @js.native
  def matchers: Any = js.native
  inline def matchers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchers")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.DomQuery.operators")
  @js.native
  def operators: Any = js.native
  inline def operators_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operators")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.DomQuery.pseudos")
  @js.native
  def pseudos: Any = js.native
  inline def pseudos_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pseudos")(x.asInstanceOf[js.Any])
  
  /** [Method] Selects an array of DOM nodes by CSS XPath selector
    * @param path String The selector/xpath query
    * @param root HTMLElement The start of the query.
    * @param type String Either "select" or "simple" for a simple selector match (only valid when used when the call is deferred to the jsSelect method)
    * @param single Boolean Pass true to select only the first matching node using document.querySelector (where available)
    * @returns HTMLElement[] An array of DOM elements (not a NodeList as returned by querySelectorAll).
    */
  inline def select(): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: java.lang.String): typings.extjs.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any]).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: java.lang.String, root: Unit, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: java.lang.String, root: Unit, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: java.lang.String, root: Unit, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: java.lang.String, root: HTMLElement): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: java.lang.String, root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: java.lang.String, root: HTMLElement, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: Unit, root: Unit, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: Unit, root: Unit, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: Unit, root: Unit, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: Unit, root: HTMLElement): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: Unit, root: HTMLElement, `type`: java.lang.String): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: Unit, root: HTMLElement, `type`: java.lang.String, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  inline def select(path: Unit, root: HTMLElement, `type`: Unit, single: Boolean): typings.extjs.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(path.asInstanceOf[js.Any], root.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], single.asInstanceOf[js.Any])).asInstanceOf[typings.extjs.Ext.Array]
  
  /** [Method] Selects a single element
    * @param selector String The selector/xpath query
    * @param root HTMLElement The start of the query.
    * @returns HTMLElement The DOM element which matched the selector.
    */
  inline def selectNode(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")().asInstanceOf[HTMLElement]
  inline def selectNode(selector: java.lang.String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def selectNode(selector: java.lang.String, root: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def selectNode(selector: Unit, root: HTMLElement): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  /** [Method] Selects the value of a node parsing integers and floats
    * @param selector String The selector/xpath query
    * @param root HTMLElement The start of the query.
    * @param defaultValue Number When specified, this is return as empty value.
    * @returns Number
    */
  inline def selectNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")().asInstanceOf[Double]
  inline def selectNumber(selector: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def selectNumber(selector: java.lang.String, root: Unit, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def selectNumber(selector: java.lang.String, root: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def selectNumber(selector: java.lang.String, root: HTMLElement, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def selectNumber(selector: Unit, root: Unit, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def selectNumber(selector: Unit, root: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def selectNumber(selector: Unit, root: HTMLElement, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNumber")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Selects the value of a node optionally replacing null with the defaultValue
    * @param selector String The selector/xpath query
    * @param root HTMLElement The start of the query.
    * @param defaultValue String When specified, this is return as empty value.
    * @returns String
    */
  inline def selectValue(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")().asInstanceOf[java.lang.String]
  inline def selectValue(selector: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def selectValue(selector: java.lang.String, root: Unit, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def selectValue(selector: java.lang.String, root: HTMLElement): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def selectValue(selector: java.lang.String, root: HTMLElement, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def selectValue(selector: Unit, root: Unit, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def selectValue(selector: Unit, root: HTMLElement): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def selectValue(selector: Unit, root: HTMLElement, defaultValue: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("selectValue")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
