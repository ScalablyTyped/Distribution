package typings.firebaseFirestore

import typings.firebaseFirestore.anon.`39`
import typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.AbstractUserDataWriter
import typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Query_
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteDatastoreMod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreCountQueryRunnerMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/count_query_runner", "CountQueryRunner")
  @js.native
  open class CountQueryRunner protected () extends StObject {
    def this(query: Query_[Any], datastore: Datastore, userDataWriter: AbstractUserDataWriter) = this()
    
    /* private */ val datastore: Any = js.native
    
    /* private */ val query: Any = js.native
    
    def run(): js.Promise[AggregateQuerySnapshot[`39`]] = js.native
    
    /* private */ val userDataWriter: Any = js.native
  }
}
