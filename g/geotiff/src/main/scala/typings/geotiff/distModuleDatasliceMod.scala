package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleDatasliceMod {
  
  @JSImport("geotiff/dist-module/dataslice", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DataSlice {
    def this(arrayBuffer: Any, sliceOffset: Any, littleEndian: Any, bigTiff: Any) = this()
  }
  
  @js.native
  trait DataSlice extends StObject {
    
    var _bigTiff: Any = js.native
    
    var _dataView: js.typedarray.DataView = js.native
    
    var _littleEndian: Any = js.native
    
    var _sliceOffset: Any = js.native
    
    def bigTiff: Any = js.native
    
    def buffer: js.typedarray.ArrayBuffer = js.native
    
    def covers(offset: Any, length: Any): Boolean = js.native
    
    def littleEndian: Any = js.native
    
    def readFloat32(offset: Any): Double = js.native
    
    def readFloat64(offset: Any): Double = js.native
    
    def readInt16(offset: Any): Double = js.native
    
    def readInt32(offset: Any): Double = js.native
    
    def readInt64(offset: Any): Double = js.native
    
    def readInt8(offset: Any): Double = js.native
    
    def readOffset(offset: Any): Double = js.native
    
    def readUint16(offset: Any): Double = js.native
    
    def readUint32(offset: Any): Double = js.native
    
    def readUint64(offset: Any): Double = js.native
    
    def readUint8(offset: Any): Double = js.native
    
    def sliceOffset: Any = js.native
    
    def sliceTop: Any = js.native
  }
}
