package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLitePackagesFirestoreTestUtilHelpersMod.TestSnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadTimeResumeToken extends StObject {
  
  var readTime: js.UndefOr[TestSnapshotVersion] = js.undefined
  
  var resumeToken: js.UndefOr[String] = js.undefined
}
object ReadTimeResumeToken {
  
  inline def apply(): ReadTimeResumeToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadTimeResumeToken]
  }
  
  extension [Self <: ReadTimeResumeToken](x: Self) {
    
    inline def setReadTime(value: TestSnapshotVersion): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setResumeToken(value: String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
  }
}
