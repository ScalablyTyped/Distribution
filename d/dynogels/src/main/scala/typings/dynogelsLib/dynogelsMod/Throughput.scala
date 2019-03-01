package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Throughput extends js.Object {
  var readCapacity: scala.Double
  var writeCapacity: scala.Double
}

object Throughput {
  @scala.inline
  def apply(readCapacity: scala.Double, writeCapacity: scala.Double): Throughput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readCapacity")(readCapacity)
    __obj.updateDynamic("writeCapacity")(writeCapacity)
    __obj.asInstanceOf[Throughput]
  }
}

