package typings.expoBunyan

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@expo/bunyan", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Logger {
    def this(options: LoggerOptions) = this()
  }
  @JSImport("@expo/bunyan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/bunyan", "DEBUG")
  @js.native
  val DEBUG: Double = js.native
  
  @JSImport("@expo/bunyan", "ERROR")
  @js.native
  val ERROR: Double = js.native
  
  @JSImport("@expo/bunyan", "FATAL")
  @js.native
  val FATAL: Double = js.native
  
  @JSImport("@expo/bunyan", "INFO")
  @js.native
  val INFO: Double = js.native
  
  @JSImport("@expo/bunyan", "RingBuffer")
  @js.native
  open class RingBuffer protected () extends EventEmitter {
    def this(options: RingBufferOptions) = this()
    
    def destroy(): Unit = js.native
    
    def destroySoon(): Unit = js.native
    
    def end(): Unit = js.native
    def end(record: Any): Unit = js.native
    
    var records: js.Array[Any] = js.native
    
    var writable: Boolean = js.native
    
    def write(record: Any): Boolean = js.native
  }
  
  @JSImport("@expo/bunyan", "RotatingFileStream")
  @js.native
  open class RotatingFileStream protected () extends EventEmitter {
    def this(options: RotatingFileStreamOptions) = this()
    
    def destroy(): Unit = js.native
    
    def destroySoon(): Unit = js.native
    
    def end(): Unit = js.native
    def end(record: Any): Unit = js.native
    
    var periodNum: Double = js.native
    
    var periodScope: String = js.native
    
    var rotQueue: js.Array[Any] = js.native
    
    def rotate(): Unit = js.native
    
    var rotating: Boolean = js.native
    
    var stream: Any = js.native
    
    var writable: Boolean = js.native
    
    def write(record: Any): Boolean = js.native
  }
  
  @JSImport("@expo/bunyan", "TRACE")
  @js.native
  val TRACE: Double = js.native
  
  @JSImport("@expo/bunyan", "WARN")
  @js.native
  val WARN: Double = js.native
  
  inline def createLogger(options: LoggerOptions): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(options.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  /* Inlined {[ name in @expo/bunyan.@expo/bunyan.LogLevelString ]: number} */
  object levelFromName {
    
    @JSImport("@expo/bunyan", "levelFromName")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/bunyan", "levelFromName.debug")
    @js.native
    def debug: Double = js.native
    inline def debug_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/bunyan", "levelFromName.error")
    @js.native
    def error: Double = js.native
    inline def error_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/bunyan", "levelFromName.fatal")
    @js.native
    def fatal: Double = js.native
    inline def fatal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fatal")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/bunyan", "levelFromName.info")
    @js.native
    def info: Double = js.native
    inline def info_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/bunyan", "levelFromName.trace")
    @js.native
    def trace: Double = js.native
    inline def trace_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/bunyan", "levelFromName.warn")
    @js.native
    def warn: Double = js.native
    inline def warn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
  
  inline def resolveLevel(value: LogLevel): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLevel")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def safeCycles(): js.Function2[/* key */ String, /* value */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeCycles")().asInstanceOf[js.Function2[/* key */ String, /* value */ Any, Any]]
  
  @JSImport("@expo/bunyan", "stdSerializers")
  @js.native
  val stdSerializers: StdSerializers_ = js.native
  
  type LogLevel = LogLevelString | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoBunyan.expoBunyanStrings.trace
    - typings.expoBunyan.expoBunyanStrings.debug
    - typings.expoBunyan.expoBunyanStrings.info
    - typings.expoBunyan.expoBunyanStrings.warn
    - typings.expoBunyan.expoBunyanStrings.error
    - typings.expoBunyan.expoBunyanStrings.fatal
  */
  trait LogLevelString extends StObject
  object LogLevelString {
    
    inline def debug: typings.expoBunyan.expoBunyanStrings.debug = "debug".asInstanceOf[typings.expoBunyan.expoBunyanStrings.debug]
    
    inline def error: typings.expoBunyan.expoBunyanStrings.error = "error".asInstanceOf[typings.expoBunyan.expoBunyanStrings.error]
    
    inline def fatal: typings.expoBunyan.expoBunyanStrings.fatal = "fatal".asInstanceOf[typings.expoBunyan.expoBunyanStrings.fatal]
    
    inline def info: typings.expoBunyan.expoBunyanStrings.info = "info".asInstanceOf[typings.expoBunyan.expoBunyanStrings.info]
    
    inline def trace: typings.expoBunyan.expoBunyanStrings.trace = "trace".asInstanceOf[typings.expoBunyan.expoBunyanStrings.trace]
    
    inline def warn: typings.expoBunyan.expoBunyanStrings.warn = "warn".asInstanceOf[typings.expoBunyan.expoBunyanStrings.warn]
  }
  
  @js.native
  trait Logger extends EventEmitter {
    
    def addSerializers(serializers: Serializers): Unit = js.native
    
    def addStream(stream: Stream): Unit = js.native
    
    def child(options: js.Object): Logger = js.native
    def child(options: js.Object, simple: Boolean): Logger = js.native
    
    /**
      * Returns a boolean: is the `debug` level enabled?
      *
      * This is equivalent to `log.isDebugEnabled()` or `log.isEnabledFor(DEBUG)` in log4j.
      */
    def debug(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def debug(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def debug(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def debug(obj: js.Object, params: Any*): Unit = js.native
    
    /**
      * Returns a boolean: is the `error` level enabled?
      *
      * This is equivalent to `log.isErrorEnabled()` or `log.isEnabledFor(ERROR)` in log4j.
      */
    def error(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def error(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def error(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def error(obj: js.Object, params: Any*): Unit = js.native
    
    /**
      * Returns a boolean: is the `fatal` level enabled?
      *
      * This is equivalent to `log.isFatalEnabled()` or `log.isEnabledFor(FATAL)` in log4j.
      */
    def fatal(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def fatal(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def fatal(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def fatal(obj: js.Object, params: Any*): Unit = js.native
    
    var fields: Any = js.native
    
    /**
      * Returns a boolean: is the `info` level enabled?
      *
      * This is equivalent to `log.isInfoEnabled()` or `log.isEnabledFor(INFO)` in log4j.
      */
    def info(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def info(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def info(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def info(obj: js.Object, params: Any*): Unit = js.native
    
    def level(): Double = js.native
    def level(value: LogLevel): Unit = js.native
    
    def levels(): js.Array[Double] = js.native
    def levels(name: String): Double = js.native
    def levels(name: String, value: LogLevel): Unit = js.native
    def levels(name: Double): Double = js.native
    def levels(name: Double, value: LogLevel): Unit = js.native
    
    def reopenFileStreams(): Unit = js.native
    
    var src: Boolean = js.native
    
    /**
      * Returns a boolean: is the `trace` level enabled?
      *
      * This is equivalent to `log.isTraceEnabled()` or `log.isEnabledFor(TRACE)` in log4j.
      */
    def trace(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def trace(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def trace(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def trace(obj: js.Object, params: Any*): Unit = js.native
    
    /**
      * Returns a boolean: is the `warn` level enabled?
      *
      * This is equivalent to `log.isWarnEnabled()` or `log.isEnabledFor(WARN)` in log4j.
      */
    def warn(): Boolean = js.native
    /**
      * Special case to log an `Error` instance to the record.
      * This adds an `err` field with exception details
      * (including the stack) and sets `msg` to the exception
      * message or you can specify the `msg`.
      */
    def warn(error: js.Error, params: Any*): Unit = js.native
    /**
      * Uses `util.format` for msg formatting.
      */
    def warn(format: Any, params: Any*): Unit = js.native
    /**
      * The first field can optionally be a "fields" object, which
      * is merged into the log record.
      *
      * To pass in an Error *and* other fields, use the `err`
      * field name for the Error instance.
      */
    def warn(obj: js.Object, params: Any*): Unit = js.native
  }
  
  trait LoggerOptions
    extends StObject
       with /* custom */ StringDictionary[Any] {
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var name: String
    
    var serializers: js.UndefOr[Serializers] = js.undefined
    
    var src: js.UndefOr[Boolean] = js.undefined
    
    var stream: js.UndefOr[WritableStream[Any]] = js.undefined
    
    var streams: js.UndefOr[js.Array[Stream]] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(name: String): LoggerOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSerializers(value: Serializers): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setSrc(value: Boolean): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStream(value: WritableStream[Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      inline def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value*))
    }
  }
  
  trait RingBufferOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object RingBufferOptions {
    
    inline def apply(): RingBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RingBufferOptions]
    }
    
    extension [Self <: RingBufferOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait RotatingFileStreamOptions extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var path: String
    
    var period: js.UndefOr[String] = js.undefined
  }
  object RotatingFileStreamOptions {
    
    inline def apply(path: String): RotatingFileStreamOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RotatingFileStreamOptions]
    }
    
    extension [Self <: RotatingFileStreamOptions](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    }
  }
  
  type Serializer = js.Function1[/* input */ Any, Any]
  
  type Serializers = StringDictionary[Serializer]
  
  trait StdSerializers_
    extends StObject
       with Serializers {
    
    def err(input: Any): Any
    @JSName("err")
    var err_Original: Serializer
    
    def req(input: Any): Any
    @JSName("req")
    var req_Original: Serializer
    
    def res(input: Any): Any
    @JSName("res")
    var res_Original: Serializer
  }
  object StdSerializers_ {
    
    inline def apply(err: /* input */ Any => Any, req: /* input */ Any => Any, res: /* input */ Any => Any): StdSerializers_ = {
      val __obj = js.Dynamic.literal(err = js.Any.fromFunction1(err), req = js.Any.fromFunction1(req), res = js.Any.fromFunction1(res))
      __obj.asInstanceOf[StdSerializers_]
    }
    
    extension [Self <: StdSerializers_](x: Self) {
      
      inline def setErr(value: /* input */ Any => Any): Self = StObject.set(x, "err", js.Any.fromFunction1(value))
      
      inline def setReq(value: /* input */ Any => Any): Self = StObject.set(x, "req", js.Any.fromFunction1(value))
      
      inline def setRes(value: /* input */ Any => Any): Self = StObject.set(x, "res", js.Any.fromFunction1(value))
    }
  }
  
  trait Stream extends StObject {
    
    var closeOnExit: js.UndefOr[Boolean] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var period: js.UndefOr[String] = js.undefined
    
    var reemitErrorEvents: js.UndefOr[Boolean] = js.undefined
    
    var stream: js.UndefOr[WritableStream[Any] | Stream] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Stream {
    
    inline def apply(): Stream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stream]
    }
    
    extension [Self <: Stream](x: Self) {
      
      inline def setCloseOnExit(value: Boolean): Self = StObject.set(x, "closeOnExit", value.asInstanceOf[js.Any])
      
      inline def setCloseOnExitUndefined: Self = StObject.set(x, "closeOnExit", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setReemitErrorEvents(value: Boolean): Self = StObject.set(x, "reemitErrorEvents", value.asInstanceOf[js.Any])
      
      inline def setReemitErrorEventsUndefined: Self = StObject.set(x, "reemitErrorEvents", js.undefined)
      
      inline def setStream(value: WritableStream[Any] | Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
