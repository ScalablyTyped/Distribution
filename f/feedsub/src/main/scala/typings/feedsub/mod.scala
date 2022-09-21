package typings.feedsub

import typings.feedsub.anon.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("feedsub/dist/feedsub", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FeedSub {
    /**
      * @constructor
      * @param {string} feed
      * @param {!Object} options
      */
    def this(feed: String) = this()
    def this(feed: String, options: Options) = this()
  }
  
  /* Inlined std.Required<feedsub.feedsub/dist/feedsub.Options> */
  trait DefaultOptions extends StObject {
    
    var autoStart: Boolean
    
    var daysToSkip: js.Array[String]
    
    var emitOnStart: Boolean
    
    var forceInterval: Boolean
    
    var history: js.Array[String]
    
    var hoursToSkip: js.Array[Double]
    
    var interval: Double
    
    var lastDate: String
    
    var maxHistory: Double
    
    var requestOpts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify miniget.Options */ Any
    
    var skipDays: Boolean
    
    var skipHours: Boolean
  }
  object DefaultOptions {
    
    inline def apply(
      autoStart: Boolean,
      daysToSkip: js.Array[String],
      emitOnStart: Boolean,
      forceInterval: Boolean,
      history: js.Array[String],
      hoursToSkip: js.Array[Double],
      interval: Double,
      lastDate: String,
      maxHistory: Double,
      requestOpts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify miniget.Options */ Any,
      skipDays: Boolean,
      skipHours: Boolean
    ): DefaultOptions = {
      val __obj = js.Dynamic.literal(autoStart = autoStart.asInstanceOf[js.Any], daysToSkip = daysToSkip.asInstanceOf[js.Any], emitOnStart = emitOnStart.asInstanceOf[js.Any], forceInterval = forceInterval.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], hoursToSkip = hoursToSkip.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any], maxHistory = maxHistory.asInstanceOf[js.Any], requestOpts = requestOpts.asInstanceOf[js.Any], skipDays = skipDays.asInstanceOf[js.Any], skipHours = skipHours.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptions]
    }
    
    extension [Self <: DefaultOptions](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setDaysToSkip(value: js.Array[String]): Self = StObject.set(x, "daysToSkip", value.asInstanceOf[js.Any])
      
      inline def setDaysToSkipVarargs(value: String*): Self = StObject.set(x, "daysToSkip", js.Array(value*))
      
      inline def setEmitOnStart(value: Boolean): Self = StObject.set(x, "emitOnStart", value.asInstanceOf[js.Any])
      
      inline def setForceInterval(value: Boolean): Self = StObject.set(x, "forceInterval", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setHoursToSkip(value: js.Array[Double]): Self = StObject.set(x, "hoursToSkip", value.asInstanceOf[js.Any])
      
      inline def setHoursToSkipVarargs(value: Double*): Self = StObject.set(x, "hoursToSkip", js.Array(value*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setLastDate(value: String): Self = StObject.set(x, "lastDate", value.asInstanceOf[js.Any])
      
      inline def setMaxHistory(value: Double): Self = StObject.set(x, "maxHistory", value.asInstanceOf[js.Any])
      
      inline def setRequestOpts(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify miniget.Options */ Any
      ): Self = StObject.set(x, "requestOpts", value.asInstanceOf[js.Any])
      
      inline def setSkipDays(value: Boolean): Self = StObject.set(x, "skipDays", value.asInstanceOf[js.Any])
      
      inline def setSkipHours(value: Boolean): Self = StObject.set(x, "skipHours", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypedEmitter<FeedSubEvents> * / any */ @js.native
  trait FeedSub extends StObject {
    
    /* private */ var _first: Any = js.native
    
    /* private */ var _intervalid: Any = js.native
    
    var feed: String = js.native
    
    var getOpts: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify miniget.Options */ Any) & Headers = js.native
    
    var news: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NewsEmitter */ Any = js.native
    
    var options: DefaultOptions = js.native
    
    /**
      * Reads feed and determines if there are any new items
      * emits new items through event `item`
      * if there are new items, emits `items` event at end with all items
      *
      * if callback is given, calls callback with all new items
      * even when there are 0.
      *
      * @param {!Function(!Error, Array.<Object>)} callback
      */
    def read(): Unit = js.native
    def read(
      callback: js.Function2[
          /* err */ Null | js.Error, 
          /* items */ js.UndefOr[
            js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeedItem */ Any
            ]
          ], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Start calling the read function on interval.
      *
      * @param {boolean} readOnStart
      */
    def start(): Unit = js.native
    def start(readOnStart: Boolean): Unit = js.native
    
    /**
      * Stop interval if any
      */
    def stop(): Unit = js.native
  }
  
  trait FeedSubEvents extends StObject {
    
    def error(err: js.Error): Unit
    
    def item(
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeedItem */ Any
    ): Unit
    
    def items(
      items: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeedItem */ Any
        ]
    ): Unit
  }
  object FeedSubEvents {
    
    inline def apply(
      error: js.Error => Unit,
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeedItem */ Any => Unit,
      items: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeedItem */ Any
        ] => Unit
    ): FeedSubEvents = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), item = js.Any.fromFunction1(item), items = js.Any.fromFunction1(items))
      __obj.asInstanceOf[FeedSubEvents]
    }
    
    extension [Self <: FeedSubEvents](x: Self) {
      
      inline def setError(value: js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeedItem */ Any => Unit
      ): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setItems(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeedItem */ Any
            ] => Unit
      ): Self = StObject.set(x, "items", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var daysToSkip: js.UndefOr[js.Array[String]] = js.undefined
    
    var emitOnStart: js.UndefOr[Boolean] = js.undefined
    
    var forceInterval: js.UndefOr[Boolean] = js.undefined
    
    var history: js.UndefOr[js.Array[String]] = js.undefined
    
    var hoursToSkip: js.UndefOr[js.Array[Double]] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var lastDate: js.UndefOr[Null | String] = js.undefined
    
    var maxHistory: js.UndefOr[Double] = js.undefined
    
    var requestOpts: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify miniget.Options */ Any
      ] = js.undefined
    
    var skipDays: js.UndefOr[Boolean] = js.undefined
    
    var skipHours: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setDaysToSkip(value: js.Array[String]): Self = StObject.set(x, "daysToSkip", value.asInstanceOf[js.Any])
      
      inline def setDaysToSkipUndefined: Self = StObject.set(x, "daysToSkip", js.undefined)
      
      inline def setDaysToSkipVarargs(value: String*): Self = StObject.set(x, "daysToSkip", js.Array(value*))
      
      inline def setEmitOnStart(value: Boolean): Self = StObject.set(x, "emitOnStart", value.asInstanceOf[js.Any])
      
      inline def setEmitOnStartUndefined: Self = StObject.set(x, "emitOnStart", js.undefined)
      
      inline def setForceInterval(value: Boolean): Self = StObject.set(x, "forceInterval", value.asInstanceOf[js.Any])
      
      inline def setForceIntervalUndefined: Self = StObject.set(x, "forceInterval", js.undefined)
      
      inline def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value*))
      
      inline def setHoursToSkip(value: js.Array[Double]): Self = StObject.set(x, "hoursToSkip", value.asInstanceOf[js.Any])
      
      inline def setHoursToSkipUndefined: Self = StObject.set(x, "hoursToSkip", js.undefined)
      
      inline def setHoursToSkipVarargs(value: Double*): Self = StObject.set(x, "hoursToSkip", js.Array(value*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLastDate(value: String): Self = StObject.set(x, "lastDate", value.asInstanceOf[js.Any])
      
      inline def setLastDateNull: Self = StObject.set(x, "lastDate", null)
      
      inline def setLastDateUndefined: Self = StObject.set(x, "lastDate", js.undefined)
      
      inline def setMaxHistory(value: Double): Self = StObject.set(x, "maxHistory", value.asInstanceOf[js.Any])
      
      inline def setMaxHistoryUndefined: Self = StObject.set(x, "maxHistory", js.undefined)
      
      inline def setRequestOpts(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify miniget.Options */ Any
      ): Self = StObject.set(x, "requestOpts", value.asInstanceOf[js.Any])
      
      inline def setRequestOptsUndefined: Self = StObject.set(x, "requestOpts", js.undefined)
      
      inline def setSkipDays(value: Boolean): Self = StObject.set(x, "skipDays", value.asInstanceOf[js.Any])
      
      inline def setSkipDaysUndefined: Self = StObject.set(x, "skipDays", js.undefined)
      
      inline def setSkipHours(value: Boolean): Self = StObject.set(x, "skipHours", value.asInstanceOf[js.Any])
      
      inline def setSkipHoursUndefined: Self = StObject.set(x, "skipHours", js.undefined)
    }
  }
}
