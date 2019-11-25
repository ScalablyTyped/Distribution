package typings.dynamodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadCapacity extends js.Object {
  var readCapacity: Double
  var writeCapacity: Double
}

object Anon_ReadCapacity {
  @scala.inline
  def apply(readCapacity: Double, writeCapacity: Double): Anon_ReadCapacity = {
    val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ReadCapacity]
  }
}

