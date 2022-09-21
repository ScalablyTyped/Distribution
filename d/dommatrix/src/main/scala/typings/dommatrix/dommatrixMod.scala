package typings.dommatrix

import typings.dommatrix.typesMod.JSONMatrix
import typings.dommatrix.typesMod.PointTuple
import typings.dommatrix.typesMod.matrix
import typings.dommatrix.typesMod.matrix3d
import typings.std.DOMMatrix
import typings.std.DOMPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dommatrixMod {
  
  @JSImport("dommatrix/src/dommatrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new `DOMMatrix` compatible instance
    * with equivalent instance.
    * @class CSSMatrix
    *
    * @author thednp <https://github.com/thednp/DOMMatrix/>
    * @see https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix
    */
  @JSImport("dommatrix/src/dommatrix", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CSSMatrix {
    /**
      * @constructor
      * @param {any} args accepts all parameter configurations:
      * * valid CSS transform string,
      * * CSSMatrix/DOMMatrix instance,
      * * a 6/16 elements *Array*.
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any) = this()
  }
  
  inline def Multiply(m1: CSSMatrix, m2: CSSMatrix): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  inline def Multiply(m1: CSSMatrix, m2: JSONMatrix): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  inline def Multiply(m1: CSSMatrix, m2: DOMMatrix): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  inline def Multiply(m1: JSONMatrix, m2: CSSMatrix): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  inline def Multiply(m1: JSONMatrix, m2: JSONMatrix): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  inline def Multiply(m1: JSONMatrix, m2: DOMMatrix): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  inline def Multiply(m1: DOMMatrix, m2: CSSMatrix): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  inline def Multiply(m1: DOMMatrix, m2: JSONMatrix): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  inline def Multiply(m1: DOMMatrix, m2: DOMMatrix): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  
  inline def Rotate(rx: Double, ry: Double, rz: Double): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Rotate")(rx.asInstanceOf[js.Any], ry.asInstanceOf[js.Any], rz.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  
  inline def RotateAxisAngle(x: Double, y: Double, z: Double, alpha: Double): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("RotateAxisAngle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  
  inline def Scale(x: Double, y: Double, z: Double): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Scale")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  
  inline def Skew(angleX: Double, angleY: Double): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Skew")(angleX.asInstanceOf[js.Any], angleY.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  
  inline def SkewX(angle: Double): CSSMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("SkewX")(angle.asInstanceOf[js.Any]).asInstanceOf[CSSMatrix]
  
  inline def SkewY(angle: Double): CSSMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("SkewY")(angle.asInstanceOf[js.Any]).asInstanceOf[CSSMatrix]
  
  inline def Translate(x: Double, y: Double, z: Double): CSSMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("Translate")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[CSSMatrix]
  
  inline def fromArray(array: matrix): CSSMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[CSSMatrix]
  inline def fromArray(array: matrix3d): CSSMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[CSSMatrix]
  
  inline def fromMatrix(m: CSSMatrix): CSSMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(m.asInstanceOf[js.Any]).asInstanceOf[CSSMatrix]
  inline def fromMatrix(m: JSONMatrix): CSSMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(m.asInstanceOf[js.Any]).asInstanceOf[CSSMatrix]
  inline def fromMatrix(m: DOMMatrix): CSSMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(m.asInstanceOf[js.Any]).asInstanceOf[CSSMatrix]
  
  inline def fromString(source: String): CSSMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(source.asInstanceOf[js.Any]).asInstanceOf[CSSMatrix]
  
  inline def toArray(m: CSSMatrix): matrix | matrix3d = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(m.asInstanceOf[js.Any]).asInstanceOf[matrix | matrix3d]
  inline def toArray(m: CSSMatrix, is2D: Boolean): matrix | matrix3d = (^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(m.asInstanceOf[js.Any], is2D.asInstanceOf[js.Any])).asInstanceOf[matrix | matrix3d]
  
  /**
    * Creates and returns a new `DOMMatrix` compatible instance
    * with equivalent instance.
    * @class CSSMatrix
    *
    * @author thednp <https://github.com/thednp/DOMMatrix/>
    * @see https://developer.mozilla.org/en-US/docs/Web/API/DOMMatrix
    */
  @js.native
  trait CSSMatrix extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var c: Double = js.native
    
    var d: Double = js.native
    
    var e: Double = js.native
    
    var f: Double = js.native
    
    /**
      * A `Boolean` flag whose value is `true` if the matrix was initialized as a 2D matrix
      * and `false` if the matrix is 3D.
      *
      * @return {boolean} the current property value
      */
    def is2D: Boolean = js.native
    
    /**
      * A `Boolean` whose value is `true` if the matrix is the identity matrix. The identity
      * matrix is one in which every value is 0 except those on the main diagonal from top-left
      * to bottom-right corner (in other words, where the offsets in each direction are equal).
      *
      * @return {boolean} the current property value
      */
    def isIdentity: Boolean = js.native
    
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
    
    /**
      * The Multiply method returns a new CSSMatrix which is the result of this
      * matrix multiplied by the passed matrix, with the passed matrix to the right.
      * This matrix is not modified.
      *
      * @param {CSSMatrix | DOMMatrix | CSSM.JSONMatrix} m2 CSSMatrix
      * @return {CSSMatrix} The resulted matrix.
      */
    def multiply(m2: CSSMatrix): CSSMatrix = js.native
    def multiply(m2: JSONMatrix): CSSMatrix = js.native
    def multiply(m2: DOMMatrix): CSSMatrix = js.native
    
    /**
      * The rotate method returns a new matrix which is this matrix post multiplied
      * by each of 3 rotation matrices about the major axes, first X, then Y, then Z.
      * If the y and z components are undefined, the x value is used to rotate the
      * object about the z axis, as though the vector (0,0,x) were passed. All
      * rotation values are in degrees. This matrix is not modified.
      *
      * @param {number} rx The X component of the rotation, or Z if Y and Z are null.
      * @param {number=} ry The (optional) Y component of the rotation value.
      * @param {number=} rz The (optional) Z component of the rotation value.
      * @return {CSSMatrix} The resulted matrix
      */
    def rotate(rx: Double): CSSMatrix = js.native
    def rotate(rx: Double, ry: Double): CSSMatrix = js.native
    def rotate(rx: Double, ry: Double, rz: Double): CSSMatrix = js.native
    def rotate(rx: Double, ry: Unit, rz: Double): CSSMatrix = js.native
    
    /**
      * The rotateAxisAngle method returns a new matrix which is this matrix post
      * multiplied by a rotation matrix with the given axis and `angle`. The right-hand
      * rule is used to determine the direction of rotation. All rotation values are
      * in degrees. This matrix is not modified.
      *
      * @param {number} x The X component of the axis vector.
      * @param {number} y The Y component of the axis vector.
      * @param {number} z The Z component of the axis vector.
      * @param {number} angle The angle of rotation about the axis vector, in degrees.
      * @return {CSSMatrix} The resulted matrix
      */
    def rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): CSSMatrix = js.native
    
    /**
      * The scale method returns a new matrix which is this matrix post multiplied by
      * a scale matrix containing the passed values. If the z component is undefined,
      * a 1 value is used in its place. If the y component is undefined, the x
      * component value is used in its place. This matrix is not modified.
      *
      * @param {number} x The X component of the scale value.
      * @param {number=} y The Y component of the scale value.
      * @param {number=} z The Z component of the scale value.
      * @return {CSSMatrix} The resulted matrix
      */
    def scale(x: Double): CSSMatrix = js.native
    def scale(x: Double, y: Double): CSSMatrix = js.native
    def scale(x: Double, y: Double, z: Double): CSSMatrix = js.native
    def scale(x: Double, y: Unit, z: Double): CSSMatrix = js.native
    
    /**
      * The `setMatrixValue` method replaces the existing matrix with one computed
      * in the browser. EG: `matrix(1,0.25,-0.25,1,0,0)`
      *
      * The method accepts any *Array* values, the result of
      * `DOMMatrix` instance method `toFloat64Array()` / `toFloat32Array()` calls
      *  or `CSSMatrix` instance method `toArray()`.
      *
      * This method expects valid *matrix()* / *matrix3d()* string values, as well
      * as other transform functions like *translateX(10px)*.
      *
      * @param {string | CSSM.matrix | CSSM.matrix3d | CSSMatrix | DOMMatrix | CSSM.JSONMatrix} source
      * @return {CSSMatrix} the matrix instance
      */
    def setMatrixValue(source: String): CSSMatrix = js.native
    def setMatrixValue(source: CSSMatrix): CSSMatrix = js.native
    def setMatrixValue(source: JSONMatrix): CSSMatrix = js.native
    def setMatrixValue(source: matrix): CSSMatrix = js.native
    def setMatrixValue(source: matrix3d): CSSMatrix = js.native
    def setMatrixValue(source: DOMMatrix): CSSMatrix = js.native
    
    /**
      * Specifies a skew transformation along both the `x-axis` and `y-axis`.
      * This matrix is not modified.
      *
      * @param {number} angleX The X-angle amount in degrees to skew.
      * @param {number} angleY The angle amount in degrees to skew.
      * @return {CSSMatrix} The resulted matrix
      */
    def skew(angleX: Double, angleY: Double): CSSMatrix = js.native
    
    /**
      * Specifies a skew transformation along the `x-axis` by the given angle.
      * This matrix is not modified.
      *
      * @param {number} angle The angle amount in degrees to skew.
      * @return {CSSMatrix} The resulted matrix
      */
    def skewX(angle: Double): CSSMatrix = js.native
    
    /**
      * Specifies a skew transformation along the `y-axis` by the given angle.
      * This matrix is not modified.
      *
      * @param {number} angle The angle amount in degrees to skew.
      * @return {CSSMatrix} The resulted matrix
      */
    def skewY(angle: Double): CSSMatrix = js.native
    
    /**
      * Returns a *Float32Array* containing elements which comprise the matrix.
      * The method can return either the 16 elements or the 6 elements
      * depending on the value of the `is2D` parameter.
      *
      * @param {boolean=} is2D *Array* representation of the matrix
      * @return {Float32Array} an *Array* representation of the matrix
      */
    def toFloat32Array(): js.typedarray.Float32Array = js.native
    def toFloat32Array(is2D: Boolean): js.typedarray.Float32Array = js.native
    
    /**
      * Returns a *Float64Array* containing elements which comprise the matrix.
      * The method can return either the 16 elements or the 6 elements
      * depending on the value of the `is2D` parameter.
      *
      * @param {boolean=} is2D *Array* representation of the matrix
      * @return {Float64Array} an *Array* representation of the matrix
      */
    def toFloat64Array(): js.typedarray.Float64Array = js.native
    def toFloat64Array(is2D: Boolean): js.typedarray.Float64Array = js.native
    
    /**
      * Returns a JSON representation of the `CSSMatrix` instance, a standard *Object*
      * that includes `{a,b,c,d,e,f}` and `{m11,m12,m13,..m44}` properties as well
      * as the `is2D` & `isIdentity` properties.
      *
      * The result can also be used as a second parameter for the `fromMatrix` static method
      * to load values into another matrix instance.
      *
      * @return {CSSM.JSONMatrix} an *Object* with all matrix values.
      */
    def toJSON(): JSONMatrix = js.native
    
    /**
      * Transforms a specified vector using the matrix, returning a new
      * {x,y,z,w} Tuple *Object* comprising the transformed vector.
      * Neither the matrix nor the original vector are altered.
      *
      * @param {CSSM.PointTuple} t Tuple with `{x,y,z,w}` components
      * @return {CSSM.PointTuple} the resulting Tuple
      */
    def transform(t: PointTuple): PointTuple = js.native
    
    /**
      * Transforms a specified point using the matrix, returning a new
      * Tuple *Object* comprising of the transformed point.
      * Neither the matrix nor the original point are altered.
      *
      * The method is equivalent with `transformPoint()` method
      * of the `DOMMatrix` constructor.
      *
      * @copyright thednp © 2021
      *
      * @param {CSSM.PointTuple | DOMPoint} v Tuple or DOMPoint
      * @return {CSSM.PointTuple} the resulting Tuple
      */
    def transformPoint(v: PointTuple): PointTuple = js.native
    def transformPoint(v: DOMPoint): PointTuple = js.native
    
    /**
      * The translate method returns a new matrix which is this matrix post
      * multiplied by a translation matrix containing the passed values. If the z
      * component is undefined, a 0 value is used in its place. This matrix is not
      * modified.
      *
      * @param {number} x X component of the translation value.
      * @param {number=} y Y component of the translation value.
      * @param {number=} z Z component of the translation value.
      * @return {CSSMatrix} The resulted matrix
      */
    def translate(x: Double): CSSMatrix = js.native
    def translate(x: Double, y: Double): CSSMatrix = js.native
    def translate(x: Double, y: Double, z: Double): CSSMatrix = js.native
    def translate(x: Double, y: Unit, z: Double): CSSMatrix = js.native
  }
}
