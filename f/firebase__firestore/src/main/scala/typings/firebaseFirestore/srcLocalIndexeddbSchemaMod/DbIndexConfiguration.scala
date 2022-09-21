package typings.firebaseFirestore.srcLocalIndexeddbSchemaMod

import typings.firebaseFirestore.srcModelFieldIndexMod.IndexKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbIndexConfiguration extends StObject {
  
  /** The collection group this index belongs to. */
  var collectionGroup: String
  
  /** The fields to index for this index. */
  var fields: js.Array[js.Tuple2[/* name */ String, /* kind */ IndexKind]]
  
  /**
    * The index id for this entry. Undefined for indexes that are not yet
    * persisted.
    */
  var indexId: js.UndefOr[Double] = js.undefined
}
object DbIndexConfiguration {
  
  inline def apply(collectionGroup: String, fields: js.Array[js.Tuple2[/* name */ String, /* kind */ IndexKind]]): DbIndexConfiguration = {
    val __obj = js.Dynamic.literal(collectionGroup = collectionGroup.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbIndexConfiguration]
  }
  
  extension [Self <: DbIndexConfiguration](x: Self) {
    
    inline def setCollectionGroup(value: String): Self = StObject.set(x, "collectionGroup", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[js.Tuple2[/* name */ String, /* kind */ IndexKind]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: (js.Tuple2[/* name */ String, /* kind */ IndexKind])*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setIndexId(value: Double): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    inline def setIndexIdUndefined: Self = StObject.set(x, "indexId", js.undefined)
  }
}
