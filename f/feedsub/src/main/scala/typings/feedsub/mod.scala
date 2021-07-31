package typings.feedsub

import typings.node.httpMod.RequestOptions
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("feedsub", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with FeedSub {
    /**
      * Creates a new instance of FeedSub.
      * @param feed URL of feed to subscribe
      * @param options Optional options
      */
    def this(feed: String) = this()
    def this(feed: String, options: FeedSubOptions) = this()
  }
  
  /**
    * This is similar to Parameters but will work with a type which is
    * a function or with a tuple specifying arguments, which are both
    * common ways to define eventemitter events
    */
  type EventArguments[T] = js.Array[js.Any | T]
  
  type FeedItem = Record[String, js.Any]
  
  @js.native
  trait FeedSub
    extends StObject
       with TypedEventEmitter[FeedSubEvents] {
    
    /**
      * Options that were passed to the constructor along with any defaults are kept here.
      */
    var options: FeedSubOptions = js.native
    
    /**
      * Reads the feed. Calls callback with possible error or new items discovered if provided.
      * Causes reader to emit new item events.
      * @param callback The function to call.
      */
    def read(): Unit = js.native
    def read(callback: js.Function2[/* err */ Error | Null, /* items */ js.UndefOr[js.Array[FeedItem]], Unit]): Unit = js.native
    
    /**
      * Starts checking the feed for any new items.
      * It checks right away, and then, every options.interval minutes.
      */
    def start(): Unit = js.native
    
    /**
      * Stops the reader from automatically reading the feed.
      */
    def stop(): Unit = js.native
  }
  
  trait FeedSubEvents extends StObject {
    
    // Emitted when there is an error downloading or parsing the feed.
    // Not emitted if callback is given for read or readInterval.
    def error(error: Error): Unit
    
    // Emitted whenever there is a new item.
    def item(item: FeedItem): Unit
    
    // Emits all new items from one request in one array.
    def items(items: js.Array[FeedItem]): Unit
  }
  object FeedSubEvents {
    
    @scala.inline
    def apply(error: Error => Unit, item: FeedItem => Unit, items: js.Array[FeedItem] => Unit): FeedSubEvents = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), item = js.Any.fromFunction1(item), items = js.Any.fromFunction1(items))
      __obj.asInstanceOf[FeedSubEvents]
    }
    
    @scala.inline
    implicit class FeedSubEventsMutableBuilder[Self <: FeedSubEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItem(value: FeedItem => Unit): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItems(value: js.Array[FeedItem] => Unit): Self = StObject.set(x, "items", js.Any.fromFunction1(value))
    }
  }
  
  trait FeedSubOptions extends StObject {
    
    // If true, calls `reader.start()` when initialized. [default: false]
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    // Specify exactly what days to skip, ex: ['Saturday', 'Sunday']. [default: []]
    var daysToSkip: js.UndefOr[js.Array[String]] = js.undefined
    
    // Emits items on the very first request.
    // After which, it should consider those items read. [default: false]
    var emitOnStart: js.UndefOr[Boolean] = js.undefined
    
    // Some feeds contain a `ttl` tag that specify the
    // number of minutes to cache the feed.
    // Setting this to true will ignore that. [default: false]
    var forceInterval: js.UndefOr[Boolean] = js.undefined
    
    // If you'd like to specify exactly what hours to skip. [default: []]
    var hoursToSkip: js.UndefOr[js.Array[Double]] = js.undefined
    
    // Number of minutes to wait between checking the feed for new items. [default: 10]
    var interval: js.UndefOr[Double] = js.undefined
    
    // Keeps track of last date of the feed. [default: null]
    var lastDate: js.UndefOr[Double] = js.undefined
    
    // Maximum size of `history` array. [default: 10]
    var maxHistory: js.UndefOr[Double] = js.undefined
    
    // Options object passed to [miniget](https://github.com/fent/node-miniget). [default: {}]
    var requestOpts: js.UndefOr[RequestOptions] = js.undefined
    
    // Same as `skipHours`, but with days. [default: false]
    var skipDays: js.UndefOr[Boolean] = js.undefined
    
    // Some feeds have a `skipHours` tag with a list of
    // hours in which the feed should not be read.
    // if this is set to true and the feed has that tag, it obeys that rule [default: false]
    var skipHours: js.UndefOr[Boolean] = js.undefined
  }
  object FeedSubOptions {
    
    @scala.inline
    def apply(): FeedSubOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedSubOptions]
    }
    
    @scala.inline
    implicit class FeedSubOptionsMutableBuilder[Self <: FeedSubOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      @scala.inline
      def setDaysToSkip(value: js.Array[String]): Self = StObject.set(x, "daysToSkip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysToSkipUndefined: Self = StObject.set(x, "daysToSkip", js.undefined)
      
      @scala.inline
      def setDaysToSkipVarargs(value: String*): Self = StObject.set(x, "daysToSkip", js.Array(value :_*))
      
      @scala.inline
      def setEmitOnStart(value: Boolean): Self = StObject.set(x, "emitOnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitOnStartUndefined: Self = StObject.set(x, "emitOnStart", js.undefined)
      
      @scala.inline
      def setForceInterval(value: Boolean): Self = StObject.set(x, "forceInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceIntervalUndefined: Self = StObject.set(x, "forceInterval", js.undefined)
      
      @scala.inline
      def setHoursToSkip(value: js.Array[Double]): Self = StObject.set(x, "hoursToSkip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursToSkipUndefined: Self = StObject.set(x, "hoursToSkip", js.undefined)
      
      @scala.inline
      def setHoursToSkipVarargs(value: Double*): Self = StObject.set(x, "hoursToSkip", js.Array(value :_*))
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLastDate(value: Double): Self = StObject.set(x, "lastDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastDateUndefined: Self = StObject.set(x, "lastDate", js.undefined)
      
      @scala.inline
      def setMaxHistory(value: Double): Self = StObject.set(x, "maxHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHistoryUndefined: Self = StObject.set(x, "maxHistory", js.undefined)
      
      @scala.inline
      def setRequestOpts(value: RequestOptions): Self = StObject.set(x, "requestOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptsUndefined: Self = StObject.set(x, "requestOpts", js.undefined)
      
      @scala.inline
      def setSkipDays(value: Boolean): Self = StObject.set(x, "skipDays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipDaysUndefined: Self = StObject.set(x, "skipDays", js.undefined)
      
      @scala.inline
      def setSkipHours(value: Boolean): Self = StObject.set(x, "skipHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipHoursUndefined: Self = StObject.set(x, "skipHours", js.undefined)
    }
  }
  
  /**
    * Type-safe event emitter from https://github.com/andywer/typed-emitter.
    *
    * Use it like this:
    *
    * interface MyEvents {
    *   error: (error: Error) => void
    *   message: (from: string, content: string) => void
    * }
    *
    * const myEmitter = new EventEmitter() as TypedEmitter<MyEvents>
    *
    * myEmitter.on("message", (from, content) => {
    *   // ...
    * })
    *
    * myEmitter.emit("error", "x")  // <- Will catch this type error
    */
  @js.native
  trait TypedEventEmitter[Events] extends StObject {
    
    def addListener[E /* <: /* keyof Events */ String */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def emit[E /* <: /* keyof Events */ String */](
      event: E,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArguments<Events[E]> is not an array type */ args: EventArguments[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
        ]
    ): Boolean = js.native
    
    def eventNames(): js.Array[/* keyof Events */ String] = js.native
    
    // tslint:disable-line no-unnecessary-generics
    def getMaxListeners(): Double = js.native
    
    // tslint:disable-line:ban-types no-unnecessary-generics
    def listenerCount[E /* <: /* keyof Events */ String */](event: E): Double = js.native
    
    // tslint:disable-line:ban-types no-unnecessary-generics
    def listeners[E /* <: /* keyof Events */ String */](event: E): js.Array[js.Function] = js.native
    
    def off[E /* <: /* keyof Events */ String */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def on[E /* <: /* keyof Events */ String */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def once[E /* <: /* keyof Events */ String */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def prependListener[E /* <: /* keyof Events */ String */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def prependOnceListener[E /* <: /* keyof Events */ String */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def rawListeners[E /* <: /* keyof Events */ String */](event: E): js.Array[js.Function] = js.native
    
    def removeAllListeners[E /* <: /* keyof Events */ String */](): this.type = js.native
    def removeAllListeners[E /* <: /* keyof Events */ String */](event: E): this.type = js.native
    
    // tslint:disable-line no-unnecessary-generics
    def removeListener[E /* <: /* keyof Events */ String */](
      event: E,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[E] */ js.Any
    ): this.type = js.native
    
    def setMaxListeners(maxListeners: Double): this.type = js.native
  }
}
