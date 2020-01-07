package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - use CommandResult instead. Can be used as part of
  * CompleteRequest.metadata, or are part of a more sophisticated message.
  */
@js.native
trait Schema$GoogleDevtoolsRemoteworkersV1test2CommandOverhead extends js.Object {
  /**
    * The elapsed time between calling Accept and Complete. The server will
    * also have its own idea of what this should be, but this excludes the
    * overhead of the RPCs and the bot response time.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * The amount of time *not* spent executing the command (ie
    * uploading/downloading files).
    */
  var overhead: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemoteworkersV1test2CommandOverhead {
  @scala.inline
  def apply(duration: String = null, overhead: String = null): Schema$GoogleDevtoolsRemoteworkersV1test2CommandOverhead = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (overhead != null) __obj.updateDynamic("overhead")(overhead.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemoteworkersV1test2CommandOverhead]
  }
}

