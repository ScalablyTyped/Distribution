package typings.geometryDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryDom {
  
  @js.native
  trait DOMMatrix
    extends StObject
       with DOMMatrixReadOnly {
    
    def invertSelf(): DOMMatrix = js.native
    
    def multiplySelf(other: DOMMatrix): DOMMatrix = js.native
    
    def preMultiplySelf(other: DOMMatrix): DOMMatrix = js.native
    
    def rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
    
    def rotateFromVectorSelf(x: Double, y: Double): DOMMatrix = js.native
    
    def rotateSelf(angle: Double): DOMMatrix = js.native
    def rotateSelf(angle: Double, originX: Double): DOMMatrix = js.native
    def rotateSelf(angle: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def rotateSelf(angle: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    
    def scale3dSelf(scale: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    
    def scaleNonUniformSelf(scaleX: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Unit, originX: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Unit, originX: Double, originY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Unit, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Unit, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Unit, originX: Unit, originY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Unit, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Unit, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Double, originX: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Double, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Double, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Double, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Unit, originX: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Unit, originX: Double, originY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Unit, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Unit, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Unit, originX: Unit, originY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Unit, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Unit, scaleZ: Unit, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    
    def scaleSelf(scale: Double): DOMMatrix = js.native
    def scaleSelf(scale: Double, originX: Double): DOMMatrix = js.native
    def scaleSelf(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scaleSelf(scale: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    
    def setMatrixValue(transformList: DOMMatrix): DOMMatrix = js.native
    
    def skewXSelf(sx: Double): DOMMatrix = js.native
    
    def skewYSelf(sy: Double): DOMMatrix = js.native
    
    def translateSelf(tx: Double, ty: Double): DOMMatrix = js.native
    def translateSelf(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
  }
  
  @js.native
  trait DOMMatrixReadOnly extends StObject {
    
    /**
      * These attributes are simple aliases for certain elements of the 4x4 matrix
      */
    var a: Double = js.native
    
    var b: Double = js.native
    
    var c: Double = js.native
    
    var d: Double = js.native
    
    var e: Double = js.native
    
    var f: Double = js.native
    
    def flipX(): DOMMatrix = js.native
    
    def flipY(): DOMMatrix = js.native
    
    def inverse(): DOMMatrix = js.native
    
    var is2D: Boolean = js.native
    
    var isIdentity: Boolean = js.native
    
    var m11: Double = js.native
    
    var m12: Double = js.native
    
    var m13: Double = js.native
    
    var m14: Double = js.native
    
    var m21: Double = js.native
    
    var m22: Double = js.native
    
    var m23: Double = js.native
    
    var m24: Double = js.native
    
    var m31: Double = js.native
    
    var m32: Double = js.native
    
    var m33: Double = js.native
    
    var m34: Double = js.native
    
    var m41: Double = js.native
    
    var m42: Double = js.native
    
    var m43: Double = js.native
    
    var m44: Double = js.native
    
    def multiply(other: DOMMatrix): DOMMatrix = js.native
    
    def rotate(angle: Double): DOMMatrix = js.native
    def rotate(angle: Double, originX: Double): DOMMatrix = js.native
    def rotate(angle: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def rotate(angle: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    
    def rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
    
    def rotateFromVector(x: Double, y: Double): DOMMatrix = js.native
    
    def scale(scale: Double): DOMMatrix = js.native
    def scale(scale: Double, originX: Double): DOMMatrix = js.native
    def scale(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scale(scale: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    
    def scale3d(scale: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double, originY: Unit, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Unit, originY: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Unit, originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Unit, originY: Unit, originZ: Double): DOMMatrix = js.native
    
    def scaleNonUniform(
      scale: Double,
      scaleX: Double,
      scaleY: Double,
      scaleZ: Double,
      originX: Double,
      originY: Double,
      originZ: Double
    ): DOMMatrix = js.native
    
    def skewX(sx: Double): DOMMatrix = js.native
    
    def skewY(sx: Double): DOMMatrix = js.native
    
    def toFloat32Array(): js.Array[Double] = js.native
    
    def toFloat64Array(): js.Array[Double] = js.native
    
    def transformPoint(): DOMPoint = js.native
    def transformPoint(point: DOMPointInit): DOMPoint = js.native
    
    def translate(tx: Double, ty: Double): DOMMatrix = js.native
    def translate(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
  }
  
  trait DOMPoint
    extends StObject
       with DOMPointReadOnly
  object DOMPoint {
    
    inline def apply(matrixTransform: DOMMatrixReadOnly => DOMPoint, w: Double, x: Double, y: Double, z: Double): DOMPoint = {
      val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMPoint]
    }
  }
  
  trait DOMPointReadOnly extends StObject {
    
    /**
      * Post-multiply point with matrix.
      * @param matrix
      */
    def matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint
    
    /**
      * w coordinate / readonly
      */
    var w: Double
    
    /**
      * x coordinate / readonly
      */
    var x: Double
    
    /**
      * y coordinate / readonly
      */
    var y: Double
    
    /**
      * z coordinate / readonly
      */
    var z: Double
  }
  object DOMPointReadOnly {
    
    inline def apply(matrixTransform: DOMMatrixReadOnly => DOMPoint, w: Double, x: Double, y: Double, z: Double): DOMPointReadOnly = {
      val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMPointReadOnly]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DOMPointReadOnly] (val x: Self) extends AnyVal {
      
      inline def setMatrixTransform(value: DOMMatrixReadOnly => DOMPoint): Self = StObject.set(x, "matrixTransform", js.Any.fromFunction1(value))
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  trait DOMQuad extends StObject {
    
    /**
      * the associated bounding rectangle of the quadrilateral
      */
    var bounds: DOMRectReadOnly
    
    /**
      * a DOMPoint that represents p1 of the quadrilateral
      */
    var p1: DOMPoint
    
    /**
      * a DOMPoint that represents p2 of the quadrilateral
      */
    var p2: DOMPoint
    
    /**
      * a DOMPoint that represents p3 of the quadrilateral
      */
    var p3: DOMPoint
    
    /**
      * a DOMPoint that represents p4 of the quadrilateral
      */
    var p4: DOMPoint
  }
  object DOMQuad {
    
    inline def apply(bounds: DOMRectReadOnly, p1: DOMPoint, p2: DOMPoint, p3: DOMPoint, p4: DOMPoint): DOMQuad = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any], p4 = p4.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMQuad]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DOMQuad] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: DOMRectReadOnly): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setP1(value: DOMPoint): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setP2(value: DOMPoint): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      inline def setP3(value: DOMPoint): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
      
      inline def setP4(value: DOMPoint): Self = StObject.set(x, "p4", value.asInstanceOf[js.Any])
    }
  }
  
  trait DOMRect
    extends StObject
       with DOMRectReadOnly
  object DOMRect {
    
    inline def apply(
      bottom: Double,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): DOMRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMRect]
    }
  }
  
  trait DOMRectList extends StObject {
    
    /**
      * the DOMRect object at index must be returned.
      * @param index
      */
    def item(index: Double): DOMRect
    
    /**
      * total number of DOMRect objects associated with the object.
      * readonly unsigned long length
      */
    var length: Double
  }
  object DOMRectList {
    
    inline def apply(item: Double => DOMRect, length: Double): typings.geometryDom.GeometryDom.DOMRectList = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geometryDom.GeometryDom.DOMRectList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.geometryDom.GeometryDom.DOMRectList] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Double => DOMRect): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  trait DOMRectReadOnly extends StObject {
    
    /**
      * max(y coordinate, y coordinate + height dimension)
      */
    var bottom: Double
    
    /**
      * height value
      */
    var height: Double
    
    /**
      * min(x coordinate, x coordinate + width dimension)
      */
    var left: Double
    
    /**
      * max(x coordinate, x coordinate + width dimension)
      */
    var right: Double
    
    /**
      * min(y coordinate, y coordinate + height dimension)
      */
    var top: Double
    
    /**
      * width value
      */
    var width: Double
    
    /**
      * x coordinate
      */
    var x: Double
    
    /**
      * y coordinate
      */
    var y: Double
  }
  object DOMRectReadOnly {
    
    inline def apply(
      bottom: Double,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): DOMRectReadOnly = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMRectReadOnly]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DOMRectReadOnly] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
