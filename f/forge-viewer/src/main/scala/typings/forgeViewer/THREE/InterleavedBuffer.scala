package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Offset
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterleavedBuffer extends StObject {
  
  var array: ArrayLike[Double]
  
  def copy(source: InterleavedBuffer): InterleavedBuffer
  
  def copyAt(index1: Double, attribute: InterleavedBufferAttribute, index2: Double): InterleavedBuffer
  
  var count: Double
  
  var dynamic: Boolean
  
  var length: Double
  
  var needsUpdate: Boolean
  
  def set(value: ArrayLike[Double], index: Double): InterleavedBuffer
  
  def setDynamic(dynamic: Boolean): InterleavedBuffer
  
  var stride: Double
  
  var updateRange: Offset
  
  var version: Double
}
object InterleavedBuffer {
  
  inline def apply(
    array: ArrayLike[Double],
    copy: InterleavedBuffer => InterleavedBuffer,
    copyAt: (Double, InterleavedBufferAttribute, Double) => InterleavedBuffer,
    count: Double,
    dynamic: Boolean,
    length: Double,
    needsUpdate: Boolean,
    set: (ArrayLike[Double], Double) => InterleavedBuffer,
    setDynamic: Boolean => InterleavedBuffer,
    stride: Double,
    updateRange: Offset,
    version: Double
  ): InterleavedBuffer = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], copy = js.Any.fromFunction1(copy), copyAt = js.Any.fromFunction3(copyAt), count = count.asInstanceOf[js.Any], dynamic = dynamic.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], needsUpdate = needsUpdate.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setDynamic = js.Any.fromFunction1(setDynamic), stride = stride.asInstanceOf[js.Any], updateRange = updateRange.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterleavedBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterleavedBuffer] (val x: Self) extends AnyVal {
    
    inline def setArray(value: ArrayLike[Double]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: InterleavedBuffer => InterleavedBuffer): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setCopyAt(value: (Double, InterleavedBufferAttribute, Double) => InterleavedBuffer): Self = StObject.set(x, "copyAt", js.Any.fromFunction3(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (ArrayLike[Double], Double) => InterleavedBuffer): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetDynamic(value: Boolean => InterleavedBuffer): Self = StObject.set(x, "setDynamic", js.Any.fromFunction1(value))
    
    inline def setStride(value: Double): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
    
    inline def setUpdateRange(value: Offset): Self = StObject.set(x, "updateRange", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
