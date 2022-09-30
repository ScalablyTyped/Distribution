package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListIndexesRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListIndexesRequest")
@js.native
/**
  * Constructs a new ListIndexesRequest.
  * @param [properties] Properties to set
  */
open class ListIndexesRequest ()
  extends StObject
     with IListIndexesRequest {
  def this(properties: IListIndexesRequest) = this()
  
  /** ListIndexesRequest filter. */
  @JSName("filter")
  var filter_ListIndexesRequest: String = js.native
  
  /** ListIndexesRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListIndexesRequest: Double = js.native
  
  /** ListIndexesRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListIndexesRequest: String = js.native
  
  /** ListIndexesRequest parent. */
  @JSName("parent")
  var parent_ListIndexesRequest: String = js.native
  
  /**
    * Converts this ListIndexesRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListIndexesRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListIndexesRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListIndexesRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListIndexesRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListIndexesRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListIndexesRequest]
  
  /**
    * Creates a plain object from a ListIndexesRequest message. Also converts values to other types if specified.
    * @param message ListIndexesRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListIndexesRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListIndexesRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
