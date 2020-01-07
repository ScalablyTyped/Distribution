package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CommandEvents contains counters for the number of warnings and errors that
  * occurred during the execution of a command.
  */
@js.native
trait Schema$GoogleDevtoolsRemotebuildbotCommandEvents extends js.Object {
  /**
    * Indicates whether we are using a cached Docker image (true) or had to
    * pull the Docker image (false) for this command.
    */
  var dockerCacheHit: js.UndefOr[Boolean] = js.native
  /**
    * The input cache miss ratio.
    */
  var inputCacheMiss: js.UndefOr[Double] = js.native
  /**
    * The number of errors reported.
    */
  var numErrors: js.UndefOr[String] = js.native
  /**
    * The number of warnings reported.
    */
  var numWarnings: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemotebuildbotCommandEvents {
  @scala.inline
  def apply(
    dockerCacheHit: js.UndefOr[Boolean] = js.undefined,
    inputCacheMiss: Int | Double = null,
    numErrors: String = null,
    numWarnings: String = null
  ): Schema$GoogleDevtoolsRemotebuildbotCommandEvents = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dockerCacheHit)) __obj.updateDynamic("dockerCacheHit")(dockerCacheHit.asInstanceOf[js.Any])
    if (inputCacheMiss != null) __obj.updateDynamic("inputCacheMiss")(inputCacheMiss.asInstanceOf[js.Any])
    if (numErrors != null) __obj.updateDynamic("numErrors")(numErrors.asInstanceOf[js.Any])
    if (numWarnings != null) __obj.updateDynamic("numWarnings")(numWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildbotCommandEvents]
  }
}

