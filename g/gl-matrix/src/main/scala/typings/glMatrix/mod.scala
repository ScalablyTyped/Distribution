package typings.glMatrix

import typings.glMatrix.glMatrixNumbers.`0.000001`
import typings.std.ArrayConstructor
import typings.std.Float32Array
import typings.std.Float32ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object glMatrix {
    
    @JSImport("gl-matrix", "glMatrix")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gl-matrix", "glMatrix.ARRAY_TYPE")
    @js.native
    def ARRAY_TYPE: ArrayConstructor | Float32ArrayConstructor = js.native
    inline def ARRAY_TYPE_=(x: ArrayConstructor | Float32ArrayConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARRAY_TYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("gl-matrix", "glMatrix.EPSILON")
    @js.native
    val EPSILON: `0.000001` = js.native
    
    inline def RANDOM(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("RANDOM")().asInstanceOf[Double]
    
    inline def equals_(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def setMatrixArrayType(`type`: ArrayConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMatrixArrayType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setMatrixArrayType(`type`: Float32ArrayConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMatrixArrayType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def toRadian(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toRadian")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  object mat2 {
    
    @JSImport("gl-matrix", "mat2")
    @js.native
    val ^ : js.Any = js.native
    
    inline def LDU(L: ReadonlyMat2, D: ReadonlyMat2, U: ReadonlyMat2, a: ReadonlyMat2): js.Array[ReadonlyMat2] = (^.asInstanceOf[js.Dynamic].applyDynamic("LDU")(L.asInstanceOf[js.Any], D.asInstanceOf[js.Any], U.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReadonlyMat2]]
    
    inline def add(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def adjoint(out: mat2, a: ReadonlyMat2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("adjoint")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def clone_(a: ReadonlyMat2): mat2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[mat2]
    
    inline def copy(out: mat2, a: ReadonlyMat2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def create(): mat2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[mat2]
    
    inline def determinant(a: ReadonlyMat2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyMat2, b: ReadonlyMat2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyMat2, b: ReadonlyMat2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def frob(a: ReadonlyMat2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("frob")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromRotation(out: mat2, rad: Double): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(out.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def fromScaling(out: mat2, v: ReadonlyVec2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScaling")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def fromValues(m00: Double, m01: Double, m10: Double, m11: Double): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def identity(out: mat2): mat2 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(out.asInstanceOf[js.Any]).asInstanceOf[mat2]
    
    inline def invert(out: mat2, a: ReadonlyMat2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def mul(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def multiply(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def multiplyScalar(out: mat2, a: ReadonlyMat2, b: Double): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalar")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def multiplyScalarAndAdd(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2, scale: Double): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalarAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def rotate(out: mat2, a: ReadonlyMat2, rad: Double): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def scale(out: mat2, a: ReadonlyMat2, v: ReadonlyVec2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def set(out: mat2, m00: Double, m01: Double, m10: Double, m11: Double): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def str(a: ReadonlyMat2): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def subtract(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2]
    
    inline def transpose(out: mat2, a: ReadonlyMat2): mat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat2]
  }
  type mat2 = (js.Tuple4[Double, Double, Double, Double]) | Float32Array
  
  object mat2d {
    
    @JSImport("gl-matrix", "mat2d")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def clone_(a: ReadonlyMat2d): mat2d = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[mat2d]
    
    inline def copy(out: mat2d, a: ReadonlyMat2d): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def create(): mat2d = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[mat2d]
    
    inline def determinant(a: ReadonlyMat2d): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyMat2d, b: ReadonlyMat2d): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyMat2d, b: ReadonlyMat2d): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def frob(a: ReadonlyMat2d): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("frob")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromRotation(out: mat2d, rad: Double): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(out.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def fromScaling(out: mat2d, v: ReadonlyVec2): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScaling")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def fromTranslation(out: mat2d, v: ReadonlyVec2): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslation")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def fromValues(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def identity(out: mat2d): mat2d = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(out.asInstanceOf[js.Any]).asInstanceOf[mat2d]
    
    inline def invert(out: mat2d, a: ReadonlyMat2d): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def mul(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def multiply(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def multiplyScalar(out: mat2d, a: ReadonlyMat2d, b: Double): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalar")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def multiplyScalarAndAdd(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d, scale: Double): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalarAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def rotate(out: mat2d, a: ReadonlyMat2d, rad: Double): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def scale(out: mat2d, a: ReadonlyMat2d, v: ReadonlyVec2): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def set(out: mat2d, a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], ty.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def str(a: ReadonlyMat2d): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def subtract(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat2d]
    
    inline def translate(out: mat2d, a: ReadonlyMat2d, v: ReadonlyVec2): mat2d = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat2d]
  }
  type mat2d = (js.Tuple6[Double, Double, Double, Double, Double, Double]) | Float32Array
  
  object mat3 {
    
    @JSImport("gl-matrix", "mat3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def adjoint(out: mat3, a: ReadonlyMat3): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("adjoint")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def clone_(a: ReadonlyMat3): mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[mat3]
    
    inline def copy(out: mat3, a: ReadonlyMat3): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def create(): mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[mat3]
    
    inline def determinant(a: ReadonlyMat3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def frob(a: ReadonlyMat3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("frob")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromMat2d(out: mat3, a: ReadonlyMat2d): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat2d")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def fromMat4(out: mat3, a: ReadonlyMat4): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def fromQuat(out: mat3, q: ReadonlyQuat): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuat")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def fromRotation(out: mat3, rad: Double): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(out.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def fromScaling(out: mat3, v: ReadonlyVec2): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScaling")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def fromTranslation(out: mat3, v: ReadonlyVec2): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslation")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def fromValues(
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m02.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any], m12.asInstanceOf[js.Any], m20.asInstanceOf[js.Any], m21.asInstanceOf[js.Any], m22.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def identity(out: mat3): mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(out.asInstanceOf[js.Any]).asInstanceOf[mat3]
    
    inline def invert(out: mat3, a: ReadonlyMat3): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def mul(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def multiply(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def multiplyScalar(out: mat3, a: ReadonlyMat3, b: Double): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalar")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def multiplyScalarAndAdd(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3, scale: Double): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalarAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def normalFromMat4(out: mat3, a: ReadonlyMat4): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalFromMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def projection(out: mat3, width: Double, height: Double): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("projection")(out.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def rotate(out: mat3, a: ReadonlyMat3, rad: Double): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def scale(out: mat3, a: ReadonlyMat3, v: ReadonlyVec2): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def set(
      out: mat3,
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m02.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any], m12.asInstanceOf[js.Any], m20.asInstanceOf[js.Any], m21.asInstanceOf[js.Any], m22.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def str(a: ReadonlyMat3): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def subtract(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def translate(out: mat3, a: ReadonlyMat3, v: ReadonlyVec2): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat3]
    
    inline def transpose(out: mat3, a: ReadonlyMat3): mat3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat3]
  }
  type mat3 = (js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]) | Float32Array
  
  object mat4 {
    
    @JSImport("gl-matrix", "mat4")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def adjoint(out: mat4, a: ReadonlyMat4): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("adjoint")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def clone_(a: ReadonlyMat4): mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[mat4]
    
    inline def copy(out: mat4, a: ReadonlyMat4): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def create(): mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[mat4]
    
    inline def determinant(a: ReadonlyMat4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("determinant")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyMat4, b: ReadonlyMat4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyMat4, b: ReadonlyMat4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def frob(a: ReadonlyMat4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("frob")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromQuat(out: mat4, q: ReadonlyQuat): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuat")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromQuat2(out: mat4, a: ReadonlyQuat2): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQuat2")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromRotation(out: mat4, rad: Double, axis: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(out.asInstanceOf[js.Any], rad.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromRotationTranslation(out: mat4, q: js.Any, v: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslation")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromRotationTranslationScale(out: mat4, q: js.Any, v: ReadonlyVec3, s: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslationScale")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any], v.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromRotationTranslationScaleOrigin(out: mat4, q: js.Any, v: ReadonlyVec3, s: ReadonlyVec3, o: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslationScaleOrigin")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any], v.asInstanceOf[js.Any], s.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromScaling(out: mat4, v: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromScaling")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromTranslation(out: mat4, v: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslation")(out.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromValues(
      m00: Double,
      m01: Double,
      m02: Double,
      m03: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m13: Double,
      m20: Double,
      m21: Double,
      m22: Double,
      m23: Double,
      m30: Double,
      m31: Double,
      m32: Double,
      m33: Double
    ): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m02.asInstanceOf[js.Any], m03.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any], m12.asInstanceOf[js.Any], m13.asInstanceOf[js.Any], m20.asInstanceOf[js.Any], m21.asInstanceOf[js.Any], m22.asInstanceOf[js.Any], m23.asInstanceOf[js.Any], m30.asInstanceOf[js.Any], m31.asInstanceOf[js.Any], m32.asInstanceOf[js.Any], m33.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromXRotation(out: mat4, rad: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromXRotation")(out.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromYRotation(out: mat4, rad: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromYRotation")(out.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def fromZRotation(out: mat4, rad: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromZRotation")(out.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def frustum(out: mat4, left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("frustum")(out.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def getRotation(out: quat, mat: ReadonlyMat4): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("getRotation")(out.asInstanceOf[js.Any], mat.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def getScaling(out: vec3, mat: ReadonlyMat4): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaling")(out.asInstanceOf[js.Any], mat.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def getTranslation(out: vec3, mat: ReadonlyMat4): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(out.asInstanceOf[js.Any], mat.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def identity(out: mat4): mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(out.asInstanceOf[js.Any]).asInstanceOf[mat4]
    
    inline def invert(out: mat4, a: ReadonlyMat4): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def lookAt(out: mat4, eye: ReadonlyVec3, center: ReadonlyVec3, up: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(out.asInstanceOf[js.Any], eye.asInstanceOf[js.Any], center.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def mul(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def multiply(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def multiplyScalar(out: mat4, a: ReadonlyMat4, b: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalar")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def multiplyScalarAndAdd(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4, scale: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyScalarAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def ortho(out: mat4, left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("ortho")(out.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def perspective(out: mat4, fovy: Double, aspect: Double, near: Double, far: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("perspective")(out.asInstanceOf[js.Any], fovy.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def perspectiveFromFieldOfView(out: mat4, fov: js.Any, near: Double, far: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("perspectiveFromFieldOfView")(out.asInstanceOf[js.Any], fov.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def rotate(out: mat4, a: ReadonlyMat4, rad: Double, axis: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def rotateX(out: mat4, a: ReadonlyMat4, rad: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateX")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def rotateY(out: mat4, a: ReadonlyMat4, rad: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateY")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def rotateZ(out: mat4, a: ReadonlyMat4, rad: Double): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateZ")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def scale(out: mat4, a: ReadonlyMat4, v: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def set(
      out: mat4,
      m00: Double,
      m01: Double,
      m02: Double,
      m03: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m13: Double,
      m20: Double,
      m21: Double,
      m22: Double,
      m23: Double,
      m30: Double,
      m31: Double,
      m32: Double,
      m33: Double
    ): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], m00.asInstanceOf[js.Any], m01.asInstanceOf[js.Any], m02.asInstanceOf[js.Any], m03.asInstanceOf[js.Any], m10.asInstanceOf[js.Any], m11.asInstanceOf[js.Any], m12.asInstanceOf[js.Any], m13.asInstanceOf[js.Any], m20.asInstanceOf[js.Any], m21.asInstanceOf[js.Any], m22.asInstanceOf[js.Any], m23.asInstanceOf[js.Any], m30.asInstanceOf[js.Any], m31.asInstanceOf[js.Any], m32.asInstanceOf[js.Any], m33.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def str(a: ReadonlyMat4): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def subtract(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def targetTo(out: mat4, eye: ReadonlyVec3, target: js.Any, up: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("targetTo")(out.asInstanceOf[js.Any], eye.asInstanceOf[js.Any], target.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def translate(out: mat4, a: ReadonlyMat4, v: ReadonlyVec3): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[mat4]
    
    inline def transpose(out: mat4, a: ReadonlyMat4): mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[mat4]
  }
  type mat4 = (js.Tuple16[
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]) | Float32Array
  
  object quat {
    
    @JSImport("gl-matrix", "quat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gl-matrix", "quat.add")
    @js.native
    val add: js.Function3[/* out */ vec4, /* a */ ReadonlyVec4, /* b */ ReadonlyVec4, vec4] = js.native
    
    inline def calculateW(out: quat, a: ReadonlyQuat): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateW")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    @JSImport("gl-matrix", "quat.clone")
    @js.native
    val clone_ : js.Function1[/* a */ ReadonlyVec4, vec4] = js.native
    
    inline def conjugate(out: quat, a: ReadonlyQuat): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("conjugate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    @JSImport("gl-matrix", "quat.copy")
    @js.native
    val copy: js.Function2[/* out */ vec4, /* a */ ReadonlyVec4, vec4] = js.native
    
    inline def create(): quat = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[quat]
    
    @JSImport("gl-matrix", "quat.dot")
    @js.native
    val dot: js.Function2[/* a */ ReadonlyVec4, /* b */ ReadonlyVec4, Double] = js.native
    
    @JSImport("gl-matrix", "quat.equals")
    @js.native
    val equals_ : js.Function2[/* a */ ReadonlyVec4, /* b */ ReadonlyVec4, Boolean] = js.native
    
    @JSImport("gl-matrix", "quat.exactEquals")
    @js.native
    val exactEquals: js.Function2[/* a */ ReadonlyVec4, /* b */ ReadonlyVec4, Boolean] = js.native
    
    inline def exp(out: quat, a: ReadonlyQuat): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("exp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def fromEuler(out: quat, x: js.Any, y: js.Any, z: js.Any): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEuler")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def fromMat3(out: quat, m: ReadonlyMat3): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat3")(out.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    @JSImport("gl-matrix", "quat.fromValues")
    @js.native
    val fromValues: js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, vec4] = js.native
    
    inline def getAngle(a: ReadonlyQuat, b: ReadonlyQuat): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getAxisAngle(out_axis: vec3, q: ReadonlyQuat): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisAngle")(out_axis.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def identity(out: quat): quat = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(out.asInstanceOf[js.Any]).asInstanceOf[quat]
    
    inline def invert(out: quat, a: ReadonlyQuat): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    @JSImport("gl-matrix", "quat.len")
    @js.native
    val len: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    @JSImport("gl-matrix", "quat.length")
    @js.native
    val length: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    @JSImport("gl-matrix", "quat.lerp")
    @js.native
    val lerp: js.Function4[/* out */ vec4, /* a */ ReadonlyVec4, /* b */ ReadonlyVec4, /* t */ Double, vec4] = js.native
    
    inline def ln(out: quat, a: ReadonlyQuat): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("ln")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def mul(out: quat, a: ReadonlyQuat, b: ReadonlyQuat): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def multiply(out: quat, a: ReadonlyQuat, b: ReadonlyQuat): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    @JSImport("gl-matrix", "quat.normalize")
    @js.native
    val normalize: js.Function2[/* out */ vec4, /* a */ ReadonlyVec4, vec4] = js.native
    
    inline def pow(out: quat, a: ReadonlyQuat, b: Double): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def random(out: quat): quat = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any]).asInstanceOf[quat]
    
    inline def rotateX(out: quat, a: ReadonlyQuat, rad: Double): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateX")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def rotateY(out: quat, a: ReadonlyQuat, rad: Double): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateY")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def rotateZ(out: quat, a: ReadonlyQuat, rad: Double): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateZ")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def rotationTo(out: js.Any, a: js.Any, b: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationTo")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSImport("gl-matrix", "quat.scale")
    @js.native
    val scale: js.Function3[/* out */ vec4, /* a */ ReadonlyVec4, /* b */ Double, vec4] = js.native
    
    @JSImport("gl-matrix", "quat.set")
    @js.native
    val set: js.Function5[/* out */ vec4, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, vec4] = js.native
    
    inline def setAxes(out: js.Any, view: js.Any, right: js.Any, up: js.Any): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("setAxes")(out.asInstanceOf[js.Any], view.asInstanceOf[js.Any], right.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def setAxisAngle(out: quat, axis: ReadonlyVec3, rad: Double): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("setAxisAngle")(out.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def slerp(out: quat, a: ReadonlyQuat, b: ReadonlyQuat, t: Double): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    inline def sqlerp(out: js.Any, a: js.Any, b: js.Any, c: js.Any, d: js.Any, t: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sqlerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSImport("gl-matrix", "quat.sqrLen")
    @js.native
    val sqrLen: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    @JSImport("gl-matrix", "quat.squaredLength")
    @js.native
    val squaredLength: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    inline def str(a: ReadonlyQuat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  type quat = (js.Tuple4[Double, Double, Double, Double]) | Float32Array
  
  object quat2 {
    
    @JSImport("gl-matrix", "quat2")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: quat2, a: ReadonlyQuat2, b: ReadonlyQuat2): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def clone_(a: ReadonlyQuat2): quat2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[quat2]
    
    inline def conjugate(out: quat2, a: ReadonlyQuat2): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("conjugate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def copy(out: quat2, a: ReadonlyQuat2): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def create(): quat2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[quat2]
    
    @JSImport("gl-matrix", "quat2.dot")
    @js.native
    val dot: js.Function2[/* a */ ReadonlyVec4, /* b */ ReadonlyVec4, Double] = js.native
    
    inline def equals_(a: ReadonlyQuat2, b: ReadonlyQuat2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyQuat2, b: ReadonlyQuat2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromMat4(out: quat2, a: ReadonlyMat4): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def fromRotation(out: js.Any, q: ReadonlyQuat): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def fromRotationTranslation(out: js.Any, q: ReadonlyQuat, t: ReadonlyVec3): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslation")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def fromRotationTranslationValues(x1: Double, y1: Double, z1: Double, w1: Double, x2: Double, y2: Double, z2: Double): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRotationTranslationValues")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], w1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def fromTranslation(out: js.Any, t: ReadonlyVec3): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslation")(out.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def fromValues(x1: Double, y1: Double, z1: Double, w1: Double, x2: Double, y2: Double, z2: Double, w2: Double): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], w1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], w2.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def getDual(out: quat, a: ReadonlyQuat2): quat = (^.asInstanceOf[js.Dynamic].applyDynamic("getDual")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat]
    
    @JSImport("gl-matrix", "quat2.getReal")
    @js.native
    val getReal: js.Function2[/* out */ vec4, /* a */ ReadonlyVec4, vec4] = js.native
    
    inline def getTranslation(out: vec3, a: ReadonlyQuat2): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslation")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def identity(out: quat2): quat2 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(out.asInstanceOf[js.Any]).asInstanceOf[quat2]
    
    inline def invert(out: quat2, a: ReadonlyQuat2): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("invert")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    @JSImport("gl-matrix", "quat2.len")
    @js.native
    val len: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    @JSImport("gl-matrix", "quat2.length")
    @js.native
    val length: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    inline def lerp(out: quat2, a: ReadonlyQuat2, b: ReadonlyQuat2, t: Double): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def mul(out: quat2, a: ReadonlyQuat2, b: ReadonlyQuat2): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def multiply(out: quat2, a: ReadonlyQuat2, b: ReadonlyQuat2): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def normalize(out: quat2, a: ReadonlyQuat2): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def rotateAroundAxis(out: quat2, a: ReadonlyQuat2, axis: ReadonlyVec3, rad: Double): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateAroundAxis")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def rotateByQuatAppend(out: quat2, a: ReadonlyQuat2, q: ReadonlyQuat): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateByQuatAppend")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def rotateByQuatPrepend(out: quat2, q: ReadonlyQuat, a: ReadonlyQuat2): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateByQuatPrepend")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def rotateX(out: quat2, a: ReadonlyQuat2, rad: Double): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateX")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def rotateY(out: quat2, a: ReadonlyQuat2, rad: Double): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateY")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def rotateZ(out: quat2, a: ReadonlyQuat2, rad: Double): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateZ")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def scale(out: quat2, a: ReadonlyQuat2, b: Double): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def set(
      out: quat2,
      x1: Double,
      y1: Double,
      z1: Double,
      w1: Double,
      x2: Double,
      y2: Double,
      z2: Double,
      w2: Double
    ): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], z1.asInstanceOf[js.Any], w1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], z2.asInstanceOf[js.Any], w2.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    inline def setDual(out: quat2, q: ReadonlyQuat): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("setDual")(out.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[quat2]
    
    @JSImport("gl-matrix", "quat2.setReal")
    @js.native
    val setReal: js.Function2[/* out */ vec4, /* a */ ReadonlyVec4, vec4] = js.native
    
    @JSImport("gl-matrix", "quat2.sqrLen")
    @js.native
    val sqrLen: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    @JSImport("gl-matrix", "quat2.squaredLength")
    @js.native
    val squaredLength: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    inline def str(a: ReadonlyQuat2): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def translate(out: quat2, a: ReadonlyQuat2, v: ReadonlyVec3): quat2 = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[quat2]
  }
  type quat2 = (js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]) | Float32Array
  
  object vec2 {
    
    @JSImport("gl-matrix", "vec2")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def angle(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def ceil(out: vec2, a: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def clone_(a: ReadonlyVec2): vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[vec2]
    
    inline def copy(out: vec2, a: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def create(): vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[vec2]
    
    inline def cross(out: vec3, a: ReadonlyVec2, b: ReadonlyVec2): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def dist(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def distance(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def div(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def divide(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def dot(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def floor(out: vec2, a: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(a.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def fromValues(x: Double, y: Double): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def inverse(out: vec2, a: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def len(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def length(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def lerp(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2, t: Double): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def max(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def min(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def mul(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def multiply(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def negate(out: vec2, a: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def normalize(out: vec2, a: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def random(out: vec2): vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any]).asInstanceOf[vec2]
    inline def random(out: vec2, scale: Double): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def rotate(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2, rad: Double): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def round(out: vec2, a: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def scale(out: vec2, a: ReadonlyVec2, b: Double): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def scaleAndAdd(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2, scale: Double): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def set(out: vec2, x: Double, y: Double): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def sqrDist(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrDist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def sqrLen(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrLen")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def squaredDistance(a: ReadonlyVec2, b: ReadonlyVec2): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def squaredLength(a: ReadonlyVec2): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("squaredLength")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def str(a: ReadonlyVec2): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def subtract(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def transformMat2(out: vec2, a: ReadonlyVec2, m: ReadonlyMat2): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat2")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def transformMat2d(out: vec2, a: ReadonlyVec2, m: ReadonlyMat2d): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat2d")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def transformMat3(out: vec2, a: ReadonlyVec2, m: ReadonlyMat3): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat3")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def transformMat4(out: vec2, a: ReadonlyVec2, m: ReadonlyMat4): vec2 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[vec2]
    
    inline def zero(out: vec2): vec2 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(out.asInstanceOf[js.Any]).asInstanceOf[vec2]
  }
  type vec2 = (js.Tuple2[Double, Double]) | Float32Array
  
  object vec3 {
    
    @JSImport("gl-matrix", "vec3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def angle(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def bezier(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, c: ReadonlyVec3, d: ReadonlyVec3, t: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("bezier")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def ceil(out: vec3, a: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def clone_(a: ReadonlyVec3): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[vec3]
    
    inline def copy(out: vec3, a: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def create(): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[vec3]
    
    inline def cross(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def dist(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def distance(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def div(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def divide(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def dot(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def floor(out: vec3, a: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(a.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def fromValues(x: Double, y: Double, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def hermite(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, c: ReadonlyVec3, d: ReadonlyVec3, t: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hermite")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def inverse(out: vec3, a: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def len(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def length(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def lerp(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, t: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def max(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def min(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def mul(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def multiply(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def negate(out: vec3, a: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def normalize(out: vec3, a: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def random(out: vec3): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any]).asInstanceOf[vec3]
    inline def random(out: vec3, scale: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def rotateX(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateX")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def rotateY(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateY")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def rotateZ(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateZ")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rad.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def round(out: vec3, a: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def scale(out: vec3, a: ReadonlyVec3, b: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def scaleAndAdd(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, scale: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def set(out: vec3, x: Double, y: Double, z: Double): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def sqrDist(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrDist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def sqrLen(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrLen")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def squaredDistance(a: ReadonlyVec3, b: ReadonlyVec3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def squaredLength(a: ReadonlyVec3): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("squaredLength")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def str(a: ReadonlyVec3): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def subtract(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def transformMat3(out: vec3, a: ReadonlyVec3, m: ReadonlyMat3): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat3")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def transformMat4(out: vec3, a: ReadonlyVec3, m: ReadonlyMat4): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def transformQuat(out: vec3, a: ReadonlyVec3, q: ReadonlyQuat): vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformQuat")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[vec3]
    
    inline def zero(out: vec3): vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(out.asInstanceOf[js.Any]).asInstanceOf[vec3]
  }
  type vec3 = (js.Tuple3[Double, Double, Double]) | Float32Array
  
  object vec4 {
    
    @JSImport("gl-matrix", "vec4")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def ceil(out: vec4, a: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def clone_(a: ReadonlyVec4): vec4 = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(a.asInstanceOf[js.Any]).asInstanceOf[vec4]
    
    inline def copy(out: vec4, a: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def create(): vec4 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[vec4]
    
    inline def cross(out: js.Any, u: js.Any, v: js.Any, w: js.Any): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("cross")(out.asInstanceOf[js.Any], u.asInstanceOf[js.Any], v.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def dist(a: ReadonlyVec4, b: ReadonlyVec4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def distance(a: ReadonlyVec4, b: ReadonlyVec4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def div(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def divide(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def dot(a: ReadonlyVec4, b: ReadonlyVec4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dot")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def equals_(a: ReadonlyVec4, b: ReadonlyVec4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def exactEquals(a: ReadonlyVec4, b: ReadonlyVec4): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exactEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def floor(out: vec4, a: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(a.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], count.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def fromValues(x: Double, y: Double, z: Double, w: Double): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValues")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def inverse(out: vec4, a: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("inverse")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def len(a: ReadonlyVec4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("len")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def length(a: ReadonlyVec4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def lerp(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4, t: Double): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def max(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def min(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def mul(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def multiply(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def negate(out: vec4, a: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("negate")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def normalize(out: vec4, a: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def random(out: vec4): vec4 = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any]).asInstanceOf[vec4]
    inline def random(out: vec4, scale: Double): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(out.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def round(out: vec4, a: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def scale(out: vec4, a: ReadonlyVec4, b: Double): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def scaleAndAdd(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4, scale: Double): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleAndAdd")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def set(out: vec4, x: Double, y: Double, z: Double, w: Double): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(out.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def sqrDist(a: ReadonlyVec4, b: ReadonlyVec4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sqrDist")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def sqrLen(a: ReadonlyVec4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrLen")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def squaredDistance(a: ReadonlyVec4, b: ReadonlyVec4): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def squaredLength(a: ReadonlyVec4): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("squaredLength")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def str(a: ReadonlyVec4): String = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(a.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def sub(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def subtract(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def transformMat4(out: vec4, a: ReadonlyVec4, m: ReadonlyMat4): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformMat4")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def transformQuat(out: vec4, a: ReadonlyVec4, q: ReadonlyQuat): vec4 = (^.asInstanceOf[js.Dynamic].applyDynamic("transformQuat")(out.asInstanceOf[js.Any], a.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[vec4]
    
    inline def zero(out: vec4): vec4 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")(out.asInstanceOf[js.Any]).asInstanceOf[vec4]
  }
  type vec4 = (js.Tuple4[Double, Double, Double, Double]) | Float32Array
  
  type ReadonlyMat2 = (js.Tuple4[Double, Double, Double, Double]) | Float32Array
  
  type ReadonlyMat2d = (js.Tuple6[Double, Double, Double, Double, Double, Double]) | Float32Array
  
  type ReadonlyMat3 = (js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]) | Float32Array
  
  type ReadonlyMat4 = (js.Tuple16[
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]) | Float32Array
  
  type ReadonlyQuat = (js.Tuple4[Double, Double, Double, Double]) | Float32Array
  
  type ReadonlyQuat2 = (js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]) | Float32Array
  
  type ReadonlyVec2 = (js.Tuple2[Double, Double]) | Float32Array
  
  type ReadonlyVec3 = (js.Tuple3[Double, Double, Double]) | Float32Array
  
  type ReadonlyVec4 = (js.Tuple4[Double, Double, Double, Double]) | Float32Array
}
