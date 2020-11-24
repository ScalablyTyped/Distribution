package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.Publisher
import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.PublisherList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishersCollection extends js.Object {
  
  // Retrieves information about the specified publisher.
  def get(publisherId: String): Publisher = js.native
  // Retrieves information about the specified publisher.
  def get(publisherId: String, optionalArgs: js.Object): Publisher = js.native
  
  // Retrieves a list of publishers that match the request criteria. This method is analogous to a publisher search function.
  def list(): PublisherList = js.native
  // Retrieves a list of publishers that match the request criteria. This method is analogous to a publisher search function.
  def list(optionalArgs: js.Object): PublisherList = js.native
}
