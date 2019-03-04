package typings
package fhirDashJsDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any extends js.Object {
  /**
    * Returns the valueQuantity value as number. (As it is)
    */
  def any(valueQuantity: js.Any): scala.Double
  /**
    * Converts the valueQuantity passed into cm based on the code
    */
  def cm(valueQuantity: js.Any): scala.Double
  /**
    * Converts the valueQuantity passed into kg based on the code
    */
  def kg(valueQuantity: js.Any): scala.Double
}

object Anon_Any {
  @scala.inline
  def apply(
    any: js.Function1[js.Any, scala.Double],
    cm: js.Function1[js.Any, scala.Double],
    kg: js.Function1[js.Any, scala.Double]
  ): Anon_Any = {
    val __obj = js.Dynamic.literal(any = any, cm = cm, kg = kg)
  
    __obj.asInstanceOf[Anon_Any]
  }
}

