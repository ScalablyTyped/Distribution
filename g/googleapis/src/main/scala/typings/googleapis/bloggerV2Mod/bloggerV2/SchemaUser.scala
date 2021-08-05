package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.googleapis.anon.Country
import typings.googleapis.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUser extends StObject {
  
  /**
    * Profile summary information.
    */
  var about: js.UndefOr[String] = js.undefined
  
  /**
    * The container of blogs for this user.
    */
  var blogs: js.UndefOr[`1`] = js.undefined
  
  /**
    * The timestamp of when this profile was created, in seconds since epoch.
    */
  var created: js.UndefOr[String] = js.undefined
  
  /**
    * The display name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for this User.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of this entity. Always blogger#user
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * This user&#39;s locale
    */
  var locale: js.UndefOr[Country] = js.undefined
  
  /**
    * The API REST URL to fetch this resource from.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The user&#39;s profile page.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaUser {
  
  inline def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  extension [Self <: SchemaUser](x: Self) {
    
    inline def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
    
    inline def setBlogs(value: `1`): Self = StObject.set(x, "blogs", value.asInstanceOf[js.Any])
    
    inline def setBlogsUndefined: Self = StObject.set(x, "blogs", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocale(value: Country): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
