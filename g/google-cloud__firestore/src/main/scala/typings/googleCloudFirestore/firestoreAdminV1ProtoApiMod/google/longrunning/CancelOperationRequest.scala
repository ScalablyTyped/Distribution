package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CancelOperationRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.longrunning.CancelOperationRequest")
@js.native
/**
  * Constructs a new CancelOperationRequest.
  * @param [properties] Properties to set
  */
open class CancelOperationRequest ()
  extends StObject
     with ICancelOperationRequest {
  def this(properties: ICancelOperationRequest) = this()
  
  /** CancelOperationRequest name. */
  @JSName("name")
  var name_CancelOperationRequest: String = js.native
  
  /**
    * Converts this CancelOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CancelOperationRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.longrunning.CancelOperationRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a CancelOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CancelOperationRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CancelOperationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CancelOperationRequest]
  
  /**
    * Creates a plain object from a CancelOperationRequest message. Also converts values to other types if specified.
    * @param message CancelOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CancelOperationRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CancelOperationRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
