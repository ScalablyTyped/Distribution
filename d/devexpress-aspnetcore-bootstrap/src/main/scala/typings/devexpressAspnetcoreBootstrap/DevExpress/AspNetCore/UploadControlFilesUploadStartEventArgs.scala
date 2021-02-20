package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadControlFilesUploadStartEventArgs extends EventArgs {
  
  val cancel: Boolean = js.native
}
object UploadControlFilesUploadStartEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, sender: Control): UploadControlFilesUploadStartEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlFilesUploadStartEventArgs]
  }
  
  @scala.inline
  implicit class UploadControlFilesUploadStartEventArgsMutableBuilder[Self <: UploadControlFilesUploadStartEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
