package typings.fontoxml.comNs.fontoxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFontoMessageEventData extends js.Object {
  var command: String
  var metadata: js.Any
  var scope: IInvocator
  var `type`: String
}

object IFontoMessageEventData {
  @scala.inline
  def apply(command: String, metadata: js.Any, scope: IInvocator, `type`: String): IFontoMessageEventData = {
    val __obj = js.Dynamic.literal(command = command, metadata = metadata, scope = scope)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IFontoMessageEventData]
  }
}

