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

object boundaryMod {
  
  @JSImport("@devexpress/utils/lib/intervals/boundary", "BoundaryInterval")
  @js.native
  class BoundaryInterval protected ()
    extends MutableInterval
       with IEquatable[BoundaryInterval]
       with ICloneable[BoundaryInterval]
       with ISupportCopyFrom[BoundaryInterval]
       with IReproducibleInterval[BoundaryInterval] {
    def this(start: Double, end: Double) = this()
    
    /* CompleteClass */
    override def copyFrom(obj: BoundaryInterval): Unit = js.native
    
    def expand(interval: BoundaryInterval): this.type = js.native
    
    /* CompleteClass */
    override def makeByLengthEnd(length: Double, end: Double): BoundaryInterval = js.native
    
    /* CompleteClass */
    override def makeByStartEnd(start: Double, end: Double): BoundaryInterval = js.native
    
    /* CompleteClass */
    override def makeByStartLength(start: Double, length: Double): BoundaryInterval = js.native
  }
  /* static members */
  object BoundaryInterval {
    
    @JSImport("@devexpress/utils/lib/intervals/boundary", "BoundaryInterval")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeByConstInterval(interval: ConstInterval): BoundaryInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("makeByConstInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[BoundaryInterval]
    
    inline def normalized(pointA: Double, pointB: Double): BoundaryInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("normalized")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[BoundaryInterval]
  }
}
