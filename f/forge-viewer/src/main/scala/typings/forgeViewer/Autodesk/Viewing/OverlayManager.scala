package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.THREE.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayManager extends StObject {
  
  def addMesh(mesh: js.Array[Mesh], name: String): Boolean = js.native
  def addMesh(mesh: Mesh, name: String): Boolean = js.native
  
  def addScene(name: String): Boolean = js.native
  
  def clearScene(name: String): Unit = js.native
  
  def hasMesh(mesh: Mesh, name: String): Boolean = js.native
  
  def hasScene(name: String): Boolean = js.native
  
  def removeMesh(mesh: js.Array[Mesh], name: String): Boolean = js.native
  def removeMesh(mesh: Mesh, name: String): Boolean = js.native
  
  def removeScene(name: String): Unit = js.native
}
