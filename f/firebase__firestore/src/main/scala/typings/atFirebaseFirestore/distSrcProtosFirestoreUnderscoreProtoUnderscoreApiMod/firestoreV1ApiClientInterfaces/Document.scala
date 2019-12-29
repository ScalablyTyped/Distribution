package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var createTime: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[ApiClientObjectMap[Value]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var updateTime: js.UndefOr[String] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    createTime: String = null,
    fields: ApiClientObjectMap[Value] = null,
    name: String = null,
    updateTime: String = null
  ): Document = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

