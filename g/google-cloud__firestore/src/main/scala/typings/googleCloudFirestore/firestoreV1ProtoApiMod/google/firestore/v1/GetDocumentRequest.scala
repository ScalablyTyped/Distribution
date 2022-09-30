package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.readTime
import typings.googleCloudFirestore.googleCloudFirestoreStrings.transaction
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetDocumentRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.GetDocumentRequest")
@js.native
/**
  * Constructs a new GetDocumentRequest.
  * @param [properties] Properties to set
  */
open class GetDocumentRequest ()
  extends StObject
     with IGetDocumentRequest {
  def this(properties: IGetDocumentRequest) = this()
  
  /** GetDocumentRequest consistencySelector. */
  var consistencySelector: js.UndefOr[transaction | readTime] = js.native
  
  /** GetDocumentRequest name. */
  @JSName("name")
  var name_GetDocumentRequest: String = js.native
  
  /**
    * Converts this GetDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetDocumentRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.GetDocumentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a GetDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetDocumentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetDocumentRequest]
  
  /**
    * Creates a plain object from a GetDocumentRequest message. Also converts values to other types if specified.
    * @param message GetDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetDocumentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetDocumentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
