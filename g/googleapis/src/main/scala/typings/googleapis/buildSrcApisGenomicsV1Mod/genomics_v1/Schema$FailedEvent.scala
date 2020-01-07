package typings.googleapis.buildSrcApisGenomicsV1Mod.genomics_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the execution of a pipeline has failed. Note that
  * other events can continue to occur after this event.
  */
@js.native
trait Schema$FailedEvent extends js.Object {
  /**
    * The human-readable description of the cause of the failure.
    */
  var cause: js.UndefOr[String] = js.native
  /**
    * The Google standard error code that best describes this failure.
    */
  var code: js.UndefOr[String] = js.native
}

object Schema$FailedEvent {
  @scala.inline
  def apply(cause: String = null, code: String = null): Schema$FailedEvent = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FailedEvent]
  }
}

