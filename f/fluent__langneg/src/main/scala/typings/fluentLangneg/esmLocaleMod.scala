package typings.fluentLangneg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmLocaleMod {
  
  @JSImport("@fluent/langneg/esm/locale", "Locale")
  @js.native
  open class Locale protected () extends StObject {
    /**
      * Parses a locale id using the localeRe into an array with four elements.
      *
      * If the second argument `range` is set to true, it places range `*` char
      * in place of any missing piece.
      *
      * It also allows skipping the script section of the id, so `en-US` is
      * properly parsed as `en-*-US-*`.
      */
    def this(locale: String) = this()
    
    def addLikelySubtags(): Boolean = js.native
    
    def clearRegion(): Unit = js.native
    
    def clearVariants(): Unit = js.native
    
    def isEqual(other: Locale): Boolean = js.native
    
    var isWellFormed: Boolean = js.native
    
    var language: js.UndefOr[String] = js.native
    
    def matches(other: Locale): Boolean = js.native
    def matches(other: Locale, thisRange: Boolean): Boolean = js.native
    def matches(other: Locale, thisRange: Boolean, otherRange: Boolean): Boolean = js.native
    def matches(other: Locale, thisRange: Unit, otherRange: Boolean): Boolean = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var script: js.UndefOr[String] = js.native
    
    var variant: js.UndefOr[String] = js.native
  }
}
