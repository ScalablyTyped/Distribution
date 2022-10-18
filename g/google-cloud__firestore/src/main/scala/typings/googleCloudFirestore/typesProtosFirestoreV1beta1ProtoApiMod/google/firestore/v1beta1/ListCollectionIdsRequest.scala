package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListCollectionIdsRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.ListCollectionIdsRequest")
@js.native
/**
  * Constructs a new ListCollectionIdsRequest.
  * @param [properties] Properties to set
  */
open class ListCollectionIdsRequest ()
  extends StObject
     with IListCollectionIdsRequest {
  def this(properties: IListCollectionIdsRequest) = this()
  
  /** ListCollectionIdsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListCollectionIdsRequest: Double = js.native
  
  /** ListCollectionIdsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListCollectionIdsRequest: String = js.native
  
  /** ListCollectionIdsRequest parent. */
  @JSName("parent")
  var parent_ListCollectionIdsRequest: String = js.native
  
  /**
    * Converts this ListCollectionIdsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListCollectionIdsRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.ListCollectionIdsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListCollectionIdsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListCollectionIdsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListCollectionIdsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListCollectionIdsRequest]
  
  /**
    * Creates a plain object from a ListCollectionIdsRequest message. Also converts values to other types if specified.
    * @param message ListCollectionIdsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListCollectionIdsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListCollectionIdsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
