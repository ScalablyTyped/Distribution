package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.HashClientIdRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema.HashClientIdResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientIdCollection extends js.Object {
  // Hashes the given Client ID.
  def hashClientId(resource: HashClientIdRequest): HashClientIdResponse
}

object ClientIdCollection {
  @scala.inline
  def apply(hashClientId: HashClientIdRequest => HashClientIdResponse): ClientIdCollection = {
    val __obj = js.Dynamic.literal(hashClientId = js.Any.fromFunction1(hashClientId))
  
    __obj.asInstanceOf[ClientIdCollection]
  }
}

