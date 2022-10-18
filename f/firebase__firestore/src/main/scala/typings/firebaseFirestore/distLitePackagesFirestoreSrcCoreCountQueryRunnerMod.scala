package typings.firebaseFirestore

import typings.firebaseFirestore.anon.`24`
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod.AbstractUserDataWriter
import typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod.Query_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typings.firebaseFirestore.distLitePackagesFirestoreSrcRemoteDatastoreMod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcCoreCountQueryRunnerMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/core/count_query_runner", "CountQueryRunner")
  @js.native
  open class CountQueryRunner protected () extends StObject {
    def this(query: Query_[Any], datastore: Datastore, userDataWriter: AbstractUserDataWriter) = this()
    
    /* private */ val datastore: Any = js.native
    
    /* private */ val query: Any = js.native
    
    def run(): js.Promise[AggregateQuerySnapshot[`24`]] = js.native
    
    /* private */ val userDataWriter: Any = js.native
  }
}
