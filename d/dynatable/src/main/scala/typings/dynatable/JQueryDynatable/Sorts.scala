package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sorts extends js.Object {
  /** functions object for Sorts */
  var functions: SortsFunctions
  /**
    * Add a new sort in sortKeys
    *
    * @param attr The key for for the sorting
    * @param direction The sorting direction (-1 or +1)
    * @return A reference to the related Dynatable object
    */
  def add(attr: String, direction: Double): Dynatable
  /** Remove all the sortKeys */
  def clear(): Unit
  /**
    * Try to intelligently guess which sort function to use based on the type of attribute values.
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @return A string containing one of the types ('string' or 'number')
    */
  def guessType(a: js.Any, b: js.Any, attr: String): String
  /** Create and init the sorts */
  def init(): Unit
  /**
    * Check if sort feature is enabled
    *
    * @return A boolean if sort feature is enabled
    */
  def initOnLoad(): Boolean
  /**
    * Remove a sort attribute from the sortKeys
    *
    * @param attr The key to be removed from the sorting
    * @return A reference to the related Dynatable object
    */
  def remove(attr: String): Dynatable
}

object Sorts {
  @scala.inline
  def apply(
    add: (String, Double) => Dynatable,
    clear: () => Unit,
    functions: SortsFunctions,
    guessType: (js.Any, js.Any, String) => String,
    init: () => Unit,
    initOnLoad: () => Boolean,
    remove: String => Dynatable
  ): Sorts = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), functions = functions.asInstanceOf[js.Any], guessType = js.Any.fromFunction3(guessType), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Sorts]
  }
}

