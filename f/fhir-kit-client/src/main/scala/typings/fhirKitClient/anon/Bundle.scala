package typings.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundle[T /* <: String */] extends StObject {
  
  var bundle: typings.fhir.fhir.Bundle & Type[T]
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
}
object Bundle {
  
  inline def apply[T /* <: String */](bundle: typings.fhir.fhir.Bundle & Type[T]): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
  
  extension [Self <: Bundle[?], T /* <: String */](x: Self & Bundle[T]) {
    
    inline def setBundle(value: typings.fhir.fhir.Bundle & Type[T]): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
