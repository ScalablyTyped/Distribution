package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distFirestoreSrcLocalTargetDataMod.TargetPurpose
import typings.firebaseFirestore.distFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpectedCount extends StObject {
  
  var expectedCount: js.UndefOr[Double] = js.undefined
  
  var query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query
  
  var readTime: js.UndefOr[TestSnapshotVersion] = js.undefined
  
  var resumeToken: js.UndefOr[String] = js.undefined
  
  var targetPurpose: js.UndefOr[TargetPurpose] = js.undefined
}
object ExpectedCount {
  
  inline def apply(query: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query): ExpectedCount = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectedCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpectedCount] (val x: Self) extends AnyVal {
    
    inline def setExpectedCount(value: Double): Self = StObject.set(x, "expectedCount", value.asInstanceOf[js.Any])
    
    inline def setExpectedCountUndefined: Self = StObject.set(x, "expectedCount", js.undefined)
    
    inline def setQuery(value: typings.firebaseFirestore.distFirestoreSrcCoreQueryMod.Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: TestSnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setTargetPurpose(value: TargetPurpose): Self = StObject.set(x, "targetPurpose", value.asInstanceOf[js.Any])
    
    inline def setTargetPurposeUndefined: Self = StObject.set(x, "targetPurpose", js.undefined)
  }
}
