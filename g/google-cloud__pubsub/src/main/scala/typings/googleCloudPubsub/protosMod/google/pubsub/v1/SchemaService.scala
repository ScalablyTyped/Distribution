package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import typings.googleCloudPubsub.protosMod.google.protobuf.Empty
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.SchemaService.CreateSchemaCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.SchemaService.DeleteSchemaCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.SchemaService.GetSchemaCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.SchemaService.ListSchemasCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.SchemaService.ValidateMessageCallback
import typings.googleCloudPubsub.protosMod.google.pubsub.v1.SchemaService.ValidateSchemaCallback
import typings.googleGax.mod.protobuf.rpc.Service
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SchemaService */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SchemaService")
@js.native
open class SchemaService protected () extends Service {
  /**
    * Constructs a new SchemaService service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls CreateSchema.
    * @param request CreateSchemaRequest message or plain object
    * @returns Promise
    */
  def createSchema(request: ICreateSchemaRequest): js.Promise[Schema] = js.native
  /**
    * Calls CreateSchema.
    * @param request CreateSchemaRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Schema
    */
  def createSchema(request: ICreateSchemaRequest, callback: CreateSchemaCallback): Unit = js.native
  
  /**
    * Calls DeleteSchema.
    * @param request DeleteSchemaRequest message or plain object
    * @returns Promise
    */
  def deleteSchema(request: IDeleteSchemaRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteSchema.
    * @param request DeleteSchemaRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteSchema(request: IDeleteSchemaRequest, callback: DeleteSchemaCallback): Unit = js.native
  
  /**
    * Calls GetSchema.
    * @param request GetSchemaRequest message or plain object
    * @returns Promise
    */
  def getSchema(request: IGetSchemaRequest): js.Promise[Schema] = js.native
  /**
    * Calls GetSchema.
    * @param request GetSchemaRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Schema
    */
  def getSchema(request: IGetSchemaRequest, callback: GetSchemaCallback): Unit = js.native
  
  /**
    * Calls ListSchemas.
    * @param request ListSchemasRequest message or plain object
    * @returns Promise
    */
  def listSchemas(request: IListSchemasRequest): js.Promise[ListSchemasResponse] = js.native
  /**
    * Calls ListSchemas.
    * @param request ListSchemasRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListSchemasResponse
    */
  def listSchemas(request: IListSchemasRequest, callback: ListSchemasCallback): Unit = js.native
  
  /**
    * Calls ValidateMessage.
    * @param request ValidateMessageRequest message or plain object
    * @returns Promise
    */
  def validateMessage(request: IValidateMessageRequest): js.Promise[ValidateMessageResponse] = js.native
  /**
    * Calls ValidateMessage.
    * @param request ValidateMessageRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ValidateMessageResponse
    */
  def validateMessage(request: IValidateMessageRequest, callback: ValidateMessageCallback): Unit = js.native
  
  /**
    * Calls ValidateSchema.
    * @param request ValidateSchemaRequest message or plain object
    * @returns Promise
    */
  def validateSchema(request: IValidateSchemaRequest): js.Promise[ValidateSchemaResponse] = js.native
  /**
    * Calls ValidateSchema.
    * @param request ValidateSchemaRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ValidateSchemaResponse
    */
  def validateSchema(request: IValidateSchemaRequest, callback: ValidateSchemaCallback): Unit = js.native
}
object SchemaService {
  
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SchemaService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new SchemaService service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): SchemaService = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[SchemaService]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): SchemaService = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[SchemaService]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): SchemaService = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[SchemaService]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): SchemaService = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[SchemaService]
  
  /**
    * Callback as used by {@link google.pubsub.v1.SchemaService|createSchema}.
    * @param error Error, if any
    * @param [response] Schema
    */
  type CreateSchemaCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Schema], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.SchemaService|deleteSchema}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteSchemaCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.SchemaService|getSchema}.
    * @param error Error, if any
    * @param [response] Schema
    */
  type GetSchemaCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Schema], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.SchemaService|listSchemas}.
    * @param error Error, if any
    * @param [response] ListSchemasResponse
    */
  type ListSchemasCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListSchemasResponse], Unit]
  
  /**
    * Callback as used by {@link google.pubsub.v1.SchemaService|validateMessage}.
    * @param error Error, if any
    * @param [response] ValidateMessageResponse
    */
  type ValidateMessageCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[ValidateMessageResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.pubsub.v1.SchemaService|validateSchema}.
    * @param error Error, if any
    * @param [response] ValidateSchemaResponse
    */
  type ValidateSchemaCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ValidateSchemaResponse], Unit]
}
