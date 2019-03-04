package typings
package diagnosticDashChannelDashPublishersLib.distSrcMongodbDotPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMongoData extends js.Object {
  var event: diagnosticDashChannelDashPublishersLib.Anon_CommandName
  var startedData: diagnosticDashChannelDashPublishersLib.Anon_Command
  var succeeded: scala.Boolean
}

object IMongoData {
  @scala.inline
  def apply(
    event: diagnosticDashChannelDashPublishersLib.Anon_CommandName,
    startedData: diagnosticDashChannelDashPublishersLib.Anon_Command,
    succeeded: scala.Boolean
  ): IMongoData = {
    val __obj = js.Dynamic.literal(event = event, startedData = startedData, succeeded = succeeded)
  
    __obj.asInstanceOf[IMongoData]
  }
}

