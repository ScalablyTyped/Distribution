package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the object modified by the event.
  */
trait SchemaTarget extends StObject {
  
  /**
    * The ID of the target. For example, in Google Drive, this is the file or
    * folder ID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The MIME type of the target.
    */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the target. For example, in Google Drive, this is the title
    * of the file.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaTarget {
  
  inline def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  
  extension [Self <: SchemaTarget](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
