package typings.divaJs.anon

import typings.divaJs.interfacesMod.SourceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAllZoomLevelsForPage extends js.Object {
  
  var getAllZoomLevelsForPage: Double | js.Array[SourceProvider] = js.native
  
  var getBestZoomLevelForPage: Double | SourceProvider = js.native
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
  
  @scala.inline
  implicit class GetAllZoomLevelsForPageOps[Self <: GetAllZoomLevelsForPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAllZoomLevelsForPageVarargs(value: SourceProvider*): Self = this.set("getAllZoomLevelsForPage", js.Array(value :_*))
    
    @scala.inline
    def setGetAllZoomLevelsForPage(value: Double | js.Array[SourceProvider]): Self = this.set("getAllZoomLevelsForPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBestZoomLevelForPage(value: Double | SourceProvider): Self = this.set("getBestZoomLevelForPage", value.asInstanceOf[js.Any])
  }
}
