package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleDataview64Mod {
  
  @JSImport("geotiff/dist-module/dataview64", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DataView64 {
    def this(arrayBuffer: Any) = this()
  }
  
  @js.native
  trait DataView64 extends StObject {
    
    var _dataView: js.typedarray.DataView = js.native
    
    def buffer: js.typedarray.ArrayBuffer = js.native
    
    def getFloat16(offset: Any, littleEndian: Any): Double = js.native
    
    def getFloat32(offset: Any, littleEndian: Any): Double = js.native
    
    def getFloat64(offset: Any, littleEndian: Any): Double = js.native
    
    def getInt16(offset: Any, littleEndian: Any): Double = js.native
    
    def getInt32(offset: Any, littleEndian: Any): Double = js.native
    
    def getInt64(offset: Any, littleEndian: Any): Double = js.native
    
    def getInt8(offset: Any, littleEndian: Any): Double = js.native
    
    def getUint16(offset: Any, littleEndian: Any): Double = js.native
    
    def getUint32(offset: Any, littleEndian: Any): Double = js.native
    
    def getUint64(offset: Any, littleEndian: Any): Double = js.native
    
    def getUint8(offset: Any, littleEndian: Any): Double = js.native
  }
}
