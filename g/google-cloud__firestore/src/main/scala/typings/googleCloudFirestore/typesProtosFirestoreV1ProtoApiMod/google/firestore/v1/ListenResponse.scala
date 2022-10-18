package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.documentChange
import typings.googleCloudFirestore.googleCloudFirestoreStrings.documentDelete
import typings.googleCloudFirestore.googleCloudFirestoreStrings.documentRemove
import typings.googleCloudFirestore.googleCloudFirestoreStrings.filter
import typings.googleCloudFirestore.googleCloudFirestoreStrings.targetChange
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListenResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ListenResponse")
@js.native
/**
  * Constructs a new ListenResponse.
  * @param [properties] Properties to set
  */
open class ListenResponse ()
  extends StObject
     with IListenResponse {
  def this(properties: IListenResponse) = this()
  
  /** ListenResponse responseType. */
  var responseType: js.UndefOr[targetChange | documentChange | documentDelete | documentRemove | filter] = js.native
  
  /**
    * Converts this ListenResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListenResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ListenResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListenResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListenResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListenResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListenResponse]
  
  /**
    * Creates a plain object from a ListenResponse message. Also converts values to other types if specified.
    * @param message ListenResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListenResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListenResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
