package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsStringMod {
  
  @JSImport("@devexpress/utils/lib/utils/string", "StringUtils")
  @js.native
  open class StringUtils () extends StObject
  /* static members */
  object StringUtils {
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def atLeastOneSymbolInUpperCase(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("atLeastOneSymbolInUpperCase")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def endsAt(str: String, template: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsAt")(str.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getDecimalSeparator(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecimalSeparator")().asInstanceOf[String]
    
    inline def getSymbolFromEnd(text: String, posFromEnd: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolFromEnd")(text.asInstanceOf[js.Any], posFromEnd.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def isAlpha(ch: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDigit(ch: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDigit")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNullOrEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrEmpty")().asInstanceOf[Boolean]
    inline def isNullOrEmpty(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrEmpty")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def padLeft(str: String, totalWidth: Double, paddingChar: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padLeft")(str.asInstanceOf[js.Any], totalWidth.asInstanceOf[js.Any], paddingChar.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def repeat(str: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def startsAt(str: String, template: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsAt")(str.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def stringHashCode(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stringHashCode")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def stringInLowerCase(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stringInLowerCase")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def stringInUpperCase(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stringInUpperCase")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def trim(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trim(str: String, trimChars: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trim")(str.asInstanceOf[js.Any], trimChars.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def trimEnd(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trimEnd(str: String, trimChars: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimEnd")(str.asInstanceOf[js.Any], trimChars.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.trimInternal")
    @js.native
    def trimInternal: Any = js.native
    inline def trimInternal_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trimInternal")(x.asInstanceOf[js.Any])
    
    inline def trimStart(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def trimStart(str: String, trimChars: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimStart")(str.asInstanceOf[js.Any], trimChars.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
