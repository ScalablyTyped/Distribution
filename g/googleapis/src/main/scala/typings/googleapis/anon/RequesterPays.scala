package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequesterPays extends StObject {
  
  var requesterPays: js.UndefOr[Boolean] = js.undefined
}
object RequesterPays {
  
  inline def apply(): RequesterPays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequesterPays]
  }
  
  extension [Self <: RequesterPays](x: Self) {
    
    inline def setRequesterPays(value: Boolean): Self = StObject.set(x, "requesterPays", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysUndefined: Self = StObject.set(x, "requesterPays", js.undefined)
  }
}
