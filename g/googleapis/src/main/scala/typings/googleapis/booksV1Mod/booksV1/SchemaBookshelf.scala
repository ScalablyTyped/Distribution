package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBookshelf extends StObject {
  
  /**
    * Whether this bookshelf is PUBLIC or PRIVATE.
    */
  var access: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Created time for this bookshelf (formatted UTC timestamp with millisecond resolution).
    */
  var created: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Description of this bookshelf.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Id of this bookshelf, only unique by user.
    */
  var id: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Resource type for bookshelf metadata.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of this bookshelf.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last modified time of this bookshelf (formatted UTC timestamp with millisecond resolution).
    */
  var updated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of volumes in this bookshelf.
    */
  var volumeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Last time a volume was added or removed from this bookshelf (formatted UTC timestamp with millisecond resolution).
    */
  var volumesLastUpdated: js.UndefOr[String | Null] = js.undefined
}
object SchemaBookshelf {
  
  inline def apply(): SchemaBookshelf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBookshelf]
  }
  
  extension [Self <: SchemaBookshelf](x: Self) {
    
    inline def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedNull: Self = StObject.set(x, "created", null)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setVolumeCount(value: Double): Self = StObject.set(x, "volumeCount", value.asInstanceOf[js.Any])
    
    inline def setVolumeCountNull: Self = StObject.set(x, "volumeCount", null)
    
    inline def setVolumeCountUndefined: Self = StObject.set(x, "volumeCount", js.undefined)
    
    inline def setVolumesLastUpdated(value: String): Self = StObject.set(x, "volumesLastUpdated", value.asInstanceOf[js.Any])
    
    inline def setVolumesLastUpdatedNull: Self = StObject.set(x, "volumesLastUpdated", null)
    
    inline def setVolumesLastUpdatedUndefined: Self = StObject.set(x, "volumesLastUpdated", js.undefined)
  }
}
