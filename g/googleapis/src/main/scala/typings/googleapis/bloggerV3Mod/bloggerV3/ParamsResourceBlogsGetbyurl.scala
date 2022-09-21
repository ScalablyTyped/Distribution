package typings.googleapis.bloggerV3Mod.bloggerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBlogsGetbyurl
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceBlogsGetbyurl {
  
  inline def apply(): ParamsResourceBlogsGetbyurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBlogsGetbyurl]
  }
  
  extension [Self <: ParamsResourceBlogsGetbyurl](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
