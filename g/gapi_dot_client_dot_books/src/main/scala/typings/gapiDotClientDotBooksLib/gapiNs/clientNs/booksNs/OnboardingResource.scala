package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnboardingResource extends js.Object {
  /** List categories for onboarding experience. */
  def listCategories(request: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Category]
  /** List available volumes under categories for onboarding experience. */
  def listCategoryVolumes(request: gapiDotClientDotBooksLib.Anon_AltCategoryId): gapiDotClientLib.gapiNs.clientNs.Request[Volume2]
}

object OnboardingResource {
  @scala.inline
  def apply(
    listCategories: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Category]
    ],
    listCategoryVolumes: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltCategoryId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Volume2]
    ]
  ): OnboardingResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listCategories")(listCategories)
    __obj.updateDynamic("listCategoryVolumes")(listCategoryVolumes)
    __obj.asInstanceOf[OnboardingResource]
  }
}

