package typings.divaJs.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageGroup extends StObject {
  
  var dimensions: Dimensions
  
  var index: Double
  
  var padding: Offset
  
  var pages: js.Array[Double]
  
  var region: Region
}
object PageGroup {
  
  inline def apply(dimensions: Dimensions, index: Double, padding: Offset, pages: js.Array[Double], region: Region): PageGroup = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageGroup]
  }
  
  extension [Self <: PageGroup](x: Self) {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Offset): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPages(value: js.Array[Double]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: Double*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
