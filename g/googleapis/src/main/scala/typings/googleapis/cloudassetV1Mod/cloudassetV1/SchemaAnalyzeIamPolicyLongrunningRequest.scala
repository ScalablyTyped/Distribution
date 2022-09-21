package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnalyzeIamPolicyLongrunningRequest extends StObject {
  
  /**
    * Required. The request query.
    */
  var analysisQuery: js.UndefOr[SchemaIamPolicyAnalysisQuery] = js.undefined
  
  /**
    * Required. Output configuration indicating where the results will be output to.
    */
  var outputConfig: js.UndefOr[SchemaIamPolicyAnalysisOutputConfig] = js.undefined
  
  /**
    * Optional. The name of a saved query, which must be in the format of: * projects/project_number/savedQueries/saved_query_id * folders/folder_number/savedQueries/saved_query_id * organizations/organization_number/savedQueries/saved_query_id If both `analysis_query` and `saved_analysis_query` are provided, they will be merged together with the `saved_analysis_query` as base and the `analysis_query` as overrides. For more details of the merge behavior, please refer to the [MergeFrom](https://developers.google.com/protocol-buffers/docs/reference/cpp/google.protobuf.message#Message.MergeFrom.details) doc. Note that you cannot override primitive fields with default value, such as 0 or empty string, etc., because we use proto3, which doesn't support field presence yet.
    */
  var savedAnalysisQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaAnalyzeIamPolicyLongrunningRequest {
  
  inline def apply(): SchemaAnalyzeIamPolicyLongrunningRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyzeIamPolicyLongrunningRequest]
  }
  
  extension [Self <: SchemaAnalyzeIamPolicyLongrunningRequest](x: Self) {
    
    inline def setAnalysisQuery(value: SchemaIamPolicyAnalysisQuery): Self = StObject.set(x, "analysisQuery", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryUndefined: Self = StObject.set(x, "analysisQuery", js.undefined)
    
    inline def setOutputConfig(value: SchemaIamPolicyAnalysisOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setSavedAnalysisQuery(value: String): Self = StObject.set(x, "savedAnalysisQuery", value.asInstanceOf[js.Any])
    
    inline def setSavedAnalysisQueryNull: Self = StObject.set(x, "savedAnalysisQuery", null)
    
    inline def setSavedAnalysisQueryUndefined: Self = StObject.set(x, "savedAnalysisQuery", js.undefined)
  }
}
