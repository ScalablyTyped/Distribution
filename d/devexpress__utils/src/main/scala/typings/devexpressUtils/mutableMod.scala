package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/intervals/mutable", JSImport.Namespace)
@js.native
object mutableMod extends js.Object {
  
  @js.native
  abstract class MutableInterval () extends ConstInterval {
    
    def expand(interval: ConstInterval): this.type = js.native
    
    def normalizeLength(): this.type = js.native
  }
}
