package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostDataEntry extends StObject {
  
  var bytes: js.UndefOr[String] = js.undefined
}
object PostDataEntry {
  
  inline def apply(): PostDataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostDataEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostDataEntry] (val x: Self) extends AnyVal {
    
    inline def setBytes(value: String): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
  }
}
