package typings
package easyDashXDashHeadersLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket
  extends easyDashXDashHeadersLib.eventsMod.EventEmitter {
  def addMembership(multicastAddress: java.lang.String): scala.Unit = js.native
  def addMembership(multicastAddress: java.lang.String, multicastInterface: java.lang.String): scala.Unit = js.native
  def address(): AddressInfo = js.native
  def bind(port: scala.Double): scala.Unit = js.native
  def bind(port: scala.Double, address: java.lang.String): scala.Unit = js.native
  def bind(port: scala.Double, address: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def dropMembership(multicastAddress: java.lang.String): scala.Unit = js.native
  def dropMembership(multicastAddress: java.lang.String, multicastInterface: java.lang.String): scala.Unit = js.native
  def send(
    buf: easyDashXDashHeadersLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String
  ): scala.Unit = js.native
  def send(
    buf: easyDashXDashHeadersLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* bytes */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def setBroadcast(flag: scala.Boolean): scala.Unit = js.native
  def setMulticastLoopback(flag: scala.Boolean): scala.Unit = js.native
  def setMulticastTTL(ttl: scala.Double): scala.Unit = js.native
}

