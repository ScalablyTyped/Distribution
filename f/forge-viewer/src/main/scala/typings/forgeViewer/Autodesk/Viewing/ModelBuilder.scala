package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.Private.FragmentList
import typings.forgeViewer.Autodesk.Viewing.Private.GeometryList
import typings.forgeViewer.THREE.Box3
import typings.forgeViewer.THREE.BufferGeometry
import typings.forgeViewer.THREE.Material
import typings.forgeViewer.THREE.Matrix4
import typings.forgeViewer.THREE.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelBuilder extends StObject {
  
  def addFragment(geometry: Double, material: String): Double = js.native
  def addFragment(geometry: Double, material: String, transform: js.Array[Double]): Double = js.native
  def addFragment(geometry: Double, material: String, transform: js.Array[Double], bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: Double, material: String, transform: js.Array[Double], bbox: Box3): Double = js.native
  def addFragment(geometry: Double, material: String, transform: Unit, bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: Double, material: String, transform: Unit, bbox: Box3): Double = js.native
  def addFragment(geometry: Double, material: String, transform: Matrix4): Double = js.native
  def addFragment(geometry: Double, material: String, transform: Matrix4, bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: Double, material: String, transform: Matrix4, bbox: Box3): Double = js.native
  def addFragment(geometry: Double, material: Material): Double = js.native
  def addFragment(geometry: Double, material: Material, transform: js.Array[Double]): Double = js.native
  def addFragment(geometry: Double, material: Material, transform: js.Array[Double], bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: Double, material: Material, transform: js.Array[Double], bbox: Box3): Double = js.native
  def addFragment(geometry: Double, material: Material, transform: Unit, bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: Double, material: Material, transform: Unit, bbox: Box3): Double = js.native
  def addFragment(geometry: Double, material: Material, transform: Matrix4): Double = js.native
  def addFragment(geometry: Double, material: Material, transform: Matrix4, bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: Double, material: Material, transform: Matrix4, bbox: Box3): Double = js.native
  def addFragment(geometry: BufferGeometry, material: String): Double = js.native
  def addFragment(geometry: BufferGeometry, material: String, transform: js.Array[Double]): Double = js.native
  def addFragment(geometry: BufferGeometry, material: String, transform: js.Array[Double], bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: BufferGeometry, material: String, transform: js.Array[Double], bbox: Box3): Double = js.native
  def addFragment(geometry: BufferGeometry, material: String, transform: Unit, bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: BufferGeometry, material: String, transform: Unit, bbox: Box3): Double = js.native
  def addFragment(geometry: BufferGeometry, material: String, transform: Matrix4): Double = js.native
  def addFragment(geometry: BufferGeometry, material: String, transform: Matrix4, bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: BufferGeometry, material: String, transform: Matrix4, bbox: Box3): Double = js.native
  def addFragment(geometry: BufferGeometry, material: Material): Double = js.native
  def addFragment(geometry: BufferGeometry, material: Material, transform: js.Array[Double]): Double = js.native
  def addFragment(geometry: BufferGeometry, material: Material, transform: js.Array[Double], bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: BufferGeometry, material: Material, transform: js.Array[Double], bbox: Box3): Double = js.native
  def addFragment(geometry: BufferGeometry, material: Material, transform: Unit, bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: BufferGeometry, material: Material, transform: Unit, bbox: Box3): Double = js.native
  def addFragment(geometry: BufferGeometry, material: Material, transform: Matrix4): Double = js.native
  def addFragment(geometry: BufferGeometry, material: Material, transform: Matrix4, bbox: js.Array[Double]): Double = js.native
  def addFragment(geometry: BufferGeometry, material: Material, transform: Matrix4, bbox: Box3): Double = js.native
  
  def addGeometry(geometry: BufferGeometry): Double = js.native
  def addGeometry(geometry: BufferGeometry, numFragments: Double): Double = js.native
  
  def addMaterial(name: String, material: Material): Boolean = js.native
  
  def addMesh(mesh: Mesh): Boolean = js.native
  
  def changeFragmentGeometry(fragment: Double, geometry: Double, transform: js.Array[Double], bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentGeometry(fragment: Double, geometry: Double, transform: js.Array[Double], bbox: Box3): Boolean = js.native
  def changeFragmentGeometry(fragment: Double, geometry: Double, transform: Matrix4, bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentGeometry(fragment: Double, geometry: Double, transform: Matrix4, bbox: Box3): Boolean = js.native
  def changeFragmentGeometry(fragment: Double, geometry: BufferGeometry, transform: js.Array[Double], bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentGeometry(fragment: Double, geometry: BufferGeometry, transform: js.Array[Double], bbox: Box3): Boolean = js.native
  def changeFragmentGeometry(fragment: Double, geometry: BufferGeometry, transform: Matrix4, bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentGeometry(fragment: Double, geometry: BufferGeometry, transform: Matrix4, bbox: Box3): Boolean = js.native
  def changeFragmentGeometry(fragment: Mesh, geometry: Double, transform: js.Array[Double], bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentGeometry(fragment: Mesh, geometry: Double, transform: js.Array[Double], bbox: Box3): Boolean = js.native
  def changeFragmentGeometry(fragment: Mesh, geometry: Double, transform: Matrix4, bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentGeometry(fragment: Mesh, geometry: Double, transform: Matrix4, bbox: Box3): Boolean = js.native
  def changeFragmentGeometry(fragment: Mesh, geometry: BufferGeometry, transform: js.Array[Double], bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentGeometry(fragment: Mesh, geometry: BufferGeometry, transform: js.Array[Double], bbox: Box3): Boolean = js.native
  def changeFragmentGeometry(fragment: Mesh, geometry: BufferGeometry, transform: Matrix4, bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentGeometry(fragment: Mesh, geometry: BufferGeometry, transform: Matrix4, bbox: Box3): Boolean = js.native
  
  def changeFragmentMaterial(fragment: Double, material: String): Boolean = js.native
  def changeFragmentMaterial(fragment: Double, material: Material): Boolean = js.native
  def changeFragmentMaterial(fragment: Mesh, material: String): Boolean = js.native
  def changeFragmentMaterial(fragment: Mesh, material: Material): Boolean = js.native
  
  def changeFragmentTransform(fragment: Double, transform: js.Array[Double], bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentTransform(fragment: Double, transform: js.Array[Double], bbox: Box3): Boolean = js.native
  def changeFragmentTransform(fragment: Double, transform: Matrix4, bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentTransform(fragment: Double, transform: Matrix4, bbox: Box3): Boolean = js.native
  def changeFragmentTransform(fragment: Mesh, transform: js.Array[Double], bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentTransform(fragment: Mesh, transform: js.Array[Double], bbox: Box3): Boolean = js.native
  def changeFragmentTransform(fragment: Mesh, transform: Matrix4, bbox: js.Array[Double]): Boolean = js.native
  def changeFragmentTransform(fragment: Mesh, transform: Matrix4, bbox: Box3): Boolean = js.native
  
  def changeFragmentsDbId(fragments: js.Array[Double | Mesh], dbId: Double): Boolean = js.native
  def changeFragmentsDbId(fragments: Double, dbId: Double): Boolean = js.native
  def changeFragmentsDbId(fragments: Mesh, dbId: Double): Boolean = js.native
  
  def changeGeometry(existingGeom: Double, geometry: BufferGeometry): Boolean = js.native
  def changeGeometry(existingGeom: Double, geometry: BufferGeometry, numFragments: Double): Boolean = js.native
  def changeGeometry(existingGeom: BufferGeometry, geometry: BufferGeometry): Boolean = js.native
  def changeGeometry(existingGeom: BufferGeometry, geometry: BufferGeometry, numFragments: Double): Boolean = js.native
  
  def changeMaterial(existingMaterial: String, material: Material): Boolean = js.native
  
  def findGeometryFragments(geometry: js.Array[BufferGeometry | Double]): js.Array[Double] = js.native
  def findGeometryFragments(geometry: Double): js.Array[Double] = js.native
  def findGeometryFragments(geometry: BufferGeometry): js.Array[Double] = js.native
  
  def findMaterial(name: String): Material = js.native
  
  def findMaterialFragments(materials: String): js.Array[Double] = js.native
  def findMaterialFragments(materials: js.Array[Material | String]): js.Array[Double] = js.native
  def findMaterialFragments(materials: Material): js.Array[Double] = js.native
  
  var fragList: FragmentList = js.native
  
  var geomList: GeometryList = js.native
  
  var instanceTree: Any = js.native
  
  def isConservingMemory(): Boolean = js.native
  
  var model: Model = js.native
  
  def packNormals(geometry: BufferGeometry): BufferGeometry = js.native
  
  def removeFragment(fragments: js.Array[Double | Mesh]): Boolean = js.native
  def removeFragment(fragments: Double): Boolean = js.native
  def removeFragment(fragments: Mesh): Boolean = js.native
  
  def removeGeometry(geometry: js.Array[BufferGeometry | Double]): Boolean = js.native
  def removeGeometry(geometry: Double): Boolean = js.native
  def removeGeometry(geometry: BufferGeometry): Boolean = js.native
  
  def removeMaterial(materials: String): Boolean = js.native
  def removeMaterial(materials: js.Array[Material | String]): Boolean = js.native
  def removeMaterial(materials: Material): Boolean = js.native
  
  def removeMesh(meshes: js.Array[Mesh]): Boolean = js.native
  def removeMesh(meshes: Mesh): Boolean = js.native
  
  def sceneUpdated(objectsMoved: Boolean, skipRepaint: Boolean): Unit = js.native
  
  def updateMesh(meshes: js.Array[Mesh], skipGeom: Boolean, skipTransform: Boolean): Boolean = js.native
  def updateMesh(meshes: Mesh, skipGeom: Boolean, skipTransform: Boolean): Boolean = js.native
}
