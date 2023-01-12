package typings.exifReader

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exif extends StObject {
    
    /** Full EXIF data */
    var exif: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** GPS/location data about the image */
    var gps: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** Basic TIFF properties about the image */
    var image: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** Interoperability information */
    var interoperability: js.UndefOr[Record[String, Any]] = js.undefined
    
    /** Basic TIFF properties about the embedded thumbnail */
    var thumbnail: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object Exif {
    
    inline def apply(): Exif = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exif]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exif] (val x: Self) extends AnyVal {
      
      inline def setExif(value: Record[String, Any]): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
      
      inline def setExifUndefined: Self = StObject.set(x, "exif", js.undefined)
      
      inline def setGps(value: Record[String, Any]): Self = StObject.set(x, "gps", value.asInstanceOf[js.Any])
      
      inline def setGpsUndefined: Self = StObject.set(x, "gps", js.undefined)
      
      inline def setImage(value: Record[String, Any]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setInteroperability(value: Record[String, Any]): Self = StObject.set(x, "interoperability", value.asInstanceOf[js.Any])
      
      inline def setInteroperabilityUndefined: Self = StObject.set(x, "interoperability", js.undefined)
      
      inline def setThumbnail(value: Record[String, Any]): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
}
