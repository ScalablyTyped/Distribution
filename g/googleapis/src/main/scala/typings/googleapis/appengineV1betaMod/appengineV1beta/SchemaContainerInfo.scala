package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContainerInfo extends StObject {
  
  /**
    * URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: "gcr.io/my-project/image:tag" or "gcr.io/my-project/image@digest"
    */
  var image: js.UndefOr[String | Null] = js.undefined
}
object SchemaContainerInfo {
  
  inline def apply(): SchemaContainerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerInfo]
  }
  
  extension [Self <: SchemaContainerInfo](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
