package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Dictattachment
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry extends StObject {
  
  // EventDispatcher mixins
  def addEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  
  // These properties do not exist in a normal Geometry class, but if you use the instance that was passed by JSONLoader, it will be added.
  var animation: AnimationClip = js.native
  
  var animations: js.Array[AnimationClip] = js.native
  
  def applyMatrix(matrix: Matrix4): Geometry = js.native
  
  var bones: js.Array[Bone] = js.native
  
  var boundingBox: Box3 = js.native
  
  var boundingSphere: Sphere = js.native
  
  def center(): Vector3 = js.native
  
  var colors: js.Array[Color] = js.native
  
  var colorsNeedUpdate: Boolean = js.native
  
  def computeBoundingBox(): Unit = js.native
  
  def computeBoundingSphere(): Unit = js.native
  
  def computeFaceNormals(): Unit = js.native
  
  def computeLineDistances(): Unit = js.native
  
  def computeMorphNormals(): Unit = js.native
  
  def computeVertexNormals(): Unit = js.native
  def computeVertexNormals(areaWeighted: Boolean): Unit = js.native
  
  def copy(source: Geometry): Geometry = js.native
  
  def dispatchEvent(event: Dictattachment): Unit = js.native
  
  def dispose(): Unit = js.native
  
  var elementsNeedUpdate: Boolean = js.native
  
  var faceVertexUvs: js.Array[js.Array[js.Array[Vector2]]] = js.native
  
  var faces: js.Array[Face3] = js.native
  
  def fromBufferGeometry(geometry: BufferGeometry): Geometry = js.native
  
  var groupsNeedUpdate: Boolean = js.native
  
  def hasEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  
  var id: Double = js.native
  
  var lineDistances: js.Array[Double] = js.native
  
  var lineDistancesNeedUpdate: Boolean = js.native
  
  def lookAt(vector: Vector3): Unit = js.native
  
  def merge(geometry: Geometry, matrix: Matrix): Unit = js.native
  def merge(geometry: Geometry, matrix: Matrix, materialIndexOffset: Double): Unit = js.native
  
  def mergeMesh(mesh: Mesh): Unit = js.native
  
  def mergeVertices(): Double = js.native
  
  var morphNormals: js.Array[MorphNormals] = js.native
  
  var morphTargets: js.Array[MorphTarget] = js.native
  
  var name: String = js.native
  
  def normalize(): Geometry = js.native
  
  var normalsNeedUpdate: Boolean = js.native
  
  def removeEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  
  def rotateX(angle: Double): Geometry = js.native
  
  def rotateY(angle: Double): Geometry = js.native
  
  def rotateZ(angle: Double): Geometry = js.native
  
  def scale(x: Double, y: Double, z: Double): Geometry = js.native
  
  var skinIndices: js.Array[Vector4] = js.native
  
  var skinWeights: js.Array[Vector4] = js.native
  
  def sortFacesByMaterialIndex(): Unit = js.native
  
  def toJSON(): Any = js.native
  
  def translate(x: Double, y: Double, z: Double): Geometry = js.native
  
  var `type`: String = js.native
  
  var uuid: String = js.native
  
  var uvsNeedUpdate: Boolean = js.native
  
  var vertices: js.Array[Vector3] = js.native
  
  var verticesNeedUpdate: Boolean = js.native
}
