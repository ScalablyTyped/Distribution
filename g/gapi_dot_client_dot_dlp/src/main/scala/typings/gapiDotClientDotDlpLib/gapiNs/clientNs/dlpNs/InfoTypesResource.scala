package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoTypesResource extends js.Object {
  /** Returns sensitive information types for given category. */
  def list(request: gapiDotClientDotDlpLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[GooglePrivacyDlpV2beta1ListInfoTypesResponse]
}

object InfoTypesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotDlpLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[GooglePrivacyDlpV2beta1ListInfoTypesResponse]
    ]
  ): InfoTypesResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[InfoTypesResource]
  }
}

