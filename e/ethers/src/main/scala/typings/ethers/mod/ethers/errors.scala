package typings.ethers.mod.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "ethers.errors")
@js.native
object errors extends js.Object {
  val CALL_EXCEPTION: typings.ethers.ethersStrings.CALL_EXCEPTION = js.native
  val INVALID_ARGUMENT: typings.ethers.ethersStrings.INVALID_ARGUMENT = js.native
  val MISSING_ARGUMENT: typings.ethers.ethersStrings.MISSING_ARGUMENT = js.native
  val MISSING_NEW: typings.ethers.ethersStrings.MISSING_NEW = js.native
  val NOT_IMPLEMENTED: typings.ethers.ethersStrings.NOT_IMPLEMENTED = js.native
  val NUMERIC_FAULT: typings.ethers.ethersStrings.NUMERIC_FAULT = js.native
  val UNEXPECTED_ARGUMENT: typings.ethers.ethersStrings.UNEXPECTED_ARGUMENT = js.native
  val UNKNOWN_ERROR: typings.ethers.ethersStrings.UNKNOWN_ERROR = js.native
  val UNSUPPORTED_OPERATION: typings.ethers.ethersStrings.UNSUPPORTED_OPERATION = js.native
  def checkArgumentCount(count: Double, expectedCount: Double): Unit = js.native
  def checkArgumentCount(count: Double, expectedCount: Double, suffix: String): Unit = js.native
  def checkNew(self: js.Any, kind: js.Any): Unit = js.native
  def setCensorship(censorship: Boolean): Unit = js.native
  def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
  def throwError(message: String, code: String, params: js.Any): scala.Nothing = js.native
}

