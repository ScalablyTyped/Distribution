package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferAttribute extends StObject {
  
  var array: js.Array[Double] = js.native
  
  def copyAt(index1: Double, attribute: BufferAttribute, index2: Double): Unit = js.native
  
  var itemSize: Double = js.native
  
  var length: Double = js.native
  
  var needsUpdate: Boolean = js.native
  
  def set(value: Double): BufferAttribute = js.native
  def set(value: Double, offset: Double): BufferAttribute = js.native
  
  def setX(index: Double, x: Double): BufferAttribute = js.native
  
  def setXY(index: Double, x: Double, y: Double): BufferAttribute = js.native
  
  def setXYZ(index: Double, x: Double, y: Double, z: Double): BufferAttribute = js.native
  
  def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): BufferAttribute = js.native
  
  def setY(index: Double, y: Double): BufferAttribute = js.native
  
  def setZ(index: Double, z: Double): BufferAttribute = js.native
}
