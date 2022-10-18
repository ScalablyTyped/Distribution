package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.structuredQuery
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PartitionQueryRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.PartitionQueryRequest")
@js.native
/**
  * Constructs a new PartitionQueryRequest.
  * @param [properties] Properties to set
  */
open class PartitionQueryRequest ()
  extends StObject
     with IPartitionQueryRequest {
  def this(properties: IPartitionQueryRequest) = this()
  
  /** PartitionQueryRequest pageSize. */
  @JSName("pageSize")
  var pageSize_PartitionQueryRequest: Double = js.native
  
  /** PartitionQueryRequest pageToken. */
  @JSName("pageToken")
  var pageToken_PartitionQueryRequest: String = js.native
  
  /** PartitionQueryRequest parent. */
  @JSName("parent")
  var parent_PartitionQueryRequest: String = js.native
  
  /** PartitionQueryRequest partitionCount. */
  @JSName("partitionCount")
  var partitionCount_PartitionQueryRequest: Double | String = js.native
  
  /** PartitionQueryRequest queryType. */
  var queryType: js.UndefOr[structuredQuery] = js.native
  
  /**
    * Converts this PartitionQueryRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object PartitionQueryRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.PartitionQueryRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a PartitionQueryRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PartitionQueryRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): PartitionQueryRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PartitionQueryRequest]
  
  /**
    * Creates a plain object from a PartitionQueryRequest message. Also converts values to other types if specified.
    * @param message PartitionQueryRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PartitionQueryRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PartitionQueryRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
