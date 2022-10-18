package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListOperationsRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.longrunning.ListOperationsRequest")
@js.native
/**
  * Constructs a new ListOperationsRequest.
  * @param [properties] Properties to set
  */
open class ListOperationsRequest ()
  extends StObject
     with IListOperationsRequest {
  def this(properties: IListOperationsRequest) = this()
  
  /** ListOperationsRequest filter. */
  @JSName("filter")
  var filter_ListOperationsRequest: String = js.native
  
  /** ListOperationsRequest name. */
  @JSName("name")
  var name_ListOperationsRequest: String = js.native
  
  /** ListOperationsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListOperationsRequest: Double = js.native
  
  /** ListOperationsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListOperationsRequest: String = js.native
  
  /**
    * Converts this ListOperationsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListOperationsRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.longrunning.ListOperationsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListOperationsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListOperationsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListOperationsRequest]
  
  /**
    * Creates a plain object from a ListOperationsRequest message. Also converts values to other types if specified.
    * @param message ListOperationsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListOperationsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListOperationsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
