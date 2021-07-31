package typings.forgeViewer.Autodesk.Viewing

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.materialMod.Material
import typings.three.mod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayManager extends StObject {
  
  def addMesh(mesh: js.Array[Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]], name: String): Boolean = js.native
  def addMesh(mesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]], name: String): Boolean = js.native
  
  def addScene(name: String): Boolean = js.native
  
  def clearScene(name: String): Unit = js.native
  
  def hasMesh(mesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]], name: String): Boolean = js.native
  
  def hasScene(name: String): Boolean = js.native
  
  def removeMesh(mesh: js.Array[Mesh[Geometry | BufferGeometry, Material | js.Array[Material]]], name: String): Boolean = js.native
  def removeMesh(mesh: Mesh[Geometry | BufferGeometry, Material | js.Array[Material]], name: String): Boolean = js.native
  
  def removeScene(name: String): Unit = js.native
}
