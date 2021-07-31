package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An image built by the pipeline.
  */
trait SchemaBuiltImage extends StObject {
  
  /**
    * Docker Registry 2.0 digest.
    */
  var digest: js.UndefOr[String] = js.undefined
  
  /**
    * Name used to push the container image to Google Container Registry, as
    * presented to `docker push`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Stores timing information for pushing the specified image.
    */
  var pushTiming: js.UndefOr[SchemaTimeSpan] = js.undefined
}
object SchemaBuiltImage {
  
  @scala.inline
  def apply(): SchemaBuiltImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuiltImage]
  }
  
  @scala.inline
  implicit class SchemaBuiltImageMutableBuilder[Self <: SchemaBuiltImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPushTiming(value: SchemaTimeSpan): Self = StObject.set(x, "pushTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushTimingUndefined: Self = StObject.set(x, "pushTiming", js.undefined)
  }
}
