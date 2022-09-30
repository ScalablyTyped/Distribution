package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GetFieldRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.GetFieldRequest")
@js.native
/**
  * Constructs a new GetFieldRequest.
  * @param [properties] Properties to set
  */
open class GetFieldRequest ()
  extends StObject
     with IGetFieldRequest {
  def this(properties: IGetFieldRequest) = this()
  
  /** GetFieldRequest name. */
  @JSName("name")
  var name_GetFieldRequest: String = js.native
  
  /**
    * Converts this GetFieldRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object GetFieldRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.GetFieldRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a GetFieldRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetFieldRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): GetFieldRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetFieldRequest]
  
  /**
    * Creates a plain object from a GetFieldRequest message. Also converts values to other types if specified.
    * @param message GetFieldRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: GetFieldRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GetFieldRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
