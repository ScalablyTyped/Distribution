package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshBuilder extends StObject {
  
  def AddFacesToMesh(mesh: Mesh, numFaces: Double, faces: js.typedarray.Uint16Array): Unit = js.native
  def AddFacesToMesh(mesh: Mesh, numFaces: Double, faces: js.typedarray.Uint32Array): Unit = js.native
  
  def AddFloatAttribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
  
  def AddInt16Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
  
  def AddInt8Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
  
  def AddUInt16Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
  
  def AddUInt32Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
  
  def AddUInt8Attribute(mesh: Mesh, attribute: Double, count: Double, itemSize: Double, array: TypedArray): Double = js.native
}
