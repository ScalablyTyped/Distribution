package typings.fastGlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersMatchersPartialMod {
  
  @JSImport("fast-glob/out/providers/matchers/partial", JSImport.Default)
  @js.native
  open class default () extends PartialMatcher
  
  @js.native
  trait PartialMatcher
    extends typings.fastGlob.outProvidersMatchersMatcherMod.default {
    
    def `match`(filepath: String): Boolean = js.native
  }
}
