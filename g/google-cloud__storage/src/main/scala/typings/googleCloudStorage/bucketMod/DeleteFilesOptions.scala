package typings.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFilesOptions extends GetFilesOptions {
  
  var force: js.UndefOr[Boolean] = js.native
}
object DeleteFilesOptions {
  
  @scala.inline
  def apply(): DeleteFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFilesOptions]
  }
  
  @scala.inline
  implicit class DeleteFilesOptionsMutableBuilder[Self <: DeleteFilesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
