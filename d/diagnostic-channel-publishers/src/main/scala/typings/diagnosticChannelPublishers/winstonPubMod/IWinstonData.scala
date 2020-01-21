package typings.diagnosticChannelPublishers.winstonPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWinstonData extends js.Object {
  var level: String
  var levelKind: String
  var message: String
  var meta: js.Any
}

object IWinstonData {
  @scala.inline
  def apply(level: String, levelKind: String, message: String, meta: js.Any): IWinstonData = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], levelKind = levelKind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWinstonData]
  }
}

