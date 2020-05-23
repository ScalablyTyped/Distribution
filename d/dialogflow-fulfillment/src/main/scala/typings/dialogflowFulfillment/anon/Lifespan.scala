package typings.dialogflowFulfillment.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifespan extends js.Object {
  var lifespan: Double
  var name: String
  var parameters: js.Object
}

object Lifespan {
  @scala.inline
  def apply(lifespan: Double, name: String, parameters: js.Object): Lifespan = {
    val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifespan]
  }
}

