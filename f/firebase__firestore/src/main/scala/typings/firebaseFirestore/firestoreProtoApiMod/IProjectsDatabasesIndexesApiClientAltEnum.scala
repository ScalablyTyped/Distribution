package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectsDatabasesIndexesApiClientAltEnum extends js.Object {
  var JSON: ProjectsDatabasesIndexesApiClientAlt
  var MEDIA: ProjectsDatabasesIndexesApiClientAlt
  var PROTO: ProjectsDatabasesIndexesApiClientAlt
  def values(): js.Array[ProjectsDatabasesIndexesApiClientAlt]
}

object IProjectsDatabasesIndexesApiClientAltEnum {
  @scala.inline
  def apply(
    JSON: ProjectsDatabasesIndexesApiClientAlt,
    MEDIA: ProjectsDatabasesIndexesApiClientAlt,
    PROTO: ProjectsDatabasesIndexesApiClientAlt,
    values: () => js.Array[ProjectsDatabasesIndexesApiClientAlt]
  ): IProjectsDatabasesIndexesApiClientAltEnum = {
    val __obj = js.Dynamic.literal(JSON = JSON.asInstanceOf[js.Any], MEDIA = MEDIA.asInstanceOf[js.Any], PROTO = PROTO.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[IProjectsDatabasesIndexesApiClientAltEnum]
  }
}

