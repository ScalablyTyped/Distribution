package typings
package dynamodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReadCapacity extends js.Object {
  var readCapacity: scala.Double
  var writeCapacity: scala.Double
}

object Anon_ReadCapacity {
  @scala.inline
  def apply(readCapacity: scala.Double, writeCapacity: scala.Double): Anon_ReadCapacity = {
    val __obj = js.Dynamic.literal(readCapacity = readCapacity, writeCapacity = writeCapacity)
  
    __obj.asInstanceOf[Anon_ReadCapacity]
  }
}

