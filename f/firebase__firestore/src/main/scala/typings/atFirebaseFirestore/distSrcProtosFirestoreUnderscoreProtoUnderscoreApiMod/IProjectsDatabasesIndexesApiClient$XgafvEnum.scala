package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectsDatabasesIndexesApiClient$XgafvEnum extends js.Object {
  var `1`: ProjectsDatabasesIndexesApiClient$Xgafv
  var `2`: ProjectsDatabasesIndexesApiClient$Xgafv
  def values(): js.Array[ProjectsDatabasesIndexesApiClient$Xgafv]
}

object IProjectsDatabasesIndexesApiClient$XgafvEnum {
  @scala.inline
  def apply(
    `1`: ProjectsDatabasesIndexesApiClient$Xgafv,
    `2`: ProjectsDatabasesIndexesApiClient$Xgafv,
    values: () => js.Array[ProjectsDatabasesIndexesApiClient$Xgafv]
  ): IProjectsDatabasesIndexesApiClient$XgafvEnum = {
    val __obj = js.Dynamic.literal(values = js.Any.fromFunction0(values))
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectsDatabasesIndexesApiClient$XgafvEnum]
  }
}

