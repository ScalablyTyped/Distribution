package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUserDefinedFunctionResource extends js.Object {
  /**
    * [Pick one] An inline resource that contains code for a user-defined
    * function (UDF). Providing a inline code resource is equivalent to
    * providing a URI for a file containing the same code.
    */
  var inlineCode: js.UndefOr[String] = js.native
  /**
    * [Pick one] A code resource to load from a Google Cloud Storage URI
    * (gs://bucket/path).
    */
  var resourceUri: js.UndefOr[String] = js.native
}

object SchemaUserDefinedFunctionResource {
  @scala.inline
  def apply(inlineCode: String = null, resourceUri: String = null): SchemaUserDefinedFunctionResource = {
    val __obj = js.Dynamic.literal()
    if (inlineCode != null) __obj.updateDynamic("inlineCode")(inlineCode.asInstanceOf[js.Any])
    if (resourceUri != null) __obj.updateDynamic("resourceUri")(resourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserDefinedFunctionResource]
  }
}

