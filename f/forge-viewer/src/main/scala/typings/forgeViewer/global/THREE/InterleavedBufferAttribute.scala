package typings.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.InterleavedBufferAttribute")
@js.native
open class InterleavedBufferAttribute protected ()
  extends StObject
     with typings.forgeViewer.THREE.InterleavedBufferAttribute {
  def this(
    interleavedBuffer: typings.forgeViewer.THREE.InterleavedBuffer,
    itemSize: Double,
    offset: Double,
    normalized: Boolean
  ) = this()
  
  /* CompleteClass */
  var array: js.Array[Any] = js.native
  
  /* CompleteClass */
  var count: Double = js.native
  
  /* CompleteClass */
  var data: typings.forgeViewer.THREE.InterleavedBuffer = js.native
  
  /* CompleteClass */
  override def getW(index: Double): Double = js.native
  
  /* CompleteClass */
  override def getX(index: Double): Double = js.native
  
  /* CompleteClass */
  override def getY(index: Double): Double = js.native
  
  /* CompleteClass */
  override def getZ(index: Double): Double = js.native
  
  /* CompleteClass */
  var itemSize: Double = js.native
  
  /* CompleteClass */
  var length: Double = js.native
  
  // deprecated, use count instead
  /* CompleteClass */
  var normalized: Boolean = js.native
  
  /* CompleteClass */
  var offset: Double = js.native
  
  /* CompleteClass */
  override def setW(index: Double, z: Double): typings.forgeViewer.THREE.InterleavedBufferAttribute = js.native
  
  /* CompleteClass */
  override def setX(index: Double, x: Double): typings.forgeViewer.THREE.InterleavedBufferAttribute = js.native
  
  /* CompleteClass */
  override def setXY(index: Double, x: Double, y: Double): typings.forgeViewer.THREE.InterleavedBufferAttribute = js.native
  
  /* CompleteClass */
  override def setXYZ(index: Double, x: Double, y: Double, z: Double): typings.forgeViewer.THREE.InterleavedBufferAttribute = js.native
  
  /* CompleteClass */
  override def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): typings.forgeViewer.THREE.InterleavedBufferAttribute = js.native
  
  /* CompleteClass */
  override def setY(index: Double, y: Double): typings.forgeViewer.THREE.InterleavedBufferAttribute = js.native
  
  /* CompleteClass */
  override def setZ(index: Double, z: Double): typings.forgeViewer.THREE.InterleavedBufferAttribute = js.native
  
  /* CompleteClass */
  var uuid: String = js.native
}
