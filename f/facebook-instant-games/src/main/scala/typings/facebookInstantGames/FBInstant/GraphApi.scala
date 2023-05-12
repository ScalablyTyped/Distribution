package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions and properties related to Graph APIs.
  *
  * @since 7.0
  */
@js.native
trait GraphApi extends StObject {
  
  /**
    * Performs a graph API Call and returns the result.
    *
    * @example
    * FBInstant.graphApi.requestAsync('/me?fields=id,name')
    *   .then(function(response) {
    *     ...
    *   });
    * @param path The graph API path to perform the request against.
    * @param method HTTP method that will be used for this request. `GET` is the default if not specified.
    * @param params Parameters that will be sent as part of the request.
    * @returns The result of the graph API call.
    */
  def requestAsync(path: String): js.Promise[js.Object] = js.native
  def requestAsync(path: String, method: String): js.Promise[js.Object] = js.native
  def requestAsync(path: String, method: String, params: js.Object): js.Promise[js.Object] = js.native
  def requestAsync(path: String, method: Unit, params: js.Object): js.Promise[js.Object] = js.native
}
