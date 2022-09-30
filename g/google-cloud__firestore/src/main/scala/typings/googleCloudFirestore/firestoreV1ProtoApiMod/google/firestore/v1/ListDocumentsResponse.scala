package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDocumentsResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ListDocumentsResponse")
@js.native
/**
  * Constructs a new ListDocumentsResponse.
  * @param [properties] Properties to set
  */
open class ListDocumentsResponse ()
  extends StObject
     with IListDocumentsResponse {
  def this(properties: IListDocumentsResponse) = this()
  
  /** ListDocumentsResponse documents. */
  @JSName("documents")
  var documents_ListDocumentsResponse: js.Array[IDocument] = js.native
  
  /** ListDocumentsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListDocumentsResponse: String = js.native
  
  /**
    * Converts this ListDocumentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDocumentsResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ListDocumentsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListDocumentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDocumentsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsResponse]
  
  /**
    * Creates a plain object from a ListDocumentsResponse message. Also converts values to other types if specified.
    * @param message ListDocumentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDocumentsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDocumentsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
