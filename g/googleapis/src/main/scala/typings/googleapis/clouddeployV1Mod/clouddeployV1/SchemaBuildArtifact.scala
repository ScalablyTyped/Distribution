package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildArtifact extends StObject {
  
  /**
    * Image name in Skaffold configuration.
    */
  var image: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Image tag to use. This will generally be the full path to an image, such as "gcr.io/my-project/busybox:1.2.3" or "gcr.io/my-project/busybox@sha256:abc123".
    */
  var tag: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildArtifact {
  
  inline def apply(): SchemaBuildArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildArtifact]
  }
  
  extension [Self <: SchemaBuildArtifact](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
