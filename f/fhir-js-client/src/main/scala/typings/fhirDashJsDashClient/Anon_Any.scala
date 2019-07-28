package typings.fhirDashJsDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any extends js.Object {
  /**
    * Returns the valueQuantity value as number. (As it is)
    */
  def any(valueQuantity: js.Any): Double
  /**
    * Converts the valueQuantity passed into cm based on the code
    */
  def cm(valueQuantity: js.Any): Double
  /**
    * Converts the valueQuantity passed into kg based on the code
    */
  def kg(valueQuantity: js.Any): Double
}

object Anon_Any {
  @scala.inline
  def apply(any: js.Any => Double, cm: js.Any => Double, kg: js.Any => Double): Anon_Any = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), cm = js.Any.fromFunction1(cm), kg = js.Any.fromFunction1(kg))
  
    __obj.asInstanceOf[Anon_Any]
  }
}

