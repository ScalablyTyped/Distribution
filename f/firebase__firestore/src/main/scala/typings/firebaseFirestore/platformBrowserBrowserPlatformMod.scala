package typings.firebaseFirestore

import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseInfo
import typings.firebaseFirestore.firebaseFirestoreBooleans.`true`
import typings.firebaseFirestore.platformPlatformMod.Platform
import typings.firebaseFirestore.remoteConnectionMod.Connection
import typings.firebaseFirestore.remoteConnectivityMonitorMod.ConnectivityMonitor
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typings.std.Document_
import typings.std.Uint8Array
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform_browser/browser_platform", JSImport.Namespace)
@js.native
object platformBrowserBrowserPlatformMod extends js.Object {
  @js.native
  class BrowserPlatform () extends Platform {
    /** True if and only if the Base64 conversion functions are available. */
    /* CompleteClass */
    override val base64Available: Boolean = js.native
    /** The Platform's 'document' implementation or null if not available. */
    /* CompleteClass */
    override val document: Document_ | Null = js.native
    /**
      * True if timestamps, bytes and numbers are represented in Proto3 JSON
      * format (in-memory and on the wire)
      */
    /* CompleteClass */
    override val useProto3Json: Boolean = js.native
    @JSName("useProto3Json")
    val useProto3Json_BrowserPlatform: `true` = js.native
    /** The Platform's 'window' implementation or null if not available. */
    /* CompleteClass */
    override val window: Window_ | Null = js.native
    /** Converts a Base64 encoded string to a binary string. */
    /* CompleteClass */
    override def atob(encoded: String): String = js.native
    /** Converts a binary string to a Base64 encoded string. */
    /* CompleteClass */
    override def btoa(raw: String): String = js.native
    @JSName("document")
    def document_MBrowserPlatform(): Document_ | Null = js.native
    /** Formats an object as a JSON string, suitable for logging. */
    /* CompleteClass */
    override def formatJSON(value: js.Any): String = js.native
    /* CompleteClass */
    override def loadConnection(databaseInfo: DatabaseInfo): js.Promise[Connection] = js.native
    /* CompleteClass */
    override def newConnectivityMonitor(): ConnectivityMonitor = js.native
    /* CompleteClass */
    override def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = js.native
    /**
      * Generates `nBytes` of random bytes. If `nBytes` is negative, an empty array
      * will be returned.
      */
    /* CompleteClass */
    override def randomBytes(nBytes: Double): Uint8Array = js.native
    @JSName("window")
    def window_MBrowserPlatform(): Window_ | Null = js.native
  }
  
}

