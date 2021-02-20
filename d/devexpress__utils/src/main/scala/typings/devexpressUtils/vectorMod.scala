package typings.devexpressUtils

import typings.devexpressUtils.pointMod.Point
import typings.devexpressUtils.segmentMod.Segment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorMod {
  
  @JSImport("@devexpress/utils/lib/geometry/vector", "Vector")
  @js.native
  class Vector () extends StObject {
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
  object Vector {
    
    @JSImport("@devexpress/utils/lib/geometry/vector", "Vector.angleBetween")
    @js.native
    def angleBetween(a: Vector, b: Vector): Double = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/vector", "Vector.fromPoints")
    @js.native
    def fromPoints(begin: Point, end: Point): Vector = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/vector", "Vector.fromSegment")
    @js.native
    def fromSegment(segment: Segment[Point]): Vector = js.native
    
    @JSImport("@devexpress/utils/lib/geometry/vector", "Vector.scalarProduct")
    @js.native
    def scalarProduct(a: Point, b: Point): Double = js.native
    @JSImport("@devexpress/utils/lib/geometry/vector", "Vector.scalarProduct")
    @js.native
    def scalarProduct(a: Point, b: Vector): Double = js.native
    @JSImport("@devexpress/utils/lib/geometry/vector", "Vector.scalarProduct")
    @js.native
    def scalarProduct(a: Vector, b: Point): Double = js.native
    @JSImport("@devexpress/utils/lib/geometry/vector", "Vector.scalarProduct")
    @js.native
    def scalarProduct(a: Vector, b: Vector): Double = js.native
  }
}
