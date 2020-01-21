package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.VideoCategoryListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoCategoriesCollection extends js.Object {
  // Returns a list of categories that can be associated with YouTube videos.
  def list(part: String): VideoCategoryListResponse = js.native
  // Returns a list of categories that can be associated with YouTube videos.
  def list(part: String, optionalArgs: js.Object): VideoCategoryListResponse = js.native
}

