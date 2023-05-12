package typings.fhirKitClient.anon

import typings.fhirKitClient.mod.FhirResource
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundle[T /* <: String */] extends StObject {
  
  var bundle: FhirResource & TypeT[T]
  
  var options: js.UndefOr[RequestInit] = js.undefined
}
object Bundle {
  
  inline def apply[T /* <: String */](bundle: FhirResource & TypeT[T]): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bundle[?], T /* <: String */] (val x: Self & Bundle[T]) extends AnyVal {
    
    inline def setBundle(value: FhirResource & TypeT[T]): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RequestInit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
