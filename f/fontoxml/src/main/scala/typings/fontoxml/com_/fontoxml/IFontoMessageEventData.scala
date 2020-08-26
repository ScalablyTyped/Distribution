package typings.fontoxml.com_.fontoxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFontoMessageEventData extends js.Object {
  var command: String = js.native
  var metadata: js.Any = js.native
  var scope: IInvocator = js.native
  var `type`: String = js.native
}

object IFontoMessageEventData {
  @scala.inline
  def apply(command: String, metadata: js.Any, scope: IInvocator, `type`: String): IFontoMessageEventData = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontoMessageEventData]
  }
  @scala.inline
  implicit class IFontoMessageEventDataOps[Self <: IFontoMessageEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: IInvocator): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

