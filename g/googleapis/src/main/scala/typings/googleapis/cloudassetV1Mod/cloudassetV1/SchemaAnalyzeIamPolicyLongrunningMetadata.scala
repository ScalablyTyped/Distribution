package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzeIamPolicyLongrunningMetadata extends StObject {
  
  /**
    * Output only. The time the operation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnalyzeIamPolicyLongrunningMetadata {
  
  inline def apply(): SchemaAnalyzeIamPolicyLongrunningMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeIamPolicyLongrunningMetadata]
  }
  
  extension [Self <: SchemaAnalyzeIamPolicyLongrunningMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
  }
}
