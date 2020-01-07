package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for Capabilities.GetCapabilities.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2ServerCapabilities extends js.Object {
  /**
    * Capabilities of the remote cache system.
    */
  var cacheCapabilities: js.UndefOr[Schema$BuildBazelRemoteExecutionV2CacheCapabilities] = js.native
  /**
    * Earliest RE API version supported, including deprecated versions.
    */
  var deprecatedApiVersion: js.UndefOr[Schema$BuildBazelSemverSemVer] = js.native
  /**
    * Capabilities of the remote execution system.
    */
  var executionCapabilities: js.UndefOr[Schema$BuildBazelRemoteExecutionV2ExecutionCapabilities] = js.native
  /**
    * Latest RE API version supported.
    */
  var highApiVersion: js.UndefOr[Schema$BuildBazelSemverSemVer] = js.native
  /**
    * Earliest non-deprecated RE API version supported.
    */
  var lowApiVersion: js.UndefOr[Schema$BuildBazelSemverSemVer] = js.native
}

object Schema$BuildBazelRemoteExecutionV2ServerCapabilities {
  @scala.inline
  def apply(
    cacheCapabilities: Schema$BuildBazelRemoteExecutionV2CacheCapabilities = null,
    deprecatedApiVersion: Schema$BuildBazelSemverSemVer = null,
    executionCapabilities: Schema$BuildBazelRemoteExecutionV2ExecutionCapabilities = null,
    highApiVersion: Schema$BuildBazelSemverSemVer = null,
    lowApiVersion: Schema$BuildBazelSemverSemVer = null
  ): Schema$BuildBazelRemoteExecutionV2ServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (cacheCapabilities != null) __obj.updateDynamic("cacheCapabilities")(cacheCapabilities.asInstanceOf[js.Any])
    if (deprecatedApiVersion != null) __obj.updateDynamic("deprecatedApiVersion")(deprecatedApiVersion.asInstanceOf[js.Any])
    if (executionCapabilities != null) __obj.updateDynamic("executionCapabilities")(executionCapabilities.asInstanceOf[js.Any])
    if (highApiVersion != null) __obj.updateDynamic("highApiVersion")(highApiVersion.asInstanceOf[js.Any])
    if (lowApiVersion != null) __obj.updateDynamic("lowApiVersion")(lowApiVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2ServerCapabilities]
  }
}

