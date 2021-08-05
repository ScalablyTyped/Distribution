package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constMod {
  
  @JSImport("@devexpress/utils/lib/intervals/const", "ConstInterval")
  @js.native
  abstract class ConstInterval () extends StObject {
    
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
  object ConstInterval {
    
    @JSImport("@devexpress/utils/lib/intervals/const", "ConstInterval")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isCollapsed(intervals: js.Array[ConstInterval]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollapsed")(intervals.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
