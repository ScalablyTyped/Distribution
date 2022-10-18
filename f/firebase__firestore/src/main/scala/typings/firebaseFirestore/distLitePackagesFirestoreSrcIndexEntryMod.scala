package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcIndexEntryMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/index_entry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/index_entry", "IndexEntry")
  @js.native
  open class IndexEntry protected () extends StObject {
    def this(
      indexId: Double,
      documentKey: DocumentKey,
      arrayValue: js.typedarray.Uint8Array,
      directionalValue: js.typedarray.Uint8Array
    ) = this()
    
    val arrayValue: js.typedarray.Uint8Array = js.native
    
    val directionalValue: js.typedarray.Uint8Array = js.native
    
    val documentKey: DocumentKey = js.native
    
    val indexId: Double = js.native
    
    /**
      * Returns an IndexEntry entry that sorts immediately after the current
      * directional value.
      */
    def successor(): IndexEntry = js.native
  }
  
  inline def compareByteArrays(left: js.typedarray.Uint8Array, right: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareByteArrays")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def indexEntryComparator(left: IndexEntry, right: IndexEntry): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexEntryComparator")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
}
