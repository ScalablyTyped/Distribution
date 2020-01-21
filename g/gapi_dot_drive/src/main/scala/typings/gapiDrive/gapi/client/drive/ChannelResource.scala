package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.gapiDriveStrings.apiNumbersignchannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelResource extends js.Object {
  var expiration: Double
  var id: String
  var kind: apiNumbersignchannel
  var resourceId: String
  var resourceUri: String
  var token: String
}

object ChannelResource {
  @scala.inline
  def apply(
    expiration: Double,
    id: String,
    kind: apiNumbersignchannel,
    resourceId: String,
    resourceUri: String,
    token: String
  ): ChannelResource = {
    val __obj = js.Dynamic.literal(expiration = expiration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], resourceUri = resourceUri.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelResource]
  }
}

