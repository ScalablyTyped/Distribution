package typings.entities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object escapeMod {
  
  @JSImport("entities/lib/escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeXML(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeXML")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("entities/lib/escape", "escape")
  @js.native
  val escape: js.Function1[/* str */ String, String] = js.native
  
  inline def escapeAttribute(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeAttribute")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeText(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeText")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeUTF8(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeUTF8")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getCodePoint(str: String, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getCodePoint")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("entities/lib/escape", "xmlReplacer")
  @js.native
  val xmlReplacer: js.RegExp = js.native
}
