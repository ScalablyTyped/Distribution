package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.rpc.IStatus
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchWriteResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BatchWriteResponse")
@js.native
/**
  * Constructs a new BatchWriteResponse.
  * @param [properties] Properties to set
  */
open class BatchWriteResponse ()
  extends StObject
     with IBatchWriteResponse {
  def this(properties: IBatchWriteResponse) = this()
  
  /** BatchWriteResponse status. */
  @JSName("status")
  var status_BatchWriteResponse: js.Array[IStatus] = js.native
  
  /**
    * Converts this BatchWriteResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** BatchWriteResponse writeResults. */
  @JSName("writeResults")
  var writeResults_BatchWriteResponse: js.Array[IWriteResult] = js.native
}
object BatchWriteResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BatchWriteResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BatchWriteResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchWriteResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchWriteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchWriteResponse]
  
  /**
    * Creates a plain object from a BatchWriteResponse message. Also converts values to other types if specified.
    * @param message BatchWriteResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchWriteResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchWriteResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
