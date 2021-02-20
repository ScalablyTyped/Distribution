package typings.geometryDom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryDom {
  
  @js.native
  trait DOMMatrix extends DOMMatrixReadOnly {
    
    def invertSelf(): DOMMatrix = js.native
    
    def multiplySelf(other: DOMMatrix): DOMMatrix = js.native
    
    def preMultiplySelf(other: DOMMatrix): DOMMatrix = js.native
    
    def rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
    
    def rotateFromVectorSelf(x: Double, y: Double): DOMMatrix = js.native
    
    def rotateSelf(angle: Double): DOMMatrix = js.native
    def rotateSelf(angle: Double, originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
    def rotateSelf(angle: Double, originX: Double): DOMMatrix = js.native
    def rotateSelf(angle: Double, originX: Double, originY: Double): DOMMatrix = js.native
    
    def scale3dSelf(scale: Double): DOMMatrix = js.native
    def scale3dSelf(
      scale: Double,
      originX: js.UndefOr[scala.Nothing],
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double, originY: js.UndefOr[scala.Nothing], originZ: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    
    def scaleNonUniformSelf(scaleX: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: js.UndefOr[scala.Nothing],
      originX: js.UndefOr[scala.Nothing],
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: js.UndefOr[scala.Nothing],
      originX: js.UndefOr[scala.Nothing],
      originY: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: js.UndefOr[scala.Nothing],
      originX: js.UndefOr[scala.Nothing],
      originY: Double,
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: js.UndefOr[scala.Nothing],
      originX: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: js.UndefOr[scala.Nothing],
      originX: Double,
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: js.UndefOr[scala.Nothing],
      originX: Double,
      originY: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: js.UndefOr[scala.Nothing],
      originX: Double,
      originY: Double,
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: js.UndefOr[scala.Nothing], scaleZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: Double,
      originX: js.UndefOr[scala.Nothing],
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: Double,
      originX: js.UndefOr[scala.Nothing],
      originY: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: Double,
      originX: js.UndefOr[scala.Nothing],
      originY: Double,
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: js.UndefOr[scala.Nothing], scaleZ: Double, originX: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: Double,
      originX: Double,
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: Double,
      originX: Double,
      originY: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      scaleZ: Double,
      originX: Double,
      originY: Double,
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: js.UndefOr[scala.Nothing],
      originX: js.UndefOr[scala.Nothing],
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: js.UndefOr[scala.Nothing],
      originX: js.UndefOr[scala.Nothing],
      originY: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: js.UndefOr[scala.Nothing],
      originX: js.UndefOr[scala.Nothing],
      originY: Double,
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: js.UndefOr[scala.Nothing], originX: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: js.UndefOr[scala.Nothing],
      originX: Double,
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: js.UndefOr[scala.Nothing],
      originX: Double,
      originY: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: js.UndefOr[scala.Nothing],
      originX: Double,
      originY: Double,
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: Double,
      originX: js.UndefOr[scala.Nothing],
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: Double,
      originX: js.UndefOr[scala.Nothing],
      originY: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: Double,
      originX: js.UndefOr[scala.Nothing],
      originY: Double,
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(
      scaleX: Double,
      scaleY: Double,
      scaleZ: Double,
      originX: Double,
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    
    def scaleSelf(scale: Double): DOMMatrix = js.native
    def scaleSelf(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
    def scaleSelf(scale: Double, originX: Double): DOMMatrix = js.native
    def scaleSelf(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    
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
    def rotate(angle: Double, originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
    def rotate(angle: Double, originX: Double): DOMMatrix = js.native
    def rotate(angle: Double, originX: Double, originY: Double): DOMMatrix = js.native
    
    def rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
    
    def rotateFromVector(x: Double, y: Double): DOMMatrix = js.native
    
    def scale(scale: Double): DOMMatrix = js.native
    def scale(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
    def scale(scale: Double, originX: Double): DOMMatrix = js.native
    def scale(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    
    def scale3d(scale: Double): DOMMatrix = js.native
    def scale3d(
      scale: Double,
      originX: js.UndefOr[scala.Nothing],
      originY: js.UndefOr[scala.Nothing],
      originZ: Double
    ): DOMMatrix = js.native
    def scale3d(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: js.UndefOr[scala.Nothing], originY: Double, originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double, originY: js.UndefOr[scala.Nothing], originZ: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
    def scale3d(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
    
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
  
  @js.native
  trait DOMPoint extends DOMPointReadOnly
  object DOMPoint {
    
    @scala.inline
    def apply(matrixTransform: DOMMatrixReadOnly => DOMPoint, w: Double, x: Double, y: Double, z: Double): DOMPoint = {
      val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMPoint]
    }
  }
  
  @js.native
  trait DOMPointReadOnly extends StObject {
    
    /**
      * Post-multiply point with matrix.
      * @param matrix
      */
    def matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint = js.native
    
    /**
      * w coordinate / readonly
      */
    var w: Double = js.native
    
    /**
      * x coordinate / readonly
      */
    var x: Double = js.native
    
    /**
      * y coordinate / readonly
      */
    var y: Double = js.native
    
    /**
      * z coordinate / readonly
      */
    var z: Double = js.native
  }
  object DOMPointReadOnly {
    
    @scala.inline
    def apply(matrixTransform: DOMMatrixReadOnly => DOMPoint, w: Double, x: Double, y: Double, z: Double): DOMPointReadOnly = {
      val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMPointReadOnly]
    }
    
    @scala.inline
    implicit class DOMPointReadOnlyMutableBuilder[Self <: DOMPointReadOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatrixTransform(value: DOMMatrixReadOnly => DOMPoint): Self = StObject.set(x, "matrixTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DOMQuad extends StObject {
    
    /**
      * the associated bounding rectangle of the quadrilateral
      */
    var bounds: DOMRectReadOnly = js.native
    
    /**
      * a DOMPoint that represents p1 of the quadrilateral
      */
    var p1: DOMPoint = js.native
    
    /**
      * a DOMPoint that represents p2 of the quadrilateral
      */
    var p2: DOMPoint = js.native
    
    /**
      * a DOMPoint that represents p3 of the quadrilateral
      */
    var p3: DOMPoint = js.native
    
    /**
      * a DOMPoint that represents p4 of the quadrilateral
      */
    var p4: DOMPoint = js.native
  }
  object DOMQuad {
    
    @scala.inline
    def apply(bounds: DOMRectReadOnly, p1: DOMPoint, p2: DOMPoint, p3: DOMPoint, p4: DOMPoint): DOMQuad = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any], p4 = p4.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMQuad]
    }
    
    @scala.inline
    implicit class DOMQuadMutableBuilder[Self <: DOMQuad] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: DOMRectReadOnly): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP1(value: DOMPoint): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP2(value: DOMPoint): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP3(value: DOMPoint): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP4(value: DOMPoint): Self = StObject.set(x, "p4", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DOMRect extends DOMRectReadOnly
  object DOMRect {
    
    @scala.inline
    def apply(
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
  
  @js.native
  trait DOMRectList extends StObject {
    
    /**
      * the DOMRect object at index must be returned.
      * @param index
      */
    def item(index: Double): DOMRect = js.native
    
    /**
      * total number of DOMRect objects associated with the object.
      * readonly unsigned long length
      */
    var length: Double = js.native
  }
  object DOMRectList {
    
    @scala.inline
    def apply(item: Double => DOMRect, length: Double): typings.geometryDom.GeometryDom.DOMRectList = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.geometryDom.GeometryDom.DOMRectList]
    }
    
    @scala.inline
    implicit class DOMRectListMutableBuilder[Self <: typings.geometryDom.GeometryDom.DOMRectList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: Double => DOMRect): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DOMRectReadOnly extends StObject {
    
    /**
      * max(y coordinate, y coordinate + height dimension)
      */
    var bottom: Double = js.native
    
    /**
      * height value
      */
    var height: Double = js.native
    
    /**
      * min(x coordinate, x coordinate + width dimension)
      */
    var left: Double = js.native
    
    /**
      * max(x coordinate, x coordinate + width dimension)
      */
    var right: Double = js.native
    
    /**
      * min(y coordinate, y coordinate + height dimension)
      */
    var top: Double = js.native
    
    /**
      * width value
      */
    var width: Double = js.native
    
    /**
      * x coordinate
      */
    var x: Double = js.native
    
    /**
      * y coordinate
      */
    var y: Double = js.native
  }
  object DOMRectReadOnly {
    
    @scala.inline
    def apply(
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
    implicit class DOMRectReadOnlyMutableBuilder[Self <: DOMRectReadOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
