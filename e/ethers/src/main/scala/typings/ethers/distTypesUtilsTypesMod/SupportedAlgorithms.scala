package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ethers.ethersStrings.sha256
  - typings.ethers.ethersStrings.sha512
*/
trait SupportedAlgorithms extends js.Object

object SupportedAlgorithms {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sha256: typings.ethers.ethersStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha512: typings.ethers.ethersStrings.sha512 = this.cast("sha512")
}

