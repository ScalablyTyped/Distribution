package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PartitionQueryResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.PartitionQueryResponse")
@js.native
/**
  * Constructs a new PartitionQueryResponse.
  * @param [properties] Properties to set
  */
open class PartitionQueryResponse ()
  extends StObject
     with IPartitionQueryResponse {
  def this(properties: IPartitionQueryResponse) = this()
  
  /** PartitionQueryResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_PartitionQueryResponse: String = js.native
  
  /** PartitionQueryResponse partitions. */
  @JSName("partitions")
  var partitions_PartitionQueryResponse: js.Array[ICursor] = js.native
  
  /**
    * Converts this PartitionQueryResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object PartitionQueryResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.PartitionQueryResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a PartitionQueryResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PartitionQueryResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): PartitionQueryResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PartitionQueryResponse]
  
  /**
    * Creates a plain object from a PartitionQueryResponse message. Also converts values to other types if specified.
    * @param message PartitionQueryResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PartitionQueryResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PartitionQueryResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
