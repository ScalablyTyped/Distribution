package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootCategoriesResource extends js.Object {
  var infoTypes: InfoTypesResource
  /** Returns the list of root categories of sensitive information. */
  def list(request: gapiDotClientDotDlpLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
}

object RootCategoriesResource {
  @scala.inline
  def apply(
    infoTypes: InfoTypesResource,
    list: js.Function1[
      gapiDotClientDotDlpLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
    ]
  ): RootCategoriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("infoTypes")(infoTypes)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[RootCategoriesResource]
  }
}

