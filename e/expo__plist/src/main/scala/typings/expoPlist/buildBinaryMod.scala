package typings.expoPlist

import typings.expoPlist.anon.ChunkSize
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildBinaryMod {
  
  @JSImport("@expo/plist/build/binary", "BinaryXmlParser")
  @js.native
  open class BinaryXmlParser protected () extends StObject {
    def this(buffer: Buffer) = this()
    def this(buffer: Buffer, options: Any) = this()
    
    var buffer: Buffer = js.native
    
    def convertIntToFloat(int: Double): Double = js.native
    
    var cursor: Double = js.native
    
    var debug: Boolean = js.native
    
    var document: Any = js.native
    
    var parent: Any = js.native
    
    def parse(): Any = js.native
    
    def readChunkHeader(): ChunkSize = js.native
    
    def readDimension(): Any = js.native
    
    def readFraction(): Any = js.native
    
    def readHex24(): String = js.native
    
    def readHex32(): String = js.native
    
    def readLength16(): Double = js.native
    
    def readLength8(): Double = js.native
    
    def readNull(header: Any): Null = js.native
    
    def readResourceMap(header: Any): Null = js.native
    
    def readS32(): Double = js.native
    
    def readString(encoding: String): String = js.native
    
    def readStringPool(header: Any): Null = js.native
    
    def readTypedValue(): Any = js.native
    
    def readU16(): Double = js.native
    
    def readU32(): Double = js.native
    
    def readU8(): Double = js.native
    
    def readXmlAttribute(): Any = js.native
    
    def readXmlCData(): Any = js.native
    
    def readXmlElementEnd(): Null = js.native
    
    def readXmlElementStart(): Any = js.native
    
    def readXmlNamespaceEnd(): Null = js.native
    
    def readXmlNamespaceStart(): Null = js.native
    
    var resources: js.Array[Any] = js.native
    
    var stack: js.Array[Any] = js.native
    
    var strings: js.Array[String] = js.native
  }
}
