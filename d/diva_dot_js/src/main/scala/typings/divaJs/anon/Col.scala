package typings.divaJs.anon

import typings.divaJs.interfacesMod.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Col extends StObject {
  
  var col: Double = js.native
  
  var dimensions: typings.divaJs.interfacesMod.Dimensions = js.native
  
  var offset: Offset = js.native
  
  var row: Double = js.native
  
  var url: String = js.native
}
object Col {
  
  @scala.inline
  def apply(
    col: Double,
    dimensions: typings.divaJs.interfacesMod.Dimensions,
    offset: Offset,
    row: Double,
    url: String
  ): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
  
  @scala.inline
  implicit class ColMutableBuilder[Self <: Col] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: typings.divaJs.interfacesMod.Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
