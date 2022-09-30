package typings.googleCloudSpanner.mod.protos.google.spanner.admin.database.v1

import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DatabaseAdmin */
@JSImport("@google-cloud/spanner", "protos.google.spanner.admin.database.v1.DatabaseAdmin")
@js.native
open class DatabaseAdmin protected ()
  extends typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin {
  /**
    * Constructs a new DatabaseAdmin service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
}
object DatabaseAdmin {
  
  @JSImport("@google-cloud/spanner", "protos.google.spanner.admin.database.v1.DatabaseAdmin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new DatabaseAdmin service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin]
}
