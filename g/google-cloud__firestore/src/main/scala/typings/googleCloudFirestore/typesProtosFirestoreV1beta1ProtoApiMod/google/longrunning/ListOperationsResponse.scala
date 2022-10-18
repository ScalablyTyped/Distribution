package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListOperationsResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.longrunning.ListOperationsResponse")
@js.native
/**
  * Constructs a new ListOperationsResponse.
  * @param [properties] Properties to set
  */
open class ListOperationsResponse ()
  extends StObject
     with IListOperationsResponse {
  def this(properties: IListOperationsResponse) = this()
  
  /** ListOperationsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListOperationsResponse: String = js.native
  
  /** ListOperationsResponse operations. */
  @JSName("operations")
  var operations_ListOperationsResponse: js.Array[IOperation] = js.native
  
  /**
    * Converts this ListOperationsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListOperationsResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.longrunning.ListOperationsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListOperationsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListOperationsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListOperationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListOperationsResponse]
  
  /**
    * Creates a plain object from a ListOperationsResponse message. Also converts values to other types if specified.
    * @param message ListOperationsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListOperationsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListOperationsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
