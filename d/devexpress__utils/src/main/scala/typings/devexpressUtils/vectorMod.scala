package typings.devexpressUtils

import typings.devexpressUtils.pointMod.Point
import typings.devexpressUtils.segmentMod.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/geometry/vector", JSImport.Namespace)
@js.native
object vectorMod extends js.Object {
  
  @js.native
  class Vector () extends js.Object {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    
    val axisX: Vector = js.native
    
    val axisY: Vector = js.native
    
    val length: Double = js.native
    
    def negative(): this.type = js.native
    
    def normalize(): Vector = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  @js.native
  object Vector extends js.Object {
    
    def angleBetween(a: Vector, b: Vector): Double = js.native
    
    def fromPoints(begin: Point, end: Point): Vector = js.native
    
    def fromSegment(segment: Segment[Point]): Vector = js.native
    
    def scalarProduct(a: Point, b: Point): Double = js.native
    def scalarProduct(a: Point, b: Vector): Double = js.native
    def scalarProduct(a: Vector, b: Point): Double = js.native
    def scalarProduct(a: Vector, b: Vector): Double = js.native
  }
}
