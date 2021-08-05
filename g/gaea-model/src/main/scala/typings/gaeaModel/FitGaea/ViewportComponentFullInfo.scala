package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportComponentFullInfo extends StObject {
  
  // 子元素列表 （包括非直接子集）
  var childs: StringDictionary[ViewportComponentInfo]
  
  // 组件信息
  var componentInfo: ViewportComponentInfo
  
  // 组件的 mapUniqueKey
  var mapUniqueKey: String
}
object ViewportComponentFullInfo {
  
  inline def apply(
    childs: StringDictionary[ViewportComponentInfo],
    componentInfo: ViewportComponentInfo,
    mapUniqueKey: String
  ): ViewportComponentFullInfo = {
    val __obj = js.Dynamic.literal(childs = childs.asInstanceOf[js.Any], componentInfo = componentInfo.asInstanceOf[js.Any], mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportComponentFullInfo]
  }
  
  extension [Self <: ViewportComponentFullInfo](x: Self) {
    
    inline def setChilds(value: StringDictionary[ViewportComponentInfo]): Self = StObject.set(x, "childs", value.asInstanceOf[js.Any])
    
    inline def setComponentInfo(value: ViewportComponentInfo): Self = StObject.set(x, "componentInfo", value.asInstanceOf[js.Any])
    
    inline def setMapUniqueKey(value: String): Self = StObject.set(x, "mapUniqueKey", value.asInstanceOf[js.Any])
  }
}
