package typings.dnssd.dnssdMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", "Advertisement")
@js.native
class Advertisement protected () extends EventEmitter {
  def this(`type`: String, port: Double, args: js.Any*) = this()
  def this(`type`: js.Array[String], port: Double, args: js.Any*) = this()
  def this(`type`: ServiceType, port: Double, args: js.Any*) = this()
  def start(): Advertisement = js.native
  def stop(): Unit = js.native
  def stop(forceImmediate: Boolean): Unit = js.native
  def stop(forceImmediate: Boolean, callback: js.Function0[_]): Unit = js.native
  def updateTXT(txtObj: js.Any): Unit = js.native
}

