package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarActionresultsDollarUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The hash. In the case of SHA-256, it will always be a lowercase hex
    * string exactly 64 characters long.
    */
  var hash: js.UndefOr[String] = js.native
  /**
    * The instance of the execution system to operate against. A server may
    * support multiple instances of the execution system (with their own
    * workers, storage, caches, etc.). The server MAY require use of this field
    * to select between them in an implementation-defined fashion, otherwise it
    * can be omitted.
    */
  var instanceName: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$BuildBazelRemoteExecutionV2ActionResult] = js.native
  /**
    * The priority (relative importance) of this content in the overall cache.
    * Generally, a lower value means a longer retention time or other
    * advantage, but the interpretation of a given value is server-dependent. A
    * priority of 0 means a *default* value, decided by the server.  The
    * particular semantics of this field is up to the server. In particular,
    * every server will have their own supported range of priorities, and will
    * decide how these map into retention/eviction policy.
    */
  @JSName("resultsCachePolicy.priority")
  var resultsCachePolicyDotpriority: js.UndefOr[Double] = js.native
  /**
    * The size of the blob, in bytes.
    */
  var sizeBytes: js.UndefOr[String] = js.native
}

