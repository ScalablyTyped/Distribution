package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def number(a: Any, b: Any, attr: String, direction: Double): Double
  
  /**
    * Restores the original order we had...
    *
    * @param a The first record
    * @param b The second record
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def originalPlacement(a: Any, b: Any): Double
  
  /**
    * Sorting between 2 strings
    *
    * @param a The first record
    * @param b The second record
    * @param attr The key of the property
    * @param direction The number describingthe order: ASC (+1), DESC (-1) or none (0)
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def string(a: Any, b: Any, attr: String, direction: Double): Double
}
object SortsFunctions {
  
  inline def apply(
    number: (Any, Any, String, Double) => Double,
    originalPlacement: (Any, Any) => Double,
    string: (Any, Any, String, Double) => Double
  ): SortsFunctions = {
    val __obj = js.Dynamic.literal(number = js.Any.fromFunction4(number), originalPlacement = js.Any.fromFunction2(originalPlacement), string = js.Any.fromFunction4(string))
    __obj.asInstanceOf[SortsFunctions]
  }
  
  extension [Self <: SortsFunctions](x: Self) {
    
    inline def setNumber(value: (Any, Any, String, Double) => Double): Self = StObject.set(x, "number", js.Any.fromFunction4(value))
    
    inline def setOriginalPlacement(value: (Any, Any) => Double): Self = StObject.set(x, "originalPlacement", js.Any.fromFunction2(value))
    
    inline def setString(value: (Any, Any, String, Double) => Double): Self = StObject.set(x, "string", js.Any.fromFunction4(value))
  }
}
