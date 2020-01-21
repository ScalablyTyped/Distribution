package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Size
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.SizesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizesCollection extends js.Object {
  // Gets one size by ID.
  def get(profileId: String, id: String): Size = js.native
  // Inserts a new size.
  def insert(resource: Size, profileId: String): Size = js.native
  // Retrieves a list of sizes, possibly filtered. Retrieved sizes are globally unique and may include values not currently in use by your account. Due to this, the list of sizes returned by this method may differ from the list seen in the Trafficking UI.
  def list(profileId: String): SizesListResponse = js.native
  // Retrieves a list of sizes, possibly filtered. Retrieved sizes are globally unique and may include values not currently in use by your account. Due to this, the list of sizes returned by this method may differ from the list seen in the Trafficking UI.
  def list(profileId: String, optionalArgs: js.Object): SizesListResponse = js.native
}

