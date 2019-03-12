package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueriesFunctions extends js.Object {
  /**
    * Search in all of the properties of the provided single record
    *
    * @param record A data object with all the properties of the current line
    * @param queryValue The researched value
    * @return A boolean indicating if a match was found
    */
  def search(record: js.Any, queryValue: java.lang.String): scala.Boolean
}

object QueriesFunctions {
  @scala.inline
  def apply(search: (js.Any, java.lang.String) => scala.Boolean): QueriesFunctions = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
  
    __obj.asInstanceOf[QueriesFunctions]
  }
}

