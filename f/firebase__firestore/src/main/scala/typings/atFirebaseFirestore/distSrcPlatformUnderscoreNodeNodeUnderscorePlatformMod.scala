package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.atFirebaseFirestoreNumbers.`true`
import typings.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseId
import typings.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseInfo
import typings.atFirebaseFirestore.distSrcCoreTypesMod.ProtoByteString
import typings.atFirebaseFirestore.distSrcPlatformPlatformMod.Platform
import typings.atFirebaseFirestore.distSrcRemoteConnectionMod.Connection
import typings.atFirebaseFirestore.distSrcRemoteConnectivityUnderscoreMonitorMod.ConnectivityMonitor
import typings.atFirebaseFirestore.distSrcRemoteSerializerMod.JsonProtoSerializer
import typings.std.Document
import typings.std.Uint8Array
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_node/node_platform", JSImport.Namespace)
@js.native
object distSrcPlatformUnderscoreNodeNodeUnderscorePlatformMod extends js.Object {
  @js.native
  class NodePlatform () extends Platform {
    /** True if and only if the Base64 conversion functions are available. */
    /* CompleteClass */
    override val base64Available: Boolean = js.native
    @JSName("base64Available")
    val base64Available_NodePlatform: `true` = js.native
    /** The Platform's 'document' implementation or null if not available. */
    /* CompleteClass */
    override val document: Document | Null = js.native
    @JSName("document")
    val document_NodePlatform: Null = js.native
    /* CompleteClass */
    override val emptyByteString: ProtoByteString = js.native
    @JSName("emptyByteString")
    val emptyByteString_NodePlatform: Uint8Array = js.native
    /** The Platform's 'window' implementation or null if not available. */
    /* CompleteClass */
    override val window: Window | Null = js.native
    /** Converts a Base64 encoded string to a binary string. */
    /* CompleteClass */
    override def atob(encoded: String): String = js.native
    /** Converts a binary string to a Base64 encoded string. */
    /* CompleteClass */
    override def btoa(raw: String): String = js.native
    /** Formats an object as a JSON string, suitable for logging. */
    /* CompleteClass */
    override def formatJSON(value: js.Any): String = js.native
    /* CompleteClass */
    override def loadConnection(databaseInfo: DatabaseInfo): js.Promise[Connection] = js.native
    /* CompleteClass */
    override def newConnectivityMonitor(): ConnectivityMonitor = js.native
    /* CompleteClass */
    override def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = js.native
    @JSName("window")
    def window_MNodePlatform(): Window | Null = js.native
  }
  
}

