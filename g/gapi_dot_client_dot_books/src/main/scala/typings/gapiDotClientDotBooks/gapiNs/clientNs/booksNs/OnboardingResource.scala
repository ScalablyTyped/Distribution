package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltCategoryId
import typings.gapiDotClientDotBooks.Anon_AltFieldsKeyLocaleOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnboardingResource extends js.Object {
  /** List categories for onboarding experience. */
  def listCategories(request: Anon_AltFieldsKeyLocaleOauthtoken): Request[Category]
  /** List available volumes under categories for onboarding experience. */
  def listCategoryVolumes(request: Anon_AltCategoryId): Request[Volume2]
}

object OnboardingResource {
  @scala.inline
  def apply(
    listCategories: Anon_AltFieldsKeyLocaleOauthtoken => Request[Category],
    listCategoryVolumes: Anon_AltCategoryId => Request[Volume2]
  ): OnboardingResource = {
    val __obj = js.Dynamic.literal(listCategories = js.Any.fromFunction1(listCategories), listCategoryVolumes = js.Any.fromFunction1(listCategoryVolumes))
  
    __obj.asInstanceOf[OnboardingResource]
  }
}

