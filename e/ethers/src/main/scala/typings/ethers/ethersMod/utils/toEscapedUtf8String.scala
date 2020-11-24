package typings.ethers.ethersMod.utils

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectStrings.utf8Mod.Utf8ErrorFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/lib/ethers", "utils._toEscapedUtf8String")
@js.native
object toEscapedUtf8String extends js.Object {
  
  def apply(bytes: BytesLike): String = js.native
  def apply(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
}
