package typings.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Throughput extends js.Object {
  var readCapacity: Double
  var writeCapacity: Double
}

object Throughput {
  @scala.inline
  def apply(readCapacity: Double, writeCapacity: Double): Throughput = {
    val __obj = js.Dynamic.literal(readCapacity = readCapacity.asInstanceOf[js.Any], writeCapacity = writeCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Throughput]
  }
}

