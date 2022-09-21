package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Count
import typings.forgeViewer.anon.MaterialIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferGeometry extends StObject {
  
  def addAttribute(name: String, attribute: BufferAttribute): Any = js.native
  def addAttribute(name: String, attribute: InterleavedBufferAttribute): BufferGeometry = js.native
  def addAttribute(name: Any, array: Any, itemSize: Any): Any = js.native
  @JSName("addAttribute")
  def addAttribute_BufferGeometry(name: String, attribute: BufferAttribute): BufferGeometry = js.native
  
  def addDrawCall(start: Any, count: Any): Unit = js.native
  def addDrawCall(start: Any, count: Any, indexOffset: Any): Unit = js.native
  
  def addGroup(start: Double, count: Double): Unit = js.native
  def addGroup(start: Double, count: Double, materialIndex: Double): Unit = js.native
  
  def addIndex(index: Any): Unit = js.native
  
  def applyMatrix(matrix: Matrix4): BufferGeometry = js.native
  
  var attributes: BufferAttribute | js.Array[InterleavedBufferAttribute] = js.native
  
  var boundingBox: Box3 = js.native
  
  var boundingSphere: Sphere = js.native
  
  def center(): Vector3 = js.native
  
  def clearDrawCalls(): Unit = js.native
  
  def clearGroups(): Unit = js.native
  
  def computeBoundingBox(): Unit = js.native
  
  def computeBoundingSphere(): Unit = js.native
  
  def computeVertexNormals(): Unit = js.native
  
  def copy(source: BufferGeometry): BufferGeometry = js.native
  
  def dispose(): Unit = js.native
  
  var drawRange: Count = js.native
  
  // deprecated
  var drawcalls: Any = js.native
  
  def fromDirectGeometry(geometry: DirectGeometry): BufferGeometry = js.native
  
  def fromGeometry(geometry: Geometry): BufferGeometry = js.native
  def fromGeometry(geometry: Geometry, settings: Any): BufferGeometry = js.native
  
  def getAttribute(name: String): BufferAttribute | InterleavedBufferAttribute = js.native
  
  def getIndex(): BufferAttribute = js.native
  
  var groups: js.Array[MaterialIndex] = js.native
  
  var id: Double = js.native
  
  var index: BufferAttribute = js.native
  
  def lookAt(v: Vector3): Unit = js.native
  
  def merge(geometry: BufferGeometry, offset: Double): BufferGeometry = js.native
  
  var morphAttributes: Any = js.native
  
  var name: String = js.native
  
  def normalizeNormals(): Unit = js.native
  
  var offsets: Any = js.native
  
  def removeAttribute(name: String): BufferGeometry = js.native
  
  def rotateX(angle: Double): BufferGeometry = js.native
  
  def rotateY(angle: Double): BufferGeometry = js.native
  
  def rotateZ(angle: Double): BufferGeometry = js.native
  
  def scale(x: Double, y: Double, z: Double): BufferGeometry = js.native
  
  def setDrawRange(start: Double, count: Double): Unit = js.native
  
  def setFromObject(`object`: Object3D): Unit = js.native
  
  def setIndex(index: BufferAttribute): Unit = js.native
  
  def toJSON(): Any = js.native
  
  def toNonIndexed(): BufferGeometry = js.native
  
  def translate(x: Double, y: Double, z: Double): BufferGeometry = js.native
  
  var `type`: String = js.native
  
  def updateFromObject(`object`: Object3D): Unit = js.native
  
  var uuid: String = js.native
}
