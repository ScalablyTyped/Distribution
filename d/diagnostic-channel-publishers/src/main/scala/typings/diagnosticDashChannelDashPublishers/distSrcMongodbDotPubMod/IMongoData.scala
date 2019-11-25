package typings.diagnosticDashChannelDashPublishers.distSrcMongodbDotPubMod

import typings.diagnosticDashChannelDashPublishers.Anon_Command
import typings.diagnosticDashChannelDashPublishers.Anon_CommandName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMongoData extends js.Object {
  var event: Anon_CommandName
  var startedData: Anon_Command
  var succeeded: Boolean
}

object IMongoData {
  @scala.inline
  def apply(event: Anon_CommandName, startedData: Anon_Command, succeeded: Boolean): IMongoData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], startedData = startedData.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMongoData]
  }
}

