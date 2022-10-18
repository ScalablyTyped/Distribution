package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLiteFirestoreSrcModelFieldIndexMod.IndexKind
import typings.firebaseFirestore.distLiteFirestoreSrcModelFieldIndexMod.IndexOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var fields: js.UndefOr[js.Array[js.Tuple2[/* field */ String, /* kind */ IndexKind]]] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[IndexOffset] = js.undefined
  
  var sequenceNumber: js.UndefOr[Double] = js.undefined
}
object Id {
  
  inline def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setFields(value: js.Array[js.Tuple2[/* field */ String, /* kind */ IndexKind]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: (js.Tuple2[/* field */ String, /* kind */ IndexKind])*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOffset(value: IndexOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
  }
}
