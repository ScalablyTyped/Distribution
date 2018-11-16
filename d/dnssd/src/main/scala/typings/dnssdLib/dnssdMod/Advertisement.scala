package typings
package dnssdLib.dnssdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", "Advertisement")
@js.native
class Advertisement protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(`type`: ServiceType, port: scala.Double, args: js.Any*) = this()
  def this(`type`: java.lang.String, port: scala.Double, args: js.Any*) = this()
  def this(`type`: js.Array[java.lang.String], port: scala.Double, args: js.Any*) = this()
  def start(): Advertisement = js.native
  def stop(): scala.Unit = js.native
  def stop(forceImmediate: scala.Boolean): scala.Unit = js.native
  def stop(forceImmediate: scala.Boolean, callback: js.Function0[_]): scala.Unit = js.native
  def updateTXT(txtObj: js.Any): scala.Unit = js.native
}

