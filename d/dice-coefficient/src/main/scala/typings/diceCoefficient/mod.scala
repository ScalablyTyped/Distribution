package typings.diceCoefficient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dice-coefficient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diceCoefficient(value: String, alternative: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diceCoefficient")(value.asInstanceOf[js.Any], alternative.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def diceCoefficient(value: String, alternative: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diceCoefficient")(value.asInstanceOf[js.Any], alternative.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def diceCoefficient(value: js.Array[String], alternative: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diceCoefficient")(value.asInstanceOf[js.Any], alternative.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def diceCoefficient(value: js.Array[String], alternative: js.Array[String]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diceCoefficient")(value.asInstanceOf[js.Any], alternative.asInstanceOf[js.Any])).asInstanceOf[Double]
}
