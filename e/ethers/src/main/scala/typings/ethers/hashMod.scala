package typings.ethers

import typings.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/hash", JSImport.Namespace)
@js.native
object hashMod extends js.Object {
  def hashMessage(message: String): String = js.native
  def hashMessage(message: Arrayish): String = js.native
  def id(text: String): String = js.native
  def namehash(name: String): String = js.native
}

