package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortsFunctions extends js.Object {
  /**
    * Sorting between 2 numbers
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @param direction The number describingthe order: ASC (+1), DESC (-1) or none (0)
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def number(a: js.Any, b: js.Any, attr: java.lang.String, direction: scala.Double): scala.Double
  /**
    * Restores the original order we had...
    *
    * @param a The first record
    * @param b The second record
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def originalPlacement(a: js.Any, b: js.Any): scala.Double
  /**
    * Sorting between 2 strings
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @param direction The number describingthe order: ASC (+1), DESC (-1) or none (0)
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def string(a: js.Any, b: js.Any, attr: java.lang.String, direction: scala.Double): scala.Double
}

object SortsFunctions {
  @scala.inline
  def apply(
    number: (js.Any, js.Any, java.lang.String, scala.Double) => scala.Double,
    originalPlacement: (js.Any, js.Any) => scala.Double,
    string: (js.Any, js.Any, java.lang.String, scala.Double) => scala.Double
  ): SortsFunctions = {
    val __obj = js.Dynamic.literal(number = js.Any.fromFunction4(number), originalPlacement = js.Any.fromFunction2(originalPlacement), string = js.Any.fromFunction4(string))
  
    __obj.asInstanceOf[SortsFunctions]
  }
}

