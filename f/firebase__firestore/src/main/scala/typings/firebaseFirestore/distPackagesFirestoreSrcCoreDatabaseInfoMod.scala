package typings.firebaseFirestore

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.distPackagesFirestoreSrcApiLongPollingOptionsMod.ExperimentalLongPollingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreDatabaseInfoMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/database_info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/database_info", "DEFAULT_DATABASE_NAME")
  @js.native
  val DEFAULT_DATABASE_NAME: /* "(default)" */ String = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/database_info", "DatabaseId")
  @js.native
  open class DatabaseId protected () extends StObject {
    def this(projectId: String) = this()
    def this(projectId: String, database: String) = this()
    
    val database: String = js.native
    
    def isDefaultDatabase: Boolean = js.native
    
    def isEqual(other: js.Object): Boolean = js.native
    
    val projectId: String = js.native
  }
  /* static members */
  object DatabaseId {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/core/database_info", "DatabaseId")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): DatabaseId = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[DatabaseId]
  }
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/database_info", "DatabaseInfo")
  @js.native
  open class DatabaseInfo protected () extends StObject {
    /**
      * Constructs a DatabaseInfo using the provided host, databaseId and
      * persistenceKey.
      *
      * @param databaseId - The database to use.
      * @param appId - The Firebase App Id.
      * @param persistenceKey - A unique identifier for this Firestore's local
      * storage (used in conjunction with the databaseId).
      * @param host - The Firestore backend host to connect to.
      * @param ssl - Whether to use SSL when connecting.
      * @param forceLongPolling - Whether to use the forceLongPolling option
      * when using WebChannel as the network transport.
      * @param autoDetectLongPolling - Whether to use the detectBufferingProxy
      * option when using WebChannel as the network transport.
      * @param longPollingOptions Options that configure long-polling.
      * @param useFetchStreams Whether to use the Fetch API instead of
      * XMLHTTPRequest
      */
    def this(
      databaseId: DatabaseId,
      appId: String,
      persistenceKey: String,
      host: String,
      ssl: Boolean,
      forceLongPolling: Boolean,
      autoDetectLongPolling: Boolean,
      longPollingOptions: ExperimentalLongPollingOptions,
      useFetchStreams: Boolean
    ) = this()
    
    val appId: String = js.native
    
    val autoDetectLongPolling: Boolean = js.native
    
    val databaseId: DatabaseId = js.native
    
    val forceLongPolling: Boolean = js.native
    
    val host: String = js.native
    
    val longPollingOptions: ExperimentalLongPollingOptions = js.native
    
    val persistenceKey: String = js.native
    
    val ssl: Boolean = js.native
    
    val useFetchStreams: Boolean = js.native
  }
  
  inline def databaseIdFromApp(app: FirebaseApp): DatabaseId = ^.asInstanceOf[js.Dynamic].applyDynamic("databaseIdFromApp")(app.asInstanceOf[js.Any]).asInstanceOf[DatabaseId]
  inline def databaseIdFromApp(app: FirebaseApp, database: String): DatabaseId = (^.asInstanceOf[js.Dynamic].applyDynamic("databaseIdFromApp")(app.asInstanceOf[js.Any], database.asInstanceOf[js.Any])).asInstanceOf[DatabaseId]
}
