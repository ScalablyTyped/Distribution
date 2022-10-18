package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetIndexRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.GetIndexRequest")
@js.native
/**
  * Constructs a new GetIndexRequest.
  * @param [properties] Properties to set
  */
open class GetIndexRequest ()
  extends StObject
     with IGetIndexRequest {
  def this(properties: IGetIndexRequest) = this()
  
  /** GetIndexRequest name. */
  @JSName("name")
  var name_GetIndexRequest: String = js.native
  
  /**
    * Converts this GetIndexRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetIndexRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.GetIndexRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a GetIndexRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetIndexRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetIndexRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetIndexRequest]
  
  /**
    * Creates a plain object from a GetIndexRequest message. Also converts values to other types if specified.
    * @param message GetIndexRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetIndexRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetIndexRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
