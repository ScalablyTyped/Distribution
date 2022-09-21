package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod.Value
import typings.firebaseFirestore.packagesFirestoreSrcDirectionalIndexByteEncoderMod.DirectionalIndexByteEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagesFirestoreSrcFirestoreIndexValueWriterMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/firestore_index_value_writer", "FirestoreIndexValueWriter")
  @js.native
  /* private */ open class FirestoreIndexValueWriter () extends StObject {
    
    /* private */ var writeIndexArray: Any = js.native
    
    /* private */ var writeIndexEntityRef: Any = js.native
    
    /* private */ var writeIndexMap: Any = js.native
    
    /* private */ var writeIndexString: Any = js.native
    
    /** Writes an index value.  */
    def writeIndexValue(value: Value, encoder: DirectionalIndexByteEncoder): Unit = js.native
    
    /* private */ var writeIndexValueAux: Any = js.native
    
    /* private */ var writeTruncationMarker: Any = js.native
    
    /* private */ var writeUnlabeledIndexString: Any = js.native
    
    /* private */ var writeValueTypeLabel: Any = js.native
  }
  /* static members */
  object FirestoreIndexValueWriter {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/firestore_index_value_writer", "FirestoreIndexValueWriter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/firestore_index_value_writer", "FirestoreIndexValueWriter.INSTANCE")
    @js.native
    def INSTANCE: FirestoreIndexValueWriter = js.native
    inline def INSTANCE_=(x: FirestoreIndexValueWriter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCE")(x.asInstanceOf[js.Any])
  }
}
