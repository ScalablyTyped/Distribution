package typings.ethers.mod.ethers.utils

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectBytes.mod.DataOptions
import typings.ethersprojectBytes.mod.Hexable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.utils.arrayify")
@js.native
object arrayify extends js.Object {
  
  def apply(value: Double): Uint8Array = js.native
  def apply(value: Double, options: DataOptions): Uint8Array = js.native
  def apply(value: BytesLike): Uint8Array = js.native
  def apply(value: BytesLike, options: DataOptions): Uint8Array = js.native
  def apply(value: Hexable): Uint8Array = js.native
  def apply(value: Hexable, options: DataOptions): Uint8Array = js.native
}
