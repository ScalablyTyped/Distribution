package typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionSelector extends StObject {
  
  var allDescendants: js.UndefOr[Boolean] = js.undefined
  
  var collectionId: js.UndefOr[String] = js.undefined
}
object CollectionSelector {
  
  inline def apply(): CollectionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionSelector]
  }
  
  extension [Self <: CollectionSelector](x: Self) {
    
    inline def setAllDescendants(value: Boolean): Self = StObject.set(x, "allDescendants", value.asInstanceOf[js.Any])
    
    inline def setAllDescendantsUndefined: Self = StObject.set(x, "allDescendants", js.undefined)
    
    inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
  }
}
