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
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    /**
      * w coordinate / readonly
      */
    /* CompleteClass */
    override var w: Double = js.native
    /**
      * x coordinate / readonly
      */
    /* CompleteClass */
    override var x: Double = js.native
    /**
      * y coordinate / readonly
      */
    /* CompleteClass */
    override var y: Double = js.native
    /**
      * z coordinate / readonly
      */
    /* CompleteClass */
    override var z: Double = js.native
    /**
      * Post-multiply point with matrix.
      * @param matrix
      */
    /* CompleteClass */
    override def matrixTransform(matrix: typings.geometryDom.GeometryDom.DOMMatrixReadOnly): typings.geometryDom.GeometryDom.DOMPoint = js.native
  }
  
  @js.native
  class DOMPointReadOnly protected ()
    extends typings.geometryDom.GeometryDom.DOMPointReadOnly {
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    /**
      * w coordinate / readonly
      */
    /* CompleteClass */
    override var w: Double = js.native
    /**
      * x coordinate / readonly
      */
    /* CompleteClass */
    override var x: Double = js.native
    /**
      * y coordinate / readonly
      */
    /* CompleteClass */
    override var y: Double = js.native
    /**
      * z coordinate / readonly
      */
    /* CompleteClass */
    override var z: Double = js.native
    /**
      * Post-multiply point with matrix.
      * @param matrix
      */
    /* CompleteClass */
    override def matrixTransform(matrix: typings.geometryDom.GeometryDom.DOMMatrixReadOnly): typings.geometryDom.GeometryDom.DOMPoint = js.native
  }
  
  @js.native
  class DOMQuad ()
    extends typings.geometryDom.GeometryDom.DOMQuad {
    def this(p1: DOMPointInit) = this()
    def this(rect: DOMRectInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
    /**
      * the associated bounding rectangle of the quadrilateral
      */
    /* CompleteClass */
    override var bounds: typings.geometryDom.GeometryDom.DOMRectReadOnly = js.native
    /**
      * a DOMPoint that represents p1 of the quadrilateral
      */
    /* CompleteClass */
    override var p1: typings.geometryDom.GeometryDom.DOMPoint = js.native
    /**
      * a DOMPoint that represents p2 of the quadrilateral
      */
    /* CompleteClass */
    override var p2: typings.geometryDom.GeometryDom.DOMPoint = js.native
    /**
      * a DOMPoint that represents p3 of the quadrilateral
      */
    /* CompleteClass */
    override var p3: typings.geometryDom.GeometryDom.DOMPoint = js.native
    /**
      * a DOMPoint that represents p4 of the quadrilateral
      */
    /* CompleteClass */
    override var p4: typings.geometryDom.GeometryDom.DOMPoint = js.native
  }
  
  @js.native
  class DOMRect protected ()
    extends typings.geometryDom.GeometryDom.DOMRect {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    /**
      * max(y coordinate, y coordinate + height dimension)
      */
    /* CompleteClass */
    override var bottom: Double = js.native
    /**
      * height value
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * min(x coordinate, x coordinate + width dimension)
      */
    /* CompleteClass */
    override var left: Double = js.native
    /**
      * max(x coordinate, x coordinate + width dimension)
      */
    /* CompleteClass */
    override var right: Double = js.native
    /**
      * min(y coordinate, y coordinate + height dimension)
      */
    /* CompleteClass */
    override var top: Double = js.native
    /**
      * width value
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * x coordinate
      */
    /* CompleteClass */
    override var x: Double = js.native
    /**
      * y coordinate
      */
    /* CompleteClass */
    override var y: Double = js.native
  }
  
  @js.native
  class DOMRectReadOnly protected ()
    extends typings.geometryDom.GeometryDom.DOMRectReadOnly {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    /**
      * max(y coordinate, y coordinate + height dimension)
      */
    /* CompleteClass */
    override var bottom: Double = js.native
    /**
      * height value
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * min(x coordinate, x coordinate + width dimension)
      */
    /* CompleteClass */
    override var left: Double = js.native
    /**
      * max(x coordinate, x coordinate + width dimension)
      */
    /* CompleteClass */
    override var right: Double = js.native
    /**
      * min(y coordinate, y coordinate + height dimension)
      */
    /* CompleteClass */
    override var top: Double = js.native
    /**
      * width value
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * x coordinate
      */
    /* CompleteClass */
    override var x: Double = js.native
    /**
      * y coordinate
      */
    /* CompleteClass */
    override var y: Double = js.native
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
       with Instantiable2[/* x */ Double, /* y */ Double, typings.geometryDom.GeometryDom.DOMPoint]
       with Instantiable3[
          /* x */ Double, 
          /* y */ Double, 
          /* z */ Double, 
          typings.geometryDom.GeometryDom.DOMPoint
        ]
       with Instantiable4[
          /* x */ Double, 
          /* y */ Double, 
          /* z */ Double, 
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
          /* p1 */ DOMPointInit, 
          /* p2 */ DOMPointInit, 
          typings.geometryDom.GeometryDom.DOMQuad
        ]
       with Instantiable3[
          /* p1 */ DOMPointInit, 
          /* p2 */ DOMPointInit, 
          /* p3 */ DOMPointInit, 
          typings.geometryDom.GeometryDom.DOMQuad
        ]
       with Instantiable4[
          /* p1 */ DOMPointInit, 
          /* p2 */ DOMPointInit, 
          /* p3 */ DOMPointInit, 
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

