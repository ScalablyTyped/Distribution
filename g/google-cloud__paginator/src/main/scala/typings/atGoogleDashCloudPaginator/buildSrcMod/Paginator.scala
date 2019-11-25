package typings.atGoogleDashCloudPaginator.buildSrcMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/paginator/build/src", "Paginator")
@js.native
class Paginator () extends js.Object {
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
  def parseArguments_(args: js.Array[_]): ParsedArguments = js.native
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
  def runAsStream_[T](parsedArguments: ParsedArguments, originalMethod: js.Function): typings.atGoogleDashCloudPaginator.buildSrcResourceDashStreamMod.ResourceStream[T] = js.native
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
  def run_(parsedArguments: ParsedArguments, originalMethod: js.Function): js.Any = js.native
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
    /* repeated */ js.Any, 
    typings.atGoogleDashCloudPaginator.buildSrcResourceDashStreamMod.ResourceStream[T]
  ] = js.native
}

@JSImport("@google-cloud/paginator/build/src", "paginator")
@js.native
object paginator extends TopLevel[Paginator]

