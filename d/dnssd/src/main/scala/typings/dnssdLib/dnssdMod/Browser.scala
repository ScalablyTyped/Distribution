package typings
package dnssdLib.dnssdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", "Browser")
@js.native
class Browser protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(`type`: ServiceType, args: js.Any*) = this()
  def this(`type`: java.lang.String, args: js.Any*) = this()
  def this(`type`: js.Array[java.lang.String], args: js.Any*) = this()
  def list(): js.Array[_] = js.native
  def start(): Browser = js.native
  def stop(): scala.Unit = js.native
}

