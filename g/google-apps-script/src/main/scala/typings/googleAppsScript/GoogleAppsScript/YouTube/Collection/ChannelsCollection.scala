package typings.googleAppsScript.GoogleAppsScript.YouTube.Collection

import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.Channel
import typings.googleAppsScript.GoogleAppsScript.YouTube.Schema.ChannelListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsCollection extends js.Object {
  
  // Returns a collection of zero or more channel resources that match the request criteria.
  def list(part: String): ChannelListResponse = js.native
  // Returns a collection of zero or more channel resources that match the request criteria.
  def list(part: String, optionalArgs: js.Object): ChannelListResponse = js.native
  
  // Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion objects and their child properties.
  def update(resource: Channel, part: String): Channel = js.native
  // Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion objects and their child properties.
  def update(resource: Channel, part: String, optionalArgs: js.Object): Channel = js.native
}
