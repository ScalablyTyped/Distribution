package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multipart extends StObject {
  
  var multipart: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object Multipart {
  
  @scala.inline
  def apply(): Multipart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multipart]
  }
  
  @scala.inline
  implicit class MultipartMutableBuilder[Self <: Multipart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
