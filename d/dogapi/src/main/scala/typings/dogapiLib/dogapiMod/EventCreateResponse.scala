package typings
package dogapiLib.dogapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCreateResponse extends js.Object {
  var event: dogapiLib.Anon_Datehappened
  var ok: scala.Boolean
  var status: dogapiLib.dogapiLibStrings.ok
}

object EventCreateResponse {
  @scala.inline
  def apply(event: dogapiLib.Anon_Datehappened, ok: scala.Boolean, status: dogapiLib.dogapiLibStrings.ok): EventCreateResponse = {
    val __obj = js.Dynamic.literal(event = event, ok = ok, status = status)
  
    __obj.asInstanceOf[EventCreateResponse]
  }
}

