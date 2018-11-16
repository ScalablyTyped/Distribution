package typings
package digibyteLib.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Address")
@js.native
class Address protected () extends js.Object {
  def this(data: java.lang.String) = this()
  def this(data: js.Object) = this()
  def this(data: nodeLib.Buffer) = this()
  def this(data: stdLib.Uint8Array) = this()
  def this(data: java.lang.String, network: digibyteLib.digibyteMod.NetworksNs.Network) = this()
  def this(data: js.Object, network: digibyteLib.digibyteMod.NetworksNs.Network) = this()
  def this(data: nodeLib.Buffer, network: digibyteLib.digibyteMod.NetworksNs.Network) = this()
  def this(data: stdLib.Uint8Array, network: digibyteLib.digibyteMod.NetworksNs.Network) = this()
  def this(data: java.lang.String, network: digibyteLib.digibyteMod.NetworksNs.Network, `type`: java.lang.String) = this()
  def this(data: js.Object, network: digibyteLib.digibyteMod.NetworksNs.Network, `type`: java.lang.String) = this()
  def this(data: nodeLib.Buffer, network: digibyteLib.digibyteMod.NetworksNs.Network, `type`: java.lang.String) = this()
  def this(data: stdLib.Uint8Array, network: digibyteLib.digibyteMod.NetworksNs.Network, `type`: java.lang.String) = this()
  val hashBuffer: nodeLib.Buffer = js.native
  val network: digibyteLib.digibyteMod.NetworksNs.Network = js.native
  val `type`: java.lang.String = js.native
}

