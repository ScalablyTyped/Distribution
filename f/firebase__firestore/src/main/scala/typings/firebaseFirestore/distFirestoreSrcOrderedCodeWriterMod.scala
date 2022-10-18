package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcUtilByteStringMod.ByteString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcOrderedCodeWriterMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/ordered_code_writer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/ordered_code_writer", "OrderedCodeWriter")
  @js.native
  open class OrderedCodeWriter () extends StObject {
    
    var buffer: js.typedarray.Uint8Array = js.native
    
    /** Makes a copy of the encoded bytes in this buffer.  */
    def encodedBytes(): js.typedarray.Uint8Array = js.native
    
    /* private */ var ensureAvailable: Any = js.native
    
    var position: Double = js.native
    
    /**
      * Resets the buffer such that it is the same as when it was newly
      * constructed.
      */
    def reset(): Unit = js.native
    
    def seed(encodedBytes: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Encodes `val` into an encoding so that the order matches the IEEE 754
      * floating-point comparison results with the following exceptions:
      *   -0.0 < 0.0
      *   all non-NaN < NaN
      *   NaN = NaN
      */
    /* private */ var toOrderedBits: Any = js.native
    
    /** Writes a single byte ascending to the buffer. */
    /* private */ var writeByteAscending: Any = js.native
    
    /** Writes a single byte descending to the buffer.  */
    /* private */ var writeByteDescending: Any = js.native
    
    def writeBytesAscending(value: ByteString): Unit = js.native
    
    def writeBytesDescending(value: ByteString): Unit = js.native
    
    /* private */ var writeEscapedByteAscending: Any = js.native
    
    /* private */ var writeEscapedByteDescending: Any = js.native
    
    /**
      * Writes the "infinity" byte sequence that sorts after all other byte
      * sequences written in ascending order.
      */
    def writeInfinityAscending(): Unit = js.native
    
    /**
      * Writes the "infinity" byte sequence that sorts before all other byte
      * sequences written in descending order.
      */
    def writeInfinityDescending(): Unit = js.native
    
    def writeNumberAscending(`val`: Double): Unit = js.native
    
    def writeNumberDescending(`val`: Double): Unit = js.native
    
    /* private */ var writeSeparatorAscending: Any = js.native
    
    /* private */ var writeSeparatorDescending: Any = js.native
    
    /** Writes utf8 bytes into this byte sequence, ascending. */
    def writeUtf8Ascending(sequence: String): Unit = js.native
    
    /** Writes utf8 bytes into this byte sequence, descending */
    def writeUtf8Descending(sequence: String): Unit = js.native
  }
  
  inline def numberOfLeadingZerosInByte(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("numberOfLeadingZerosInByte")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
