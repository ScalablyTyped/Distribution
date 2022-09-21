package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterleavedBufferAttribute extends StObject {
  
  var array: js.Array[Any]
  
  var count: Double
  
  var data: InterleavedBuffer
  
  def getW(index: Double): Double
  
  def getX(index: Double): Double
  
  def getY(index: Double): Double
  
  def getZ(index: Double): Double
  
  var itemSize: Double
  
  var length: Double
  
  // deprecated, use count instead
  var normalized: Boolean
  
  var offset: Double
  
  def setW(index: Double, z: Double): InterleavedBufferAttribute
  
  def setX(index: Double, x: Double): InterleavedBufferAttribute
  
  def setXY(index: Double, x: Double, y: Double): InterleavedBufferAttribute
  
  def setXYZ(index: Double, x: Double, y: Double, z: Double): InterleavedBufferAttribute
  
  def setXYZW(index: Double, x: Double, y: Double, z: Double, w: Double): InterleavedBufferAttribute
  
  def setY(index: Double, y: Double): InterleavedBufferAttribute
  
  def setZ(index: Double, z: Double): InterleavedBufferAttribute
  
  var uuid: String
}
object InterleavedBufferAttribute {
  
  inline def apply(
    array: js.Array[Any],
    count: Double,
    data: InterleavedBuffer,
    getW: Double => Double,
    getX: Double => Double,
    getY: Double => Double,
    getZ: Double => Double,
    itemSize: Double,
    length: Double,
    normalized: Boolean,
    offset: Double,
    setW: (Double, Double) => InterleavedBufferAttribute,
    setX: (Double, Double) => InterleavedBufferAttribute,
    setXY: (Double, Double, Double) => InterleavedBufferAttribute,
    setXYZ: (Double, Double, Double, Double) => InterleavedBufferAttribute,
    setXYZW: (Double, Double, Double, Double, Double) => InterleavedBufferAttribute,
    setY: (Double, Double) => InterleavedBufferAttribute,
    setZ: (Double, Double) => InterleavedBufferAttribute,
    uuid: String
  ): InterleavedBufferAttribute = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getW = js.Any.fromFunction1(getW), getX = js.Any.fromFunction1(getX), getY = js.Any.fromFunction1(getY), getZ = js.Any.fromFunction1(getZ), itemSize = itemSize.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], setW = js.Any.fromFunction2(setW), setX = js.Any.fromFunction2(setX), setXY = js.Any.fromFunction3(setXY), setXYZ = js.Any.fromFunction4(setXYZ), setXYZW = js.Any.fromFunction5(setXYZW), setY = js.Any.fromFunction2(setY), setZ = js.Any.fromFunction2(setZ), uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterleavedBufferAttribute]
  }
  
  extension [Self <: InterleavedBufferAttribute](x: Self) {
    
    inline def setArray(value: js.Array[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: Any*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setData(value: InterleavedBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetW(value: Double => Double): Self = StObject.set(x, "getW", js.Any.fromFunction1(value))
    
    inline def setGetX(value: Double => Double): Self = StObject.set(x, "getX", js.Any.fromFunction1(value))
    
    inline def setGetY(value: Double => Double): Self = StObject.set(x, "getY", js.Any.fromFunction1(value))
    
    inline def setGetZ(value: Double => Double): Self = StObject.set(x, "getZ", js.Any.fromFunction1(value))
    
    inline def setItemSize(value: Double): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSetW(value: (Double, Double) => InterleavedBufferAttribute): Self = StObject.set(x, "setW", js.Any.fromFunction2(value))
    
    inline def setSetX(value: (Double, Double) => InterleavedBufferAttribute): Self = StObject.set(x, "setX", js.Any.fromFunction2(value))
    
    inline def setSetXY(value: (Double, Double, Double) => InterleavedBufferAttribute): Self = StObject.set(x, "setXY", js.Any.fromFunction3(value))
    
    inline def setSetXYZ(value: (Double, Double, Double, Double) => InterleavedBufferAttribute): Self = StObject.set(x, "setXYZ", js.Any.fromFunction4(value))
    
    inline def setSetXYZW(value: (Double, Double, Double, Double, Double) => InterleavedBufferAttribute): Self = StObject.set(x, "setXYZW", js.Any.fromFunction5(value))
    
    inline def setSetY(value: (Double, Double) => InterleavedBufferAttribute): Self = StObject.set(x, "setY", js.Any.fromFunction2(value))
    
    inline def setSetZ(value: (Double, Double) => InterleavedBufferAttribute): Self = StObject.set(x, "setZ", js.Any.fromFunction2(value))
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
