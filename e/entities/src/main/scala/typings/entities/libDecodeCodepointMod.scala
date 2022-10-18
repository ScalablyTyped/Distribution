package typings.entities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecodeCodepointMod {
  
  @JSImport("entities/lib/decode_codepoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(codePoint: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(codePoint.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fromCodePoint(codePoints: Double*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(codePoints.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def replaceCodePoint(codePoint: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceCodePoint")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Double]
}
