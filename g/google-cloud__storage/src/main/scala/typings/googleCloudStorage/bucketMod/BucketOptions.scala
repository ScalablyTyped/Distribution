package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object BucketOptions {
  
  @scala.inline
  def apply(): BucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketOptions]
  }
  
  @scala.inline
  implicit class BucketOptionsMutableBuilder[Self <: BucketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
