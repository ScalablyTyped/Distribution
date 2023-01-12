package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedExternalId extends StObject {
  
  var needExternalId: Boolean
}
object NeedExternalId {
  
  inline def apply(needExternalId: Boolean): NeedExternalId = {
    val __obj = js.Dynamic.literal(needExternalId = needExternalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeedExternalId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NeedExternalId] (val x: Self) extends AnyVal {
    
    inline def setNeedExternalId(value: Boolean): Self = StObject.set(x, "needExternalId", value.asInstanceOf[js.Any])
  }
}
