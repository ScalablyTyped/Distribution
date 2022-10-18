package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListFieldsRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListFieldsRequest")
@js.native
/**
  * Constructs a new ListFieldsRequest.
  * @param [properties] Properties to set
  */
open class ListFieldsRequest ()
  extends StObject
     with IListFieldsRequest {
  def this(properties: IListFieldsRequest) = this()
  
  /** ListFieldsRequest filter. */
  @JSName("filter")
  var filter_ListFieldsRequest: String = js.native
  
  /** ListFieldsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListFieldsRequest: Double = js.native
  
  /** ListFieldsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListFieldsRequest: String = js.native
  
  /** ListFieldsRequest parent. */
  @JSName("parent")
  var parent_ListFieldsRequest: String = js.native
  
  /**
    * Converts this ListFieldsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListFieldsRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListFieldsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListFieldsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListFieldsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListFieldsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListFieldsRequest]
  
  /**
    * Creates a plain object from a ListFieldsRequest message. Also converts values to other types if specified.
    * @param message ListFieldsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListFieldsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListFieldsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
