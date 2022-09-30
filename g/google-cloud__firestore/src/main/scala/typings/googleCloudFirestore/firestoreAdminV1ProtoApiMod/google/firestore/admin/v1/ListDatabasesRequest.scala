package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDatabasesRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListDatabasesRequest")
@js.native
/**
  * Constructs a new ListDatabasesRequest.
  * @param [properties] Properties to set
  */
open class ListDatabasesRequest ()
  extends StObject
     with IListDatabasesRequest {
  def this(properties: IListDatabasesRequest) = this()
  
  /** ListDatabasesRequest parent. */
  @JSName("parent")
  var parent_ListDatabasesRequest: String = js.native
  
  /**
    * Converts this ListDatabasesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDatabasesRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListDatabasesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListDatabasesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDatabasesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDatabasesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesRequest]
  
  /**
    * Creates a plain object from a ListDatabasesRequest message. Also converts values to other types if specified.
    * @param message ListDatabasesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDatabasesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDatabasesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
