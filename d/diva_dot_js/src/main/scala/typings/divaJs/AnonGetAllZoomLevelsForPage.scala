package typings.divaJs

import typings.divaJs.interfacesMod.SourceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetAllZoomLevelsForPage extends js.Object {
  var getAllZoomLevelsForPage: Double | js.Array[SourceProvider]
  var getBestZoomLevelForPage: Double | SourceProvider
}

object AnonGetAllZoomLevelsForPage {
  @scala.inline
  def apply(
    getAllZoomLevelsForPage: Double | js.Array[SourceProvider],
    getBestZoomLevelForPage: Double | SourceProvider
  ): AnonGetAllZoomLevelsForPage = {
    val __obj = js.Dynamic.literal(getAllZoomLevelsForPage = getAllZoomLevelsForPage.asInstanceOf[js.Any], getBestZoomLevelForPage = getBestZoomLevelForPage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetAllZoomLevelsForPage]
  }
}

