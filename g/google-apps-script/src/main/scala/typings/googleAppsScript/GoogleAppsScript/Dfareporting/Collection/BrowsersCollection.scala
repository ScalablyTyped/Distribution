package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.BrowsersListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowsersCollection extends js.Object {
  // Retrieves a list of browsers.
  def list(profileId: String): BrowsersListResponse
}

object BrowsersCollection {
  @scala.inline
  def apply(list: String => BrowsersListResponse): BrowsersCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BrowsersCollection]
  }
}

