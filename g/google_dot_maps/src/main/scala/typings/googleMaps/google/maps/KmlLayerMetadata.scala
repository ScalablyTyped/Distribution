package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a single KML layer, in JSON format.
  */
trait KmlLayerMetadata extends StObject {
  
  /**
    * The layer&#39;s <code>&lt;atom:author&gt;</code>, extracted from the
    * layer markup.
    */
  var author: KmlAuthor | Null
  
  /**
    * The layer&#39;s <code>&lt;description&gt;</code>, extracted from the
    * layer markup.
    */
  var description: String
  
  /**
    * Whether the layer has any screen overlays.
    */
  var hasScreenOverlays: Boolean
  
  /**
    * The layer&#39;s <code>&lt;name&gt;</code>, extracted from the layer
    * markup.
    */
  var name: String
  
  /**
    * The layer&#39;s <code>&lt;Snippet&gt;</code>, extracted from the layer
    * markup
    */
  var snippet: String
}
object KmlLayerMetadata {
  
  inline def apply(description: String, hasScreenOverlays: Boolean, name: String, snippet: String): KmlLayerMetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], hasScreenOverlays = hasScreenOverlays.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], author = null)
    __obj.asInstanceOf[KmlLayerMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlLayerMetadata] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: KmlAuthor): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHasScreenOverlays(value: Boolean): Self = StObject.set(x, "hasScreenOverlays", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
