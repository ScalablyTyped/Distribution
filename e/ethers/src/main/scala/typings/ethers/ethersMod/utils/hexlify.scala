package typings.ethers.ethersMod.utils

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectBytes.mod.DataOptions
import typings.ethersprojectBytes.mod.Hexable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "utils.hexlify")
@js.native
object hexlify extends js.Object {
  
  def apply(value: Double): String = js.native
  def apply(value: Double, options: DataOptions): String = js.native
  def apply(value: BytesLike): String = js.native
  def apply(value: BytesLike, options: DataOptions): String = js.native
  def apply(value: Hexable): String = js.native
  def apply(value: Hexable, options: DataOptions): String = js.native
}
