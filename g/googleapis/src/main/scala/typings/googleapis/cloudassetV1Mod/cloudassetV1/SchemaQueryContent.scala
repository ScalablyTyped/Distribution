package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryContent extends StObject {
  
  /**
    * An IAM Policy Analysis query, which could be used in the AssetService.AnalyzeIamPolicy rpc or the AssetService.AnalyzeIamPolicyLongrunning rpc.
    */
  var iamPolicyAnalysisQuery: js.UndefOr[SchemaIamPolicyAnalysisQuery] = js.undefined
}
object SchemaQueryContent {
  
  inline def apply(): SchemaQueryContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryContent]
  }
  
  extension [Self <: SchemaQueryContent](x: Self) {
    
    inline def setIamPolicyAnalysisQuery(value: SchemaIamPolicyAnalysisQuery): Self = StObject.set(x, "iamPolicyAnalysisQuery", value.asInstanceOf[js.Any])
    
    inline def setIamPolicyAnalysisQueryUndefined: Self = StObject.set(x, "iamPolicyAnalysisQuery", js.undefined)
  }
}
