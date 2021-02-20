package typings.emberDataAdapter

import typings.emberData.mod.default.AdapterError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  /**
    * A `DS.AdapterError` is used by an adapter to signal that an error occurred
    * during a request to an external API. It indicates a generic error, and
    * subclasses are used to indicate specific error states. The following
    * subclasses are provided:
    */
  @JSImport("@ember-data/adapter/error", JSImport.Default)
  @js.native
  class default () extends AdapterError
  
  /**
    * A `DS.AbortError` is used by an adapter to signal that a request to
    * the external API was aborted. For example, this can occur if the user
    * navigates away from the current page after a request to the external API
    * has been initiated but before a response has been received.
    */
  @JSImport("@ember-data/adapter/error", "AbortError")
  @js.native
  class AbortError ()
    extends typings.emberData.mod.default.AbortError
  
  /**
    * A `DS.ConflictError` equates to a HTTP `409 Conflict` response status.
    * It is used by an adapter to indicate that the request could not be processed
    * because of a conflict in the request. An example scenario would be when
    * creating a record with a client generated id but that id is already known
    * to the external API.
    */
  @JSImport("@ember-data/adapter/error", "ConflictError")
  @js.native
  class ConflictError ()
    extends typings.emberData.mod.default.ConflictError
  
  /**
    * A `DS.ForbiddenError` equates to a HTTP `403 Forbidden` response status.
    * It is used by an adapter to signal that a request to the external API was
    * valid but the server is refusing to respond to it. If authorization was
    * provided and is valid, then the authenticated user does not have the
    * necessary permissions for the request.
    */
  @JSImport("@ember-data/adapter/error", "ForbiddenError")
  @js.native
  class ForbiddenError ()
    extends typings.emberData.mod.default.ForbiddenError
  
  /**
    * A `DS.InvalidError` is used by an adapter to signal the external API
    * was unable to process a request because the content was not
    * semantically correct or meaningful per the API. Usually this means a
    * record failed some form of server side validation. When a promise
    * from an adapter is rejected with a `DS.InvalidError` the record will
    * transition to the `invalid` state and the errors will be set to the
    * `errors` property on the record.
    */
  @JSImport("@ember-data/adapter/error", "InvalidError")
  @js.native
  class InvalidError protected ()
    extends typings.emberData.mod.default.InvalidError {
    def this(errors: js.Array[_]) = this()
  }
  
  /**
    * A `DS.NotFoundError` equates to a HTTP `404 Not Found` response status.
    * It is used by an adapter to signal that a request to the external API
    * was rejected because the resource could not be found on the API.
    */
  @JSImport("@ember-data/adapter/error", "NotFoundError")
  @js.native
  class NotFoundError ()
    extends typings.emberData.mod.default.NotFoundError
  
  /**
    * A `DS.ServerError` equates to a HTTP `500 Internal Server Error` response
    * status. It is used by the adapter to indicate that a request has failed
    * because of an error in the external API.
    */
  @JSImport("@ember-data/adapter/error", "ServerError")
  @js.native
  class ServerError ()
    extends typings.emberData.mod.default.ServerError
  
  /**
    * A `DS.TimeoutError` is used by an adapter to signal that a request
    * to the external API has timed out. I.e. no response was received from
    * the external API within an allowed time period.
    */
  @JSImport("@ember-data/adapter/error", "TimeoutError")
  @js.native
  class TimeoutError ()
    extends typings.emberData.mod.default.TimeoutError
  
  /**
    * A `DS.UnauthorizedError` equates to a HTTP `401 Unauthorized` response
    * status. It is used by an adapter to signal that a request to the external
    * API was rejected because authorization is required and has failed or has not
    * yet been provided.
    */
  @JSImport("@ember-data/adapter/error", "UnauthorizedError")
  @js.native
  class UnauthorizedError ()
    extends typings.emberData.mod.default.UnauthorizedError
  
  @JSImport("@ember-data/adapter/error", "errorsArrayToHash")
  @js.native
  val errorsArrayToHash: js.Function1[/* errors */ js.Array[js.Any], js.Object] = js.native
  
  @JSImport("@ember-data/adapter/error", "errorsHashToArray")
  @js.native
  val errorsHashToArray: js.Function1[/* errors */ js.Object, js.Array[js.Any]] = js.native
}
