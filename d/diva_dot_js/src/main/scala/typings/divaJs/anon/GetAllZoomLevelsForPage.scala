package typings.divaJs.anon

import typings.divaJs.interfacesMod.SourceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAllZoomLevelsForPage extends js.Object {
  var getAllZoomLevelsForPage: Double | js.Array[SourceProvider]
  var getBestZoomLevelForPage: Double | SourceProvider
}

object GetAllZoomLevelsForPage {
  @scala.inline
  def apply(
    getAllZoomLevelsForPage: Double | js.Array[SourceProvider],
    getBestZoomLevelForPage: Double | SourceProvider
  ): GetAllZoomLevelsForPage = {
    val __obj = js.Dynamic.literal(getAllZoomLevelsForPage = getAllZoomLevelsForPage.asInstanceOf[js.Any], getBestZoomLevelForPage = getBestZoomLevelForPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllZoomLevelsForPage]
  }
}

