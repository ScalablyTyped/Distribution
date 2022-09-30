package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListCollectionIdsResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ListCollectionIdsResponse")
@js.native
/**
  * Constructs a new ListCollectionIdsResponse.
  * @param [properties] Properties to set
  */
open class ListCollectionIdsResponse ()
  extends StObject
     with IListCollectionIdsResponse {
  def this(properties: IListCollectionIdsResponse) = this()
  
  /** ListCollectionIdsResponse collectionIds. */
  @JSName("collectionIds")
  var collectionIds_ListCollectionIdsResponse: js.Array[String] = js.native
  
  /** ListCollectionIdsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListCollectionIdsResponse: String = js.native
  
  /**
    * Converts this ListCollectionIdsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListCollectionIdsResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ListCollectionIdsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListCollectionIdsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListCollectionIdsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListCollectionIdsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListCollectionIdsResponse]
  
  /**
    * Creates a plain object from a ListCollectionIdsResponse message. Also converts values to other types if specified.
    * @param message ListCollectionIdsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListCollectionIdsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListCollectionIdsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
