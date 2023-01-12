package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceIdPayload extends StObject {
  
  var sourceId: Identifier
}
object SourceIdPayload {
  
  inline def apply(sourceId: Identifier): SourceIdPayload = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIdPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceIdPayload] (val x: Self) extends AnyVal {
    
    inline def setSourceId(value: Identifier): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
