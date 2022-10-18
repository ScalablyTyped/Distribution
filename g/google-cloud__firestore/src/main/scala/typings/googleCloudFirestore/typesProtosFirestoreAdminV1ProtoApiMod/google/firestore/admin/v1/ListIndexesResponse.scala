package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListIndexesResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListIndexesResponse")
@js.native
/**
  * Constructs a new ListIndexesResponse.
  * @param [properties] Properties to set
  */
open class ListIndexesResponse ()
  extends StObject
     with IListIndexesResponse {
  def this(properties: IListIndexesResponse) = this()
  
  /** ListIndexesResponse indexes. */
  @JSName("indexes")
  var indexes_ListIndexesResponse: js.Array[IIndex] = js.native
  
  /** ListIndexesResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListIndexesResponse: String = js.native
  
  /**
    * Converts this ListIndexesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListIndexesResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListIndexesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListIndexesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListIndexesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListIndexesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListIndexesResponse]
  
  /**
    * Creates a plain object from a ListIndexesResponse message. Also converts values to other types if specified.
    * @param message ListIndexesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListIndexesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListIndexesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
