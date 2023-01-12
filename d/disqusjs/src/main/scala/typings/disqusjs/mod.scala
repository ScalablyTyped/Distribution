package typings.disqusjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.disqusjs.anon.PartialDisqusJSConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("disqusjs", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DisqusJS = js.native
  
  @js.native
  trait DisqusJS
    extends StObject
       with Instantiable0[js.Object]
       with Instantiable1[/* config */ PartialDisqusJSConfig, js.Object]
  
  trait DisqusJSConfig extends StObject {
    
    /**
      * - The disqus forum admin username
      */
    var admin: String
    
    /**
      * - The disqus moderator badge text
      */
    var adminLabel: String
    
    /**
      * - Where to get data
      */
    var api: String
    
    /**
      * - The apikey used to request Disqus API
      */
    var apikey: String
    
    /**
      * - The identifier of the page
      */
    var identifier: String
    
    /**
      * - The max nesting level of Disqus comment
      */
    var nesting: Double
    
    /**
      * - The msg when there is no comment
      */
    var nocomment: String
    
    /**
      * - The disqus shortname
      */
    var shortname: String
    
    /**
      * - The Forum Name
      */
    var siteName: String
    
    /**
      * - The title of the page
      */
    var title: String
    
    /**
      * - The url of the page
      */
    var url: String
  }
  object DisqusJSConfig {
    
    inline def apply(
      admin: String,
      adminLabel: String,
      api: String,
      apikey: String,
      identifier: String,
      nesting: Double,
      nocomment: String,
      shortname: String,
      siteName: String,
      title: String,
      url: String
    ): DisqusJSConfig = {
      val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], adminLabel = adminLabel.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], apikey = apikey.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], nesting = nesting.asInstanceOf[js.Any], nocomment = nocomment.asInstanceOf[js.Any], shortname = shortname.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisqusJSConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisqusJSConfig] (val x: Self) extends AnyVal {
      
      inline def setAdmin(value: String): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      inline def setAdminLabel(value: String): Self = StObject.set(x, "adminLabel", value.asInstanceOf[js.Any])
      
      inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setNesting(value: Double): Self = StObject.set(x, "nesting", value.asInstanceOf[js.Any])
      
      inline def setNocomment(value: String): Self = StObject.set(x, "nocomment", value.asInstanceOf[js.Any])
      
      inline def setShortname(value: String): Self = StObject.set(x, "shortname", value.asInstanceOf[js.Any])
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & DisqusJS
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & DisqusJS = ^
}
