package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.ThumbnailSetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThumbnailsCollection extends js.Object {
  
  // Uploads a custom video thumbnail to YouTube and sets it for a video.
  def set(videoId: String): ThumbnailSetResponse = js.native
  // Uploads a custom video thumbnail to YouTube and sets it for a video.
  def set(videoId: String, mediaData: js.Any): ThumbnailSetResponse = js.native
  // Uploads a custom video thumbnail to YouTube and sets it for a video.
  def set(videoId: String, mediaData: js.Any, optionalArgs: js.Object): ThumbnailSetResponse = js.native
}
