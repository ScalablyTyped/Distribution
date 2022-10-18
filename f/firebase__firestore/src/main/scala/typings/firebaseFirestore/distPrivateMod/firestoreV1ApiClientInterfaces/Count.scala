package typings.firebaseFirestore.distPrivateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var upTo: js.UndefOr[Double] = js.undefined
}
object Count {
  
  inline def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setUpTo(value: Double): Self = StObject.set(x, "upTo", value.asInstanceOf[js.Any])
    
    inline def setUpToUndefined: Self = StObject.set(x, "upTo", js.undefined)
  }
}
