package typings.divaJs.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInfo extends StObject {
  
  var dimensions: Dimensions
  
  var group: PageGroup
  
  var groupOffset: Offset
  
  var index: Double
}
object PageInfo {
  
  @scala.inline
  def apply(dimensions: Dimensions, group: PageGroup, groupOffset: Offset, index: Double): PageInfo = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], groupOffset = groupOffset.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
  
  @scala.inline
  implicit class PageInfoMutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: PageGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOffset(value: Offset): Self = StObject.set(x, "groupOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
