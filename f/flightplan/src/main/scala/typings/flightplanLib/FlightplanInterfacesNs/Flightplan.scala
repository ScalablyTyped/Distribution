package typings
package flightplanLib.FlightplanInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flightplan extends js.Object {
  var runtime: Runtime = js.native
  def abort(): scala.Unit = js.native
  def abort(message: java.lang.String): scala.Unit = js.native
  def local(fn: js.Function1[/* transport */ Transport, scala.Unit]): Flightplan = js.native
  def local(task: java.lang.String, fn: js.Function1[/* transport */ Transport, scala.Unit]): Flightplan = js.native
  def local(task: js.Array[java.lang.String], fn: js.Function1[/* transport */ Transport, scala.Unit]): Flightplan = js.native
  def remote(fn: js.Function1[/* transport */ Transport, scala.Unit]): Flightplan = js.native
  def remote(task: java.lang.String, fn: js.Function1[/* transport */ Transport, scala.Unit]): Flightplan = js.native
  def remote(task: js.Array[java.lang.String], fn: js.Function1[/* transport */ Transport, scala.Unit]): Flightplan = js.native
  def target(
    name: java.lang.String,
    fn: js.Function1[/* done */ js.Function1[/* result */ js.Any, scala.Unit], scala.Unit]
  ): Flightplan = js.native
  def target(name: java.lang.String, options: TargetOptions): Flightplan = js.native
  def target(name: java.lang.String, options: js.Array[TargetOptions]): Flightplan = js.native
}

