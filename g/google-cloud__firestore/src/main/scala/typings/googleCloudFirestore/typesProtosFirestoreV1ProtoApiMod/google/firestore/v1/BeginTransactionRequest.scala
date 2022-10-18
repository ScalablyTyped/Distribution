package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BeginTransactionRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.BeginTransactionRequest")
@js.native
/**
  * Constructs a new BeginTransactionRequest.
  * @param [properties] Properties to set
  */
open class BeginTransactionRequest ()
  extends StObject
     with IBeginTransactionRequest {
  def this(properties: IBeginTransactionRequest) = this()
  
  /** BeginTransactionRequest database. */
  @JSName("database")
  var database_BeginTransactionRequest: String = js.native
  
  /**
    * Converts this BeginTransactionRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object BeginTransactionRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.BeginTransactionRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BeginTransactionRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BeginTransactionRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): BeginTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BeginTransactionRequest]
  
  /**
    * Creates a plain object from a BeginTransactionRequest message. Also converts values to other types if specified.
    * @param message BeginTransactionRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BeginTransactionRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BeginTransactionRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
