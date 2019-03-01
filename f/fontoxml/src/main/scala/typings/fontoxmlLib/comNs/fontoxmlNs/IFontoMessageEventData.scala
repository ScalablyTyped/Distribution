package typings
package fontoxmlLib.comNs.fontoxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFontoMessageEventData extends js.Object {
  var command: java.lang.String
  var metadata: js.Any
  var scope: IInvocator
  var `type`: java.lang.String
}

object IFontoMessageEventData {
  @scala.inline
  def apply(command: java.lang.String, metadata: js.Any, scope: IInvocator, `type`: java.lang.String): IFontoMessageEventData = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[IFontoMessageEventData]
  }
}

