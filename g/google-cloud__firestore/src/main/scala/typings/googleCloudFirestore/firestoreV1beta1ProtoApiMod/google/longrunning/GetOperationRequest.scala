package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetOperationRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.longrunning.GetOperationRequest")
@js.native
/**
  * Constructs a new GetOperationRequest.
  * @param [properties] Properties to set
  */
open class GetOperationRequest ()
  extends StObject
     with IGetOperationRequest {
  def this(properties: IGetOperationRequest) = this()
  
  /** GetOperationRequest name. */
  @JSName("name")
  var name_GetOperationRequest: String = js.native
  
  /**
    * Converts this GetOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetOperationRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.longrunning.GetOperationRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a GetOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetOperationRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetOperationRequest]
  
  /**
    * Creates a plain object from a GetOperationRequest message. Also converts values to other types if specified.
    * @param message GetOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetOperationRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetOperationRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
