package typings.diagnosticChannelPublishers.mongodbPubMod

import typings.diagnosticChannelPublishers.anon.Command
import typings.diagnosticChannelPublishers.anon.CommandName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMongoData extends js.Object {
  var event: CommandName
  var startedData: Command
  var succeeded: Boolean
}

object IMongoData {
  @scala.inline
  def apply(event: CommandName, startedData: Command, succeeded: Boolean): IMongoData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], startedData = startedData.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMongoData]
  }
}

