package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RollbackRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.RollbackRequest")
@js.native
/**
  * Constructs a new RollbackRequest.
  * @param [properties] Properties to set
  */
open class RollbackRequest ()
  extends StObject
     with IRollbackRequest {
  def this(properties: IRollbackRequest) = this()
  
  /** RollbackRequest database. */
  @JSName("database")
  var database_RollbackRequest: String = js.native
  
  /**
    * Converts this RollbackRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** RollbackRequest transaction. */
  @JSName("transaction")
  var transaction_RollbackRequest: js.typedarray.Uint8Array = js.native
}
object RollbackRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.RollbackRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a RollbackRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RollbackRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): RollbackRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RollbackRequest]
  
  /**
    * Creates a plain object from a RollbackRequest message. Also converts values to other types if specified.
    * @param message RollbackRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RollbackRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RollbackRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
