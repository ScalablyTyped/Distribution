package typings.firebaseFirestore.srcLocalIndexeddbSchemaMod

import typings.firebaseFirestore.srcCoreTypesMod.ListenSequenceNumber
import typings.firebaseFirestore.srcCoreTypesMod.TargetId
import typings.firebaseFirestore.srcLocalEncodedResourcePathMod.EncodedResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbTargetDocument extends StObject {
  
  /**
    * The path to the document, as encoded in the key.
    */
  var path: EncodedResourcePath
  
  /**
    * If this is a sentinel row, this should be the sequence number of the last
    * time the document specified by `path` was used. Otherwise, it should be
    * `undefined`.
    */
  var sequenceNumber: js.UndefOr[ListenSequenceNumber] = js.undefined
  
  /**
    * The targetId identifying a target or 0 for a sentinel row.
    */
  var targetId: TargetId
}
object DbTargetDocument {
  
  inline def apply(path: EncodedResourcePath, targetId: TargetId): DbTargetDocument = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbTargetDocument]
  }
  
  extension [Self <: DbTargetDocument](x: Self) {
    
    inline def setPath(value: EncodedResourcePath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumber(value: ListenSequenceNumber): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
