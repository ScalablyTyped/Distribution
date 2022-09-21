package typings.forgeViewer.global.THREE

import typings.forgeViewer.anon.Offset
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.InterleavedBuffer")
@js.native
open class InterleavedBuffer protected ()
  extends StObject
     with typings.forgeViewer.THREE.InterleavedBuffer {
  def this(array: ArrayLike[Double], stride: Double) = this()
  
  /* CompleteClass */
  var array: ArrayLike[Double] = js.native
  
  /* CompleteClass */
  override def copy(source: typings.forgeViewer.THREE.InterleavedBuffer): typings.forgeViewer.THREE.InterleavedBuffer = js.native
  
  /* CompleteClass */
  override def copyAt(index1: Double, attribute: typings.forgeViewer.THREE.InterleavedBufferAttribute, index2: Double): typings.forgeViewer.THREE.InterleavedBuffer = js.native
  
  /* CompleteClass */
  var count: Double = js.native
  
  /* CompleteClass */
  var dynamic: Boolean = js.native
  
  /* CompleteClass */
  var length: Double = js.native
  
  /* CompleteClass */
  var needsUpdate: Boolean = js.native
  
  /* CompleteClass */
  override def set(value: ArrayLike[Double], index: Double): typings.forgeViewer.THREE.InterleavedBuffer = js.native
  
  /* CompleteClass */
  override def setDynamic(dynamic: Boolean): typings.forgeViewer.THREE.InterleavedBuffer = js.native
  
  /* CompleteClass */
  var stride: Double = js.native
  
  /* CompleteClass */
  var updateRange: Offset = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
