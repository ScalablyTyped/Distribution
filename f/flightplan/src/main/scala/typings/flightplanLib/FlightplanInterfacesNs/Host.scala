package typings
package flightplanLib.FlightplanInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: java.lang.String
  var port: scala.Double
}

object Host {
  @scala.inline
  def apply(host: java.lang.String, port: scala.Double): Host = {
    val __obj = js.Dynamic.literal(host = host, port = port)
  
    __obj.asInstanceOf[Host]
  }
}

