package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffRemove extends ViewportComponentFullInfo {
  
  // 删除的位置
  var index: Double = js.native
  
  // 父级元素 mapKey
  var parentMapUniqueKey: String = js.native
}
object DiffRemove {
  
  @scala.inline
  def apply(
    childs: StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    index: Double,
    mapUniqueKey: String,
    parentMapUniqueKey: String
  ): DiffRemove = {
    val __obj = js.Dynamic.literal(childs = childs.asInstanceOf[js.Any], componentInfo = componentInfo.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any], parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffRemove]
  }
  
  @scala.inline
  implicit class DiffRemoveMutableBuilder[Self <: DiffRemove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentMapUniqueKey(value: String): Self = StObject.set(x, "parentMapUniqueKey", value.asInstanceOf[js.Any])
  }
}
