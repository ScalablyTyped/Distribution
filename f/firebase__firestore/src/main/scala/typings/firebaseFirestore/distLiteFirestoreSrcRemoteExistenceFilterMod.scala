package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces.BloomFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcRemoteExistenceFilterMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/remote/existence_filter", "ExistenceFilter")
  @js.native
  open class ExistenceFilter protected () extends StObject {
    def this(count: Double) = this()
    def this(count: Double, unchangedNames: BloomFilter) = this()
    
    var count: Double = js.native
    
    var unchangedNames: js.UndefOr[BloomFilter] = js.native
  }
}
