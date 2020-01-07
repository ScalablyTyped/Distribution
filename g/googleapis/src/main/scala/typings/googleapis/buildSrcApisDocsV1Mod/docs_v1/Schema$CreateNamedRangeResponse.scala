package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a named range.
  */
@js.native
trait Schema$CreateNamedRangeResponse extends js.Object {
  /**
    * The ID of the created named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}

object Schema$CreateNamedRangeResponse {
  @scala.inline
  def apply(namedRangeId: String = null): Schema$CreateNamedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateNamedRangeResponse]
  }
}

