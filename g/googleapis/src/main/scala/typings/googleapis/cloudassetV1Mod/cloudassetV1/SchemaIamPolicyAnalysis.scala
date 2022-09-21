package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIamPolicyAnalysis extends StObject {
  
  /**
    * The analysis query.
    */
  var analysisQuery: js.UndefOr[SchemaIamPolicyAnalysisQuery] = js.undefined
  
  /**
    * A list of IamPolicyAnalysisResult that matches the analysis query, or empty if no result is found.
    */
  var analysisResults: js.UndefOr[js.Array[SchemaIamPolicyAnalysisResult]] = js.undefined
  
  /**
    * Represents whether all entries in the analysis_results have been fully explored to answer the query.
    */
  var fullyExplored: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A list of non-critical errors happened during the query handling.
    */
  var nonCriticalErrors: js.UndefOr[js.Array[SchemaIamPolicyAnalysisState]] = js.undefined
}
object SchemaIamPolicyAnalysis {
  
  inline def apply(): SchemaIamPolicyAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamPolicyAnalysis]
  }
  
  extension [Self <: SchemaIamPolicyAnalysis](x: Self) {
    
    inline def setAnalysisQuery(value: SchemaIamPolicyAnalysisQuery): Self = StObject.set(x, "analysisQuery", value.asInstanceOf[js.Any])
    
    inline def setAnalysisQueryUndefined: Self = StObject.set(x, "analysisQuery", js.undefined)
    
    inline def setAnalysisResults(value: js.Array[SchemaIamPolicyAnalysisResult]): Self = StObject.set(x, "analysisResults", value.asInstanceOf[js.Any])
    
    inline def setAnalysisResultsUndefined: Self = StObject.set(x, "analysisResults", js.undefined)
    
    inline def setAnalysisResultsVarargs(value: SchemaIamPolicyAnalysisResult*): Self = StObject.set(x, "analysisResults", js.Array(value*))
    
    inline def setFullyExplored(value: Boolean): Self = StObject.set(x, "fullyExplored", value.asInstanceOf[js.Any])
    
    inline def setFullyExploredNull: Self = StObject.set(x, "fullyExplored", null)
    
    inline def setFullyExploredUndefined: Self = StObject.set(x, "fullyExplored", js.undefined)
    
    inline def setNonCriticalErrors(value: js.Array[SchemaIamPolicyAnalysisState]): Self = StObject.set(x, "nonCriticalErrors", value.asInstanceOf[js.Any])
    
    inline def setNonCriticalErrorsUndefined: Self = StObject.set(x, "nonCriticalErrors", js.undefined)
    
    inline def setNonCriticalErrorsVarargs(value: SchemaIamPolicyAnalysisState*): Self = StObject.set(x, "nonCriticalErrors", js.Array(value*))
  }
}
