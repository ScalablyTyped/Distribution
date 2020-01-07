package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about vulnerable or missing HTTP Headers.
  */
@js.native
trait Schema$VulnerableHeaders extends js.Object {
  /**
    * List of vulnerable headers.
    */
  var headers: js.UndefOr[js.Array[Schema$Header]] = js.native
  /**
    * List of missing headers.
    */
  var missingHeaders: js.UndefOr[js.Array[Schema$Header]] = js.native
}

object Schema$VulnerableHeaders {
  @scala.inline
  def apply(headers: js.Array[Schema$Header] = null, missingHeaders: js.Array[Schema$Header] = null): Schema$VulnerableHeaders = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (missingHeaders != null) __obj.updateDynamic("missingHeaders")(missingHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VulnerableHeaders]
  }
}

