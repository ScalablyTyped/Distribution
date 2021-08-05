package typings.epilogue

import typings.epilogue.anon.Model
import typings.epilogue.anon.Plural
import typings.epilogue.mod.Errors.EpilogueError
import typings.express.mod.Express
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import typings.sequelize.mod.AssociationOptions
import typings.sequelize.mod.DataTypeAbstract
import typings.sequelize.mod.DataTypeArray
import typings.sequelize.mod.DataTypeBigInt
import typings.sequelize.mod.DataTypeBlob
import typings.sequelize.mod.DataTypeBoolean
import typings.sequelize.mod.DataTypeChar
import typings.sequelize.mod.DataTypeDate
import typings.sequelize.mod.DataTypeDateOnly
import typings.sequelize.mod.DataTypeDecimal
import typings.sequelize.mod.DataTypeDouble
import typings.sequelize.mod.DataTypeEnum
import typings.sequelize.mod.DataTypeFloat
import typings.sequelize.mod.DataTypeGeometry
import typings.sequelize.mod.DataTypeHStore
import typings.sequelize.mod.DataTypeInteger
import typings.sequelize.mod.DataTypeJSONB
import typings.sequelize.mod.DataTypeJSONType
import typings.sequelize.mod.DataTypeNow
import typings.sequelize.mod.DataTypeNumber
import typings.sequelize.mod.DataTypeRange
import typings.sequelize.mod.DataTypeReal
import typings.sequelize.mod.DataTypeString
import typings.sequelize.mod.DataTypeText
import typings.sequelize.mod.DataTypeTime
import typings.sequelize.mod.DataTypeUUID
import typings.sequelize.mod.DataTypeUUIDv1
import typings.sequelize.mod.DataTypeUUIDv4
import typings.sequelize.mod.DataTypeVirtual
import typings.sequelize.mod.Sequelize
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("epilogue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("epilogue", "BaseController")
  @js.native
  class BaseController protected () extends StObject {
    def this(options: BaseContollerOptions) = this()
    
    var endpoint: Endpoint = js.native
    
    var model: js.Any = js.native
  }
  
  @JSImport("epilogue", "CreateController")
  @js.native
  class CreateController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def write(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  @JSImport("epilogue", "DeleteController")
  @js.native
  class DeleteController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def fetch(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], context: Context): js.Promise[js.Function0[Unit]] = js.native
    
    def write(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  @JSImport("epilogue", "Endpoint")
  @js.native
  class Endpoint protected () extends StObject {
    def this(endpoint: String) = this()
    
    var attributes: js.Array[String] = js.native
    
    var string: String = js.native
  }
  
  object Errors {
    
    @JSImport("epilogue", "Errors.BadRequestError")
    @js.native
    class BadRequestError () extends EpilogueError {
      def this(message: String) = this()
      def this(message: String, errors: js.Array[String]) = this()
      def this(message: Unit, errors: js.Array[String]) = this()
      def this(message: String, errors: js.Array[String], cause: Error) = this()
      def this(message: String, errors: Unit, cause: Error) = this()
      def this(message: Unit, errors: js.Array[String], cause: Error) = this()
      def this(message: Unit, errors: Unit, cause: Error) = this()
    }
    
    @JSImport("epilogue", "Errors.EpilogueError")
    @js.native
    class EpilogueError protected ()
      extends StObject
         with Error {
      def this(status: Double) = this()
      def this(status: EpilogueError) = this()
      def this(status: Double, message: String) = this()
      def this(status: EpilogueError, message: String) = this()
      def this(status: Double, message: String, errors: js.Array[String]) = this()
      def this(status: Double, message: Unit, errors: js.Array[String]) = this()
      def this(status: EpilogueError, message: String, errors: js.Array[String]) = this()
      def this(status: EpilogueError, message: Unit, errors: js.Array[String]) = this()
      def this(status: Double, message: String, errors: js.Array[String], cause: Error) = this()
      def this(status: Double, message: String, errors: Unit, cause: Error) = this()
      def this(status: Double, message: Unit, errors: js.Array[String], cause: Error) = this()
      def this(status: Double, message: Unit, errors: Unit, cause: Error) = this()
      def this(status: EpilogueError, message: String, errors: js.Array[String], cause: Error) = this()
      def this(status: EpilogueError, message: String, errors: Unit, cause: Error) = this()
      def this(status: EpilogueError, message: Unit, errors: js.Array[String], cause: Error) = this()
      def this(status: EpilogueError, message: Unit, errors: Unit, cause: Error) = this()
      
      var cause: Error = js.native
      
      var errors: js.Array[String] = js.native
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      var status: Double | EpilogueError = js.native
    }
    
    @JSImport("epilogue", "Errors.ForbiddenError")
    @js.native
    class ForbiddenError () extends EpilogueError {
      def this(message: String) = this()
      def this(message: String, errors: js.Array[String]) = this()
      def this(message: Unit, errors: js.Array[String]) = this()
      def this(message: String, errors: js.Array[String], cause: Error) = this()
      def this(message: String, errors: Unit, cause: Error) = this()
      def this(message: Unit, errors: js.Array[String], cause: Error) = this()
      def this(message: Unit, errors: Unit, cause: Error) = this()
    }
    
    @JSImport("epilogue", "Errors.NotFoundError")
    @js.native
    class NotFoundError () extends EpilogueError {
      def this(message: String) = this()
      def this(message: String, errors: js.Array[String]) = this()
      def this(message: Unit, errors: js.Array[String]) = this()
      def this(message: String, errors: js.Array[String], cause: Error) = this()
      def this(message: String, errors: Unit, cause: Error) = this()
      def this(message: Unit, errors: js.Array[String], cause: Error) = this()
      def this(message: Unit, errors: Unit, cause: Error) = this()
    }
    
    @JSImport("epilogue", "Errors.RequestCompleted")
    @js.native
    class RequestCompleted ()
      extends StObject
         with Error {
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
    }
  }
  
  @JSImport("epilogue", "ListController")
  @js.native
  class ListController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def _safeishParse(
      value: js.Any,
      `type`: DataTypeAbstract | DataTypeBoolean | DataTypeDateOnly | DataTypeHStore | DataTypeJSONB | DataTypeJSONType | DataTypeNow | DataTypeTime,
      sequelize: Sequelize
    ): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeArray, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeBigInt, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeBlob, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeChar, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeDate, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeDecimal, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeDouble, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeEnum, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeFloat, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeGeometry, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeInteger, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeNumber, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeRange, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeReal, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeString, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeText, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeUUID, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeUUIDv1, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeUUIDv4, sequelize: Sequelize): js.Any = js.native
    def _safeishParse(value: js.Any, `type`: DataTypeVirtual, sequelize: Sequelize): js.Any = js.native
    
    def fetch(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  @JSImport("epilogue", "ReadController")
  @js.native
  class ReadController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def fetch(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  @JSImport("epilogue", "Resource")
  @js.native
  class Resource_ protected () extends StObject {
    def this(options: ResourceOptions) = this()
    
    var actions: js.Array[String] = js.native
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any = js.native
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any = js.native
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any = js.native
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    var associationOptions: ResourceAssociationOptions = js.native
    
    var attributes: js.Array[String] = js.native
    
    var controllers: Controllers = js.native
    
    var endpoints: Plural = js.native
    
    var excludeAttributes: js.Array[String] = js.native
    
    var include: js.Array[Model | String] = js.native
    
    var model: js.Any = js.native
    
    var pagination: Boolean = js.native
    
    var readOnlyAttributes: js.Array[String] = js.native
    
    var reloadInstances: Boolean = js.native
    
    var search: ResourceSearchOption = js.native
    
    var sequelize: Sequelize = js.native
    
    var sort: ResourceSortOption = js.native
    
    var updateMethod: String = js.native
  }
  
  @JSImport("epilogue", "UpdateController")
  @js.native
  class UpdateController protected () extends BaseController {
    def this(options: BaseContollerOptions) = this()
    
    def fetch(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], context: Context): js.Promise[js.Function0[Unit]] = js.native
    
    def write(req: Request_[ParamsDictionary, js.Any, js.Any, Query], res: Response_[js.Any], context: Context): js.Promise[js.Function0[Unit]] = js.native
  }
  
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  inline def initialize(options: InitializeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resource(): Resource_ = ^.asInstanceOf[js.Dynamic].applyDynamic("resource")().asInstanceOf[Resource_]
  inline def resource(options: ResourceOptions): Resource_ = ^.asInstanceOf[js.Dynamic].applyDynamic("resource")(options.asInstanceOf[js.Any]).asInstanceOf[Resource_]
  
  trait BaseContollerOptions extends StObject {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
    def app(req: IncomingMessage, res: ServerResponse): js.Any
    @JSName("app")
    var app_Original: Express
    
    var endpoint: String
    
    var include: js.Array[Model | String]
    
    var model: js.Any
    
    var resource: Resource_
  }
  object BaseContollerOptions {
    
    inline def apply(
      app: Express,
      endpoint: String,
      include: js.Array[Model | String],
      model: js.Any,
      resource: Resource_
    ): BaseContollerOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseContollerOptions]
    }
    
    extension [Self <: BaseContollerOptions](x: Self) {
      
      inline def setApp(value: Express): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setInclude(value: js.Array[Model | String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: (Model | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setResource(value: Resource_): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    var attributes: js.Any = js.native
    
    def continue(): Unit = js.native
    
    var criteria: js.Any = js.native
    
    def error(status: Double): Unit = js.native
    def error(status: Double, message: String): Unit = js.native
    def error(status: Double, message: String, errorList: js.Array[String]): Unit = js.native
    def error(status: Double, message: String, errorList: js.Array[String], cause: Error): Unit = js.native
    def error(status: Double, message: String, errorList: Unit, cause: Error): Unit = js.native
    def error(status: Double, message: Unit, errorList: js.Array[String]): Unit = js.native
    def error(status: Double, message: Unit, errorList: js.Array[String], cause: Error): Unit = js.native
    def error(status: Double, message: Unit, errorList: Unit, cause: Error): Unit = js.native
    def error(status: EpilogueError): Unit = js.native
    def error(status: EpilogueError, message: String): Unit = js.native
    def error(status: EpilogueError, message: String, errorList: js.Array[String]): Unit = js.native
    def error(status: EpilogueError, message: String, errorList: js.Array[String], cause: Error): Unit = js.native
    def error(status: EpilogueError, message: String, errorList: Unit, cause: Error): Unit = js.native
    def error(status: EpilogueError, message: Unit, errorList: js.Array[String]): Unit = js.native
    def error(status: EpilogueError, message: Unit, errorList: js.Array[String], cause: Error): Unit = js.native
    def error(status: EpilogueError, message: Unit, errorList: Unit, cause: Error): Unit = js.native
    
    var instance: Resource_ = js.native
    
    var options: js.Any = js.native
    
    def skip(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  trait Controllers extends StObject {
    
    var base: BaseController
    
    var create: CreateController
    
    var delete: DeleteController
    
    var list: ListController
    
    var read: ReadController
    
    var update: UpdateController
  }
  object Controllers {
    
    inline def apply(
      base: BaseController,
      create: CreateController,
      delete: DeleteController,
      list: ListController,
      read: ReadController,
      update: UpdateController
    ): Controllers = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[Controllers]
    }
    
    extension [Self <: Controllers](x: Self) {
      
      inline def setBase(value: BaseController): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: CreateController): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: DeleteController): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setList(value: ListController): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setRead(value: ReadController): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: UpdateController): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitializeOptions extends StObject {
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: Response[js.Any, Double]): js.Any
    def app(req: Request[ParamsDictionary, js.Any, js.Any, ParsedQs], res: ServerResponse): js.Any
    def app(req: IncomingMessage, res: Response[js.Any, Double]): js.Any
    def app(req: IncomingMessage, res: ServerResponse): js.Any
    @JSName("app")
    var app_Original: Express
    
    var base: js.UndefOr[String] = js.undefined
    
    var sequelize: Sequelize
    
    var updateMethod: js.UndefOr[String] = js.undefined
  }
  object InitializeOptions {
    
    inline def apply(app: Express, sequelize: Sequelize): InitializeOptions = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], sequelize = sequelize.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializeOptions]
    }
    
    extension [Self <: InitializeOptions](x: Self) {
      
      inline def setApp(value: Express): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setSequelize(value: Sequelize): Self = StObject.set(x, "sequelize", value.asInstanceOf[js.Any])
      
      inline def setUpdateMethod(value: String): Self = StObject.set(x, "updateMethod", value.asInstanceOf[js.Any])
      
      inline def setUpdateMethodUndefined: Self = StObject.set(x, "updateMethod", js.undefined)
    }
  }
  
  trait ResourceAssociationOptions
    extends StObject
       with AssociationOptions {
    
    var removeForeignKeys: Boolean
  }
  object ResourceAssociationOptions {
    
    inline def apply(removeForeignKeys: Boolean): ResourceAssociationOptions = {
      val __obj = js.Dynamic.literal(removeForeignKeys = removeForeignKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAssociationOptions]
    }
    
    extension [Self <: ResourceAssociationOptions](x: Self) {
      
      inline def setRemoveForeignKeys(value: Boolean): Self = StObject.set(x, "removeForeignKeys", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceOptions extends StObject {
    
    var actions: js.UndefOr[js.Array[String]] = js.undefined
    
    var associations: js.UndefOr[AssociationOptions] = js.undefined
    
    var endpoints: js.Array[String]
    
    var excludeAttributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var include: js.UndefOr[js.Array[Model | String]] = js.undefined
    
    var model: js.Any
    
    var pagination: js.UndefOr[Boolean] = js.undefined
    
    var readOnlyAttributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var reloadInstances: js.UndefOr[Boolean] = js.undefined
    
    var search: js.UndefOr[ResourceSearchOption] = js.undefined
    
    var sort: js.UndefOr[ResourceSortOption] = js.undefined
    
    var updateMethod: js.UndefOr[String] = js.undefined
  }
  object ResourceOptions {
    
    inline def apply(endpoints: js.Array[String], model: js.Any): ResourceOptions = {
      val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceOptions]
    }
    
    extension [Self <: ResourceOptions](x: Self) {
      
      inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      inline def setAssociations(value: AssociationOptions): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
      
      inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
      
      inline def setEndpoints(value: js.Array[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      inline def setEndpointsVarargs(value: String*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
      
      inline def setExcludeAttributes(value: js.Array[String]): Self = StObject.set(x, "excludeAttributes", value.asInstanceOf[js.Any])
      
      inline def setExcludeAttributesUndefined: Self = StObject.set(x, "excludeAttributes", js.undefined)
      
      inline def setExcludeAttributesVarargs(value: String*): Self = StObject.set(x, "excludeAttributes", js.Array(value :_*))
      
      inline def setInclude(value: js.Array[Model | String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (Model | String)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setReadOnlyAttributes(value: js.Array[String]): Self = StObject.set(x, "readOnlyAttributes", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyAttributesUndefined: Self = StObject.set(x, "readOnlyAttributes", js.undefined)
      
      inline def setReadOnlyAttributesVarargs(value: String*): Self = StObject.set(x, "readOnlyAttributes", js.Array(value :_*))
      
      inline def setReloadInstances(value: Boolean): Self = StObject.set(x, "reloadInstances", value.asInstanceOf[js.Any])
      
      inline def setReloadInstancesUndefined: Self = StObject.set(x, "reloadInstances", js.undefined)
      
      inline def setSearch(value: ResourceSearchOption): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSort(value: ResourceSortOption): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setUpdateMethod(value: String): Self = StObject.set(x, "updateMethod", value.asInstanceOf[js.Any])
      
      inline def setUpdateMethodUndefined: Self = StObject.set(x, "updateMethod", js.undefined)
    }
  }
  
  trait ResourceSearchOption extends StObject {
    
    var attributes: js.Array[String]
    
    var operator: String
    
    var param: String
  }
  object ResourceSearchOption {
    
    inline def apply(attributes: js.Array[String], operator: String, param: String): ResourceSearchOption = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceSearchOption]
    }
    
    extension [Self <: ResourceSearchOption](x: Self) {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceSortOption extends StObject {
    
    var default: String
    
    var param: String
  }
  object ResourceSortOption {
    
    inline def apply(default: String, param: String): ResourceSortOption = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceSortOption]
    }
    
    extension [Self <: ResourceSortOption](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    }
  }
}
