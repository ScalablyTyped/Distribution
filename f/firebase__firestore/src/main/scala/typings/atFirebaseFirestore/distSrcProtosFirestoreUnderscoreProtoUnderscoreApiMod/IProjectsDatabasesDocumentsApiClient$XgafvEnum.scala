package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProjectsDatabasesDocumentsApiClient$XgafvEnum extends js.Object {
  var `1`: ProjectsDatabasesDocumentsApiClient$Xgafv
  var `2`: ProjectsDatabasesDocumentsApiClient$Xgafv
  def values(): js.Array[ProjectsDatabasesDocumentsApiClient$Xgafv]
}

object IProjectsDatabasesDocumentsApiClient$XgafvEnum {
  @scala.inline
  def apply(
    `1`: ProjectsDatabasesDocumentsApiClient$Xgafv,
    `2`: ProjectsDatabasesDocumentsApiClient$Xgafv,
    values: () => js.Array[ProjectsDatabasesDocumentsApiClient$Xgafv]
  ): IProjectsDatabasesDocumentsApiClient$XgafvEnum = {
    val __obj = js.Dynamic.literal(values = js.Any.fromFunction0(values))
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectsDatabasesDocumentsApiClient$XgafvEnum]
  }
}

