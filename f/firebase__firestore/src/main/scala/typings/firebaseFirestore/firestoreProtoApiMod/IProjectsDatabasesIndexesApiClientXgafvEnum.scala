package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectsDatabasesIndexesApiClientXgafvEnum extends js.Object {
  var `1`: ProjectsDatabasesIndexesApiClientXgafv
  var `2`: ProjectsDatabasesIndexesApiClientXgafv
  def values(): js.Array[ProjectsDatabasesIndexesApiClientXgafv]
}

object IProjectsDatabasesIndexesApiClientXgafvEnum {
  @scala.inline
  def apply(
    `1`: ProjectsDatabasesIndexesApiClientXgafv,
    `2`: ProjectsDatabasesIndexesApiClientXgafv,
    values: () => js.Array[ProjectsDatabasesIndexesApiClientXgafv]
  ): IProjectsDatabasesIndexesApiClientXgafvEnum = {
    val __obj = js.Dynamic.literal(values = js.Any.fromFunction0(values))
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectsDatabasesIndexesApiClientXgafvEnum]
  }
}

