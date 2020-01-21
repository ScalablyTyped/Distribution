package typings.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReadCapacity extends js.Object {
  var readCapacity: Double
  var writeCapacity: Double
}

object AnonReadCapacity {
  @scala.inline
  def apply(readCapacity: Double, writeCapacity: Double): AnonReadCapacity = {
    val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReadCapacity]
  }
}

