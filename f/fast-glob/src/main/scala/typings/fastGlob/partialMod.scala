package typings.fastGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialMod {
  
  @JSImport("fast-glob/out/providers/matchers/partial", JSImport.Default)
  @js.native
  class default () extends PartialMatcher
  
  @js.native
  trait PartialMatcher
    extends typings.fastGlob.matcherMod.default {
    
    def `match`(filepath: String): Boolean = js.native
  }
}
