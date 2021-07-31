package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeBucketPrivateOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var includeFiles: js.UndefOr[Boolean] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object MakeBucketPrivateOptions {
  
  @scala.inline
  def apply(): MakeBucketPrivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeBucketPrivateOptions]
  }
  
  @scala.inline
  implicit class MakeBucketPrivateOptionsMutableBuilder[Self <: MakeBucketPrivateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setIncludeFiles(value: Boolean): Self = StObject.set(x, "includeFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFilesUndefined: Self = StObject.set(x, "includeFiles", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
