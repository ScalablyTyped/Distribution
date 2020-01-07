package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CommandDuration contains the various duration metrics tracked when a bot
  * performs a command.
  */
@js.native
trait Schema$GoogleDevtoolsRemotebuildbotCommandDurations extends js.Object {
  /**
    * The time spent preparing the command to be run in a Docker container
    * (includes pulling the Docker image, if necessary).
    */
  var dockerPrep: js.UndefOr[String] = js.native
  /**
    * The time spent downloading the input files and constructing the working
    * directory.
    */
  var download: js.UndefOr[String] = js.native
  /**
    * The time spent executing the command (i.e., doing useful work).
    */
  var execution: js.UndefOr[String] = js.native
  /**
    * The timestamp when preparation is done and bot starts downloading files.
    */
  var isoPrepDone: js.UndefOr[String] = js.native
  /**
    * The time spent completing the command, in total.
    */
  var overall: js.UndefOr[String] = js.native
  /**
    * The time spent uploading the stdout logs.
    */
  var stdout: js.UndefOr[String] = js.native
  /**
    * The time spent uploading the output files.
    */
  var upload: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemotebuildbotCommandDurations {
  @scala.inline
  def apply(
    dockerPrep: String = null,
    download: String = null,
    execution: String = null,
    isoPrepDone: String = null,
    overall: String = null,
    stdout: String = null,
    upload: String = null
  ): Schema$GoogleDevtoolsRemotebuildbotCommandDurations = {
    val __obj = js.Dynamic.literal()
    if (dockerPrep != null) __obj.updateDynamic("dockerPrep")(dockerPrep.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (execution != null) __obj.updateDynamic("execution")(execution.asInstanceOf[js.Any])
    if (isoPrepDone != null) __obj.updateDynamic("isoPrepDone")(isoPrepDone.asInstanceOf[js.Any])
    if (overall != null) __obj.updateDynamic("overall")(overall.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildbotCommandDurations]
  }
}

