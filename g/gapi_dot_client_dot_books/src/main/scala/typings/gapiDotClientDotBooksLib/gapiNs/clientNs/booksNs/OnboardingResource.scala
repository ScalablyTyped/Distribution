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
    listCategories: gapiDotClientDotBooksLib.Anon_AltFieldsKeyLocaleOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Category],
    listCategoryVolumes: gapiDotClientDotBooksLib.Anon_AltCategoryId => gapiDotClientLib.gapiNs.clientNs.Request[Volume2]
  ): OnboardingResource = {
    val __obj = js.Dynamic.literal(listCategories = js.Any.fromFunction1(listCategories), listCategoryVolumes = js.Any.fromFunction1(listCategoryVolumes))
  
    __obj.asInstanceOf[OnboardingResource]
  }
}

