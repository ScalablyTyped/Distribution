package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeBucketPublicOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var includeFiles: js.UndefOr[Boolean] = js.undefined
}
object MakeBucketPublicOptions {
  
  @scala.inline
  def apply(): MakeBucketPublicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeBucketPublicOptions]
  }
  
  @scala.inline
  implicit class MakeBucketPublicOptionsMutableBuilder[Self <: MakeBucketPublicOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setIncludeFiles(value: Boolean): Self = StObject.set(x, "includeFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFilesUndefined: Self = StObject.set(x, "includeFiles", js.undefined)
  }
}
