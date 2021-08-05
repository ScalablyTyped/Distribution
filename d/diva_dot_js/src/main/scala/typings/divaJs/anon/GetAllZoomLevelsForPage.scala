package typings.divaJs.anon

import typings.divaJs.interfacesMod.SourceProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllZoomLevelsForPage extends StObject {
  
  var getAllZoomLevelsForPage: Double | js.Array[SourceProvider]
  
  var getBestZoomLevelForPage: Double | SourceProvider
}
object GetAllZoomLevelsForPage {
  
  inline def apply(
    getAllZoomLevelsForPage: Double | js.Array[SourceProvider],
    getBestZoomLevelForPage: Double | SourceProvider
  ): GetAllZoomLevelsForPage = {
    val __obj = js.Dynamic.literal(getAllZoomLevelsForPage = getAllZoomLevelsForPage.asInstanceOf[js.Any], getBestZoomLevelForPage = getBestZoomLevelForPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllZoomLevelsForPage]
  }
  
  extension [Self <: GetAllZoomLevelsForPage](x: Self) {
    
    inline def setGetAllZoomLevelsForPage(value: Double | js.Array[SourceProvider]): Self = StObject.set(x, "getAllZoomLevelsForPage", value.asInstanceOf[js.Any])
    
    inline def setGetAllZoomLevelsForPageVarargs(value: SourceProvider*): Self = StObject.set(x, "getAllZoomLevelsForPage", js.Array(value :_*))
    
    inline def setGetBestZoomLevelForPage(value: Double | SourceProvider): Self = StObject.set(x, "getBestZoomLevelForPage", value.asInstanceOf[js.Any])
  }
}
