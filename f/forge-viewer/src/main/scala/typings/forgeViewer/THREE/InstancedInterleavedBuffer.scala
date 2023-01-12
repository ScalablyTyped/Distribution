package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Offset
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancedInterleavedBuffer
  extends StObject
     with InterleavedBuffer {
  
  def copy(source: InstancedInterleavedBuffer): InstancedInterleavedBuffer
  
  var meshPerAttribute: Double
}
object InstancedInterleavedBuffer {
  
  inline def apply(
    array: ArrayLike[Double],
    copy: InstancedInterleavedBuffer => InstancedInterleavedBuffer,
    copyAt: (Double, InterleavedBufferAttribute, Double) => InterleavedBuffer,
    count: Double,
    dynamic: Boolean,
    length: Double,
    meshPerAttribute: Double,
    needsUpdate: Boolean,
    set: (ArrayLike[Double], Double) => InterleavedBuffer,
    setDynamic: Boolean => InterleavedBuffer,
    stride: Double,
    updateRange: Offset,
    version: Double
  ): InstancedInterleavedBuffer = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), copyAt = js.Any.fromFunction3(copyAt), count = count.asInstanceOf[js.Any], dynamic = dynamic.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], meshPerAttribute = meshPerAttribute.asInstanceOf[js.Any], needsUpdate = needsUpdate.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setDynamic = js.Any.fromFunction1(setDynamic), stride = stride.asInstanceOf[js.Any], updateRange = updateRange.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancedInterleavedBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancedInterleavedBuffer] (val x: Self) extends AnyVal {
    
    inline def setCopy(value: InstancedInterleavedBuffer => InstancedInterleavedBuffer): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setMeshPerAttribute(value: Double): Self = StObject.set(x, "meshPerAttribute", value.asInstanceOf[js.Any])
  }
}
