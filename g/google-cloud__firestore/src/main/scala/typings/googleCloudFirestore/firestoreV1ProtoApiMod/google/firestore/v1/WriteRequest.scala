package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WriteRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.WriteRequest")
@js.native
/**
  * Constructs a new WriteRequest.
  * @param [properties] Properties to set
  */
open class WriteRequest ()
  extends StObject
     with IWriteRequest {
  def this(properties: IWriteRequest) = this()
  
  /** WriteRequest database. */
  @JSName("database")
  var database_WriteRequest: String = js.native
  
  /** WriteRequest labels. */
  @JSName("labels")
  var labels_WriteRequest: StringDictionary[String] = js.native
  
  /** WriteRequest streamId. */
  @JSName("streamId")
  var streamId_WriteRequest: String = js.native
  
  /** WriteRequest streamToken. */
  @JSName("streamToken")
  var streamToken_WriteRequest: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this WriteRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** WriteRequest writes. */
  @JSName("writes")
  var writes_WriteRequest: js.Array[IWrite] = js.native
}
object WriteRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.WriteRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a WriteRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns WriteRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): WriteRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[WriteRequest]
  
  /**
    * Creates a plain object from a WriteRequest message. Also converts values to other types if specified.
    * @param message WriteRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: WriteRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: WriteRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
