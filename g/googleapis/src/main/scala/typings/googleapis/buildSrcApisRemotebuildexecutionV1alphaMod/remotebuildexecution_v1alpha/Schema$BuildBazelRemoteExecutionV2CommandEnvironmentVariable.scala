package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `EnvironmentVariable` is one variable to set in the running
  * program&#39;s environment.
  */
@js.native
trait Schema$BuildBazelRemoteExecutionV2CommandEnvironmentVariable extends js.Object {
  /**
    * The variable name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The variable value.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$BuildBazelRemoteExecutionV2CommandEnvironmentVariable {
  @scala.inline
  def apply(name: String = null, value: String = null): Schema$BuildBazelRemoteExecutionV2CommandEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BuildBazelRemoteExecutionV2CommandEnvironmentVariable]
  }
}

