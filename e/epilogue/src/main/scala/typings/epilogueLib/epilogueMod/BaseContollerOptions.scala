package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseContollerOptions extends js.Object {
  var app: expressLib.expressMod.eNs.Express
  var endpoint: java.lang.String
  var include: js.Array[epilogueLib.Anon_Model | java.lang.String]
  var model: js.Any
  var resource: Resource
}

object BaseContollerOptions {
  @scala.inline
  def apply(
    app: expressLib.expressMod.eNs.Express,
    endpoint: java.lang.String,
    include: js.Array[epilogueLib.Anon_Model | java.lang.String],
    model: js.Any,
    resource: Resource
  ): BaseContollerOptions = {
    val __obj = js.Dynamic.literal(app = app, endpoint = endpoint, include = include, model = model, resource = resource)
  
    __obj.asInstanceOf[BaseContollerOptions]
  }
}

