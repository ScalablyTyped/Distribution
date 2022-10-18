package typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregation extends StObject {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[Count] = js.undefined
}
object Aggregation {
  
  inline def apply(): Aggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregation]
  }
  
  extension [Self <: Aggregation](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
