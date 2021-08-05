package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListing extends StObject {
  
  /**
    * Full description of the app; this may be up to 4000 characters in length.
    */
  var fullDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Language localization code (for example, &quot;de-AT&quot; for Austrian
    * German).
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Short description of the app (previously known as promo text); this may
    * be up to 80 characters in length.
    */
  var shortDescription: js.UndefOr[String] = js.undefined
  
  /**
    * App&#39;s localized title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * URL of a promotional YouTube video for the app.
    */
  var video: js.UndefOr[String] = js.undefined
}
object SchemaListing {
  
  inline def apply(): SchemaListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListing]
  }
  
  extension [Self <: SchemaListing](x: Self) {
    
    inline def setFullDescription(value: String): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    inline def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
