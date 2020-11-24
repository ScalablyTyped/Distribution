package typings.glMatrix

import typings.glMatrix.glMatrixNumbers.`0.000001`
import typings.std.ArrayConstructor
import typings.std.Float32Array
import typings.std.Float32ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gl-matrix", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object glMatrix extends js.Object {
    
    var ARRAY_TYPE: ArrayConstructor | Float32ArrayConstructor = js.native
    
    val EPSILON: `0.000001` = js.native
    
    def RANDOM(): Double = js.native
    
    def equals(a: Double, b: Double): Boolean = js.native
    
    def setMatrixArrayType(`type`: ArrayConstructor): Unit = js.native
    def setMatrixArrayType(`type`: Float32ArrayConstructor): Unit = js.native
    
    def toRadian(a: Double): Double = js.native
  }
  
  @js.native
  object mat2 extends js.Object {
    
    def LDU(L: ReadonlyMat2, D: ReadonlyMat2, U: ReadonlyMat2, a: ReadonlyMat2): js.Array[ReadonlyMat2] = js.native
    
    def add(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = js.native
    
    def adjoint(out: mat2, a: ReadonlyMat2): mat2 = js.native
    
    def clone(a: ReadonlyMat2): mat2 = js.native
    
    def copy(out: mat2, a: ReadonlyMat2): mat2 = js.native
    
    def create(): mat2 = js.native
    
    def determinant(a: ReadonlyMat2): Double = js.native
    
    def equals(a: ReadonlyMat2, b: ReadonlyMat2): Boolean = js.native
    
    def exactEquals(a: ReadonlyMat2, b: ReadonlyMat2): Boolean = js.native
    
    def frob(a: ReadonlyMat2): Double = js.native
    
    def fromRotation(out: mat2, rad: Double): mat2 = js.native
    
    def fromScaling(out: mat2, v: ReadonlyVec2): mat2 = js.native
    
    def fromValues(m00: Double, m01: Double, m10: Double, m11: Double): mat2 = js.native
    
    def identity(out: mat2): mat2 = js.native
    
    def invert(out: mat2, a: ReadonlyMat2): mat2 = js.native
    
    def mul(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = js.native
    
    def multiply(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = js.native
    
    def multiplyScalar(out: mat2, a: ReadonlyMat2, b: Double): mat2 = js.native
    
    def multiplyScalarAndAdd(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2, scale: Double): mat2 = js.native
    
    def rotate(out: mat2, a: ReadonlyMat2, rad: Double): mat2 = js.native
    
    def scale(out: mat2, a: ReadonlyMat2, v: ReadonlyVec2): mat2 = js.native
    
    def set(out: mat2, m00: Double, m01: Double, m10: Double, m11: Double): mat2 = js.native
    
    def str(a: ReadonlyMat2): String = js.native
    
    def sub(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = js.native
    
    def subtract(out: mat2, a: ReadonlyMat2, b: ReadonlyMat2): mat2 = js.native
    
    def transpose(out: mat2, a: ReadonlyMat2): mat2 = js.native
  }
  
  @js.native
  object mat2d extends js.Object {
    
    def add(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = js.native
    
    def clone(a: ReadonlyMat2d): mat2d = js.native
    
    def copy(out: mat2d, a: ReadonlyMat2d): mat2d = js.native
    
    def create(): mat2d = js.native
    
    def determinant(a: ReadonlyMat2d): Double = js.native
    
    def equals(a: ReadonlyMat2d, b: ReadonlyMat2d): Boolean = js.native
    
    def exactEquals(a: ReadonlyMat2d, b: ReadonlyMat2d): Boolean = js.native
    
    def frob(a: ReadonlyMat2d): Double = js.native
    
    def fromRotation(out: mat2d, rad: Double): mat2d = js.native
    
    def fromScaling(out: mat2d, v: ReadonlyVec2): mat2d = js.native
    
    def fromTranslation(out: mat2d, v: ReadonlyVec2): mat2d = js.native
    
    def fromValues(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): mat2d = js.native
    
    def identity(out: mat2d): mat2d = js.native
    
    def invert(out: mat2d, a: ReadonlyMat2d): mat2d = js.native
    
    def mul(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = js.native
    
    def multiply(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = js.native
    
    def multiplyScalar(out: mat2d, a: ReadonlyMat2d, b: Double): mat2d = js.native
    
    def multiplyScalarAndAdd(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d, scale: Double): mat2d = js.native
    
    def rotate(out: mat2d, a: ReadonlyMat2d, rad: Double): mat2d = js.native
    
    def scale(out: mat2d, a: ReadonlyMat2d, v: ReadonlyVec2): mat2d = js.native
    
    def set(out: mat2d, a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): mat2d = js.native
    
    def str(a: ReadonlyMat2d): String = js.native
    
    def sub(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = js.native
    
    def subtract(out: mat2d, a: ReadonlyMat2d, b: ReadonlyMat2d): mat2d = js.native
    
    def translate(out: mat2d, a: ReadonlyMat2d, v: ReadonlyVec2): mat2d = js.native
  }
  
  @js.native
  object mat3 extends js.Object {
    
    def add(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = js.native
    
    def adjoint(out: mat3, a: ReadonlyMat3): mat3 = js.native
    
    def clone(a: ReadonlyMat3): mat3 = js.native
    
    def copy(out: mat3, a: ReadonlyMat3): mat3 = js.native
    
    def create(): mat3 = js.native
    
    def determinant(a: ReadonlyMat3): Double = js.native
    
    def equals(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = js.native
    
    def exactEquals(a: ReadonlyMat3, b: ReadonlyMat3): Boolean = js.native
    
    def frob(a: ReadonlyMat3): Double = js.native
    
    def fromMat2d(out: mat3, a: ReadonlyMat2d): mat3 = js.native
    
    def fromMat4(out: mat3, a: ReadonlyMat4): mat3 = js.native
    
    def fromQuat(out: mat3, q: ReadonlyQuat): mat3 = js.native
    
    def fromRotation(out: mat3, rad: Double): mat3 = js.native
    
    def fromScaling(out: mat3, v: ReadonlyVec2): mat3 = js.native
    
    def fromTranslation(out: mat3, v: ReadonlyVec2): mat3 = js.native
    
    def fromValues(
      m00: Double,
      m01: Double,
      m02: Double,
      m10: Double,
      m11: Double,
      m12: Double,
      m20: Double,
      m21: Double,
      m22: Double
    ): mat3 = js.native
    
    def identity(out: mat3): mat3 = js.native
    
    def invert(out: mat3, a: ReadonlyMat3): mat3 = js.native
    
    def mul(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = js.native
    
    def multiply(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = js.native
    
    def multiplyScalar(out: mat3, a: ReadonlyMat3, b: Double): mat3 = js.native
    
    def multiplyScalarAndAdd(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3, scale: Double): mat3 = js.native
    
    def normalFromMat4(out: mat3, a: ReadonlyMat4): mat3 = js.native
    
    def projection(out: mat3, width: Double, height: Double): mat3 = js.native
    
    def rotate(out: mat3, a: ReadonlyMat3, rad: Double): mat3 = js.native
    
    def scale(out: mat3, a: ReadonlyMat3, v: ReadonlyVec2): mat3 = js.native
    
    def set(
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
    ): mat3 = js.native
    
    def str(a: ReadonlyMat3): String = js.native
    
    def sub(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = js.native
    
    def subtract(out: mat3, a: ReadonlyMat3, b: ReadonlyMat3): mat3 = js.native
    
    def translate(out: mat3, a: ReadonlyMat3, v: ReadonlyVec2): mat3 = js.native
    
    def transpose(out: mat3, a: ReadonlyMat3): mat3 = js.native
  }
  
  @js.native
  object mat4 extends js.Object {
    
    def add(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = js.native
    
    def adjoint(out: mat4, a: ReadonlyMat4): mat4 = js.native
    
    def clone(a: ReadonlyMat4): mat4 = js.native
    
    def copy(out: mat4, a: ReadonlyMat4): mat4 = js.native
    
    def create(): mat4 = js.native
    
    def determinant(a: ReadonlyMat4): Double = js.native
    
    def equals(a: ReadonlyMat4, b: ReadonlyMat4): Boolean = js.native
    
    def exactEquals(a: ReadonlyMat4, b: ReadonlyMat4): Boolean = js.native
    
    def frob(a: ReadonlyMat4): Double = js.native
    
    def fromQuat(out: mat4, q: ReadonlyQuat): mat4 = js.native
    
    def fromQuat2(out: mat4, a: ReadonlyQuat2): mat4 = js.native
    
    def fromRotation(out: mat4, rad: Double, axis: ReadonlyVec3): mat4 = js.native
    
    def fromRotationTranslation(out: mat4, q: js.Any, v: ReadonlyVec3): mat4 = js.native
    
    def fromRotationTranslationScale(out: mat4, q: js.Any, v: ReadonlyVec3, s: ReadonlyVec3): mat4 = js.native
    
    def fromRotationTranslationScaleOrigin(out: mat4, q: js.Any, v: ReadonlyVec3, s: ReadonlyVec3, o: ReadonlyVec3): mat4 = js.native
    
    def fromScaling(out: mat4, v: ReadonlyVec3): mat4 = js.native
    
    def fromTranslation(out: mat4, v: ReadonlyVec3): mat4 = js.native
    
    def fromValues(
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
    ): mat4 = js.native
    
    def fromXRotation(out: mat4, rad: Double): mat4 = js.native
    
    def fromYRotation(out: mat4, rad: Double): mat4 = js.native
    
    def fromZRotation(out: mat4, rad: Double): mat4 = js.native
    
    def frustum(out: mat4, left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): mat4 = js.native
    
    def getRotation(out: quat, mat: ReadonlyMat4): quat = js.native
    
    def getScaling(out: vec3, mat: ReadonlyMat4): vec3 = js.native
    
    def getTranslation(out: vec3, mat: ReadonlyMat4): vec3 = js.native
    
    def identity(out: mat4): mat4 = js.native
    
    def invert(out: mat4, a: ReadonlyMat4): mat4 = js.native
    
    def lookAt(out: mat4, eye: ReadonlyVec3, center: ReadonlyVec3, up: ReadonlyVec3): mat4 = js.native
    
    def mul(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = js.native
    
    def multiply(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = js.native
    
    def multiplyScalar(out: mat4, a: ReadonlyMat4, b: Double): mat4 = js.native
    
    def multiplyScalarAndAdd(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4, scale: Double): mat4 = js.native
    
    def ortho(out: mat4, left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): mat4 = js.native
    
    def perspective(out: mat4, fovy: Double, aspect: Double, near: Double, far: Double): mat4 = js.native
    
    def perspectiveFromFieldOfView(out: mat4, fov: js.Any, near: Double, far: Double): mat4 = js.native
    
    def rotate(out: mat4, a: ReadonlyMat4, rad: Double, axis: ReadonlyVec3): mat4 = js.native
    
    def rotateX(out: mat4, a: ReadonlyMat4, rad: Double): mat4 = js.native
    
    def rotateY(out: mat4, a: ReadonlyMat4, rad: Double): mat4 = js.native
    
    def rotateZ(out: mat4, a: ReadonlyMat4, rad: Double): mat4 = js.native
    
    def scale(out: mat4, a: ReadonlyMat4, v: ReadonlyVec3): mat4 = js.native
    
    def set(
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
    ): mat4 = js.native
    
    def str(a: ReadonlyMat4): String = js.native
    
    def sub(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = js.native
    
    def subtract(out: mat4, a: ReadonlyMat4, b: ReadonlyMat4): mat4 = js.native
    
    def targetTo(out: mat4, eye: ReadonlyVec3, target: js.Any, up: ReadonlyVec3): mat4 = js.native
    
    def translate(out: mat4, a: ReadonlyMat4, v: ReadonlyVec3): mat4 = js.native
    
    def transpose(out: mat4, a: ReadonlyMat4): mat4 = js.native
  }
  
  @js.native
  object quat extends js.Object {
    
    val add: js.Function3[/* out */ vec4, /* a */ ReadonlyVec4, /* b */ ReadonlyVec4, vec4] = js.native
    
    def calculateW(out: quat, a: ReadonlyQuat): quat = js.native
    
    @JSName("clone")
    val clone_Fquat: js.Function1[/* a */ ReadonlyVec4, vec4] = js.native
    
    def conjugate(out: quat, a: ReadonlyQuat): quat = js.native
    
    val copy: js.Function2[/* out */ vec4, /* a */ ReadonlyVec4, vec4] = js.native
    
    def create(): quat = js.native
    
    val dot: js.Function2[/* a */ ReadonlyVec4, /* b */ ReadonlyVec4, Double] = js.native
    
    @JSName("equals")
    val equals_Fquat: js.Function2[/* a */ ReadonlyVec4, /* b */ ReadonlyVec4, Boolean] = js.native
    
    val exactEquals: js.Function2[/* a */ ReadonlyVec4, /* b */ ReadonlyVec4, Boolean] = js.native
    
    def exp(out: quat, a: ReadonlyQuat): quat = js.native
    
    def fromEuler(out: quat, x: js.Any, y: js.Any, z: js.Any): quat = js.native
    
    def fromMat3(out: quat, m: ReadonlyMat3): quat = js.native
    
    val fromValues: js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, vec4] = js.native
    
    def getAngle(a: ReadonlyQuat, b: ReadonlyQuat): Double = js.native
    
    def getAxisAngle(out_axis: vec3, q: ReadonlyQuat): Double = js.native
    
    def identity(out: quat): quat = js.native
    
    def invert(out: quat, a: ReadonlyQuat): quat = js.native
    
    val len: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    val length: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    val lerp: js.Function4[/* out */ vec4, /* a */ ReadonlyVec4, /* b */ ReadonlyVec4, /* t */ Double, vec4] = js.native
    
    def ln(out: quat, a: ReadonlyQuat): quat = js.native
    
    def mul(out: quat, a: ReadonlyQuat, b: ReadonlyQuat): quat = js.native
    
    def multiply(out: quat, a: ReadonlyQuat, b: ReadonlyQuat): quat = js.native
    
    val normalize: js.Function2[/* out */ vec4, /* a */ ReadonlyVec4, vec4] = js.native
    
    def pow(out: quat, a: ReadonlyQuat, b: Double): quat = js.native
    
    def random(out: quat): quat = js.native
    
    def rotateX(out: quat, a: ReadonlyQuat, rad: Double): quat = js.native
    
    def rotateY(out: quat, a: ReadonlyQuat, rad: Double): quat = js.native
    
    def rotateZ(out: quat, a: ReadonlyQuat, rad: Double): quat = js.native
    
    def rotationTo(out: js.Any, a: js.Any, b: js.Any): js.Any = js.native
    
    val scale: js.Function3[/* out */ vec4, /* a */ ReadonlyVec4, /* b */ Double, vec4] = js.native
    
    val set: js.Function5[/* out */ vec4, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, vec4] = js.native
    
    def setAxes(out: js.Any, view: js.Any, right: js.Any, up: js.Any): vec4 = js.native
    
    def setAxisAngle(out: quat, axis: ReadonlyVec3, rad: Double): quat = js.native
    
    def slerp(out: quat, a: ReadonlyQuat, b: ReadonlyQuat, t: Double): quat = js.native
    
    def sqlerp(out: js.Any, a: js.Any, b: js.Any, c: js.Any, d: js.Any, t: js.Any): js.Any = js.native
    
    val sqrLen: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    val squaredLength: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    def str(a: ReadonlyQuat): String = js.native
  }
  
  @js.native
  object quat2 extends js.Object {
    
    def add(out: quat2, a: ReadonlyQuat2, b: ReadonlyQuat2): quat2 = js.native
    
    def clone(a: ReadonlyQuat2): quat2 = js.native
    
    def conjugate(out: quat2, a: ReadonlyQuat2): quat2 = js.native
    
    def copy(out: quat2, a: ReadonlyQuat2): quat2 = js.native
    
    def create(): quat2 = js.native
    
    val dot: js.Function2[/* a */ ReadonlyVec4, /* b */ ReadonlyVec4, Double] = js.native
    
    def equals(a: ReadonlyQuat2, b: ReadonlyQuat2): Boolean = js.native
    
    def exactEquals(a: ReadonlyQuat2, b: ReadonlyQuat2): Boolean = js.native
    
    def fromMat4(out: quat2, a: ReadonlyMat4): quat2 = js.native
    
    def fromRotation(out: js.Any, q: ReadonlyQuat): quat2 = js.native
    
    def fromRotationTranslation(out: js.Any, q: ReadonlyQuat, t: ReadonlyVec3): quat2 = js.native
    
    def fromRotationTranslationValues(x1: Double, y1: Double, z1: Double, w1: Double, x2: Double, y2: Double, z2: Double): quat2 = js.native
    
    def fromTranslation(out: js.Any, t: ReadonlyVec3): quat2 = js.native
    
    def fromValues(x1: Double, y1: Double, z1: Double, w1: Double, x2: Double, y2: Double, z2: Double, w2: Double): quat2 = js.native
    
    def getDual(out: quat, a: ReadonlyQuat2): quat = js.native
    
    val getReal: js.Function2[/* out */ vec4, /* a */ ReadonlyVec4, vec4] = js.native
    
    def getTranslation(out: vec3, a: ReadonlyQuat2): vec3 = js.native
    
    def identity(out: quat2): quat2 = js.native
    
    def invert(out: quat2, a: ReadonlyQuat2): quat2 = js.native
    
    val len: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    val length: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    def lerp(out: quat2, a: ReadonlyQuat2, b: ReadonlyQuat2, t: Double): quat2 = js.native
    
    def mul(out: quat2, a: ReadonlyQuat2, b: ReadonlyQuat2): quat2 = js.native
    
    def multiply(out: quat2, a: ReadonlyQuat2, b: ReadonlyQuat2): quat2 = js.native
    
    def normalize(out: quat2, a: ReadonlyQuat2): quat2 = js.native
    
    def rotateAroundAxis(out: quat2, a: ReadonlyQuat2, axis: ReadonlyVec3, rad: Double): quat2 = js.native
    
    def rotateByQuatAppend(out: quat2, a: ReadonlyQuat2, q: ReadonlyQuat): quat2 = js.native
    
    def rotateByQuatPrepend(out: quat2, q: ReadonlyQuat, a: ReadonlyQuat2): quat2 = js.native
    
    def rotateX(out: quat2, a: ReadonlyQuat2, rad: Double): quat2 = js.native
    
    def rotateY(out: quat2, a: ReadonlyQuat2, rad: Double): quat2 = js.native
    
    def rotateZ(out: quat2, a: ReadonlyQuat2, rad: Double): quat2 = js.native
    
    def scale(out: quat2, a: ReadonlyQuat2, b: Double): quat2 = js.native
    
    def set(
      out: quat2,
      x1: Double,
      y1: Double,
      z1: Double,
      w1: Double,
      x2: Double,
      y2: Double,
      z2: Double,
      w2: Double
    ): quat2 = js.native
    
    def setDual(out: quat2, q: ReadonlyQuat): quat2 = js.native
    
    val setReal: js.Function2[/* out */ vec4, /* a */ ReadonlyVec4, vec4] = js.native
    
    val sqrLen: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    val squaredLength: js.Function1[/* a */ ReadonlyVec4, Double] = js.native
    
    def str(a: ReadonlyQuat2): String = js.native
    
    def translate(out: quat2, a: ReadonlyQuat2, v: ReadonlyVec3): quat2 = js.native
  }
  
  @js.native
  object vec2 extends js.Object {
    
    def add(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = js.native
    
    def angle(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def ceil(out: vec2, a: ReadonlyVec2): vec2 = js.native
    
    def clone(a: ReadonlyVec2): vec2 = js.native
    
    def copy(out: vec2, a: ReadonlyVec2): vec2 = js.native
    
    def create(): vec2 = js.native
    
    def cross(out: vec3, a: ReadonlyVec2, b: ReadonlyVec2): vec3 = js.native
    
    def dist(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def distance(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def div(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = js.native
    
    def divide(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = js.native
    
    def dot(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def equals(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = js.native
    
    def exactEquals(a: ReadonlyVec2, b: ReadonlyVec2): Boolean = js.native
    
    def floor(out: vec2, a: ReadonlyVec2): vec2 = js.native
    
    def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = js.native
    
    def fromValues(x: Double, y: Double): vec2 = js.native
    
    def inverse(out: vec2, a: ReadonlyVec2): vec2 = js.native
    
    def len(a: ReadonlyVec2): Double = js.native
    
    def length(a: ReadonlyVec2): Double = js.native
    
    def lerp(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2, t: Double): vec2 = js.native
    
    def max(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = js.native
    
    def min(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = js.native
    
    def mul(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = js.native
    
    def multiply(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = js.native
    
    def negate(out: vec2, a: ReadonlyVec2): vec2 = js.native
    
    def normalize(out: vec2, a: ReadonlyVec2): vec2 = js.native
    
    def random(out: vec2): vec2 = js.native
    def random(out: vec2, scale: Double): vec2 = js.native
    
    def rotate(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2, rad: Double): vec2 = js.native
    
    def round(out: vec2, a: ReadonlyVec2): vec2 = js.native
    
    def scale(out: vec2, a: ReadonlyVec2, b: Double): vec2 = js.native
    
    def scaleAndAdd(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2, scale: Double): vec2 = js.native
    
    def set(out: vec2, x: Double, y: Double): vec2 = js.native
    
    def sqrDist(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def sqrLen(a: ReadonlyVec2): Double = js.native
    
    def squaredDistance(a: ReadonlyVec2, b: ReadonlyVec2): Double = js.native
    
    def squaredLength(a: ReadonlyVec2): Double = js.native
    
    def str(a: ReadonlyVec2): String = js.native
    
    def sub(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = js.native
    
    def subtract(out: vec2, a: ReadonlyVec2, b: ReadonlyVec2): vec2 = js.native
    
    def transformMat2(out: vec2, a: ReadonlyVec2, m: ReadonlyMat2): vec2 = js.native
    
    def transformMat2d(out: vec2, a: ReadonlyVec2, m: ReadonlyMat2d): vec2 = js.native
    
    def transformMat3(out: vec2, a: ReadonlyVec2, m: ReadonlyMat3): vec2 = js.native
    
    def transformMat4(out: vec2, a: ReadonlyVec2, m: ReadonlyMat4): vec2 = js.native
    
    def zero(out: vec2): vec2 = js.native
  }
  
  @js.native
  object vec3 extends js.Object {
    
    def add(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def angle(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def bezier(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, c: ReadonlyVec3, d: ReadonlyVec3, t: Double): vec3 = js.native
    
    def ceil(out: vec3, a: ReadonlyVec3): vec3 = js.native
    
    def clone(a: ReadonlyVec3): vec3 = js.native
    
    def copy(out: vec3, a: ReadonlyVec3): vec3 = js.native
    
    def create(): vec3 = js.native
    
    def cross(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def dist(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def distance(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def div(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def divide(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def dot(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def equals(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = js.native
    
    def exactEquals(a: ReadonlyVec3, b: ReadonlyVec3): Boolean = js.native
    
    def floor(out: vec3, a: ReadonlyVec3): vec3 = js.native
    
    def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = js.native
    
    def fromValues(x: Double, y: Double, z: Double): vec3 = js.native
    
    def hermite(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, c: ReadonlyVec3, d: ReadonlyVec3, t: Double): vec3 = js.native
    
    def inverse(out: vec3, a: ReadonlyVec3): vec3 = js.native
    
    def len(a: ReadonlyVec3): Double = js.native
    
    def length(a: ReadonlyVec3): Double = js.native
    
    def lerp(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, t: Double): vec3 = js.native
    
    def max(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def min(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def mul(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def multiply(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def negate(out: vec3, a: ReadonlyVec3): vec3 = js.native
    
    def normalize(out: vec3, a: ReadonlyVec3): vec3 = js.native
    
    def random(out: vec3): vec3 = js.native
    def random(out: vec3, scale: Double): vec3 = js.native
    
    def rotateX(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): vec3 = js.native
    
    def rotateY(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): vec3 = js.native
    
    def rotateZ(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, rad: Double): vec3 = js.native
    
    def round(out: vec3, a: ReadonlyVec3): vec3 = js.native
    
    def scale(out: vec3, a: ReadonlyVec3, b: Double): vec3 = js.native
    
    def scaleAndAdd(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3, scale: Double): vec3 = js.native
    
    def set(out: vec3, x: Double, y: Double, z: Double): vec3 = js.native
    
    def sqrDist(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def sqrLen(a: ReadonlyVec3): Double = js.native
    
    def squaredDistance(a: ReadonlyVec3, b: ReadonlyVec3): Double = js.native
    
    def squaredLength(a: ReadonlyVec3): Double = js.native
    
    def str(a: ReadonlyVec3): String = js.native
    
    def sub(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def subtract(out: vec3, a: ReadonlyVec3, b: ReadonlyVec3): vec3 = js.native
    
    def transformMat3(out: vec3, a: ReadonlyVec3, m: ReadonlyMat3): vec3 = js.native
    
    def transformMat4(out: vec3, a: ReadonlyVec3, m: ReadonlyMat4): vec3 = js.native
    
    def transformQuat(out: vec3, a: ReadonlyVec3, q: ReadonlyQuat): vec3 = js.native
    
    def zero(out: vec3): vec3 = js.native
  }
  
  @js.native
  object vec4 extends js.Object {
    
    def add(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = js.native
    
    def ceil(out: vec4, a: ReadonlyVec4): vec4 = js.native
    
    def clone(a: ReadonlyVec4): vec4 = js.native
    
    def copy(out: vec4, a: ReadonlyVec4): vec4 = js.native
    
    def create(): vec4 = js.native
    
    def cross(out: js.Any, u: js.Any, v: js.Any, w: js.Any): vec4 = js.native
    
    def dist(a: ReadonlyVec4, b: ReadonlyVec4): Double = js.native
    
    def distance(a: ReadonlyVec4, b: ReadonlyVec4): Double = js.native
    
    def div(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = js.native
    
    def divide(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = js.native
    
    def dot(a: ReadonlyVec4, b: ReadonlyVec4): Double = js.native
    
    def equals(a: ReadonlyVec4, b: ReadonlyVec4): Boolean = js.native
    
    def exactEquals(a: ReadonlyVec4, b: ReadonlyVec4): Boolean = js.native
    
    def floor(out: vec4, a: ReadonlyVec4): vec4 = js.native
    
    def forEach(a: js.Any, stride: js.Any, offset: js.Any, count: js.Any, fn: js.Any, arg: js.Any): js.Any = js.native
    
    def fromValues(x: Double, y: Double, z: Double, w: Double): vec4 = js.native
    
    def inverse(out: vec4, a: ReadonlyVec4): vec4 = js.native
    
    def len(a: ReadonlyVec4): Double = js.native
    
    def length(a: ReadonlyVec4): Double = js.native
    
    def lerp(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4, t: Double): vec4 = js.native
    
    def max(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = js.native
    
    def min(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = js.native
    
    def mul(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = js.native
    
    def multiply(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = js.native
    
    def negate(out: vec4, a: ReadonlyVec4): vec4 = js.native
    
    def normalize(out: vec4, a: ReadonlyVec4): vec4 = js.native
    
    def random(out: vec4): vec4 = js.native
    def random(out: vec4, scale: Double): vec4 = js.native
    
    def round(out: vec4, a: ReadonlyVec4): vec4 = js.native
    
    def scale(out: vec4, a: ReadonlyVec4, b: Double): vec4 = js.native
    
    def scaleAndAdd(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4, scale: Double): vec4 = js.native
    
    def set(out: vec4, x: Double, y: Double, z: Double, w: Double): vec4 = js.native
    
    def sqrDist(a: ReadonlyVec4, b: ReadonlyVec4): Double = js.native
    
    def sqrLen(a: ReadonlyVec4): Double = js.native
    
    def squaredDistance(a: ReadonlyVec4, b: ReadonlyVec4): Double = js.native
    
    def squaredLength(a: ReadonlyVec4): Double = js.native
    
    def str(a: ReadonlyVec4): String = js.native
    
    def sub(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = js.native
    
    def subtract(out: vec4, a: ReadonlyVec4, b: ReadonlyVec4): vec4 = js.native
    
    def transformMat4(out: vec4, a: ReadonlyVec4, m: ReadonlyMat4): vec4 = js.native
    
    def transformQuat(out: vec4, a: ReadonlyVec4, q: ReadonlyQuat): vec4 = js.native
    
    def zero(out: vec4): vec4 = js.native
  }
  
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
  
  type mat2 = (js.Tuple4[Double, Double, Double, Double]) | Float32Array
  
  type mat2d = (js.Tuple6[Double, Double, Double, Double, Double, Double]) | Float32Array
  
  type mat3 = (js.Tuple9[Double, Double, Double, Double, Double, Double, Double, Double, Double]) | Float32Array
  
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
  
  type quat = (js.Tuple4[Double, Double, Double, Double]) | Float32Array
  
  type quat2 = (js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]) | Float32Array
  
  type vec2 = (js.Tuple2[Double, Double]) | Float32Array
  
  type vec3 = (js.Tuple3[Double, Double, Double]) | Float32Array
  
  type vec4 = (js.Tuple4[Double, Double, Double, Double]) | Float32Array
}
