package typings.ethers.mod

import typings.ethersprojectLogger.mod.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "errors")
@js.native
object errors extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCode with String] = js.native
  
  /* "BUFFER_OVERRUN" */ val BUFFER_OVERRUN: typings.ethersprojectLogger.mod.ErrorCode.BUFFER_OVERRUN with String = js.native
  
  /* "CALL_EXCEPTION" */ val CALL_EXCEPTION: typings.ethersprojectLogger.mod.ErrorCode.CALL_EXCEPTION with String = js.native
  
  /* "INSUFFICIENT_FUNDS" */ val INSUFFICIENT_FUNDS: typings.ethersprojectLogger.mod.ErrorCode.INSUFFICIENT_FUNDS with String = js.native
  
  /* "INVALID_ARGUMENT" */ val INVALID_ARGUMENT: typings.ethersprojectLogger.mod.ErrorCode.INVALID_ARGUMENT with String = js.native
  
  /* "MISSING_ARGUMENT" */ val MISSING_ARGUMENT: typings.ethersprojectLogger.mod.ErrorCode.MISSING_ARGUMENT with String = js.native
  
  /* "MISSING_NEW" */ val MISSING_NEW: typings.ethersprojectLogger.mod.ErrorCode.MISSING_NEW with String = js.native
  
  /* "NETWORK_ERROR" */ val NETWORK_ERROR: typings.ethersprojectLogger.mod.ErrorCode.NETWORK_ERROR with String = js.native
  
  /* "NONCE_EXPIRED" */ val NONCE_EXPIRED: typings.ethersprojectLogger.mod.ErrorCode.NONCE_EXPIRED with String = js.native
  
  /* "NOT_IMPLEMENTED" */ val NOT_IMPLEMENTED: typings.ethersprojectLogger.mod.ErrorCode.NOT_IMPLEMENTED with String = js.native
  
  /* "NUMERIC_FAULT" */ val NUMERIC_FAULT: typings.ethersprojectLogger.mod.ErrorCode.NUMERIC_FAULT with String = js.native
  
  /* "REPLACEMENT_UNDERPRICED" */ val REPLACEMENT_UNDERPRICED: typings.ethersprojectLogger.mod.ErrorCode.REPLACEMENT_UNDERPRICED with String = js.native
  
  /* "SERVER_ERROR" */ val SERVER_ERROR: typings.ethersprojectLogger.mod.ErrorCode.SERVER_ERROR with String = js.native
  
  /* "TIMEOUT" */ val TIMEOUT: typings.ethersprojectLogger.mod.ErrorCode.TIMEOUT with String = js.native
  
  /* "UNEXPECTED_ARGUMENT" */ val UNEXPECTED_ARGUMENT: typings.ethersprojectLogger.mod.ErrorCode.UNEXPECTED_ARGUMENT with String = js.native
  
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.ethersprojectLogger.mod.ErrorCode.UNKNOWN_ERROR with String = js.native
  
  /* "UNPREDICTABLE_GAS_LIMIT" */ val UNPREDICTABLE_GAS_LIMIT: typings.ethersprojectLogger.mod.ErrorCode.UNPREDICTABLE_GAS_LIMIT with String = js.native
  
  /* "UNSUPPORTED_OPERATION" */ val UNSUPPORTED_OPERATION: typings.ethersprojectLogger.mod.ErrorCode.UNSUPPORTED_OPERATION with String = js.native
}
