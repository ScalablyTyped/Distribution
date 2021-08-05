package typings.fastestLevenshtein

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastest-levenshtein", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closest(str: String, arr: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(str.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def distance(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
