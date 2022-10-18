package typings.devexpressUtils

import typings.devexpressUtils.libIntervalsConstMod.ConstInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntervalsMutableMod {
  
  /* note: abstract class */ @JSImport("@devexpress/utils/lib/intervals/mutable", "MutableInterval")
  @js.native
  open class MutableInterval () extends ConstInterval {
    
    def end_=(`val`: Double): Unit = js.native
    
    def expand(interval: ConstInterval): this.type = js.native
    
    def length_=(`val`: Double): Unit = js.native
    
    def normalizeLength(): this.type = js.native
    
    def start_=(`val`: Double): Unit = js.native
  }
}
