package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteDocumentRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.DeleteDocumentRequest")
@js.native
/**
  * Constructs a new DeleteDocumentRequest.
  * @param [properties] Properties to set
  */
open class DeleteDocumentRequest ()
  extends StObject
     with IDeleteDocumentRequest {
  def this(properties: IDeleteDocumentRequest) = this()
  
  /** DeleteDocumentRequest name. */
  @JSName("name")
  var name_DeleteDocumentRequest: String = js.native
  
  /**
    * Converts this DeleteDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DeleteDocumentRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.DeleteDocumentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a DeleteDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteDocumentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DeleteDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteDocumentRequest]
  
  /**
    * Creates a plain object from a DeleteDocumentRequest message. Also converts values to other types if specified.
    * @param message DeleteDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DeleteDocumentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DeleteDocumentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
