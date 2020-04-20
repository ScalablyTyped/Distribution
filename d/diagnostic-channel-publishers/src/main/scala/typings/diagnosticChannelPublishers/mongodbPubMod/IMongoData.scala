package typings.diagnosticChannelPublishers.mongodbPubMod

import typings.diagnosticChannelPublishers.AnonCommand
import typings.diagnosticChannelPublishers.AnonCommandName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMongoData extends js.Object {
  var event: AnonCommandName
  var startedData: AnonCommand
  var succeeded: Boolean
}

object IMongoData {
  @scala.inline
  def apply(event: AnonCommandName, startedData: AnonCommand, succeeded: Boolean): IMongoData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], startedData = startedData.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMongoData]
  }
}

