package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of object IDs.
  */
@js.native
trait Schema$ObjectReferences extends js.Object {
  /**
    * The object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ObjectReferences {
  @scala.inline
  def apply(objectIds: js.Array[String] = null): Schema$ObjectReferences = {
    val __obj = js.Dynamic.literal()
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ObjectReferences]
  }
}

