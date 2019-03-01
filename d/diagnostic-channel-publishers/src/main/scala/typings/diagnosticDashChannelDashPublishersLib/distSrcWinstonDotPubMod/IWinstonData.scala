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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("levelKind")(levelKind)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[IWinstonData]
  }
}

