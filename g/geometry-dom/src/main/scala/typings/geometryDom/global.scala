package typings.geometryDom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class DOMMatrix ()
    extends typings.geometryDom.GeometryDom.DOMMatrix {
    def this(array: js.Array[Double]) = this()
    def this(other: typings.geometryDom.GeometryDom.DOMMatrixReadOnly) = this()
    def this(transformList: String) = this()
    def this(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double) = this()
  }
  
  @js.native
  class DOMMatrixReadOnly protected ()
    extends typings.geometryDom.GeometryDom.DOMMatrixReadOnly {
    def this(numberSequence: js.Array[Double]) = this()
  }
  
  @js.native
  class DOMPoint ()
    extends typings.geometryDom.GeometryDom.DOMPoint {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      z: js.UndefOr[scala.Nothing],
      w: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: js.UndefOr[scala.Nothing], w: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
  }
  
  @js.native
  class DOMPointReadOnly protected ()
    extends typings.geometryDom.GeometryDom.DOMPointReadOnly {
    def this(x: Double, y: Double, z: Double, w: Double) = this()
  }
  
  @js.native
  class DOMQuad ()
    extends typings.geometryDom.GeometryDom.DOMQuad {
    def this(p1: DOMPointInit) = this()
    def this(rect: DOMRectInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: js.UndefOr[scala.Nothing], p3: DOMPointInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit, p3: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: js.UndefOr[scala.Nothing], p3: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
    def this(
      p1: js.UndefOr[scala.Nothing],
      p2: js.UndefOr[scala.Nothing],
      p3: js.UndefOr[scala.Nothing],
      p4: DOMPointInit
    ) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: js.UndefOr[scala.Nothing], p3: DOMPointInit, p4: DOMPointInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit, p3: js.UndefOr[scala.Nothing], p4: DOMPointInit) = this()
    def this(p1: js.UndefOr[scala.Nothing], p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: js.UndefOr[scala.Nothing], p3: js.UndefOr[scala.Nothing], p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: js.UndefOr[scala.Nothing], p3: DOMPointInit, p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: js.UndefOr[scala.Nothing], p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  }
  
  @js.native
  class DOMRect protected ()
    extends typings.geometryDom.GeometryDom.DOMRect {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
  
  @js.native
  class DOMRectReadOnly protected ()
    extends typings.geometryDom.GeometryDom.DOMRectReadOnly {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
  
  @js.native
  object DOMMatrix
    extends Instantiable0[typings.geometryDom.GeometryDom.DOMMatrix]
       with Instantiable1[
          (/* array */ js.Array[Double]) | (/* other */ typings.geometryDom.GeometryDom.DOMMatrixReadOnly) | (/* transformList */ String), 
          typings.geometryDom.GeometryDom.DOMMatrix
        ]
       with Instantiable6[
          /* a */ Double, 
          /* b */ Double, 
          /* c */ Double, 
          /* d */ Double, 
          /* e */ Double, 
          /* f */ Double, 
          typings.geometryDom.GeometryDom.DOMMatrix
        ]
  
  @js.native
  object DOMMatrixReadOnly
    extends Instantiable1[
          /* numberSequence */ js.Array[Double], 
          typings.geometryDom.GeometryDom.DOMMatrixReadOnly
        ]
  
  @js.native
  object DOMPoint
    extends Instantiable0[typings.geometryDom.GeometryDom.DOMPoint]
       with Instantiable1[/* x */ Double, typings.geometryDom.GeometryDom.DOMPoint]
       with Instantiable2[js.UndefOr[/* x */ Double], /* y */ Double, typings.geometryDom.GeometryDom.DOMPoint]
       with Instantiable3[
          js.UndefOr[/* x */ Double], 
          js.UndefOr[/* y */ Double], 
          /* z */ Double, 
          typings.geometryDom.GeometryDom.DOMPoint
        ]
       with Instantiable4[
          js.UndefOr[/* x */ Double], 
          js.UndefOr[/* y */ Double], 
          js.UndefOr[/* z */ Double], 
          /* w */ Double, 
          typings.geometryDom.GeometryDom.DOMPoint
        ]
  
  @js.native
  object DOMPointReadOnly
    extends Instantiable4[
          /* x */ Double, 
          /* y */ Double, 
          /* z */ Double, 
          /* w */ Double, 
          typings.geometryDom.GeometryDom.DOMPointReadOnly
        ]
  
  @js.native
  object DOMQuad
    extends Instantiable0[typings.geometryDom.GeometryDom.DOMQuad]
       with Instantiable1[
          (/* p1 */ DOMPointInit) | (/* rect */ DOMRectInit), 
          typings.geometryDom.GeometryDom.DOMQuad
        ]
       with Instantiable2[
          js.UndefOr[/* p1 */ DOMPointInit], 
          /* p2 */ DOMPointInit, 
          typings.geometryDom.GeometryDom.DOMQuad
        ]
       with Instantiable3[
          js.UndefOr[/* p1 */ DOMPointInit], 
          js.UndefOr[/* p2 */ DOMPointInit], 
          /* p3 */ DOMPointInit, 
          typings.geometryDom.GeometryDom.DOMQuad
        ]
       with Instantiable4[
          js.UndefOr[/* p1 */ DOMPointInit], 
          js.UndefOr[/* p2 */ DOMPointInit], 
          js.UndefOr[/* p3 */ DOMPointInit], 
          /* p4 */ DOMPointInit, 
          typings.geometryDom.GeometryDom.DOMQuad
        ]
  
  @js.native
  object DOMRect
    extends Instantiable4[
          /* x */ Double, 
          /* y */ Double, 
          /* width */ Double, 
          /* height */ Double, 
          typings.geometryDom.GeometryDom.DOMRect
        ]
  
  @js.native
  object DOMRectReadOnly
    extends Instantiable4[
          /* x */ Double, 
          /* y */ Double, 
          /* width */ Double, 
          /* height */ Double, 
          typings.geometryDom.GeometryDom.DOMRectReadOnly
        ]
  
}

