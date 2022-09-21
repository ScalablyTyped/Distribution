package typings.firebaseFirestore.srcLocalIndexeddbSchemaMod

import typings.firebaseFirestore.srcLocalEncodedResourcePathMod.EncodedResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbCollectionParent extends StObject {
  
  /**
    * The collectionId (e.g. 'messages')
    */
  var collectionId: String
  
  /**
    * The path to the parent (either a document location or an empty path for
    * a root-level collection).
    */
  var parent: EncodedResourcePath
}
object DbCollectionParent {
  
  inline def apply(collectionId: String, parent: EncodedResourcePath): DbCollectionParent = {
    val __obj = js.Dynamic.literal(collectionId = collectionId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbCollectionParent]
  }
  
  extension [Self <: DbCollectionParent](x: Self) {
    
    inline def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    inline def setParent(value: EncodedResourcePath): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
