package typings.divaDotJs

import typings.divaDotJs.interfacesMod.SourceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetAllZoomLevelsForPage extends js.Object {
  var getAllZoomLevelsForPage: Double | js.Array[SourceProvider]
  var getBestZoomLevelForPage: Double | SourceProvider
}

object Anon_GetAllZoomLevelsForPage {
  @scala.inline
  def apply(
    getAllZoomLevelsForPage: Double | js.Array[SourceProvider],
    getBestZoomLevelForPage: Double | SourceProvider
  ): Anon_GetAllZoomLevelsForPage = {
    val __obj = js.Dynamic.literal(getAllZoomLevelsForPage = getAllZoomLevelsForPage.asInstanceOf[js.Any], getBestZoomLevelForPage = getBestZoomLevelForPage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GetAllZoomLevelsForPage]
  }
}

