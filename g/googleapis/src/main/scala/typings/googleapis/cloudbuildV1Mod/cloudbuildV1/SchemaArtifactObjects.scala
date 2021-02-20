package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Files in the workspace to upload to Cloud Storage upon successful
  * completion of all build steps.
  */
@js.native
trait SchemaArtifactObjects extends StObject {
  
  /**
    * Cloud Storage bucket and optional object path, in the form
    * &quot;gs://bucket/path/to/somewhere/&quot;. (see [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    * Files in the workspace matching any path pattern will be uploaded to
    * Cloud Storage with this location as a prefix.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Path globs used to match files in the build&#39;s workspace.
    */
  var paths: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. Stores timing information for pushing all artifact objects.
    */
  var timing: js.UndefOr[SchemaTimeSpan] = js.native
}
object SchemaArtifactObjects {
  
  @scala.inline
  def apply(): SchemaArtifactObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifactObjects]
  }
  
  @scala.inline
  implicit class SchemaArtifactObjectsMutableBuilder[Self <: SchemaArtifactObjects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    
    @scala.inline
    def setTiming(value: SchemaTimeSpan): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
  }
}
