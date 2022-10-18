package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcUtilByteStringMod.ByteString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcDirectionalIndexByteEncoderMod {
  
  trait DirectionalIndexByteEncoder extends StObject {
    
    def writeBytes(value: ByteString): Unit
    
    def writeInfinity(): Unit
    
    def writeNumber(value: Double): Unit
    
    def writeString(value: String): Unit
  }
  object DirectionalIndexByteEncoder {
    
    inline def apply(
      writeBytes: ByteString => Unit,
      writeInfinity: () => Unit,
      writeNumber: Double => Unit,
      writeString: String => Unit
    ): DirectionalIndexByteEncoder = {
      val __obj = js.Dynamic.literal(writeBytes = js.Any.fromFunction1(writeBytes), writeInfinity = js.Any.fromFunction0(writeInfinity), writeNumber = js.Any.fromFunction1(writeNumber), writeString = js.Any.fromFunction1(writeString))
      __obj.asInstanceOf[DirectionalIndexByteEncoder]
    }
    
    extension [Self <: DirectionalIndexByteEncoder](x: Self) {
      
      inline def setWriteBytes(value: ByteString => Unit): Self = StObject.set(x, "writeBytes", js.Any.fromFunction1(value))
      
      inline def setWriteInfinity(value: () => Unit): Self = StObject.set(x, "writeInfinity", js.Any.fromFunction0(value))
      
      inline def setWriteNumber(value: Double => Unit): Self = StObject.set(x, "writeNumber", js.Any.fromFunction1(value))
      
      inline def setWriteString(value: String => Unit): Self = StObject.set(x, "writeString", js.Any.fromFunction1(value))
    }
  }
}
