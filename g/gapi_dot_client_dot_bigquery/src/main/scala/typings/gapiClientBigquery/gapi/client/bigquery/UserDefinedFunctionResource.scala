package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedFunctionResource extends js.Object {
  /**
    * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI
    * for a file containing the same code.
    */
  var inlineCode: js.UndefOr[String] = js.undefined
  /** [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path). */
  var resourceUri: js.UndefOr[String] = js.undefined
}

object UserDefinedFunctionResource {
  @scala.inline
  def apply(inlineCode: String = null, resourceUri: String = null): UserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    if (inlineCode != null) __obj.updateDynamic("inlineCode")(inlineCode.asInstanceOf[js.Any])
    if (resourceUri != null) __obj.updateDynamic("resourceUri")(resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedFunctionResource]
  }
}

