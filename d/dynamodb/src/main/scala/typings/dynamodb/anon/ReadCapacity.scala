package typings.dynamodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadCapacity extends js.Object {
  var readCapacity: Double
  var writeCapacity: Double
}

object ReadCapacity {
  @scala.inline
  def apply(readCapacity: Double, writeCapacity: Double): ReadCapacity = {
    val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadCapacity]
  }
}

