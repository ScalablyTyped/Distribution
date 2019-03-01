package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedPlacementListBuilder[ExcludedPlacementList] extends AdWordsBuilder[ExcludedPlacementList] {
  def withName(name: java.lang.String): ExcludedPlacementListBuilder[ExcludedPlacementList]
}

object ExcludedPlacementListBuilder {
  @scala.inline
  def apply[ExcludedPlacementList](
    build: js.Function0[AdWordsOperation[ExcludedPlacementList]],
    withName: js.Function1[java.lang.String, ExcludedPlacementListBuilder[ExcludedPlacementList]]
  ): ExcludedPlacementListBuilder[ExcludedPlacementList] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("withName")(withName)
    __obj.asInstanceOf[ExcludedPlacementListBuilder[ExcludedPlacementList]]
  }
}

