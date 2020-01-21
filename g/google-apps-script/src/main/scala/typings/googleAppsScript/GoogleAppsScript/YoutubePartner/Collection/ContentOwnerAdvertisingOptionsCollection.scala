package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ContentOwnerAdvertisingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentOwnerAdvertisingOptionsCollection extends js.Object {
  // Retrieves advertising options for the content owner associated with the authenticated user.
  def get(): ContentOwnerAdvertisingOption = js.native
  // Retrieves advertising options for the content owner associated with the authenticated user.
  def get(optionalArgs: js.Object): ContentOwnerAdvertisingOption = js.native
  // Updates advertising options for the content owner associated with the authenticated API user. This method supports patch semantics.
  def patch(resource: ContentOwnerAdvertisingOption): ContentOwnerAdvertisingOption = js.native
  // Updates advertising options for the content owner associated with the authenticated API user. This method supports patch semantics.
  def patch(resource: ContentOwnerAdvertisingOption, optionalArgs: js.Object): ContentOwnerAdvertisingOption = js.native
  // Updates advertising options for the content owner associated with the authenticated API user.
  def update(resource: ContentOwnerAdvertisingOption): ContentOwnerAdvertisingOption = js.native
  // Updates advertising options for the content owner associated with the authenticated API user.
  def update(resource: ContentOwnerAdvertisingOption, optionalArgs: js.Object): ContentOwnerAdvertisingOption = js.native
}

