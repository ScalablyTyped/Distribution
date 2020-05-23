package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.CategoryId
import typings.gapiClientBooks.anon.KeyLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnboardingResource extends js.Object {
  /** List categories for onboarding experience. */
  def listCategories(request: KeyLocale): Request[Category]
  /** List available volumes under categories for onboarding experience. */
  def listCategoryVolumes(request: CategoryId): Request[Volume2]
}

object OnboardingResource {
  @scala.inline
  def apply(
    listCategories: KeyLocale => Request[Category],
    listCategoryVolumes: CategoryId => Request[Volume2]
  ): OnboardingResource = {
    val __obj = js.Dynamic.literal(listCategories = js.Any.fromFunction1(listCategories), listCategoryVolumes = js.Any.fromFunction1(listCategoryVolumes))
    __obj.asInstanceOf[OnboardingResource]
  }
}

