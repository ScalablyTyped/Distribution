package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateDocumentRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.CreateDocumentRequest")
@js.native
/**
  * Constructs a new CreateDocumentRequest.
  * @param [properties] Properties to set
  */
open class CreateDocumentRequest ()
  extends StObject
     with ICreateDocumentRequest {
  def this(properties: ICreateDocumentRequest) = this()
  
  /** CreateDocumentRequest collectionId. */
  @JSName("collectionId")
  var collectionId_CreateDocumentRequest: String = js.native
  
  /** CreateDocumentRequest documentId. */
  @JSName("documentId")
  var documentId_CreateDocumentRequest: String = js.native
  
  /** CreateDocumentRequest parent. */
  @JSName("parent")
  var parent_CreateDocumentRequest: String = js.native
  
  /**
    * Converts this CreateDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateDocumentRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.CreateDocumentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a CreateDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateDocumentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateDocumentRequest]
  
  /**
    * Creates a plain object from a CreateDocumentRequest message. Also converts values to other types if specified.
    * @param message CreateDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateDocumentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateDocumentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
