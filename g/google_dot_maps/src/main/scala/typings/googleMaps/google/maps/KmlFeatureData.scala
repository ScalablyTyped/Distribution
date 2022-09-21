package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data for a single KML feature in JSON format, returned when a KML feature
  * is clicked. The data contained in this object mirrors that associated with
  * the feature in the KML or GeoRSS markup in which it is declared.
  */
trait KmlFeatureData extends StObject {
  
  /**
    * The feature&#39;s <code>&lt;atom:author&gt;</code>, extracted from the
    * layer markup (if specified).
    */
  var author: KmlAuthor | Null
  
  /**
    * The feature&#39;s <code>&lt;description&gt;</code>, extracted from the
    * layer markup.
    */
  var description: String
  
  /**
    * The feature&#39;s <code>&lt;id&gt;</code>, extracted from the layer
    * markup. If no <code>&lt;id&gt;</code> has been specified, a unique ID
    * will be generated for this feature.
    */
  var id: String
  
  /**
    * The feature&#39;s balloon styled text, if set.
    */
  var infoWindowHtml: String
  
  /**
    * The feature&#39;s <code>&lt;name&gt;</code>, extracted from the layer
    * markup.
    */
  var name: String
  
  /**
    * The feature&#39;s <code>&lt;Snippet&gt;</code>, extracted from the layer
    * markup.
    */
  var snippet: String
}
object KmlFeatureData {
  
  inline def apply(description: String, id: String, infoWindowHtml: String, name: String, snippet: String): KmlFeatureData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], infoWindowHtml = infoWindowHtml.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], author = null)
    __obj.asInstanceOf[KmlFeatureData]
  }
  
  extension [Self <: KmlFeatureData](x: Self) {
    
    inline def setAuthor(value: KmlAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInfoWindowHtml(value: String): Self = StObject.set(x, "infoWindowHtml", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
