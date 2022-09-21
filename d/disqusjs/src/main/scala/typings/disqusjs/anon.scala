package typings.disqusjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<disqusjs.disqusjs.DisqusJSConfig> */
  trait PartialDisqusJSConfig extends StObject {
    
    var admin: js.UndefOr[String] = js.undefined
    
    var adminLabel: js.UndefOr[String] = js.undefined
    
    var api: js.UndefOr[String] = js.undefined
    
    var apikey: js.UndefOr[String] = js.undefined
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var nesting: js.UndefOr[Double] = js.undefined
    
    var nocomment: js.UndefOr[String] = js.undefined
    
    var shortname: js.UndefOr[String] = js.undefined
    
    var siteName: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object PartialDisqusJSConfig {
    
    inline def apply(): PartialDisqusJSConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDisqusJSConfig]
    }
    
    extension [Self <: PartialDisqusJSConfig](x: Self) {
      
      inline def setAdmin(value: String): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      inline def setAdminLabel(value: String): Self = StObject.set(x, "adminLabel", value.asInstanceOf[js.Any])
      
      inline def setAdminLabelUndefined: Self = StObject.set(x, "adminLabel", js.undefined)
      
      inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      inline def setApikeyUndefined: Self = StObject.set(x, "apikey", js.undefined)
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setNesting(value: Double): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setNestingUndefined: Self = StObject.set(x, "nesting", js.undefined)
      
      inline def setNocomment(value: String): Self = StObject.set(x, "nocomment", value.asInstanceOf[js.Any])
      
      inline def setNocommentUndefined: Self = StObject.set(x, "nocomment", js.undefined)
      
      inline def setShortname(value: String): Self = StObject.set(x, "shortname", value.asInstanceOf[js.Any])
      
      inline def setShortnameUndefined: Self = StObject.set(x, "shortname", js.undefined)
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
