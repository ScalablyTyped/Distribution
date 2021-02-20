package typings.divaJs.anon

import typings.divaJs.interfacesMod.SourceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAllZoomLevelsForPage extends StObject {
  
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
  implicit class GetAllZoomLevelsForPageMutableBuilder[Self <: GetAllZoomLevelsForPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAllZoomLevelsForPage(value: Double | js.Array[SourceProvider]): Self = StObject.set(x, "getAllZoomLevelsForPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllZoomLevelsForPageVarargs(value: SourceProvider*): Self = StObject.set(x, "getAllZoomLevelsForPage", js.Array(value :_*))
    
    @scala.inline
    def setGetBestZoomLevelForPage(value: Double | SourceProvider): Self = StObject.set(x, "getBestZoomLevelForPage", value.asInstanceOf[js.Any])
  }
}
