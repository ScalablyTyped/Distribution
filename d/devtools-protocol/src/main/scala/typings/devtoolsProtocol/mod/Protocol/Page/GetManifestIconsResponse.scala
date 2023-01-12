package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManifestIconsResponse extends StObject {
  
  var primaryIcon: js.UndefOr[String] = js.undefined
}
object GetManifestIconsResponse {
  
  inline def apply(): GetManifestIconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManifestIconsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetManifestIconsResponse] (val x: Self) extends AnyVal {
    
    inline def setPrimaryIcon(value: String): Self = StObject.set(x, "primaryIcon", value.asInstanceOf[js.Any])
    
    inline def setPrimaryIconUndefined: Self = StObject.set(x, "primaryIcon", js.undefined)
  }
}
