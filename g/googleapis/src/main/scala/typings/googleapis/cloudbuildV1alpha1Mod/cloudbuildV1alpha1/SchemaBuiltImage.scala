package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuiltImage extends StObject {
  
  /**
    * Docker Registry 2.0 digest.
    */
  var digest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name used to push the container image to Google Container Registry, as presented to `docker push`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Stores timing information for pushing the specified image.
    */
  var pushTiming: js.UndefOr[SchemaTimeSpan] = js.undefined
}
object SchemaBuiltImage {
  
  inline def apply(): SchemaBuiltImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuiltImage]
  }
  
  extension [Self <: SchemaBuiltImage](x: Self) {
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestNull: Self = StObject.set(x, "digest", null)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPushTiming(value: SchemaTimeSpan): Self = StObject.set(x, "pushTiming", value.asInstanceOf[js.Any])
    
    inline def setPushTimingUndefined: Self = StObject.set(x, "pushTiming", js.undefined)
  }
}
