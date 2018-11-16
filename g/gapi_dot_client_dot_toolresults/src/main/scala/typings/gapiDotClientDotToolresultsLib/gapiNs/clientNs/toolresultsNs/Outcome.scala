package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Outcome extends js.Object {
  /**
               * More information about a FAILURE outcome.
               *
               * Returns INVALID_ARGUMENT if this field is set but the summary is not FAILURE.
               *
               * Optional
               */
  var failureDetail: js.UndefOr[FailureDetail] = js.undefined
  /**
               * More information about an INCONCLUSIVE outcome.
               *
               * Returns INVALID_ARGUMENT if this field is set but the summary is not INCONCLUSIVE.
               *
               * Optional
               */
  var inconclusiveDetail: js.UndefOr[InconclusiveDetail] = js.undefined
  /**
               * More information about a SKIPPED outcome.
               *
               * Returns INVALID_ARGUMENT if this field is set but the summary is not SKIPPED.
               *
               * Optional
               */
  var skippedDetail: js.UndefOr[SkippedDetail] = js.undefined
  /**
               * More information about a SUCCESS outcome.
               *
               * Returns INVALID_ARGUMENT if this field is set but the summary is not SUCCESS.
               *
               * Optional
               */
  var successDetail: js.UndefOr[SuccessDetail] = js.undefined
  /**
               * The simplest way to interpret a result.
               *
               * Required
               */
  var summary: js.UndefOr[java.lang.String] = js.undefined
}

