package typings.dogStatsy

import typings.dogStatsy.dogStatsyStrings.close
import typings.dogStatsy.dogStatsyStrings.connect
import typings.dogStatsy.dogStatsyStrings.error
import typings.dogStatsy.dogStatsyStrings.message
import typings.node.bufferMod.global.Buffer
import typings.node.dgramMod.RemoteInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dog-statsy", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Client {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Client
    extends typings.node.nodeColoneventsMod.^ {
    
    def addListener(event: close | connect, listener: js.Function0[Unit]): this.type = js.native
    def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    /**
      * Closes the underlying socket, preventing the client from sending messages.
      */
    def close(): Unit = js.native
    
    /**
      * Send a counter value with optional sample rate.
      */
    def count(name: String, `val`: Double): Unit = js.native
    def count(name: String, `val`: Double, sample: Double): Unit = js.native
    def count(name: String, `val`: Double, sample: Double, tags: js.Array[String]): Unit = js.native
    def count(name: String, `val`: Double, sample: Null, tags: js.Array[String]): Unit = js.native
    def count(name: String, `val`: Double, sample: Unit, tags: js.Array[String]): Unit = js.native
    
    /**
      * Decrement counter by `val` or `1`.
      */
    def decr(name: String): Unit = js.native
    def decr(name: String, `val`: Double): Unit = js.native
    def decr(name: String, `val`: Double, tags: js.Array[String]): Unit = js.native
    def decr(name: String, `val`: Null, tags: js.Array[String]): Unit = js.native
    def decr(name: String, `val`: Unit, tags: js.Array[String]): Unit = js.native
    
    def emit(event: close | connect): Boolean = js.native
    def emit(event: String, args: Any*): Boolean = js.native
    def emit(event: js.Symbol, args: Any*): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    @JSName("emit")
    def emit_message(event: message, msg: Buffer, rinfo: RemoteInfo): Boolean = js.native
    
    /**
      * Flush buffered data, this method is a no-op if buffering is disabled.
      */
    def flush(): Unit = js.native
    
    /**
      * Send a gauge value.
      */
    def gauge(name: String, `val`: Double): Unit = js.native
    def gauge(name: String, `val`: Double, tags: js.Array[String]): Unit = js.native
    
    /**
      * Send a histogram value or omit the value to return a completion function.
      */
    def histogram(name: String): js.Function0[Unit] = js.native
    def histogram(name: String, `val`: Double): Unit = js.native
    def histogram(name: String, `val`: Double, tags: js.Array[String]): Unit = js.native
    
    /**
      * Increment counter by `val` or `1`.
      */
    def incr(name: String): Unit = js.native
    def incr(name: String, `val`: Double): Unit = js.native
    def incr(name: String, `val`: Double, tags: js.Array[String]): Unit = js.native
    def incr(name: String, `val`: Null, tags: js.Array[String]): Unit = js.native
    def incr(name: String, `val`: Unit, tags: js.Array[String]): Unit = js.native
    
    /**
      * Send a meter value.
      */
    def meter(name: String, `val`: Double): Unit = js.native
    def meter(name: String, `val`: Double, tags: js.Array[String]): Unit = js.native
    
    def on(event: close | connect, listener: js.Function0[Unit]): this.type = js.native
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    def once(event: close | connect, listener: js.Function0[Unit]): this.type = js.native
    def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    def prependListener(event: close | connect, listener: js.Function0[Unit]): this.type = js.native
    def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    def prependOnceListener(event: close | connect, listener: js.Function0[Unit]): this.type = js.native
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_message(event: message, listener: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): this.type = js.native
    
    /**
      * Send a set value.
      */
    def set(name: String, `val`: Double): Unit = js.native
    def set(name: String, `val`: Double, tags: js.Array[String]): Unit = js.native
    
    /**
      * Set the buffer flush interval as a number of milliseconds.
      *
      * @param msec The time interval for buffer flushes, or a falsy value to disable buffer flushing.
      */
    def setFlushInterval(): Unit = js.native
    def setFlushInterval(msec: Double): Unit = js.native
    
    /**
      * Send a timer value or omit the value to return a completion function.
      */
    def timer(name: String): js.Function0[Unit] = js.native
    def timer(name: String, `val`: Double): Unit = js.native
    def timer(name: String, `val`: Double, tags: js.Array[String]): Unit = js.native
    
    /**
      * Creates a trace object that generates stats on this client.
      *
      * @param name The name of the new trace, prefix for all its stats.
      * @param tags The default tags set to all stats of the trace.
      * @param now The start time of the trace.
      */
    def trace(name: String): Trace = js.native
    def trace(name: String, tags: js.Array[String]): Trace = js.native
    def trace(name: String, tags: js.Array[String], now: js.Date): Trace = js.native
    def trace(name: String, tags: Null, now: js.Date): Trace = js.native
    def trace(name: String, tags: Unit, now: js.Date): Trace = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The buffer size. Use `0` to send the data immediately.
      * @default 1024
      */
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Only valid when `bufferSize` is defined. It will flush the buffer after the
      * interval in milliseconds (if not empty).
      */
    var flushInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 'localhost'
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * @default 8125
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional prefix for a message, will be concatenated with a `'.'`.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Array of tags to include in every call.
      * @default []
      */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  @js.native
  trait Trace extends StObject {
    
    /**
      * Completes a trace.
      */
    def complete(): Unit = js.native
    def complete(now: js.Date): Unit = js.native
    
    /**
      * Adds a step to a trace.
      */
    def step(step: String): Unit = js.native
    def step(step: String, tags: js.Array[String]): Unit = js.native
    def step(step: String, tags: js.Array[String], now: js.Date): Unit = js.native
    def step(step: String, tags: Null, now: js.Date): Unit = js.native
    def step(step: String, tags: Unit, now: js.Date): Unit = js.native
  }
}
