package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSubmissionHistory extends StObject {
  
  /**
    * The grade history information of the submission, if present.
    */
  var gradeHistory: js.UndefOr[SchemaGradeHistory] = js.undefined
  
  /**
    * The state history information of the submission, if present.
    */
  var stateHistory: js.UndefOr[SchemaStateHistory] = js.undefined
}
object SchemaSubmissionHistory {
  
  inline def apply(): SchemaSubmissionHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubmissionHistory]
  }
  
  extension [Self <: SchemaSubmissionHistory](x: Self) {
    
    inline def setGradeHistory(value: SchemaGradeHistory): Self = StObject.set(x, "gradeHistory", value.asInstanceOf[js.Any])
    
    inline def setGradeHistoryUndefined: Self = StObject.set(x, "gradeHistory", js.undefined)
    
    inline def setStateHistory(value: SchemaStateHistory): Self = StObject.set(x, "stateHistory", value.asInstanceOf[js.Any])
    
    inline def setStateHistoryUndefined: Self = StObject.set(x, "stateHistory", js.undefined)
  }
}
