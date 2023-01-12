package typings.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbIndexEntry extends StObject {
  
  /** The encoded array index value for this entry. */
  var arrayValue: js.typedarray.Uint8Array
  
  /** The encoded directional value for equality and inequality filters. */
  var directionalValue: js.typedarray.Uint8Array
  
  /** The segments of the document key this entry points to. */
  var documentKey: js.Array[String]
  
  /** The index id for this entry. */
  var indexId: Double
  
  /**
    * The document key this entry points to. This entry is encoded by an ordered
    * encoder to match the key order of the index.
    */
  var orderedDocumentKey: js.typedarray.Uint8Array
  
  /** The user id for this entry. */
  var uid: String
}
object DbIndexEntry {
  
  inline def apply(
    arrayValue: js.typedarray.Uint8Array,
    directionalValue: js.typedarray.Uint8Array,
    documentKey: js.Array[String],
    indexId: Double,
    orderedDocumentKey: js.typedarray.Uint8Array,
    uid: String
  ): DbIndexEntry = {
    val __obj = js.Dynamic.literal(arrayValue = arrayValue.asInstanceOf[js.Any], directionalValue = directionalValue.asInstanceOf[js.Any], documentKey = documentKey.asInstanceOf[js.Any], indexId = indexId.asInstanceOf[js.Any], orderedDocumentKey = orderedDocumentKey.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbIndexEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DbIndexEntry] (val x: Self) extends AnyVal {
    
    inline def setArrayValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "arrayValue", value.asInstanceOf[js.Any])
    
    inline def setDirectionalValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "directionalValue", value.asInstanceOf[js.Any])
    
    inline def setDocumentKey(value: js.Array[String]): Self = StObject.set(x, "documentKey", value.asInstanceOf[js.Any])
    
    inline def setDocumentKeyVarargs(value: String*): Self = StObject.set(x, "documentKey", js.Array(value*))
    
    inline def setIndexId(value: Double): Self = StObject.set(x, "indexId", value.asInstanceOf[js.Any])
    
    inline def setOrderedDocumentKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "orderedDocumentKey", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
