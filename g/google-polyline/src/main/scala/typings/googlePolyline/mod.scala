package typings.googlePolyline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-polyline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(encoded: String): js.Array[js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(encoded.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  inline def encode(latLng: js.Array[js.Tuple2[Double, Double]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latLng.asInstanceOf[js.Any]).asInstanceOf[String]
}
