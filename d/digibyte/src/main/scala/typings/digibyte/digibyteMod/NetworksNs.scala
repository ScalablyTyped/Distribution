package typings.digibyte.digibyteMod

import typings.digibyte.digibyteMod.NetworksNs.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Networks")
@js.native
object NetworksNs extends js.Object {
  trait Network extends js.Object {
    val alias: String
    val name: String
  }
  
  val livenet: Network = js.native
  val mainnet: Network = js.native
  val testnet: Network = js.native
  def add(data: js.Any): Network = js.native
  def get(args: String, keys: String): Network = js.native
  def get(args: String, keys: js.Array[String]): Network = js.native
  def get(args: Double, keys: String): Network = js.native
  def get(args: Double, keys: js.Array[String]): Network = js.native
  def get(args: Network, keys: String): Network = js.native
  def get(args: Network, keys: js.Array[String]): Network = js.native
  def remove(network: Network): scala.Unit = js.native
}

