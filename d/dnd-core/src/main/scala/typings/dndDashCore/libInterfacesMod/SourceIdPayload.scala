package typings.dndDashCore.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceIdPayload extends js.Object {
  var sourceId: Identifier
}

object SourceIdPayload {
  @scala.inline
  def apply(sourceId: Identifier): SourceIdPayload = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceIdPayload]
  }
}

