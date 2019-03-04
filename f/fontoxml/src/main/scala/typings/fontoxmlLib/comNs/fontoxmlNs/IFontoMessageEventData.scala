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
    val __obj = js.Dynamic.literal(command = command, metadata = metadata, scope = scope)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IFontoMessageEventData]
  }
}

