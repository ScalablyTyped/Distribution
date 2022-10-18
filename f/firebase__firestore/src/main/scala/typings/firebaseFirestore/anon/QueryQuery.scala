package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryQuery extends StObject {
  
  var query: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
  
  var readTime: js.UndefOr[TestSnapshotVersion] = js.undefined
  
  var resumeToken: js.UndefOr[String] = js.undefined
}
object QueryQuery {
  
  inline def apply(query: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query): QueryQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQuery]
  }
  
  extension [Self <: QueryQuery](x: Self) {
    
    inline def setQuery(value: typings.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: TestSnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
  }
}
