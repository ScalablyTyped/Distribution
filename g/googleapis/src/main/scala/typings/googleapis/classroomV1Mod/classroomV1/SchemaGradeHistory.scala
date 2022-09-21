package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGradeHistory extends StObject {
  
  /**
    * The teacher who made the grade change.
    */
  var actorUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of grade change at this time in the submission grade history.
    */
  var gradeChangeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the grade of the submission was changed.
    */
  var gradeTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The denominator of the grade at this time in the submission grade history.
    */
  var maxPoints: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The numerator of the grade at this time in the submission grade history.
    */
  var pointsEarned: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGradeHistory {
  
  inline def apply(): SchemaGradeHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGradeHistory]
  }
  
  extension [Self <: SchemaGradeHistory](x: Self) {
    
    inline def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
    
    inline def setActorUserIdNull: Self = StObject.set(x, "actorUserId", null)
    
    inline def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
    
    inline def setGradeChangeType(value: String): Self = StObject.set(x, "gradeChangeType", value.asInstanceOf[js.Any])
    
    inline def setGradeChangeTypeNull: Self = StObject.set(x, "gradeChangeType", null)
    
    inline def setGradeChangeTypeUndefined: Self = StObject.set(x, "gradeChangeType", js.undefined)
    
    inline def setGradeTimestamp(value: String): Self = StObject.set(x, "gradeTimestamp", value.asInstanceOf[js.Any])
    
    inline def setGradeTimestampNull: Self = StObject.set(x, "gradeTimestamp", null)
    
    inline def setGradeTimestampUndefined: Self = StObject.set(x, "gradeTimestamp", js.undefined)
    
    inline def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
    
    inline def setMaxPointsNull: Self = StObject.set(x, "maxPoints", null)
    
    inline def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
    
    inline def setPointsEarned(value: Double): Self = StObject.set(x, "pointsEarned", value.asInstanceOf[js.Any])
    
    inline def setPointsEarnedNull: Self = StObject.set(x, "pointsEarned", null)
    
    inline def setPointsEarnedUndefined: Self = StObject.set(x, "pointsEarned", js.undefined)
  }
}
