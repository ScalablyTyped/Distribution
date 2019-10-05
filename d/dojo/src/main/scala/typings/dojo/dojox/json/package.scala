package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object json {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/json/query.html
    *
    * Performs a JSONQuery on the provided object and returns the results.
    * If no object is provided (just a query), it returns a "compiled" function that evaluates objects
    * according to the provided query.
    * JSONQuery provides a comprehensive set of data querying tools including filtering,
    * recursive search, sorting, mapping, range selection, and powerful expressions with
    * wildcard string comparisons and various operators. JSONQuery generally supersets
    * JSONPath and provides syntax that matches and behaves like JavaScript where
    * possible.
    *
    * JSONQuery evaluations begin with the provided object, which can referenced with
    * $. From
    * the starting object, various operators can be successively applied, each operating
    * on the result of the last operation.
    *
    * Supported Operators
    * .property - This will return the provided property of the object, behaving exactly
    * like JavaScript.
    * [expression] - This returns the property name/index defined by the evaluation of
    * the provided expression, behaving exactly like JavaScript.
    * [?expression] - This will perform a filter operation on an array, returning all the
    * items in an array that match the provided expression. This operator does not
    * need to be in brackets, you can simply use ?expression, but since it does not
    * have any containment, no operators can be used afterwards when used
    * without brackets.
    * [^?expression] - This will perform a distinct filter operation on an array. This behaves
    * as [?expression] except that it will remove any duplicate values/objects from the
    * result set.
    * [/expression], [\expression], [/expression, /expression] - This performs a sort
    * operation on an array, with sort based on the provide expression. Multiple comma delimited sort
    * expressions can be provided for multiple sort orders (first being highest priority). /
    * indicates ascending order and \ indicates descending order
    * [=expression] - This performs a map operation on an array, creating a new array
    * with each item being the evaluation of the expression for each item in the source array.
    * [start:end:step] - This performs an array slice/range operation, returning the elements
    * from the optional start index to the optional end index, stepping by the optional step number.
    * [expr,expr] - This a union operator, returning an array of all the property/index values from
    * the evaluation of the comma delimited expressions.
    * . or [] - This returns the values of all the properties of the current object.
    * $ - This is the root object, If a JSONQuery expression does not being with a $,
    * it will be auto-inserted at the beginning.
    * @ - This is the current object in filter, sort, and map expressions. This is generally
    * not necessary, names are auto-converted to property references of the current object
    * in expressions.
    * ..property - Performs a recursive search for the given property name, returning
    * an array of all values with such a property name in the current object and any subobjects
    * expr = expr - Performs a comparison (like JS's ==). When comparing to
    * a string, the comparison string may contain wildcards * (matches any number of
    * characters) and ? (matches any single character).
    * expr ~ expr - Performs a string comparison with case insensitivity.
    * ..[?expression] - This will perform a deep search filter operation on all the objects and
    * subobjects of the current data. Rather than only searching an array, this will search
    * property values, arrays, and their children.
    * $1,$2,$3, etc. - These are references to extra parameters passed to the query
    * function or the evaluator function.
    * +, -, /, *, &, |, %, (, ), <, >, <=, >=, != - These operators behave just as they do
    * in JavaScript.
    * dojox.json.query(queryString,object)
    * and
    *
    * dojox.json.query(queryString)(object)
    * always return identical results. The first one immediately evaluates, the second one returns a
    *
    * function that then evaluates the object.
    *
    * @param query Query string
    * @param obj       OptionalTarget of the JSONQuery
    */
  type query = js.Function2[/* query */ String, /* obj */ js.UndefOr[js.Object], Unit]
}
