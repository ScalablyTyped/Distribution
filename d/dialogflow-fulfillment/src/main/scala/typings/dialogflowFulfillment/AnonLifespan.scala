package typings.dialogflowFulfillment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLifespan extends js.Object {
  var lifespan: Double
  var name: String
  var parameters: js.Object
}

object AnonLifespan {
  @scala.inline
  def apply(lifespan: Double, name: String, parameters: js.Object): AnonLifespan = {
    val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLifespan]
  }
}

