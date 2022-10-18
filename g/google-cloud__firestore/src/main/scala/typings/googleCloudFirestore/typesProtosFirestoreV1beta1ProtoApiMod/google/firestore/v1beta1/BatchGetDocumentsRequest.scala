package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.newTransaction
import typings.googleCloudFirestore.googleCloudFirestoreStrings.readTime
import typings.googleCloudFirestore.googleCloudFirestoreStrings.transaction
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BatchGetDocumentsRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BatchGetDocumentsRequest")
@js.native
/**
  * Constructs a new BatchGetDocumentsRequest.
  * @param [properties] Properties to set
  */
open class BatchGetDocumentsRequest ()
  extends StObject
     with IBatchGetDocumentsRequest {
  def this(properties: IBatchGetDocumentsRequest) = this()
  
  /** BatchGetDocumentsRequest consistencySelector. */
  var consistencySelector: js.UndefOr[transaction | newTransaction | readTime] = js.native
  
  /** BatchGetDocumentsRequest database. */
  @JSName("database")
  var database_BatchGetDocumentsRequest: String = js.native
  
  /** BatchGetDocumentsRequest documents. */
  @JSName("documents")
  var documents_BatchGetDocumentsRequest: js.Array[String] = js.native
  
  /**
    * Converts this BatchGetDocumentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BatchGetDocumentsRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BatchGetDocumentsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BatchGetDocumentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchGetDocumentsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BatchGetDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchGetDocumentsRequest]
  
  /**
    * Creates a plain object from a BatchGetDocumentsRequest message. Also converts values to other types if specified.
    * @param message BatchGetDocumentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BatchGetDocumentsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchGetDocumentsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
