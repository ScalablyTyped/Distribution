package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchWriteRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BatchWriteRequest")
@js.native
/**
  * Constructs a new BatchWriteRequest.
  * @param [properties] Properties to set
  */
open class BatchWriteRequest ()
  extends StObject
     with IBatchWriteRequest {
  def this(properties: IBatchWriteRequest) = this()
  
  /** BatchWriteRequest database. */
  @JSName("database")
  var database_BatchWriteRequest: String = js.native
  
  /** BatchWriteRequest labels. */
  @JSName("labels")
  var labels_BatchWriteRequest: StringDictionary[String] = js.native
  
  /**
    * Converts this BatchWriteRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** BatchWriteRequest writes. */
  @JSName("writes")
  var writes_BatchWriteRequest: js.Array[IWrite] = js.native
}
object BatchWriteRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BatchWriteRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BatchWriteRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchWriteRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchWriteRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchWriteRequest]
  
  /**
    * Creates a plain object from a BatchWriteRequest message. Also converts values to other types if specified.
    * @param message BatchWriteRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchWriteRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchWriteRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
