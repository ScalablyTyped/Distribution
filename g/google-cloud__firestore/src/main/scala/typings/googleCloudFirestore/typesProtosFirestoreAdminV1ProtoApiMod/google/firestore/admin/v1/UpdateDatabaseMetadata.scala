package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateDatabaseMetadata. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.UpdateDatabaseMetadata")
@js.native
/**
  * Constructs a new UpdateDatabaseMetadata.
  * @param [properties] Properties to set
  */
open class UpdateDatabaseMetadata ()
  extends StObject
     with IUpdateDatabaseMetadata {
  def this(properties: IUpdateDatabaseMetadata) = this()
  
  /**
    * Converts this UpdateDatabaseMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object UpdateDatabaseMetadata {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.UpdateDatabaseMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an UpdateDatabaseMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateDatabaseMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): UpdateDatabaseMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateDatabaseMetadata]
  
  /**
    * Creates a plain object from an UpdateDatabaseMetadata message. Also converts values to other types if specified.
    * @param message UpdateDatabaseMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UpdateDatabaseMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: UpdateDatabaseMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
