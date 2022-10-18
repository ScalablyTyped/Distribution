package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.readTime
import typings.googleCloudFirestore.googleCloudFirestoreStrings.transaction
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDocumentsRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ListDocumentsRequest")
@js.native
/**
  * Constructs a new ListDocumentsRequest.
  * @param [properties] Properties to set
  */
open class ListDocumentsRequest ()
  extends StObject
     with IListDocumentsRequest {
  def this(properties: IListDocumentsRequest) = this()
  
  /** ListDocumentsRequest collectionId. */
  @JSName("collectionId")
  var collectionId_ListDocumentsRequest: String = js.native
  
  /** ListDocumentsRequest consistencySelector. */
  var consistencySelector: js.UndefOr[transaction | readTime] = js.native
  
  /** ListDocumentsRequest orderBy. */
  @JSName("orderBy")
  var orderBy_ListDocumentsRequest: String = js.native
  
  /** ListDocumentsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListDocumentsRequest: Double = js.native
  
  /** ListDocumentsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListDocumentsRequest: String = js.native
  
  /** ListDocumentsRequest parent. */
  @JSName("parent")
  var parent_ListDocumentsRequest: String = js.native
  
  /** ListDocumentsRequest showMissing. */
  @JSName("showMissing")
  var showMissing_ListDocumentsRequest: Boolean = js.native
  
  /**
    * Converts this ListDocumentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDocumentsRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ListDocumentsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListDocumentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDocumentsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDocumentsRequest]
  
  /**
    * Creates a plain object from a ListDocumentsRequest message. Also converts values to other types if specified.
    * @param message ListDocumentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDocumentsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDocumentsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
