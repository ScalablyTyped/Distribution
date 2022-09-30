package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommitRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.CommitRequest")
@js.native
/**
  * Constructs a new CommitRequest.
  * @param [properties] Properties to set
  */
open class CommitRequest ()
  extends StObject
     with ICommitRequest {
  def this(properties: ICommitRequest) = this()
  
  /** CommitRequest database. */
  @JSName("database")
  var database_CommitRequest: String = js.native
  
  /**
    * Converts this CommitRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** CommitRequest transaction. */
  @JSName("transaction")
  var transaction_CommitRequest: js.typedarray.Uint8Array = js.native
  
  /** CommitRequest writes. */
  @JSName("writes")
  var writes_CommitRequest: js.Array[IWrite] = js.native
}
object CommitRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.CommitRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a CommitRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommitRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CommitRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommitRequest]
  
  /**
    * Creates a plain object from a CommitRequest message. Also converts values to other types if specified.
    * @param message CommitRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommitRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CommitRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
