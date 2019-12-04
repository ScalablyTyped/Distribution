package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectsDatabasesDocumentsApiClientAltEnum extends js.Object {
  var JSON: ProjectsDatabasesDocumentsApiClientAlt
  var MEDIA: ProjectsDatabasesDocumentsApiClientAlt
  var PROTO: ProjectsDatabasesDocumentsApiClientAlt
  def values(): js.Array[ProjectsDatabasesDocumentsApiClientAlt]
}

object IProjectsDatabasesDocumentsApiClientAltEnum {
  @scala.inline
  def apply(
    JSON: ProjectsDatabasesDocumentsApiClientAlt,
    MEDIA: ProjectsDatabasesDocumentsApiClientAlt,
    PROTO: ProjectsDatabasesDocumentsApiClientAlt,
    values: () => js.Array[ProjectsDatabasesDocumentsApiClientAlt]
  ): IProjectsDatabasesDocumentsApiClientAltEnum = {
    val __obj = js.Dynamic.literal(JSON = JSON.asInstanceOf[js.Any], MEDIA = MEDIA.asInstanceOf[js.Any], PROTO = PROTO.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[IProjectsDatabasesDocumentsApiClientAltEnum]
  }
}

