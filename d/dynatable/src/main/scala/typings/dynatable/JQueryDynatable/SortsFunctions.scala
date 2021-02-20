package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortsFunctions extends StObject {
  
  /**
    * Sorting between 2 numbers
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @param direction The number describingthe order: ASC (+1), DESC (-1) or none (0)
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def number(a: js.Any, b: js.Any, attr: String, direction: Double): Double = js.native
  
  /**
    * Restores the original order we had...
    *
    * @param a The first record
    * @param b The second record
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def originalPlacement(a: js.Any, b: js.Any): Double = js.native
  
  /**
    * Sorting between 2 strings
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @param direction The number describingthe order: ASC (+1), DESC (-1) or none (0)
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def string(a: js.Any, b: js.Any, attr: String, direction: Double): Double = js.native
}
object SortsFunctions {
  
  @scala.inline
  def apply(
    number: (js.Any, js.Any, String, Double) => Double,
    originalPlacement: (js.Any, js.Any) => Double,
    string: (js.Any, js.Any, String, Double) => Double
  ): SortsFunctions = {
    val __obj = js.Dynamic.literal(number = js.Any.fromFunction4(number), originalPlacement = js.Any.fromFunction2(originalPlacement), string = js.Any.fromFunction4(string))
    __obj.asInstanceOf[SortsFunctions]
  }
  
  @scala.inline
  implicit class SortsFunctionsMutableBuilder[Self <: SortsFunctions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: (js.Any, js.Any, String, Double) => Double): Self = StObject.set(x, "number", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOriginalPlacement(value: (js.Any, js.Any) => Double): Self = StObject.set(x, "originalPlacement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setString(value: (js.Any, js.Any, String, Double) => Double): Self = StObject.set(x, "string", js.Any.fromFunction4(value))
  }
}
