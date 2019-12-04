package typings.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/lists.html
  *
  *
  */
trait lists extends js.Object {
  /**
    * Takes a list of dicts, returns that list sorted by the property given in the argument.
    *
    * @param value
    * @param arg
    */
  def dictsort(value: js.Any, arg: js.Any): js.Any
  /**
    * Takes a list of dicts, returns that list sorted in reverse order by the property given in the argument.
    *
    * @param value
    * @param arg
    */
  def dictsortreversed(value: js.Any, arg: js.Any): js.Any
  /**
    * Returns the first item in a list
    *
    * @param value
    */
  def first(value: js.Any): String
  /**
    * Joins a list with a string, like Python's str.join(list)
    * Django throws a compile error, but JS can't do arg checks
    * so we're left with run time errors, which aren't wise for something
    * as trivial here as an empty arg.
    *
    * @param value
    * @param arg
    */
  def join(value: js.Any, arg: js.Any): js.Any
  /**
    * Returns the length of the value - useful for lists
    *
    * @param value
    */
  def length(value: js.Any): js.Any
  /**
    * Returns a boolean of whether the value's length is the argument
    *
    * @param value
    * @param arg
    */
  def length_is(value: js.Any, arg: js.Any): Boolean
  /**
    * Returns a random item from the list
    *
    * @param value
    */
  def random(value: js.Any): js.Any
  /**
    * Returns a slice of the list.
    * Uses the same syntax as Python's list slicing; see
    * http://www.diveintopython.net/native_data_types/lists.html#odbchelper.list.slice
    * for an introduction.
    * Also uses the optional third value to denote every X item.
    *
    * @param value
    * @param arg
    */
  def slice(value: js.Any, arg: js.Any): js.Any
  /**
    * Recursively takes a self-nested list and returns an HTML unordered list --
    * WITHOUT opening and closing <ul> tags.
    * The list is assumed to be in the proper format. For example, if var contains
    * ['States', [['Kansas', [['Lawrence', []], ['Topeka', []]]], ['Illinois', []]]],
    * then {{ var|unordered_list }} would return::
    *
    * <li>States
    * <ul>
    *     <li>Kansas
    *     <ul>
    *         <li>Lawrence</li>
    *         <li>Topeka</li>
    *     </ul>
    *     </li>
    *     <li>Illinois</li>
    * </ul>
    * </li>
    *
    * @param value
    */
  def unordered_list(value: js.Any): js.Any
}

object lists {
  @scala.inline
  def apply(
    dictsort: (js.Any, js.Any) => js.Any,
    dictsortreversed: (js.Any, js.Any) => js.Any,
    first: js.Any => String,
    join: (js.Any, js.Any) => js.Any,
    length: js.Any => js.Any,
    length_is: (js.Any, js.Any) => Boolean,
    random: js.Any => js.Any,
    slice: (js.Any, js.Any) => js.Any,
    unordered_list: js.Any => js.Any
  ): lists = {
    val __obj = js.Dynamic.literal(dictsort = js.Any.fromFunction2(dictsort), dictsortreversed = js.Any.fromFunction2(dictsortreversed), first = js.Any.fromFunction1(first), join = js.Any.fromFunction2(join), length = js.Any.fromFunction1(length), length_is = js.Any.fromFunction2(length_is), random = js.Any.fromFunction1(random), slice = js.Any.fromFunction2(slice), unordered_list = js.Any.fromFunction1(unordered_list))
  
    __obj.asInstanceOf[lists]
  }
}

