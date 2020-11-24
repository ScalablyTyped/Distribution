package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/class/pair", JSImport.Namespace)
@js.native
object pairMod extends js.Object {
  
  @js.native
  class Pair[firstT, secondT] protected () extends js.Object {
    def this(first: firstT, second: secondT) = this()
    
    var first: firstT = js.native
    
    var second: secondT = js.native
  }
}
