package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/string", JSImport.Namespace)
@js.native
object utilsStringMod extends js.Object {
  
  @js.native
  class StringUtils () extends js.Object
  /* static members */
  @js.native
  object StringUtils extends js.Object {
    
    def atLeastOneSymbolInUpperCase(str: String): Boolean = js.native
    
    def endsAt(str: String, template: String): Boolean = js.native
    
    def getDecimalSeparator(): String = js.native
    
    def getSymbolFromEnd(text: String, posFromEnd: Double): String = js.native
    
    def isAlpha(ch: String): Boolean = js.native
    
    def isDigit(ch: String): Boolean = js.native
    
    def isNullOrEmpty(): Boolean = js.native
    def isNullOrEmpty(str: String): Boolean = js.native
    
    def padLeft(str: String, totalWidth: Double, paddingChar: String): String = js.native
    
    def repeat(str: String, count: Double): String = js.native
    
    def startsAt(str: String, template: String): Boolean = js.native
    
    def stringHashCode(str: String): Double = js.native
    
    def stringInLowerCase(str: String): Boolean = js.native
    
    def stringInUpperCase(str: String): Boolean = js.native
    
    def trim(str: String): String = js.native
    def trim(str: String, trimChars: js.Array[String]): String = js.native
    
    def trimEnd(str: String): String = js.native
    def trimEnd(str: String, trimChars: js.Array[String]): String = js.native
    
    var trimInternal: js.Any = js.native
    
    def trimStart(str: String): String = js.native
    def trimStart(str: String, trimChars: js.Array[String]): String = js.native
  }
}
