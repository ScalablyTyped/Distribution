package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListFieldsResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListFieldsResponse")
@js.native
/**
  * Constructs a new ListFieldsResponse.
  * @param [properties] Properties to set
  */
open class ListFieldsResponse ()
  extends StObject
     with IListFieldsResponse {
  def this(properties: IListFieldsResponse) = this()
  
  /** ListFieldsResponse fields. */
  @JSName("fields")
  var fields_ListFieldsResponse: js.Array[IField] = js.native
  
  /** ListFieldsResponse nextPageToken. */
  @JSName("nextPageToken")
  var nextPageToken_ListFieldsResponse: String = js.native
  
  /**
    * Converts this ListFieldsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListFieldsResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListFieldsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListFieldsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListFieldsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListFieldsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListFieldsResponse]
  
  /**
    * Creates a plain object from a ListFieldsResponse message. Also converts values to other types if specified.
    * @param message ListFieldsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListFieldsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListFieldsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
