package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetDatabaseRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.GetDatabaseRequest")
@js.native
/**
  * Constructs a new GetDatabaseRequest.
  * @param [properties] Properties to set
  */
open class GetDatabaseRequest ()
  extends StObject
     with IGetDatabaseRequest {
  def this(properties: IGetDatabaseRequest) = this()
  
  /** GetDatabaseRequest name. */
  @JSName("name")
  var name_GetDatabaseRequest: String = js.native
  
  /**
    * Converts this GetDatabaseRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetDatabaseRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.GetDatabaseRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a GetDatabaseRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetDatabaseRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetDatabaseRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetDatabaseRequest]
  
  /**
    * Creates a plain object from a GetDatabaseRequest message. Also converts values to other types if specified.
    * @param message GetDatabaseRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetDatabaseRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetDatabaseRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
