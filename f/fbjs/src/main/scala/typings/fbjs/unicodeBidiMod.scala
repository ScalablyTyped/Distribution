package typings.fbjs

import typings.fbjs.unicodeBidiDirectionMod.BidiDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unicodeBidiMod {
  
  @JSImport("fbjs/lib/UnicodeBidi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the first strong character (has Bidi_Class value of L, R, or AL).
    */
  inline def firstStrongChar(str: String): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("firstStrongChar")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  
  /**
    * Returns the direction of a block of text, based on the direction of its
    * first strong character (has Bidi_Class value of L, R, or AL).
    */
  inline def firstStrongCharDir(str: String): BidiDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("firstStrongCharDir")(str.asInstanceOf[js.Any]).asInstanceOf[BidiDirection]
  
  /**
    * Returns the direction of a block of text, based on the direction of its
    * first strong character (has Bidi_Class value of L, R, or AL), or a fallback
    * direction, if no strong character is found.
    *
    * NOTE: This function is similar to resolveBlockDir(), but uses the global
    * direction as the fallback, so it *always* returns a Strong direction,
    * making it useful for integration in places that you need to make the final
    * decision, like setting some CSS class.
    *
    * This function is supposed to be used in respect to Higher-Level Protocol
    * rule HL1. (http://www.unicode.org/reports/tr9/#HL1)
    */
  inline def getDirection(str: String): BidiDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(str.asInstanceOf[js.Any]).asInstanceOf[BidiDirection]
  inline def getDirection(str: String, strongFallback: BidiDirection): BidiDirection = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(str.asInstanceOf[js.Any], strongFallback.asInstanceOf[js.Any])).asInstanceOf[BidiDirection]
  
  /**
    * Returns true if getDirection(arguments...) returns LTR.
    */
  inline def isDirectionLTR(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectionLTR")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDirectionLTR(str: String, strongFallback: BidiDirection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirectionLTR")(str.asInstanceOf[js.Any], strongFallback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true if getDirection(arguments...) returns RTL.
    */
  inline def isDirectionRTL(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectionRTL")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDirectionRTL(str: String, strongFallback: BidiDirection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirectionRTL")(str.asInstanceOf[js.Any], strongFallback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns the direction of a block of text, based on the direction of its
    * first strong character (has Bidi_Class value of L, R, or AL), or a fallback
    * direction, if no strong character is found.
    *
    * This function is supposed to be used in respect to Higher-Level Protocol
    * rule HL1. (http://www.unicode.org/reports/tr9/#HL1)
    */
  inline def resolveBlockDir(str: String): BidiDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveBlockDir")(str.asInstanceOf[js.Any]).asInstanceOf[BidiDirection]
  inline def resolveBlockDir(str: String, fallback: BidiDirection): BidiDirection = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBlockDir")(str.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[BidiDirection]
}
