package typings.dojo.dojo._base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.regexp.html
  *
  * Regular expressions and Builder resources
  *
  */
@js.native
trait regexp extends js.Object {
  /**
    * Builds a regular expression that groups subexpressions
    * A utility function used by some of the RE generators. The
    * subexpressions are constructed by the function, re, in the second
    * parameter.  re builds one subexpression for each elem in the array
    * a, in the first parameter. Returns a string for a regular
    * expression that groups all the subexpressions.
    *
    * @param arr A single value or an array of values.
    * @param re A function. Takes one parameter and converts it to a regularexpression.
    * @param nonCapture               OptionalIf true, uses non-capturing match, otherwise matches are retainedby regular expression. Defaults to false
    */
  def buildGroupRE(arr: js.Array[_], re: js.Function): js.Any = js.native
  def buildGroupRE(arr: js.Array[_], re: js.Function, nonCapture: Boolean): js.Any = js.native
  /**
    * Builds a regular expression that groups subexpressions
    * A utility function used by some of the RE generators. The
    * subexpressions are constructed by the function, re, in the second
    * parameter.  re builds one subexpression for each elem in the array
    * a, in the first parameter. Returns a string for a regular
    * expression that groups all the subexpressions.
    *
    * @param arr A single value or an array of values.
    * @param re A function. Takes one parameter and converts it to a regularexpression.
    * @param nonCapture               OptionalIf true, uses non-capturing match, otherwise matches are retainedby regular expression. Defaults to false
    */
  def buildGroupRE(arr: js.Object, re: js.Function): js.Any = js.native
  def buildGroupRE(arr: js.Object, re: js.Function, nonCapture: Boolean): js.Any = js.native
  /**
    * Adds escape sequences for special characters in regular expressions
    *
    * @param str
    * @param except               Optionala String with special characters to be left unescaped
    */
  def escapeString(str: String): js.Any = js.native
  def escapeString(str: String, except: String): js.Any = js.native
  /**
    * adds group match to expression
    *
    * @param expression
    * @param nonCapture               OptionalIf true, uses non-capturing match, otherwise matches are retainedby regular expression.
    */
  def group(expression: String): String = js.native
  def group(expression: String, nonCapture: Boolean): String = js.native
}

