package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListDatabasesResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListDatabasesResponse")
@js.native
/**
  * Constructs a new ListDatabasesResponse.
  * @param [properties] Properties to set
  */
open class ListDatabasesResponse ()
  extends StObject
     with IListDatabasesResponse {
  def this(properties: IListDatabasesResponse) = this()
  
  /** ListDatabasesResponse databases. */
  @JSName("databases")
  var databases_ListDatabasesResponse: js.Array[IDatabase] = js.native
  
  /**
    * Converts this ListDatabasesResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListDatabasesResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ListDatabasesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListDatabasesResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListDatabasesResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListDatabasesResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListDatabasesResponse]
  
  /**
    * Creates a plain object from a ListDatabasesResponse message. Also converts values to other types if specified.
    * @param message ListDatabasesResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListDatabasesResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListDatabasesResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
