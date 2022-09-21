package typings.geometryDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMMatrix")
  @js.native
  open class DOMMatrix ()
    extends StObject
       with typings.geometryDom.GeometryDom.DOMMatrix {
    def this(array: js.Array[Double]) = this()
    def this(other: typings.geometryDom.GeometryDom.DOMMatrixReadOnly) = this()
    def this(transformList: String) = this()
    def this(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMMatrixReadOnly")
  @js.native
  open class DOMMatrixReadOnly protected ()
    extends StObject
       with typings.geometryDom.GeometryDom.DOMMatrixReadOnly {
    def this(numberSequence: js.Array[Double]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMPoint")
  @js.native
  open class DOMPoint ()
    extends StObject
       with typings.geometryDom.GeometryDom.DOMPoint {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: Unit, w: Double) = this()
    def this(x: Double, y: Unit, z: Double, w: Double) = this()
    def this(x: Double, y: Unit, z: Unit, w: Double) = this()
    def this(x: Unit, y: Double, z: Double, w: Double) = this()
    def this(x: Unit, y: Double, z: Unit, w: Double) = this()
    def this(x: Unit, y: Unit, z: Double, w: Double) = this()
    def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
    
    /**
      * Post-multiply point with matrix.
      * @param matrix
      */
    /* CompleteClass */
    override def matrixTransform(matrix: typings.geometryDom.GeometryDom.DOMMatrixReadOnly): typings.geometryDom.GeometryDom.DOMPoint = js.native
    
    /**
      * w coordinate / readonly
      */
    /* CompleteClass */
    var w: Double = js.native
    
    /**
      * x coordinate / readonly
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * y coordinate / readonly
      */
    /* CompleteClass */
    var y: Double = js.native
    
    /**
      * z coordinate / readonly
      */
    /* CompleteClass */
    var z: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMPointReadOnly")
  @js.native
  open class DOMPointReadOnly protected ()
    extends StObject
       with typings.geometryDom.GeometryDom.DOMPointReadOnly {
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    
    /**
      * Post-multiply point with matrix.
      * @param matrix
      */
    /* CompleteClass */
    override def matrixTransform(matrix: typings.geometryDom.GeometryDom.DOMMatrixReadOnly): typings.geometryDom.GeometryDom.DOMPoint = js.native
    
    /**
      * w coordinate / readonly
      */
    /* CompleteClass */
    var w: Double = js.native
    
    /**
      * x coordinate / readonly
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * y coordinate / readonly
      */
    /* CompleteClass */
    var y: Double = js.native
    
    /**
      * z coordinate / readonly
      */
    /* CompleteClass */
    var z: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMQuad")
  @js.native
  open class DOMQuad ()
    extends StObject
       with typings.geometryDom.GeometryDom.DOMQuad {
    def this(p1: DOMPointInit) = this()
    def this(rect: DOMRectInit) = this()
    def this(p1: Unit, p2: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit) = this()
    def this(p1: Unit, p2: Unit, p3: DOMPointInit) = this()
    def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
    def this(p1: Unit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
    def this(p1: Unit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
    def this(p1: Unit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
    def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
    def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
    
    /**
      * the associated bounding rectangle of the quadrilateral
      */
    /* CompleteClass */
    var bounds: typings.geometryDom.GeometryDom.DOMRectReadOnly = js.native
    
    /**
      * a DOMPoint that represents p1 of the quadrilateral
      */
    /* CompleteClass */
    var p1: typings.geometryDom.GeometryDom.DOMPoint = js.native
    
    /**
      * a DOMPoint that represents p2 of the quadrilateral
      */
    /* CompleteClass */
    var p2: typings.geometryDom.GeometryDom.DOMPoint = js.native
    
    /**
      * a DOMPoint that represents p3 of the quadrilateral
      */
    /* CompleteClass */
    var p3: typings.geometryDom.GeometryDom.DOMPoint = js.native
    
    /**
      * a DOMPoint that represents p4 of the quadrilateral
      */
    /* CompleteClass */
    var p4: typings.geometryDom.GeometryDom.DOMPoint = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMRect")
  @js.native
  open class DOMRect protected ()
    extends StObject
       with typings.geometryDom.GeometryDom.DOMRect {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    
    /**
      * max(y coordinate, y coordinate + height dimension)
      */
    /* CompleteClass */
    var bottom: Double = js.native
    
    /**
      * height value
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * min(x coordinate, x coordinate + width dimension)
      */
    /* CompleteClass */
    var left: Double = js.native
    
    /**
      * max(x coordinate, x coordinate + width dimension)
      */
    /* CompleteClass */
    var right: Double = js.native
    
    /**
      * min(y coordinate, y coordinate + height dimension)
      */
    /* CompleteClass */
    var top: Double = js.native
    
    /**
      * width value
      */
    /* CompleteClass */
    var width: Double = js.native
    
    /**
      * x coordinate
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * y coordinate
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DOMRectReadOnly")
  @js.native
  open class DOMRectReadOnly protected ()
    extends StObject
       with typings.geometryDom.GeometryDom.DOMRectReadOnly {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    
    /**
      * max(y coordinate, y coordinate + height dimension)
      */
    /* CompleteClass */
    var bottom: Double = js.native
    
    /**
      * height value
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * min(x coordinate, x coordinate + width dimension)
      */
    /* CompleteClass */
    var left: Double = js.native
    
    /**
      * max(x coordinate, x coordinate + width dimension)
      */
    /* CompleteClass */
    var right: Double = js.native
    
    /**
      * min(y coordinate, y coordinate + height dimension)
      */
    /* CompleteClass */
    var top: Double = js.native
    
    /**
      * width value
      */
    /* CompleteClass */
    var width: Double = js.native
    
    /**
      * x coordinate
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * y coordinate
      */
    /* CompleteClass */
    var y: Double = js.native
  }
}
