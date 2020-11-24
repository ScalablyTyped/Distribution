package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.InvideoBranding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatermarksCollection extends js.Object {
  
  // Uploads a watermark image to YouTube and sets it for a channel.
  def set(resource: InvideoBranding, channelId: String): Unit = js.native
  // Uploads a watermark image to YouTube and sets it for a channel.
  def set(resource: InvideoBranding, channelId: String, mediaData: js.Any): Unit = js.native
  // Uploads a watermark image to YouTube and sets it for a channel.
  def set(resource: InvideoBranding, channelId: String, mediaData: js.Any, optionalArgs: js.Object): Unit = js.native
  
  // Deletes a channel's watermark image.
  def unset(channelId: String): Unit = js.native
  // Deletes a channel's watermark image.
  def unset(channelId: String, optionalArgs: js.Object): Unit = js.native
}
