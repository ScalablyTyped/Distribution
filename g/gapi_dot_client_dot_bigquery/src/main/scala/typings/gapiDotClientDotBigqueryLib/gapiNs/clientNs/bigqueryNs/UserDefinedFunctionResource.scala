package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedFunctionResource extends js.Object {
  /**
    * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI
    * for a file containing the same code.
    */
  var inlineCode: js.UndefOr[java.lang.String] = js.undefined
  /** [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path). */
  var resourceUri: js.UndefOr[java.lang.String] = js.undefined
}

