package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.NumberDictionary
import typings.forgeViewer.THREE.Box3
import typings.forgeViewer.THREE.Mesh
import typings.forgeViewer.THREE.Quaternion
import typings.forgeViewer.THREE.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentList extends StObject {
  
  var allVisible: Boolean = js.native
  
  var allVisibleDirty: Boolean = js.native
  
  var animxforms: Any = js.native
  
  var boxes: Any = js.native
  
  var db2ThemingColor: js.Array[Any] = js.native
  
  var dbIdIsGhosted: js.Array[Any] = js.native
  
  var dbIdOpacity: js.Array[Any] = js.native
  
  var fragments: Any = js.native
  
  var geomids: js.typedarray.Int32Array = js.native
  
  var geoms: GeometryList = js.native
  
  def getAnimTransform(fragId: Double): Boolean = js.native
  def getAnimTransform(fragId: Double, scale: Unit, rotation: Unit, translation: Vector3): Boolean = js.native
  def getAnimTransform(fragId: Double, scale: Unit, rotation: Quaternion): Boolean = js.native
  def getAnimTransform(fragId: Double, scale: Unit, rotation: Quaternion, translation: Vector3): Boolean = js.native
  def getAnimTransform(fragId: Double, scale: Vector3): Boolean = js.native
  def getAnimTransform(fragId: Double, scale: Vector3, rotation: Unit, translation: Vector3): Boolean = js.native
  def getAnimTransform(fragId: Double, scale: Vector3, rotation: Quaternion): Boolean = js.native
  def getAnimTransform(fragId: Double, scale: Vector3, rotation: Quaternion, translation: Vector3): Boolean = js.native
  
  def getVizmesh(fragId: Double): Any = js.native
  
  def getWorldBounds(fragId: Double, box: Box3): Unit = js.native
  
  var is2d: Boolean = js.native
  
  var isFixedSize: Boolean = js.native
  
  var linesHidden: Boolean = js.native
  
  var materialIdMap: NumberDictionary[Any] = js.native
  
  var materialids: js.typedarray.Int32Array = js.native
  
  var materialmap: Any = js.native
  
  var matrix: Any = js.native
  
  var modelId: Double = js.native
  
  var nextAvailableFragID: Double = js.native
  
  var nextMaterialId: Double = js.native
  
  var originalColors: js.Array[Any] = js.native
  
  var pointsHidden: Boolean = js.native
  
  var themingOrGhostingNeedsUpdate: js.Object = js.native
  
  var themingOrGhostingNeedsUpdateByDbId: js.Object = js.native
  
  var transforms: Any = js.native
  
  def updateAnimTransform(fragId: Double): Unit = js.native
  def updateAnimTransform(fragId: Double, scale: Unit, rotation: Unit, translation: Vector3): Unit = js.native
  def updateAnimTransform(fragId: Double, scale: Unit, rotation: Quaternion): Unit = js.native
  def updateAnimTransform(fragId: Double, scale: Unit, rotation: Quaternion, translation: Vector3): Unit = js.native
  def updateAnimTransform(fragId: Double, scale: Vector3): Unit = js.native
  def updateAnimTransform(fragId: Double, scale: Vector3, rotation: Unit, translation: Vector3): Unit = js.native
  def updateAnimTransform(fragId: Double, scale: Vector3, rotation: Quaternion): Unit = js.native
  def updateAnimTransform(fragId: Double, scale: Vector3, rotation: Quaternion, translation: Vector3): Unit = js.native
  
  var useThreeMesh: Boolean = js.native
  
  var vizflags: js.typedarray.Uint32Array = js.native
  
  var vizmeshes: js.Array[Mesh] = js.native
}
