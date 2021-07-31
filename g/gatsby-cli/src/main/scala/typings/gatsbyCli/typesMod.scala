package typings.gatsbyCli

import org.scalablytyped.runtime.StringDictionary
import typings.gatsbyCli.anon.Duration
import typings.gatsbyCli.anon.End
import typings.gatsbyCli.anon.IdString
import typings.gatsbyCli.anon.StartTime
import typings.gatsbyCli.anon.Type
import typings.gatsbyCli.anon.Uuid
import typings.gatsbyCli.constantsMod.Actions.ActivityErrored
import typings.gatsbyCli.constantsMod.Actions.CancelActivity
import typings.gatsbyCli.constantsMod.Actions.EndActivity
import typings.gatsbyCli.constantsMod.Actions.Log
import typings.gatsbyCli.constantsMod.Actions.PendingActivity
import typings.gatsbyCli.constantsMod.Actions.SetLogs
import typings.gatsbyCli.constantsMod.Actions.SetStatus
import typings.gatsbyCli.constantsMod.Actions.StartActivity
import typings.gatsbyCli.constantsMod.Actions.UpdateActivity
import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.constantsMod.ActivityTypes
import typings.gatsbyCli.gatsbyCliStrings._empty
import typings.gatsbyCli.structuredErrorsTypesMod.IStructuredStackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.gatsbyCli.typesMod.ICreateLog
    - typings.gatsbyCli.typesMod.ISetStatus
    - typings.gatsbyCli.typesMod.IEndActivity
    - typings.gatsbyCli.typesMod.IPendingActivity
    - typings.gatsbyCli.typesMod.IStartActivity
    - typings.gatsbyCli.typesMod.ICancelActivity
    - typings.gatsbyCli.typesMod.IUpdateActivity
    - typings.gatsbyCli.typesMod.IActivityErrored
    - typings.gatsbyCli.typesMod.ISetLogs
  */
  trait ActionsUnion extends StObject
  object ActionsUnion {
    
    @scala.inline
    def IActivityErrored(payload: IdString, `type`: ActivityErrored): typings.gatsbyCli.typesMod.IActivityErrored = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyCli.typesMod.IActivityErrored]
    }
    
    @scala.inline
    def ICancelActivity(payload: Duration, `type`: CancelActivity): typings.gatsbyCli.typesMod.ICancelActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyCli.typesMod.ICancelActivity]
    }
    
    @scala.inline
    def ICreateLog(payload: ILog, `type`: Log): typings.gatsbyCli.typesMod.ICreateLog = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyCli.typesMod.ICreateLog]
    }
    
    @scala.inline
    def IEndActivity(payload: Type, `type`: EndActivity): typings.gatsbyCli.typesMod.IEndActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyCli.typesMod.IEndActivity]
    }
    
    @scala.inline
    def IPendingActivity(payload: StartTime, `type`: PendingActivity): typings.gatsbyCli.typesMod.IPendingActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyCli.typesMod.IPendingActivity]
    }
    
    @scala.inline
    def ISetLogs(payload: IGatsbyCLIState, `type`: SetLogs): typings.gatsbyCli.typesMod.ISetLogs = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyCli.typesMod.ISetLogs]
    }
    
    @scala.inline
    def ISetStatus(payload: ActivityStatuses | _empty, `type`: SetStatus): typings.gatsbyCli.typesMod.ISetStatus = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyCli.typesMod.ISetStatus]
    }
    
    @scala.inline
    def IStartActivity(payload: IActivity, `type`: StartActivity): typings.gatsbyCli.typesMod.IStartActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyCli.typesMod.IStartActivity]
    }
    
    @scala.inline
    def IUpdateActivity(payload: Uuid, `type`: UpdateActivity): typings.gatsbyCli.typesMod.IUpdateActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.gatsbyCli.typesMod.IUpdateActivity]
    }
  }
  
  trait IActivity extends StObject {
    
    var current: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var errored: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var startTime: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var status: ActivityStatuses
    
    var statusText: String
    
    var text: String
    
    var total: js.UndefOr[Double] = js.undefined
    
    var `type`: ActivityTypes
    
    var uuid: String
  }
  object IActivity {
    
    @scala.inline
    def apply(
      id: String,
      status: ActivityStatuses,
      statusText: String,
      text: String,
      `type`: ActivityTypes,
      uuid: String
    ): IActivity = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IActivity]
    }
    
    @scala.inline
    implicit class IActivityMutableBuilder[Self <: IActivity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setStatus(value: ActivityStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      @scala.inline
      def setType(value: ActivityTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait IActivityErrored
    extends StObject
       with ActionsUnion {
    
    var payload: IdString
    
    var `type`: ActivityErrored
  }
  object IActivityErrored {
    
    @scala.inline
    def apply(payload: IdString, `type`: ActivityErrored): IActivityErrored = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IActivityErrored]
    }
    
    @scala.inline
    implicit class IActivityErroredMutableBuilder[Self <: IActivityErrored] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: IdString): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: ActivityErrored): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICancelActivity
    extends StObject
       with ActionsUnion {
    
    var payload: Duration
    
    var `type`: CancelActivity
  }
  object ICancelActivity {
    
    @scala.inline
    def apply(payload: Duration, `type`: CancelActivity): ICancelActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICancelActivity]
    }
    
    @scala.inline
    implicit class ICancelActivityMutableBuilder[Self <: ICancelActivity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Duration): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CancelActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICreateLog
    extends StObject
       with ActionsUnion {
    
    var payload: ILog
    
    var `type`: Log
  }
  object ICreateLog {
    
    @scala.inline
    def apply(payload: ILog, `type`: Log): ICreateLog = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICreateLog]
    }
    
    @scala.inline
    implicit class ICreateLogMutableBuilder[Self <: ICreateLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: ILog): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IEndActivity
    extends StObject
       with ActionsUnion {
    
    var payload: Type
    
    var `type`: EndActivity
  }
  object IEndActivity {
    
    @scala.inline
    def apply(payload: Type, `type`: EndActivity): IEndActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEndActivity]
    }
    
    @scala.inline
    implicit class IEndActivityMutableBuilder[Self <: IEndActivity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Type): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: EndActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGatsbyCLIState extends StObject {
    
    var activities: StringDictionary[IActivity]
    
    var messages: js.Array[ILog]
    
    var status: ActivityStatuses | _empty
  }
  object IGatsbyCLIState {
    
    @scala.inline
    def apply(
      activities: StringDictionary[IActivity],
      messages: js.Array[ILog],
      status: ActivityStatuses | _empty
    ): IGatsbyCLIState = {
      val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGatsbyCLIState]
    }
    
    @scala.inline
    implicit class IGatsbyCLIStateMutableBuilder[Self <: IGatsbyCLIState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivities(value: StringDictionary[IActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: js.Array[ILog]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesVarargs(value: ILog*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: ActivityStatuses | _empty): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILog extends StObject {
    
    var activity_current: js.UndefOr[Double] = js.undefined
    
    var activity_total: js.UndefOr[Double] = js.undefined
    
    var activity_type: js.UndefOr[String] = js.undefined
    
    var activity_uuid: js.UndefOr[String] = js.undefined
    
    var category: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCategory * / any */ String
      ] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var docsUrl: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var level: String
    
    var location: js.UndefOr[End] = js.undefined
    
    var pluginName: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[js.Array[IStructuredStackFrame]] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var timestamp: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ILog {
    
    @scala.inline
    def apply(level: String, timestamp: String): ILog = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILog]
    }
    
    @scala.inline
    implicit class ILogMutableBuilder[Self <: ILog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivity_current(value: Double): Self = StObject.set(x, "activity_current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivity_currentUndefined: Self = StObject.set(x, "activity_current", js.undefined)
      
      @scala.inline
      def setActivity_total(value: Double): Self = StObject.set(x, "activity_total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivity_totalUndefined: Self = StObject.set(x, "activity_total", js.undefined)
      
      @scala.inline
      def setActivity_type(value: String): Self = StObject.set(x, "activity_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivity_typeUndefined: Self = StObject.set(x, "activity_type", js.undefined)
      
      @scala.inline
      def setActivity_uuid(value: String): Self = StObject.set(x, "activity_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivity_uuidUndefined: Self = StObject.set(x, "activity_uuid", js.undefined)
      
      @scala.inline
      def setCategory(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCategory * / any */ String
      ): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsUrlUndefined: Self = StObject.set(x, "docsUrl", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: End): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
      
      @scala.inline
      def setStack(value: js.Array[IStructuredStackFrame]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setStackVarargs(value: IStructuredStackFrame*): Self = StObject.set(x, "stack", js.Array(value :_*))
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IPendingActivity
    extends StObject
       with ActionsUnion {
    
    var payload: StartTime
    
    var `type`: PendingActivity
  }
  object IPendingActivity {
    
    @scala.inline
    def apply(payload: StartTime, `type`: PendingActivity): IPendingActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPendingActivity]
    }
    
    @scala.inline
    implicit class IPendingActivityMutableBuilder[Self <: IPendingActivity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: StartTime): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: PendingActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISetLogs
    extends StObject
       with ActionsUnion {
    
    var payload: IGatsbyCLIState
    
    var `type`: SetLogs
  }
  object ISetLogs {
    
    @scala.inline
    def apply(payload: IGatsbyCLIState, `type`: SetLogs): ISetLogs = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISetLogs]
    }
    
    @scala.inline
    implicit class ISetLogsMutableBuilder[Self <: ISetLogs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: IGatsbyCLIState): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: SetLogs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISetStatus
    extends StObject
       with ActionsUnion {
    
    var payload: ActivityStatuses | _empty
    
    var `type`: SetStatus
  }
  object ISetStatus {
    
    @scala.inline
    def apply(payload: ActivityStatuses | _empty, `type`: SetStatus): ISetStatus = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISetStatus]
    }
    
    @scala.inline
    implicit class ISetStatusMutableBuilder[Self <: ISetStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: ActivityStatuses | _empty): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: SetStatus): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStartActivity
    extends StObject
       with ActionsUnion {
    
    var payload: IActivity
    
    var `type`: StartActivity
  }
  object IStartActivity {
    
    @scala.inline
    def apply(payload: IActivity, `type`: StartActivity): IStartActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStartActivity]
    }
    
    @scala.inline
    implicit class IStartActivityMutableBuilder[Self <: IStartActivity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: IActivity): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: StartActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IUpdateActivity
    extends StObject
       with ActionsUnion {
    
    var payload: Uuid
    
    var `type`: UpdateActivity
  }
  object IUpdateActivity {
    
    @scala.inline
    def apply(payload: Uuid, `type`: UpdateActivity): IUpdateActivity = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUpdateActivity]
    }
    
    @scala.inline
    implicit class IUpdateActivityMutableBuilder[Self <: IUpdateActivity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Uuid): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: UpdateActivity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
