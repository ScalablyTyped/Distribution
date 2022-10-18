package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.found
import typings.googleCloudFirestore.googleCloudFirestoreStrings.missing
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchGetDocumentsResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BatchGetDocumentsResponse")
@js.native
/**
  * Constructs a new BatchGetDocumentsResponse.
  * @param [properties] Properties to set
  */
open class BatchGetDocumentsResponse ()
  extends StObject
     with IBatchGetDocumentsResponse {
  def this(properties: IBatchGetDocumentsResponse) = this()
  
  /** BatchGetDocumentsResponse result. */
  var result: js.UndefOr[found | missing] = js.native
  
  /**
    * Converts this BatchGetDocumentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** BatchGetDocumentsResponse transaction. */
  @JSName("transaction")
  var transaction_BatchGetDocumentsResponse: js.typedarray.Uint8Array = js.native
}
object BatchGetDocumentsResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BatchGetDocumentsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BatchGetDocumentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchGetDocumentsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchGetDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchGetDocumentsResponse]
  
  /**
    * Creates a plain object from a BatchGetDocumentsResponse message. Also converts values to other types if specified.
    * @param message BatchGetDocumentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchGetDocumentsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchGetDocumentsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
