package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListing extends StObject {
  
  /**
    * Full description of the app.
    */
  var fullDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Language localization code (a BCP-47 language tag; for example, "de-AT" for Austrian German).
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Short description of the app.
    */
  var shortDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Localized title of the app.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of a promotional YouTube video for the app.
    */
  var video: js.UndefOr[String | Null] = js.undefined
}
object SchemaListing {
  
  inline def apply(): SchemaListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListing]
  }
  
  extension [Self <: SchemaListing](x: Self) {
    
    inline def setFullDescription(value: String): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    inline def setFullDescriptionNull: Self = StObject.set(x, "fullDescription", null)
    
    inline def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionNull: Self = StObject.set(x, "shortDescription", null)
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoNull: Self = StObject.set(x, "video", null)
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
