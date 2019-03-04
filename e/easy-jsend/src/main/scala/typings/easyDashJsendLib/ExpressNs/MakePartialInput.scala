package typings
package easyDashJsendLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakePartialInput extends js.Object {
  var model: js.Any
  var opts: easyDashJsendLib.Anon_Limit
  var result: js.Any
  var search: js.Object
}

object MakePartialInput {
  @scala.inline
  def apply(model: js.Any, opts: easyDashJsendLib.Anon_Limit, result: js.Any, search: js.Object): MakePartialInput = {
    val __obj = js.Dynamic.literal(model = model, opts = opts, result = result, search = search)
  
    __obj.asInstanceOf[MakePartialInput]
  }
}

