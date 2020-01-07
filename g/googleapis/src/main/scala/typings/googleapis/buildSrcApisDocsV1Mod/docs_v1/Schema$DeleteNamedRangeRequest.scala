package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a NamedRange.
  */
@js.native
trait Schema$DeleteNamedRangeRequest extends js.Object {
  /**
    * The name of the range(s) to delete. All named ranges with the given name
    * will be deleted.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the named range to delete.
    */
  var namedRangeId: js.UndefOr[String] = js.native
}

object Schema$DeleteNamedRangeRequest {
  @scala.inline
  def apply(name: String = null, namedRangeId: String = null): Schema$DeleteNamedRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteNamedRangeRequest]
  }
}

