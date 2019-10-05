package typings.gapiDotDrive.gapi.client.drive

import typings.gapiDotDrive.gapiDotDriveStrings.`api#channel`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelResource extends js.Object {
  var expiration: Double
  var id: String
  var kind: `api#channel`
  var resourceId: String
  var resourceUri: String
  var token: String
}

object ChannelResource {
  @scala.inline
  def apply(
    expiration: Double,
    id: String,
    kind: `api#channel`,
    resourceId: String,
    resourceUri: String,
    token: String
  ): ChannelResource = {
    val __obj = js.Dynamic.literal(expiration = expiration, id = id, kind = kind, resourceId = resourceId, resourceUri = resourceUri, token = token)
  
    __obj.asInstanceOf[ChannelResource]
  }
}

