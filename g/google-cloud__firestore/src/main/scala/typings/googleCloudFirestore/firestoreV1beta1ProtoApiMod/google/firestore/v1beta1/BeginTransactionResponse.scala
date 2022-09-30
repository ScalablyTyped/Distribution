package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BeginTransactionResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BeginTransactionResponse")
@js.native
/**
  * Constructs a new BeginTransactionResponse.
  * @param [properties] Properties to set
  */
open class BeginTransactionResponse ()
  extends StObject
     with IBeginTransactionResponse {
  def this(properties: IBeginTransactionResponse) = this()
  
  /**
    * Converts this BeginTransactionResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** BeginTransactionResponse transaction. */
  @JSName("transaction")
  var transaction_BeginTransactionResponse: js.typedarray.Uint8Array = js.native
}
object BeginTransactionResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.BeginTransactionResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BeginTransactionResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BeginTransactionResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BeginTransactionResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BeginTransactionResponse]
  
  /**
    * Creates a plain object from a BeginTransactionResponse message. Also converts values to other types if specified.
    * @param message BeginTransactionResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BeginTransactionResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BeginTransactionResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
