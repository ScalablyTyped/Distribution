package typings
package atFirebaseFunctionsDashTypesLib.functionsDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsError
  extends stdLib.Error {
  /**
    * A standard error code that will be returned to the client. This also
    * determines the HTTP status code of the response, as defined in code.proto.
    */
  val code: FunctionsErrorCode
  /**
    * Extra data to be converted to JSON and included in the error response.
    */
  val details: js.UndefOr[js.Any] = js.undefined
}

