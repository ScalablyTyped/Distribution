package typings
package diagnosticDashChannelDashPublishersLib.distSrcWinstonDotPubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWinstonData extends js.Object {
  var level: java.lang.String
  var levelKind: java.lang.String
  var message: java.lang.String
  var meta: js.Any
}

object IWinstonData {
  @scala.inline
  def apply(level: java.lang.String, levelKind: java.lang.String, message: java.lang.String, meta: js.Any): IWinstonData = {
    val __obj = js.Dynamic.literal(level = level, levelKind = levelKind, message = message, meta = meta)
  
    __obj.asInstanceOf[IWinstonData]
  }
}

