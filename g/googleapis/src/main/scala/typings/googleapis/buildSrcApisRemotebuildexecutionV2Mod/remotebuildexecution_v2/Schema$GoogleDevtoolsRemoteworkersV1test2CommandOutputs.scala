package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - use CommandResult instead. Describes the actual outputs from
  * the task.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteworkersV1test2CommandOutputs extends js.Object {
  /**
    * exit_code is only fully reliable if the status&#39; code is OK. If the
    * task exceeded its deadline or was cancelled, the process may still
    * produce an exit code as it is cancelled, and this will be populated, but
    * a successful (zero) is unlikely to be correct unless the status code is
    * OK.
    */
  var exitCode: js.UndefOr[Double] = js.native
  /**
    * The output files. The blob referenced by the digest should contain one of
    * the following (implementation-dependent):    * A marshalled
    * DirectoryMetadata of the returned filesystem    * A LUCI-style .isolated
    * file
    */
  var outputs: js.UndefOr[Schema$GoogleDevtoolsRemoteworkersV1test2Digest] = js.native
}

object Schema$GoogleDevtoolsRemoteworkersV1test2CommandOutputs {
  @scala.inline
  def apply(exitCode: Int | Double = null, outputs: Schema$GoogleDevtoolsRemoteworkersV1test2Digest = null): Schema$GoogleDevtoolsRemoteworkersV1test2CommandOutputs = {
    val __obj = js.Dynamic.literal()
    if (exitCode != null) __obj.updateDynamic("exitCode")(exitCode.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteworkersV1test2CommandOutputs]
  }
}

