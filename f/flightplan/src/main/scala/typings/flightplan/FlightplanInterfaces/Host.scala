package typings.flightplan.FlightplanInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: String
  var port: Double
}

object Host {
  @scala.inline
  def apply(host: String, port: Double): Host = {
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[Host]
  }
}

