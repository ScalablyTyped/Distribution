package typings.ethersprojectLogger

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait ErrorCode extends StObject
  @JSImport("@ethersproject/logger", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrorCode & String] = js.native
    
    @js.native
    sealed trait BUFFER_OVERRUN
      extends StObject
         with ErrorCode
    /* "BUFFER_OVERRUN" */ val BUFFER_OVERRUN: typings.ethersprojectLogger.mod.ErrorCode.BUFFER_OVERRUN & String = js.native
    
    @js.native
    sealed trait CALL_EXCEPTION
      extends StObject
         with ErrorCode
    /* "CALL_EXCEPTION" */ val CALL_EXCEPTION: typings.ethersprojectLogger.mod.ErrorCode.CALL_EXCEPTION & String = js.native
    
    @js.native
    sealed trait INSUFFICIENT_FUNDS
      extends StObject
         with ErrorCode
    /* "INSUFFICIENT_FUNDS" */ val INSUFFICIENT_FUNDS: typings.ethersprojectLogger.mod.ErrorCode.INSUFFICIENT_FUNDS & String = js.native
    
    @js.native
    sealed trait INVALID_ARGUMENT
      extends StObject
         with ErrorCode
    /* "INVALID_ARGUMENT" */ val INVALID_ARGUMENT: typings.ethersprojectLogger.mod.ErrorCode.INVALID_ARGUMENT & String = js.native
    
    @js.native
    sealed trait MISSING_ARGUMENT
      extends StObject
         with ErrorCode
    /* "MISSING_ARGUMENT" */ val MISSING_ARGUMENT: typings.ethersprojectLogger.mod.ErrorCode.MISSING_ARGUMENT & String = js.native
    
    @js.native
    sealed trait MISSING_NEW
      extends StObject
         with ErrorCode
    /* "MISSING_NEW" */ val MISSING_NEW: typings.ethersprojectLogger.mod.ErrorCode.MISSING_NEW & String = js.native
    
    @js.native
    sealed trait NETWORK_ERROR
      extends StObject
         with ErrorCode
    /* "NETWORK_ERROR" */ val NETWORK_ERROR: typings.ethersprojectLogger.mod.ErrorCode.NETWORK_ERROR & String = js.native
    
    @js.native
    sealed trait NONCE_EXPIRED
      extends StObject
         with ErrorCode
    /* "NONCE_EXPIRED" */ val NONCE_EXPIRED: typings.ethersprojectLogger.mod.ErrorCode.NONCE_EXPIRED & String = js.native
    
    @js.native
    sealed trait NOT_IMPLEMENTED
      extends StObject
         with ErrorCode
    /* "NOT_IMPLEMENTED" */ val NOT_IMPLEMENTED: typings.ethersprojectLogger.mod.ErrorCode.NOT_IMPLEMENTED & String = js.native
    
    @js.native
    sealed trait NUMERIC_FAULT
      extends StObject
         with ErrorCode
    /* "NUMERIC_FAULT" */ val NUMERIC_FAULT: typings.ethersprojectLogger.mod.ErrorCode.NUMERIC_FAULT & String = js.native
    
    @js.native
    sealed trait REPLACEMENT_UNDERPRICED
      extends StObject
         with ErrorCode
    /* "REPLACEMENT_UNDERPRICED" */ val REPLACEMENT_UNDERPRICED: typings.ethersprojectLogger.mod.ErrorCode.REPLACEMENT_UNDERPRICED & String = js.native
    
    @js.native
    sealed trait SERVER_ERROR
      extends StObject
         with ErrorCode
    /* "SERVER_ERROR" */ val SERVER_ERROR: typings.ethersprojectLogger.mod.ErrorCode.SERVER_ERROR & String = js.native
    
    @js.native
    sealed trait TIMEOUT
      extends StObject
         with ErrorCode
    /* "TIMEOUT" */ val TIMEOUT: typings.ethersprojectLogger.mod.ErrorCode.TIMEOUT & String = js.native
    
    @js.native
    sealed trait UNEXPECTED_ARGUMENT
      extends StObject
         with ErrorCode
    /* "UNEXPECTED_ARGUMENT" */ val UNEXPECTED_ARGUMENT: typings.ethersprojectLogger.mod.ErrorCode.UNEXPECTED_ARGUMENT & String = js.native
    
    @js.native
    sealed trait UNKNOWN_ERROR
      extends StObject
         with ErrorCode
    /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.ethersprojectLogger.mod.ErrorCode.UNKNOWN_ERROR & String = js.native
    
    @js.native
    sealed trait UNPREDICTABLE_GAS_LIMIT
      extends StObject
         with ErrorCode
    /* "UNPREDICTABLE_GAS_LIMIT" */ val UNPREDICTABLE_GAS_LIMIT: typings.ethersprojectLogger.mod.ErrorCode.UNPREDICTABLE_GAS_LIMIT & String = js.native
    
    @js.native
    sealed trait UNSUPPORTED_OPERATION
      extends StObject
         with ErrorCode
    /* "UNSUPPORTED_OPERATION" */ val UNSUPPORTED_OPERATION: typings.ethersprojectLogger.mod.ErrorCode.UNSUPPORTED_OPERATION & String = js.native
  }
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("@ethersproject/logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogLevel & String] = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with LogLevel
    /* "DEBUG" */ val DEBUG: typings.ethersprojectLogger.mod.LogLevel.DEBUG & String = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LogLevel
    /* "ERROR" */ val ERROR: typings.ethersprojectLogger.mod.LogLevel.ERROR & String = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LogLevel
    /* "INFO" */ val INFO: typings.ethersprojectLogger.mod.LogLevel.INFO & String = js.native
    
    @js.native
    sealed trait OFF
      extends StObject
         with LogLevel
    /* "OFF" */ val OFF: typings.ethersprojectLogger.mod.LogLevel.OFF & String = js.native
    
    @js.native
    sealed trait WARNING
      extends StObject
         with LogLevel
    /* "WARNING" */ val WARNING: typings.ethersprojectLogger.mod.LogLevel.WARNING & String = js.native
  }
  
  @JSImport("@ethersproject/logger", "Logger")
  @js.native
  class Logger protected () extends StObject {
    def this(version: String) = this()
    
    def _log(logLevel: LogLevel, args: js.Array[js.Any]): Unit = js.native
    
    def assert(condition: js.Any, message: String): Unit = js.native
    def assert(condition: js.Any, message: String, code: Unit, params: js.Any): Unit = js.native
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
    def makeError(message: String, code: Unit, params: js.Any): Error = js.native
    def makeError(message: String, code: ErrorCode): Error = js.native
    def makeError(message: String, code: ErrorCode, params: js.Any): Error = js.native
    
    def throwArgumentError(message: String, name: String, value: js.Any): scala.Nothing = js.native
    
    def throwError(message: String): scala.Nothing = js.native
    def throwError(message: String, code: Unit, params: js.Any): scala.Nothing = js.native
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
    inline def errors_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCode */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errors")(x.asInstanceOf[js.Any])
    
    inline def from(version: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(version.asInstanceOf[js.Any]).asInstanceOf[Logger]
    
    inline def globalLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("globalLogger")().asInstanceOf[Logger]
    
    @JSImport("@ethersproject/logger", "Logger.levels")
    @js.native
    def levels: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ js.Any = js.native
    inline def levels_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("levels")(x.asInstanceOf[js.Any])
    
    inline def setCensorship(censorship: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCensorship")(censorship.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setCensorship(censorship: Boolean, permanent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCensorship")(censorship.asInstanceOf[js.Any], permanent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setLogLevel(logLevel: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
