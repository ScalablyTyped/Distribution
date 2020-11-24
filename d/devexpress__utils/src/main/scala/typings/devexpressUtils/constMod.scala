package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/intervals/const", JSImport.Namespace)
@js.native
object constMod extends js.Object {
  
  @js.native
  abstract class ConstInterval () extends js.Object {
    
    val center: Double = js.native
    
    def contains(pos: Double): Boolean = js.native
    
    def containsInterval(interval: ConstInterval): Boolean = js.native
    
    def containsIntervalWithoutEnd(interval: ConstInterval): Boolean = js.native
    
    def containsWithIntervalEnd(`val`: Double): Boolean = js.native
    
    def containsWithoutIntervalEndAndStart(pos: Double): Boolean = js.native
    
    val end: Double = js.native
    
    def equals(obj: ConstInterval): Boolean = js.native
    
    def isCollapsed(): Boolean = js.native
    
    def isNormalized(): Boolean = js.native
    
    val length: Double = js.native
    
    val start: Double = js.native
  }
  /* static members */
  @js.native
  object ConstInterval extends js.Object {
    
    def isCollapsed(intervals: js.Array[ConstInterval]): Boolean = js.native
  }
}
