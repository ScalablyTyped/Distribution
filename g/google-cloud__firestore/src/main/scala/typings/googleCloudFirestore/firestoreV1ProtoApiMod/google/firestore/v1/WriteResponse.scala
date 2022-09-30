package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WriteResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.WriteResponse")
@js.native
/**
  * Constructs a new WriteResponse.
  * @param [properties] Properties to set
  */
open class WriteResponse ()
  extends StObject
     with IWriteResponse {
  def this(properties: IWriteResponse) = this()
  
  /** WriteResponse streamId. */
  @JSName("streamId")
  var streamId_WriteResponse: String = js.native
  
  /** WriteResponse streamToken. */
  @JSName("streamToken")
  var streamToken_WriteResponse: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this WriteResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** WriteResponse writeResults. */
  @JSName("writeResults")
  var writeResults_WriteResponse: js.Array[IWriteResult] = js.native
}
object WriteResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.WriteResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a WriteResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns WriteResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): WriteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[WriteResponse]
  
  /**
    * Creates a plain object from a WriteResponse message. Also converts values to other types if specified.
    * @param message WriteResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: WriteResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: WriteResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
