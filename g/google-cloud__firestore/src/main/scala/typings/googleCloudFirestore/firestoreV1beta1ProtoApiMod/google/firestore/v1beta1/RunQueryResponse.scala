package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RunQueryResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.RunQueryResponse")
@js.native
/**
  * Constructs a new RunQueryResponse.
  * @param [properties] Properties to set
  */
open class RunQueryResponse ()
  extends StObject
     with IRunQueryResponse {
  def this(properties: IRunQueryResponse) = this()
  
  /** RunQueryResponse skippedResults. */
  @JSName("skippedResults")
  var skippedResults_RunQueryResponse: Double = js.native
  
  /**
    * Converts this RunQueryResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** RunQueryResponse transaction. */
  @JSName("transaction")
  var transaction_RunQueryResponse: js.typedarray.Uint8Array = js.native
}
object RunQueryResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.RunQueryResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a RunQueryResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RunQueryResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): RunQueryResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RunQueryResponse]
  
  /**
    * Creates a plain object from a RunQueryResponse message. Also converts values to other types if specified.
    * @param message RunQueryResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: RunQueryResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RunQueryResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
