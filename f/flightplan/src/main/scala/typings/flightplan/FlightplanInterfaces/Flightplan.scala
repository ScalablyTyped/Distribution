package typings.flightplan.FlightplanInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flightplan extends js.Object {
  
  def abort(): Unit = js.native
  def abort(message: String): Unit = js.native
  
  def local(fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
  def local(task: String, fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
  def local(task: js.Array[String], fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
  
  def remote(fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
  def remote(task: String, fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
  def remote(task: js.Array[String], fn: js.Function1[/* transport */ Transport, Unit]): Flightplan = js.native
  
  var runtime: Runtime = js.native
  
  def target(name: String, fn: js.Function1[/* done */ js.Function1[/* result */ js.Any, Unit], Unit]): Flightplan = js.native
  def target(name: String, options: js.Array[TargetOptions]): Flightplan = js.native
  def target(name: String, options: TargetOptions): Flightplan = js.native
}
