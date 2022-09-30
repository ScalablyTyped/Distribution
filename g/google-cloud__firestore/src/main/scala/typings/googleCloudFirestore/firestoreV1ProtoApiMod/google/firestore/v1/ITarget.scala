package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.Target.IDocumentsTarget
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1.Target.IQueryTarget
import typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Target. */
trait ITarget extends StObject {
  
  /** Target documents */
  var documents: js.UndefOr[IDocumentsTarget | Null] = js.undefined
  
  /** Target once */
  var once: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Target query */
  var query: js.UndefOr[IQueryTarget | Null] = js.undefined
  
  /** Target readTime */
  var readTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Target resumeToken */
  var resumeToken: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** Target targetId */
  var targetId: js.UndefOr[Double | Null] = js.undefined
}
object ITarget {
  
  inline def apply(): ITarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITarget]
  }
  
  extension [Self <: ITarget](x: Self) {
    
    inline def setDocuments(value: IDocumentsTarget): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsNull: Self = StObject.set(x, "documents", null)
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceNull: Self = StObject.set(x, "once", null)
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setQuery(value: IQueryTarget): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReadTime(value: ITimestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: js.typedarray.Uint8Array): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenNull: Self = StObject.set(x, "resumeToken", null)
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setTargetId(value: Double): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
