package typings.fontoxml.com.fontoxml

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
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontoMessageEventData]
  }
}

