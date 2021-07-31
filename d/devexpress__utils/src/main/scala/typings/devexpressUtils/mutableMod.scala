package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mutableMod {
  
  @JSImport("@devexpress/utils/lib/intervals/mutable", "MutableInterval")
  @js.native
  abstract class MutableInterval () extends ConstInterval {
    
    def expand(interval: ConstInterval): this.type = js.native
    
    def normalizeLength(): this.type = js.native
  }
}
