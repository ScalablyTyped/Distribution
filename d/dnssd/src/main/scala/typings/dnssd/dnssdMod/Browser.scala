package typings.dnssd.dnssdMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", "Browser")
@js.native
class Browser protected () extends EventEmitter {
  def this(`type`: String, args: js.Any*) = this()
  def this(`type`: js.Array[String], args: js.Any*) = this()
  def this(`type`: ServiceType, args: js.Any*) = this()
  def list(): js.Array[_] = js.native
  def start(): Browser = js.native
  def stop(): Unit = js.native
}

