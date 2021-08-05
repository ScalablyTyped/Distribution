package typings.didyoumean

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String, list: js.Array[String]): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def apply(str: String, list: js.Array[String], key: String): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], list.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  
  @JSImport("didyoumean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("didyoumean", "caseSensitive")
  @js.native
  def caseSensitive: Boolean = js.native
  inline def caseSensitive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(x.asInstanceOf[js.Any])
  
  @JSImport("didyoumean", "nullResultValue")
  @js.native
  def nullResultValue: js.Any = js.native
  inline def nullResultValue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullResultValue")(x.asInstanceOf[js.Any])
  
  @JSImport("didyoumean", "returnFirstMatch")
  @js.native
  def returnFirstMatch: Boolean = js.native
  inline def returnFirstMatch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnFirstMatch")(x.asInstanceOf[js.Any])
  
  @JSImport("didyoumean", "returnWinningObject")
  @js.native
  def returnWinningObject: Boolean = js.native
  inline def returnWinningObject_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("returnWinningObject")(x.asInstanceOf[js.Any])
  
  @JSImport("didyoumean", "threshold")
  @js.native
  def threshold: Double = js.native
  
  @JSImport("didyoumean", "thresholdAbsolute")
  @js.native
  def thresholdAbsolute: Double = js.native
  inline def thresholdAbsolute_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thresholdAbsolute")(x.asInstanceOf[js.Any])
  
  inline def threshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("threshold")(x.asInstanceOf[js.Any])
}
