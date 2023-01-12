package typings.googleCloudPaginator

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@google-cloud/paginator", "Paginator")
  @js.native
  open class Paginator_ () extends StObject {
    
    /**
      * Cache the original method, then overwrite it on the Class's prototype.
      *
      * @param {function} Class - The parent class of the methods to extend.
      * @param {string|string[]} methodNames - Name(s) of the methods to extend.
      */
    def extend(Class: js.Function, methodNames: String): Unit = js.native
    def extend(Class: js.Function, methodNames: js.Array[String]): Unit = js.native
    
    /**
      * Parse a pseudo-array `arguments` for a query and callback.
      *
      * @param {array} args - The original `arguments` pseduo-array that the original
      *     method received.
      */
    def parseArguments_(args: js.Array[Any]): ParsedArguments = js.native
    
    /**
      * This method simply calls the nextQuery recursively, emitting results to a
      * stream. The stream ends when `nextQuery` is null.
      *
      * `maxResults` will act as a cap for how many results are fetched and emitted
      * to the stream.
      *
      * @param {object=|string=} parsedArguments.query - Query object. This is most
      *     commonly an object, but to make the API more simple, it can also be a
      *     string in some places.
      * @param {function=} parsedArguments.callback - Callback function.
      * @param {boolean} parsedArguments.autoPaginate - Auto-pagination enabled.
      * @param {boolean} parsedArguments.maxApiCalls - Maximum API calls to make.
      * @param {number} parsedArguments.maxResults - Maximum results to return.
      * @param {function} originalMethod - The cached method that accepts a callback
      *     and returns `nextQuery` to receive more results.
      * @return {stream} - Readable object stream.
      */
    def runAsStream_[T](parsedArguments: ParsedArguments, originalMethod: js.Function): typings.googleCloudPaginator.buildSrcResourceStreamMod.ResourceStream[T] = js.native
    
    /**
      * This simply checks to see if `autoPaginate` is set or not, if it's true
      * then we buffer all results, otherwise simply call the original method.
      *
      * @param {array} parsedArguments - Parsed arguments from the original method
      *     call.
      * @param {object=|string=} parsedArguments.query - Query object. This is most
      *     commonly an object, but to make the API more simple, it can also be a
      *     string in some places.
      * @param {function=} parsedArguments.callback - Callback function.
      * @param {boolean} parsedArguments.autoPaginate - Auto-pagination enabled.
      * @param {boolean} parsedArguments.maxApiCalls - Maximum API calls to make.
      * @param {number} parsedArguments.maxResults - Maximum results to return.
      * @param {function} originalMethod - The cached method that accepts a callback
      *     and returns `nextQuery` to receive more results.
      */
    def run_(parsedArguments: ParsedArguments, originalMethod: js.Function): Any = js.native
    
    /**
      * Wraps paginated API calls in a readable object stream.
      *
      * This method simply calls the nextQuery recursively, emitting results to a
      * stream. The stream ends when `nextQuery` is null.
      *
      * `maxResults` will act as a cap for how many results are fetched and emitted
      * to the stream.
      *
      * @param {string} methodName - Name of the method to streamify.
      * @return {function} - Wrapped function.
      */
    def streamify[T](methodName: String): js.ThisFunction1[
        /* this */ StringDictionary[js.Function], 
        /* repeated */ Any, 
        typings.googleCloudPaginator.buildSrcResourceStreamMod.ResourceStream[T]
      ] = js.native
  }
  
  @JSImport("@google-cloud/paginator", "ResourceStream")
  @js.native
  open class ResourceStream[T] protected ()
    extends typings.googleCloudPaginator.buildSrcResourceStreamMod.ResourceStream[T] {
    def this(args: ParsedArguments, requestFn: js.Function) = this()
  }
  
  @JSImport("@google-cloud/paginator", "paginator")
  @js.native
  val paginator: Paginator_ = js.native
  
  trait ParsedArguments
    extends StObject
       with TransformOptions {
    
    /**
      * Auto-pagination enabled.
      */
    var autoPaginate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback function.
      */
    var callback: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Maximum API calls to make.
      */
    var maxApiCalls: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum results to return.
      */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Query object. This is most commonly an object, but to make the API more
      * simple, it can also be a string in some places.
      */
    var query: js.UndefOr[ParsedArguments] = js.undefined
    
    var streamOptions: js.UndefOr[ParsedArguments] = js.undefined
  }
  object ParsedArguments {
    
    inline def apply(): ParsedArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParsedArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedArguments] (val x: Self) extends AnyVal {
      
      inline def setAutoPaginate(value: Boolean): Self = StObject.set(x, "autoPaginate", value.asInstanceOf[js.Any])
      
      inline def setAutoPaginateUndefined: Self = StObject.set(x, "autoPaginate", js.undefined)
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setMaxApiCalls(value: Double): Self = StObject.set(x, "maxApiCalls", value.asInstanceOf[js.Any])
      
      inline def setMaxApiCallsUndefined: Self = StObject.set(x, "maxApiCalls", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setQuery(value: ParsedArguments): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setStreamOptions(value: ParsedArguments): Self = StObject.set(x, "streamOptions", value.asInstanceOf[js.Any])
      
      inline def setStreamOptionsUndefined: Self = StObject.set(x, "streamOptions", js.undefined)
    }
  }
}
