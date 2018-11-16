package typings
package dynatableLib.JQueryDynatableNs

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
  def add(attr: java.lang.String, direction: scala.Double): Dynatable
  /** Remove all the sortKeys */
  def clear(): scala.Unit
  /**
           * Try to intelligently guess which sort function to use based on the type of attribute values.
           *
           * @param a The first record
           * @param b The second record
           * @param attr The key of the property
           * @return A string containing one of the types ('string' or 'number')
           */
  def guessType(a: js.Any, b: js.Any, attr: java.lang.String): java.lang.String
  /** Create and init the sorts */
  def init(): scala.Unit
  /**
           * Check if sort feature is enabled
           *
           * @return A boolean if sort feature is enabled
           */
  def initOnLoad(): scala.Boolean
  /**
           * Remove a sort attribute from the sortKeys
           *
           * @param attr The key to be removed from the sorting
           * @return A reference to the related Dynatable object
           */
  def remove(attr: java.lang.String): Dynatable
}

