package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IOffsets
import typings.devexpressUtils.typesMod.IEquatable
import typings.devexpressUtils.typesMod.ISupportConverting
import typings.devexpressUtils.typesMod.ISupportCopyFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetsMod {
  
  @JSImport("@devexpress/utils/lib/geometry/offsets", "Offsets")
  @js.native
  class Offsets protected ()
    extends IEquatable[Offsets]
       with ISupportCopyFrom[Offsets]
       with ISupportConverting[Double]
       with IOffsets {
    def this(left: Double, right: Double, top: Double, bottom: Double) = this()
    
    def copyFrom(obj: IOffsets): Unit = js.native
    
    def equals(obj: IOffsets): Boolean = js.native
    
    val horizontal: Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    def multiply(multHoriz: Double, multVert: Double): this.type = js.native
    def multiply(multLeft: Double, multRight: Double, multTop: Double, multBottom: Double): this.type = js.native
    def multiply(mult: Double): this.type = js.native
    
    def normalize(): this.type = js.native
    
    def offset(offset: IOffsets): this.type = js.native
    
    val vertical: Double = js.native
  }
  /* static members */
  object Offsets {
    
    @JSImport("@devexpress/utils/lib/geometry/offsets", "Offsets.empty")
    @js.native
    def empty(): Offsets = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/offsets", "Offsets.fromNumber")
    @js.native
    def fromNumber(offset: Double): Offsets = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/offsets", "Offsets.fromOffsets")
    @js.native
    def fromOffsets(offsets: IOffsets): Offsets = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/offsets", "Offsets.fromSide")
    @js.native
    def fromSide(horizontal: Double, vertical: Double): Offsets = js.native
  }
}
