package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveOptions
  extends StObject
     with CreateWriteStreamOptions {
  
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.undefined
}
object SaveOptions {
  
  @scala.inline
  def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit class SaveOptionsMutableBuilder[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnUploadProgress(value: /* progressEvent */ js.Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
  }
}
