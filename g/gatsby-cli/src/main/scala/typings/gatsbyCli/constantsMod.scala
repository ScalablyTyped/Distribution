package typings.gatsbyCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @js.native
  sealed trait Actions extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "Actions")
  @js.native
  object Actions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Actions & String] = js.native
    
    @js.native
    sealed trait ActivityErrored
      extends StObject
         with Actions
    /* "ACTIVITY_ERRORED" */ val ActivityErrored: typings.gatsbyCli.constantsMod.Actions.ActivityErrored & String = js.native
    
    @js.native
    sealed trait CancelActivity
      extends StObject
         with Actions
    /* "ACTIVITY_CANCEL" */ val CancelActivity: typings.gatsbyCli.constantsMod.Actions.CancelActivity & String = js.native
    
    @js.native
    sealed trait EndActivity
      extends StObject
         with Actions
    /* "ACTIVITY_END" */ val EndActivity: typings.gatsbyCli.constantsMod.Actions.EndActivity & String = js.native
    
    @js.native
    sealed trait Log
      extends StObject
         with Actions
    /* "LOG" */ val Log: typings.gatsbyCli.constantsMod.Actions.Log & String = js.native
    
    @js.native
    sealed trait LogAction
      extends StObject
         with Actions
    /* "LOG_ACTION" */ val LogAction: typings.gatsbyCli.constantsMod.Actions.LogAction & String = js.native
    
    @js.native
    sealed trait PendingActivity
      extends StObject
         with Actions
    /* "ACTIVITY_PENDING" */ val PendingActivity: typings.gatsbyCli.constantsMod.Actions.PendingActivity & String = js.native
    
    @js.native
    sealed trait SetLogs
      extends StObject
         with Actions
    /* "SET_LOGS" */ val SetLogs: typings.gatsbyCli.constantsMod.Actions.SetLogs & String = js.native
    
    @js.native
    sealed trait SetStatus
      extends StObject
         with Actions
    /* "SET_STATUS" */ val SetStatus: typings.gatsbyCli.constantsMod.Actions.SetStatus & String = js.native
    
    @js.native
    sealed trait StartActivity
      extends StObject
         with Actions
    /* "ACTIVITY_START" */ val StartActivity: typings.gatsbyCli.constantsMod.Actions.StartActivity & String = js.native
    
    @js.native
    sealed trait UpdateActivity
      extends StObject
         with Actions
    /* "ACTIVITY_UPDATE" */ val UpdateActivity: typings.gatsbyCli.constantsMod.Actions.UpdateActivity & String = js.native
  }
  
  @js.native
  sealed trait ActivityLogLevels extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "ActivityLogLevels")
  @js.native
  object ActivityLogLevels extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActivityLogLevels & String] = js.native
    
    @js.native
    sealed trait Failed
      extends StObject
         with ActivityLogLevels
    /* "ACTIVITY_FAILED" */ val Failed: typings.gatsbyCli.constantsMod.ActivityLogLevels.Failed & String = js.native
    
    @js.native
    sealed trait Interrupted
      extends StObject
         with ActivityLogLevels
    /* "ACTIVITY_INTERRUPTED" */ val Interrupted: typings.gatsbyCli.constantsMod.ActivityLogLevels.Interrupted & String = js.native
    
    @js.native
    sealed trait Success
      extends StObject
         with ActivityLogLevels
    /* "ACTIVITY_SUCCESS" */ val Success: typings.gatsbyCli.constantsMod.ActivityLogLevels.Success & String = js.native
  }
  
  @js.native
  sealed trait ActivityStatuses extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "ActivityStatuses")
  @js.native
  object ActivityStatuses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActivityStatuses & String] = js.native
    
    @js.native
    sealed trait Cancelled
      extends StObject
         with ActivityStatuses
    /* "CANCELLED" */ val Cancelled: typings.gatsbyCli.constantsMod.ActivityStatuses.Cancelled & String = js.native
    
    @js.native
    sealed trait Failed
      extends StObject
         with ActivityStatuses
    /* "FAILED" */ val Failed: typings.gatsbyCli.constantsMod.ActivityStatuses.Failed & String = js.native
    
    @js.native
    sealed trait InProgress
      extends StObject
         with ActivityStatuses
    /* "IN_PROGRESS" */ val InProgress: typings.gatsbyCli.constantsMod.ActivityStatuses.InProgress & String = js.native
    
    @js.native
    sealed trait Interrupted
      extends StObject
         with ActivityStatuses
    /* "INTERRUPTED" */ val Interrupted: typings.gatsbyCli.constantsMod.ActivityStatuses.Interrupted & String = js.native
    
    @js.native
    sealed trait NotStarted
      extends StObject
         with ActivityStatuses
    /* "NOT_STARTED" */ val NotStarted: typings.gatsbyCli.constantsMod.ActivityStatuses.NotStarted & String = js.native
    
    @js.native
    sealed trait Success
      extends StObject
         with ActivityStatuses
    /* "SUCCESS" */ val Success: typings.gatsbyCli.constantsMod.ActivityStatuses.Success & String = js.native
  }
  
  @js.native
  sealed trait ActivityTypes extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "ActivityTypes")
  @js.native
  object ActivityTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ActivityTypes & String] = js.native
    
    @js.native
    sealed trait Hidden
      extends StObject
         with ActivityTypes
    /* "hidden" */ val Hidden: typings.gatsbyCli.constantsMod.ActivityTypes.Hidden & String = js.native
    
    @js.native
    sealed trait Pending
      extends StObject
         with ActivityTypes
    /* "pending" */ val Pending: typings.gatsbyCli.constantsMod.ActivityTypes.Pending & String = js.native
    
    @js.native
    sealed trait Progress
      extends StObject
         with ActivityTypes
    /* "progress" */ val Progress: typings.gatsbyCli.constantsMod.ActivityTypes.Progress & String = js.native
    
    @js.native
    sealed trait Spinner
      extends StObject
         with ActivityTypes
    /* "spinner" */ val Spinner: typings.gatsbyCli.constantsMod.ActivityTypes.Spinner & String = js.native
  }
  
  @js.native
  sealed trait LogLevels extends StObject
  @JSImport("gatsby-cli/lib/reporter/constants", "LogLevels")
  @js.native
  object LogLevels extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogLevels & String] = js.native
    
    @js.native
    sealed trait Debug
      extends StObject
         with LogLevels
    /* "DEBUG" */ val Debug: typings.gatsbyCli.constantsMod.LogLevels.Debug & String = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with LogLevels
    /* "ERROR" */ val Error: typings.gatsbyCli.constantsMod.LogLevels.Error & String = js.native
    
    @js.native
    sealed trait Info
      extends StObject
         with LogLevels
    /* "INFO" */ val Info: typings.gatsbyCli.constantsMod.LogLevels.Info & String = js.native
    
    @js.native
    sealed trait Log
      extends StObject
         with LogLevels
    /* "LOG" */ val Log: typings.gatsbyCli.constantsMod.LogLevels.Log & String = js.native
    
    @js.native
    sealed trait Success
      extends StObject
         with LogLevels
    /* "SUCCESS" */ val Success: typings.gatsbyCli.constantsMod.LogLevels.Success & String = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with LogLevels
    /* "WARNING" */ val Warning: typings.gatsbyCli.constantsMod.LogLevels.Warning & String = js.native
  }
}
