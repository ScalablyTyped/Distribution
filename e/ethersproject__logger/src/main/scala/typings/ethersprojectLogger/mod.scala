package typings.ethersprojectLogger

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait ErrorCode extends StObject
  @JSImport("@ethersproject/logger", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrorCode with String] = js.native
    
    @js.native
    sealed trait BUFFER_OVERRUN extends ErrorCode
    /* "BUFFER_OVERRUN" */ val BUFFER_OVERRUN: typings.ethersprojectLogger.mod.ErrorCode.BUFFER_OVERRUN with String = js.native
    
    @js.native
    sealed trait CALL_EXCEPTION extends ErrorCode
    /* "CALL_EXCEPTION" */ val CALL_EXCEPTION: typings.ethersprojectLogger.mod.ErrorCode.CALL_EXCEPTION with String = js.native
    
    @js.native
    sealed trait INSUFFICIENT_FUNDS extends ErrorCode
    /* "INSUFFICIENT_FUNDS" */ val INSUFFICIENT_FUNDS: typings.ethersprojectLogger.mod.ErrorCode.INSUFFICIENT_FUNDS with String = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT extends ErrorCode
    /* "INVALID_ARGUMENT" */ val INVALID_ARGUMENT: typings.ethersprojectLogger.mod.ErrorCode.INVALID_ARGUMENT with String = js.native
    
    @js.native
    sealed trait MISSING_ARGUMENT extends ErrorCode
    /* "MISSING_ARGUMENT" */ val MISSING_ARGUMENT: typings.ethersprojectLogger.mod.ErrorCode.MISSING_ARGUMENT with String = js.native
    
    @js.native
    sealed trait MISSING_NEW extends ErrorCode
    /* "MISSING_NEW" */ val MISSING_NEW: typings.ethersprojectLogger.mod.ErrorCode.MISSING_NEW with String = js.native
    
    @js.native
    sealed trait NETWORK_ERROR extends ErrorCode
    /* "NETWORK_ERROR" */ val NETWORK_ERROR: typings.ethersprojectLogger.mod.ErrorCode.NETWORK_ERROR with String = js.native
    
    @js.native
    sealed trait NONCE_EXPIRED extends ErrorCode
    /* "NONCE_EXPIRED" */ val NONCE_EXPIRED: typings.ethersprojectLogger.mod.ErrorCode.NONCE_EXPIRED with String = js.native
    
    @js.native
    sealed trait NOT_IMPLEMENTED extends ErrorCode
    /* "NOT_IMPLEMENTED" */ val NOT_IMPLEMENTED: typings.ethersprojectLogger.mod.ErrorCode.NOT_IMPLEMENTED with String = js.native
    
    @js.native
    sealed trait NUMERIC_FAULT extends ErrorCode
    /* "NUMERIC_FAULT" */ val NUMERIC_FAULT: typings.ethersprojectLogger.mod.ErrorCode.NUMERIC_FAULT with String = js.native
    
    @js.native
    sealed trait REPLACEMENT_UNDERPRICED extends ErrorCode
    /* "REPLACEMENT_UNDERPRICED" */ val REPLACEMENT_UNDERPRICED: typings.ethersprojectLogger.mod.ErrorCode.REPLACEMENT_UNDERPRICED with String = js.native
    
    @js.native
    sealed trait SERVER_ERROR extends ErrorCode
    /* "SERVER_ERROR" */ val SERVER_ERROR: typings.ethersprojectLogger.mod.ErrorCode.SERVER_ERROR with String = js.native
    
    @js.native
    sealed trait TIMEOUT extends ErrorCode
    /* "TIMEOUT" */ val TIMEOUT: typings.ethersprojectLogger.mod.ErrorCode.TIMEOUT with String = js.native
    
    @js.native
    sealed trait UNEXPECTED_ARGUMENT extends ErrorCode
    /* "UNEXPECTED_ARGUMENT" */ val UNEXPECTED_ARGUMENT: typings.ethersprojectLogger.mod.ErrorCode.UNEXPECTED_ARGUMENT with String = js.native
    
    @js.native
    sealed trait UNKNOWN_ERROR extends ErrorCode
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.ethersprojectLogger.mod.ErrorCode.UNKNOWN_ERROR with String = js.native
    
    @js.native
    sealed trait UNPREDICTABLE_GAS_LIMIT extends ErrorCode
    /* "UNPREDICTABLE_GAS_LIMIT" */ val UNPREDICTABLE_GAS_LIMIT: typings.ethersprojectLogger.mod.ErrorCode.UNPREDICTABLE_GAS_LIMIT with String = js.native
    
    @js.native
    sealed trait UNSUPPORTED_OPERATION extends ErrorCode
    /* "UNSUPPORTED_OPERATION" */ val UNSUPPORTED_OPERATION: typings.ethersprojectLogger.mod.ErrorCode.UNSUPPORTED_OPERATION with String = js.native
  }
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("@ethersproject/logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogLevel with String] = js.native
    
    @js.native
    sealed trait DEBUG extends LogLevel
    /* "DEBUG" */ val DEBUG: typings.ethersprojectLogger.mod.LogLevel.DEBUG with String = js.native
    
    @js.native
    sealed trait ERROR extends LogLevel
    /* "ERROR" */ val ERROR: typings.ethersprojectLogger.mod.LogLevel.ERROR with String = js.native
    
    @js.native
    sealed trait INFO extends LogLevel
    /* "INFO" */ val INFO: typings.ethersprojectLogger.mod.LogLevel.INFO with String = js.native
    
    @js.native
    sealed trait OFF extends LogLevel
    /* "OFF" */ val OFF: typings.ethersprojectLogger.mod.LogLevel.OFF with String = js.native
    
    @js.native
    sealed trait WARNING extends LogLevel
    /* "WARNING" */ val WARNING: typings.ethersprojectLogger.mod.LogLevel.WARNING with String = js.native
  }
  
  @JSImport("@ethersproject/logger", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(version: String) = this()
    
    def _log(logLevel: LogLevel, args: js.Array[_]): Unit = js.native
    
    def assert(condition: js.Any, message: String): Unit = js.native
    def assert(condition: js.Any, message: String, code: js.UndefOr[scala.Nothing], params: js.Any): Unit = js.native
    def assert(condition: js.Any, message: String, code: ErrorCode): Unit = js.native
    def assert(condition: js.Any, message: String, code: ErrorCode, params: js.Any): Unit = js.native
    
    def assertArgument(condition: js.Any, message: String, name: String, value: js.Any): Unit = js.native
    
    def checkAbstract(target: js.Any, kind: js.Any): Unit = js.native
    
    def checkArgumentCount(count: Double, expectedCount: Double): Unit = js.native
    def checkArgumentCount(count: Double, expectedCount: Double, message: String): Unit = js.native
    
    def checkNew(target: js.Any, kind: js.Any): Unit = js.native
    
    def checkNormalize(): Unit = js.native
    def checkNormalize(message: String): Unit = js.native
    
    def checkSafeUint53(value: Double): Unit = js.native
    def checkSafeUint53(value: Double, message: String): Unit = js.native
    
    def debug(args: js.Any*): Unit = js.native
    
    def info(args: js.Any*): Unit = js.native
    
    def makeError(message: String): Error = js.native
    def makeError(message: String, code: js.UndefOr[scala.Nothing], params: js.Any): Error = js.native
    def makeError(message: String, code: ErrorCode): Error = js.native
    def makeError(message: String, code: ErrorCode, params: js.Any): Error = js.native
    
    def throwArgumentError(message: String, name: String, value: js.Any): scala.Nothing = js.native
    
    def throwError(message: String): scala.Nothing = js.native
    def throwError(message: String, code: js.UndefOr[scala.Nothing], params: js.Any): scala.Nothing = js.native
    def throwError(message: String, code: ErrorCode): scala.Nothing = js.native
    def throwError(message: String, code: ErrorCode, params: js.Any): scala.Nothing = js.native
    
    val version: String = js.native
    
    def warn(args: js.Any*): Unit = js.native
  }
  /* static members */
  object Logger {
    
    @JSImport("@ethersproject/logger", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ethersproject/logger", "Logger.errors")
    @js.native
    def errors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCode */ js.Any = js.native
    @scala.inline
    def errors_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCode */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errors")(x.asInstanceOf[js.Any])
    
    @JSImport("@ethersproject/logger", "Logger.from")
    @js.native
    def from(version: String): Logger = js.native
    
    @JSImport("@ethersproject/logger", "Logger.globalLogger")
    @js.native
    def globalLogger(): Logger = js.native
    
    @JSImport("@ethersproject/logger", "Logger.levels")
    @js.native
    def levels: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ js.Any = js.native
    @scala.inline
    def levels_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("levels")(x.asInstanceOf[js.Any])
    
    @JSImport("@ethersproject/logger", "Logger.setCensorship")
    @js.native
    def setCensorship(censorship: Boolean): Unit = js.native
    @JSImport("@ethersproject/logger", "Logger.setCensorship")
    @js.native
    def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
    
    @JSImport("@ethersproject/logger", "Logger.setLogLevel")
    @js.native
    def setLogLevel(logLevel: LogLevel): Unit = js.native
  }
}
