package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteOperationRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.longrunning.DeleteOperationRequest")
@js.native
/**
  * Constructs a new DeleteOperationRequest.
  * @param [properties] Properties to set
  */
open class DeleteOperationRequest ()
  extends StObject
     with IDeleteOperationRequest {
  def this(properties: IDeleteOperationRequest) = this()
  
  /** DeleteOperationRequest name. */
  @JSName("name")
  var name_DeleteOperationRequest: String = js.native
  
  /**
    * Converts this DeleteOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DeleteOperationRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.longrunning.DeleteOperationRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a DeleteOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteOperationRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DeleteOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteOperationRequest]
  
  /**
    * Creates a plain object from a DeleteOperationRequest message. Also converts values to other types if specified.
    * @param message DeleteOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DeleteOperationRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DeleteOperationRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
