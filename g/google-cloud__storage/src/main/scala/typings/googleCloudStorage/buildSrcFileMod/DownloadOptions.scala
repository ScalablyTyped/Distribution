package typings.googleCloudStorage.buildSrcFileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadOptions
  extends StObject
     with CreateReadStreamOptions {
  
  var destination: js.UndefOr[String] = js.undefined
}
object DownloadOptions {
  
  inline def apply(): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
