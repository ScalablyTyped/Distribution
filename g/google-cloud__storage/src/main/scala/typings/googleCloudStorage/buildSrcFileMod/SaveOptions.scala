package typings.googleCloudStorage.buildSrcFileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveOptions
  extends StObject
     with CreateWriteStreamOptions {
  
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ Any, Unit]] = js.undefined
}
object SaveOptions {
  
  inline def apply(): SaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveOptions] (val x: Self) extends AnyVal {
    
    inline def setOnUploadProgress(value: /* progressEvent */ Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
  }
}
