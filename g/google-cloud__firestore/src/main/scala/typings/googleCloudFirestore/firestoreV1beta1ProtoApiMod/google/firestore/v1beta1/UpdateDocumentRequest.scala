package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateDocumentRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.UpdateDocumentRequest")
@js.native
/**
  * Constructs a new UpdateDocumentRequest.
  * @param [properties] Properties to set
  */
open class UpdateDocumentRequest ()
  extends StObject
     with IUpdateDocumentRequest {
  def this(properties: IUpdateDocumentRequest) = this()
  
  /**
    * Converts this UpdateDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object UpdateDocumentRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.UpdateDocumentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an UpdateDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateDocumentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): UpdateDocumentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateDocumentRequest]
  
  /**
    * Creates a plain object from an UpdateDocumentRequest message. Also converts values to other types if specified.
    * @param message UpdateDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UpdateDocumentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: UpdateDocumentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
