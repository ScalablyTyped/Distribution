package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltCategoryId
import typings.gapiClientBooks.AnonAltFieldsKeyLocaleOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnboardingResource extends js.Object {
  /** List categories for onboarding experience. */
  def listCategories(request: AnonAltFieldsKeyLocaleOauthtoken): Request_[Category]
  /** List available volumes under categories for onboarding experience. */
  def listCategoryVolumes(request: AnonAltCategoryId): Request_[Volume2]
}

object OnboardingResource {
  @scala.inline
  def apply(
    listCategories: AnonAltFieldsKeyLocaleOauthtoken => Request_[Category],
    listCategoryVolumes: AnonAltCategoryId => Request_[Volume2]
  ): OnboardingResource = {
    val __obj = js.Dynamic.literal(listCategories = js.Any.fromFunction1(listCategories), listCategoryVolumes = js.Any.fromFunction1(listCategoryVolumes))
  
    __obj.asInstanceOf[OnboardingResource]
  }
}

