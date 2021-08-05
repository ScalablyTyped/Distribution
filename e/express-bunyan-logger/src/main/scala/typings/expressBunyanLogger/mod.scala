package typings.expressBunyanLogger

import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.Serializers
import typings.bunyan.mod.Stream
import typings.express.mod.ErrorRequestHandler
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.NodeJS.WritableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def apply(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-bunyan-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def errorLogger(): ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorLogger")().asInstanceOf[ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def errorLogger(options: Options): ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorLogger")(options.asInstanceOf[js.Any]).asInstanceOf[ErrorRequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  type FormatFunction = js.Function1[/* meta */ js.Any, String]
  
  type IncludesFunction = js.Function2[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    js.Any
  ]
  
  type LevelFunction = js.Function3[/* status */ Double, /* err */ Error | Null, /* meta */ js.Any, String]
  
  /* Inlined parent std.Partial<bunyan.bunyan.LoggerOptions> */
  trait Options extends StObject {
    
    var excludes: js.UndefOr[js.Array[String]] = js.undefined
    
    var format: js.UndefOr[String | FormatFunction] = js.undefined
    
    var genReqId: js.UndefOr[RequestIdGenFunction] = js.undefined
    
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    var includesFn: js.UndefOr[IncludesFunction] = js.undefined
    
    var level: js.UndefOr[LogLevel] = js.undefined
    
    var levelFn: js.UndefOr[LevelFunction] = js.undefined
    
    var logger: js.UndefOr[typings.bunyan.mod.^] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var obfuscate: js.UndefOr[js.Array[String]] = js.undefined
    
    var obfuscatePlaceholder: js.UndefOr[String] = js.undefined
    
    var parseUA: js.UndefOr[Boolean] = js.undefined
    
    var serializers: js.UndefOr[Serializers] = js.undefined
    
    var src: js.UndefOr[Boolean] = js.undefined
    
    var stream: js.UndefOr[WritableStream] = js.undefined
    
    var streams: js.UndefOr[js.Array[Stream]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
      
      inline def setFormat(value: String | FormatFunction): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: /* meta */ js.Any => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGenReqId(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = StObject.set(x, "genReqId", js.Any.fromFunction1(value))
      
      inline def setGenReqIdUndefined: Self = StObject.set(x, "genReqId", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setIncludesFn(
        value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => js.Any
      ): Self = StObject.set(x, "includesFn", js.Any.fromFunction2(value))
      
      inline def setIncludesFnUndefined: Self = StObject.set(x, "includesFn", js.undefined)
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelFn(value: (/* status */ Double, /* err */ Error | Null, /* meta */ js.Any) => String): Self = StObject.set(x, "levelFn", js.Any.fromFunction3(value))
      
      inline def setLevelFnUndefined: Self = StObject.set(x, "levelFn", js.undefined)
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLogger(value: typings.bunyan.mod.^): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setObfuscate(value: js.Array[String]): Self = StObject.set(x, "obfuscate", value.asInstanceOf[js.Any])
      
      inline def setObfuscatePlaceholder(value: String): Self = StObject.set(x, "obfuscatePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setObfuscatePlaceholderUndefined: Self = StObject.set(x, "obfuscatePlaceholder", js.undefined)
      
      inline def setObfuscateUndefined: Self = StObject.set(x, "obfuscate", js.undefined)
      
      inline def setObfuscateVarargs(value: String*): Self = StObject.set(x, "obfuscate", js.Array(value :_*))
      
      inline def setParseUA(value: Boolean): Self = StObject.set(x, "parseUA", value.asInstanceOf[js.Any])
      
      inline def setParseUAUndefined: Self = StObject.set(x, "parseUA", js.undefined)
      
      inline def setSerializers(value: Serializers): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setSrc(value: Boolean): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
      
      inline def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    }
  }
  
  type RequestIdGenFunction = js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String]
}
