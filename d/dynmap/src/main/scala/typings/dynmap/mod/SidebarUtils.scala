package typings.dynmap.mod

import typings.dynmap.anon.DownBtn
import typings.dynmap.mod.global.JQuery
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidebarUtils extends StObject {
  
  def createListSection(labelText: String): ReturnType[js.Function2[/* labelText */ String, /* content */ JQuery, DownBtn[JQuery]]]
  
  def createScrollButton(up: Boolean, target: JQuery): JQuery
  
  def createSection[Content](labelText: String, content: Content): DownBtn[Content]
}
object SidebarUtils {
  
  inline def apply(
    createListSection: String => ReturnType[js.Function2[/* labelText */ String, /* content */ JQuery, DownBtn[JQuery]]],
    createScrollButton: (Boolean, JQuery) => JQuery,
    createSection: (String, Any) => DownBtn[Any]
  ): SidebarUtils = {
    val __obj = js.Dynamic.literal(createListSection = js.Any.fromFunction1(createListSection), createScrollButton = js.Any.fromFunction2(createScrollButton), createSection = js.Any.fromFunction2(createSection))
    __obj.asInstanceOf[SidebarUtils]
  }
  
  extension [Self <: SidebarUtils](x: Self) {
    
    inline def setCreateListSection(
      value: String => ReturnType[js.Function2[/* labelText */ String, /* content */ JQuery, DownBtn[JQuery]]]
    ): Self = StObject.set(x, "createListSection", js.Any.fromFunction1(value))
    
    inline def setCreateScrollButton(value: (Boolean, JQuery) => JQuery): Self = StObject.set(x, "createScrollButton", js.Any.fromFunction2(value))
    
    inline def setCreateSection(value: (String, Any) => DownBtn[Any]): Self = StObject.set(x, "createSection", js.Any.fromFunction2(value))
  }
}
