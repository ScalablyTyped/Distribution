package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Groups objects to create an object group. For example, groups PageElements
  * to create a Group on the same page as all the children.
  */
@js.native
trait Schema$GroupObjectsRequest extends js.Object {
  /**
    * The object IDs of the objects to group.  Only page elements can be
    * grouped. There should be at least two page elements on the same page that
    * are not already in another group. Some page elements, such as videos,
    * tables and placeholder shapes cannot be grouped.
    */
  var childrenObjectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A user-supplied object ID for the group to be created.  If you specify an
    * ID, it must be unique among all pages and page elements in the
    * presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may
    * include those as well as a hyphen or colon (matches regex
    * `[a-zA-Z0-9_-:]`). The length of the ID must not be less than 5 or
    * greater than 50.  If you don&#39;t specify an ID, a unique one is
    * generated.
    */
  var groupObjectId: js.UndefOr[String] = js.native
}

object Schema$GroupObjectsRequest {
  @scala.inline
  def apply(childrenObjectIds: js.Array[String] = null, groupObjectId: String = null): Schema$GroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    if (childrenObjectIds != null) __obj.updateDynamic("childrenObjectIds")(childrenObjectIds.asInstanceOf[js.Any])
    if (groupObjectId != null) __obj.updateDynamic("groupObjectId")(groupObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupObjectsRequest]
  }
}

