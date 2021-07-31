package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The history of each state this submission has been in.
  */
trait SchemaStateHistory extends StObject {
  
  /**
    * The teacher or student who made the change
    */
  var actorUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The workflow pipeline stage.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * When the submission entered this state.
    */
  var stateTimestamp: js.UndefOr[String] = js.undefined
}
object SchemaStateHistory {
  
  @scala.inline
  def apply(): SchemaStateHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateHistory]
  }
  
  @scala.inline
  implicit class SchemaStateHistoryMutableBuilder[Self <: SchemaStateHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateTimestamp(value: String): Self = StObject.set(x, "stateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateTimestampUndefined: Self = StObject.set(x, "stateTimestamp", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
