package typings.gematriya

import typings.gematriya.anon.Geresh
import typings.gematriya.anon.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(num: Double): String = ^.asInstanceOf[js.Dynamic].apply(num.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(num: Double, options: Geresh): String = (^.asInstanceOf[js.Dynamic].apply(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: String): Double = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(str: String, options: Order): Double = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("gematriya", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
