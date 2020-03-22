package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonCategoryId
import typings.gapiClientBooks.AnonKeyLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnboardingResource extends js.Object {
  /** List categories for onboarding experience. */
  def listCategories(request: AnonKeyLocale): Request_[Category]
  /** List available volumes under categories for onboarding experience. */
  def listCategoryVolumes(request: AnonCategoryId): Request_[Volume2]
}

object OnboardingResource {
  @scala.inline
  def apply(
    listCategories: AnonKeyLocale => Request_[Category],
    listCategoryVolumes: AnonCategoryId => Request_[Volume2]
  ): OnboardingResource = {
    val __obj = js.Dynamic.literal(listCategories = js.Any.fromFunction1(listCategories), listCategoryVolumes = js.Any.fromFunction1(listCategoryVolumes))
  
    __obj.asInstanceOf[OnboardingResource]
  }
}

