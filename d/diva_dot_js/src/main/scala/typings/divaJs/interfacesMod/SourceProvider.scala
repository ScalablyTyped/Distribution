package typings.divaJs.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceProvider extends StObject {
  
  var cols: Double
  
  var rows: Double
  
  var titles: js.Array[typings.divaJs.anon.Dimensions]
  
  var zoomLevel: Double
}
object SourceProvider {
  
  inline def apply(cols: Double, rows: Double, titles: js.Array[typings.divaJs.anon.Dimensions], zoomLevel: Double): SourceProvider = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceProvider]
  }
  
  extension [Self <: SourceProvider](x: Self) {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setTitles(value: js.Array[typings.divaJs.anon.Dimensions]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    inline def setTitlesVarargs(value: typings.divaJs.anon.Dimensions*): Self = StObject.set(x, "titles", js.Array(value*))
    
    inline def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
  }
}
