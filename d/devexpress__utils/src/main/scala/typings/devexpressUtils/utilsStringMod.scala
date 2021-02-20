package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsStringMod {
  
  @JSImport("@devexpress/utils/lib/utils/string", "StringUtils")
  @js.native
  class StringUtils () extends StObject
  /* static members */
  object StringUtils {
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.atLeastOneSymbolInUpperCase")
    @js.native
    def atLeastOneSymbolInUpperCase(str: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.endsAt")
    @js.native
    def endsAt(str: String, template: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.getDecimalSeparator")
    @js.native
    def getDecimalSeparator(): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.getSymbolFromEnd")
    @js.native
    def getSymbolFromEnd(text: String, posFromEnd: Double): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.isAlpha")
    @js.native
    def isAlpha(ch: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.isDigit")
    @js.native
    def isDigit(ch: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.isNullOrEmpty")
    @js.native
    def isNullOrEmpty(): Boolean = js.native
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.isNullOrEmpty")
    @js.native
    def isNullOrEmpty(str: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.padLeft")
    @js.native
    def padLeft(str: String, totalWidth: Double, paddingChar: String): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.repeat")
    @js.native
    def repeat(str: String, count: Double): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.startsAt")
    @js.native
    def startsAt(str: String, template: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.stringHashCode")
    @js.native
    def stringHashCode(str: String): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.stringInLowerCase")
    @js.native
    def stringInLowerCase(str: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.stringInUpperCase")
    @js.native
    def stringInUpperCase(str: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.trim")
    @js.native
    def trim(str: String): String = js.native
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.trim")
    @js.native
    def trim(str: String, trimChars: js.Array[String]): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.trimEnd")
    @js.native
    def trimEnd(str: String): String = js.native
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.trimEnd")
    @js.native
    def trimEnd(str: String, trimChars: js.Array[String]): String = js.native
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.trimInternal")
    @js.native
    def trimInternal: js.Any = js.native
    @scala.inline
    def trimInternal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trimInternal")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.trimStart")
    @js.native
    def trimStart(str: String): String = js.native
    @JSImport("@devexpress/utils/lib/utils/string", "StringUtils.trimStart")
    @js.native
    def trimStart(str: String, trimChars: js.Array[String]): String = js.native
  }
}
