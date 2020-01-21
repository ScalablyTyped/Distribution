package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.LanguagesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesCollection extends js.Object {
  // Retrieves a list of languages.
  def list(profileId: String): LanguagesListResponse
}

object LanguagesCollection {
  @scala.inline
  def apply(list: String => LanguagesListResponse): LanguagesCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LanguagesCollection]
  }
}

