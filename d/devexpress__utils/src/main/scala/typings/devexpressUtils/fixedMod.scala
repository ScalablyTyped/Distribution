package typings.devexpressUtils

import typings.devexpressUtils.constMod.ConstInterval
import typings.devexpressUtils.mutableMod.MutableInterval
import typings.devexpressUtils.reproducibleMod.IReproducibleInterval
import typings.devexpressUtils.typesMod.ICloneable
import typings.devexpressUtils.typesMod.IEquatable
import typings.devexpressUtils.typesMod.ISupportCopyFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedMod {
  
  @JSImport("@devexpress/utils/lib/intervals/fixed", "FixedInterval")
  @js.native
  class FixedInterval protected ()
    extends MutableInterval
       with IEquatable[FixedInterval]
       with ICloneable[FixedInterval]
       with ISupportCopyFrom[FixedInterval]
       with IReproducibleInterval[FixedInterval] {
    def this(start: Double, length: Double) = this()
    
    /* CompleteClass */
    override def copyFrom(obj: FixedInterval): Unit = js.native
    
    def expand(interval: FixedInterval): this.type = js.native
    
    /* CompleteClass */
    override def makeByLengthEnd(length: Double, end: Double): FixedInterval = js.native
    
    /* CompleteClass */
    override def makeByStartEnd(start: Double, end: Double): FixedInterval = js.native
    
    /* CompleteClass */
    override def makeByStartLength(start: Double, length: Double): FixedInterval = js.native
  }
  /* static members */
  object FixedInterval {
    
    @JSImport("@devexpress/utils/lib/intervals/fixed", "FixedInterval")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromPositions(start: Double, end: Double): FixedInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPositions")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[FixedInterval]
    
    inline def makeByConstInterval(interval: ConstInterval): FixedInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("makeByConstInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[FixedInterval]
  }
}
