package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassPairMod {
  
  @JSImport("@devexpress/utils/lib/class/pair", "Pair")
  @js.native
  open class Pair[firstT, secondT] protected () extends StObject {
    def this(first: firstT, second: secondT) = this()
    
    var first: firstT = js.native
    
    var second: secondT = js.native
  }
}
