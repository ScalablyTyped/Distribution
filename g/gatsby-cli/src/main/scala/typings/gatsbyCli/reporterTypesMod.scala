package typings.gatsbyCli

import typings.gatsbyCli.anon.Activitycurrent
import typings.gatsbyCli.anon.Args
import typings.gatsbyCli.anon.ArgsName
import typings.gatsbyCli.anon.ArgsParameters
import typings.gatsbyCli.anon.ArgsParametersName
import typings.gatsbyCli.anon.Current
import typings.gatsbyCli.anon.Dictid
import typings.gatsbyCli.anon.Id
import typings.gatsbyCli.anon.IdStatusText
import typings.gatsbyCli.anon.IdString
import typings.gatsbyCli.anon.Increment
import typings.gatsbyCli.anon.Name
import typings.gatsbyCli.anon.Status
import typings.gatsbyCli.anon.StatusText
import typings.gatsbyCli.anon.Total
import typings.gatsbyCli.anon.`0`
import typings.gatsbyCli.anon.`1`
import typings.gatsbyCli.anon.`2`
import typings.gatsbyCli.anon.`3`
import typings.gatsbyCli.anon.`4`
import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.gatsbyCliStrings.LOG_INTENT
import typings.gatsbyCli.gatsbyCliStrings._empty
import typings.gatsbyCli.typesMod.IActivityErrored
import typings.gatsbyCli.typesMod.ICancelActivity
import typings.gatsbyCli.typesMod.ICreateLog
import typings.gatsbyCli.typesMod.IEndActivity
import typings.gatsbyCli.typesMod.IPendingActivity
import typings.gatsbyCli.typesMod.IRenderPageTree
import typings.gatsbyCli.typesMod.ISetStatus
import typings.gatsbyCli.typesMod.IStartActivity
import typings.gatsbyCli.typesMod.IUpdateActivity
import typings.redux.mod.Dispatch
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterTypesMod {
  
  object ActionCreators {
    
    @JSImport("gatsby-cli/lib/reporter/types", "ActionCreators")
    @js.native
    val ^ : js.Any = js.native
    
    inline def activityTick(hasIdIncrement: Increment): IUpdateActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("activityTick")(hasIdIncrement.asInstanceOf[js.Any]).asInstanceOf[IUpdateActivity | Null]
    
    inline def createLog(
      hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName: Activitycurrent
    ): ICreateLog = ^.asInstanceOf[js.Dynamic].applyDynamic("createLog")(hasLevelTextStatusTextDurationGroupCodeTypeCategoryFilePathLocationDocsUrlContextActivity_currentActivity_totalActivity_typeActivity_uuidStackPluginName.asInstanceOf[js.Any]).asInstanceOf[ICreateLog]
    
    inline def createPendingActivity(hasIdStatus: Id): js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IPendingActivity] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPendingActivity")(hasIdStatus.asInstanceOf[js.Any]).asInstanceOf[js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IPendingActivity]]
    
    inline def endActivity(hasIdStatus: Status): (js.Array[
        ICreateLog | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IEndActivity | ICancelActivity
      ]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("endActivity")(hasIdStatus.asInstanceOf[js.Any]).asInstanceOf[(js.Array[
        ICreateLog | (js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IEndActivity | ICancelActivity
      ]) | Null]
    
    inline def renderPageTree(payload: IRenderPageArgs): IRenderPageTree = ^.asInstanceOf[js.Dynamic].applyDynamic("renderPageTree")(payload.asInstanceOf[js.Any]).asInstanceOf[IRenderPageTree]
    
    inline def setActivityErrored(hasId: IdString): IActivityErrored | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("setActivityErrored")(hasId.asInstanceOf[js.Any]).asInstanceOf[IActivityErrored | Null]
    
    inline def setActivityStatusText(hasIdStatusText: IdStatusText): IUpdateActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("setActivityStatusText")(hasIdStatusText.asInstanceOf[js.Any]).asInstanceOf[IUpdateActivity | Null]
    
    inline def setActivityTotal(hasIdTotal: Total): IUpdateActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("setActivityTotal")(hasIdTotal.asInstanceOf[js.Any]).asInstanceOf[IUpdateActivity | Null]
    
    inline def setStatus(status: ActivityStatuses): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setStatus")(status.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]]
    inline def setStatus(status: ActivityStatuses, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatus")(status.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]]
    inline def setStatus(status: _empty): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setStatus")(status.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]]
    inline def setStatus(status: _empty, force: Boolean): js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatus")(status.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]]
    
    inline def startActivity(hasIdTextTypeStatusCurrentTotal: Current): js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IStartActivity] = ^.asInstanceOf[js.Dynamic].applyDynamic("startActivity")(hasIdTextTypeStatusCurrentTotal.asInstanceOf[js.Any]).asInstanceOf[js.Array[(js.Function1[/* dispatch */ Dispatch[ISetStatus], Unit]) | IStartActivity]]
    
    inline def updateActivity(hasIdRest: StatusText): IUpdateActivity | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("updateActivity")(hasIdRest.asInstanceOf[js.Any]).asInstanceOf[IUpdateActivity | Null]
  }
  
  type CreateLogAction = Any
  
  type ErrorMeta = Dictid | String | js.Error | js.Array[Any]
  
  trait IGatsbyFunction extends StObject {
    
    var functionRoute: String
    
    var originalAbsoluteFilePath: String
  }
  object IGatsbyFunction {
    
    inline def apply(functionRoute: String, originalAbsoluteFilePath: String): IGatsbyFunction = {
      val __obj = js.Dynamic.literal(functionRoute = functionRoute.asInstanceOf[js.Any], originalAbsoluteFilePath = originalAbsoluteFilePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGatsbyFunction]
    }
    
    extension [Self <: IGatsbyFunction](x: Self) {
      
      inline def setFunctionRoute(value: String): Self = StObject.set(x, "functionRoute", value.asInstanceOf[js.Any])
      
      inline def setOriginalAbsoluteFilePath(value: String): Self = StObject.set(x, "originalAbsoluteFilePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGatsbyPage extends StObject {
    
    var mode: PageMode
  }
  object IGatsbyPage {
    
    inline def apply(mode: PageMode): IGatsbyPage = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGatsbyPage]
    }
    
    extension [Self <: IGatsbyPage](x: Self) {
      
      inline def setMode(value: PageMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGatsbyPageComponent extends StObject {
    
    var componentPath: String
    
    var pages: Set[String]
  }
  object IGatsbyPageComponent {
    
    inline def apply(componentPath: String, pages: Set[String]): IGatsbyPageComponent = {
      val __obj = js.Dynamic.literal(componentPath = componentPath.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGatsbyPageComponent]
    }
    
    extension [Self <: IGatsbyPageComponent](x: Self) {
      
      inline def setComponentPath(value: String): Self = StObject.set(x, "componentPath", value.asInstanceOf[js.Any])
      
      inline def setPages(value: Set[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILogIntent extends StObject {
    
    var payload: Args | Name | ArgsName | ArgsParameters | ArgsParametersName | `0` | `1` | `2` | `3` | `4`
    
    var `type`: LOG_INTENT
  }
  object ILogIntent {
    
    inline def apply(
      payload: Args | Name | ArgsName | ArgsParameters | ArgsParametersName | `0` | `1` | `2` | `3` | `4`
    ): ILogIntent = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LOG_INTENT")
      __obj.asInstanceOf[ILogIntent]
    }
    
    extension [Self <: ILogIntent](x: Self) {
      
      inline def setPayload(value: Args | Name | ArgsName | ArgsParameters | ArgsParametersName | `0` | `1` | `2` | `3` | `4`): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: LOG_INTENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRenderPageArgs extends StObject {
    
    var components: Map[String, IGatsbyPageComponent]
    
    var functions: js.Array[IGatsbyFunction]
    
    var pages: Map[String, IGatsbyPage]
    
    var root: String
  }
  object IRenderPageArgs {
    
    inline def apply(
      components: Map[String, IGatsbyPageComponent],
      functions: js.Array[IGatsbyFunction],
      pages: Map[String, IGatsbyPage],
      root: String
    ): IRenderPageArgs = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderPageArgs]
    }
    
    extension [Self <: IRenderPageArgs](x: Self) {
      
      inline def setComponents(value: Map[String, IGatsbyPageComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: js.Array[IGatsbyFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsVarargs(value: IGatsbyFunction*): Self = StObject.set(x, "functions", js.Array(value*))
      
      inline def setPages(value: Map[String, IGatsbyPage]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gatsbyCli.gatsbyCliStrings.SSG
    - typings.gatsbyCli.gatsbyCliStrings.DSG
    - typings.gatsbyCli.gatsbyCliStrings.SSR
  */
  trait PageMode extends StObject
  object PageMode {
    
    inline def DSG: typings.gatsbyCli.gatsbyCliStrings.DSG = "DSG".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.DSG]
    
    inline def SSG: typings.gatsbyCli.gatsbyCliStrings.SSG = "SSG".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.SSG]
    
    inline def SSR: typings.gatsbyCli.gatsbyCliStrings.SSR = "SSR".asInstanceOf[typings.gatsbyCli.gatsbyCliStrings.SSR]
  }
  
  type ReporterMessagesFromChild = ILogIntent
}
