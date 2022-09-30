package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an IndexOperationMetadata. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.IndexOperationMetadata")
@js.native
/**
  * Constructs a new IndexOperationMetadata.
  * @param [properties] Properties to set
  */
open class IndexOperationMetadata ()
  extends StObject
     with IIndexOperationMetadata {
  def this(properties: IIndexOperationMetadata) = this()
  
  /** IndexOperationMetadata index. */
  @JSName("index")
  var index_IndexOperationMetadata: String = js.native
  
  /** IndexOperationMetadata state. */
  @JSName("state")
  var state_IndexOperationMetadata: OperationState = js.native
  
  /**
    * Converts this IndexOperationMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object IndexOperationMetadata {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.IndexOperationMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an IndexOperationMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns IndexOperationMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): IndexOperationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[IndexOperationMetadata]
  
  /**
    * Creates a plain object from an IndexOperationMetadata message. Also converts values to other types if specified.
    * @param message IndexOperationMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: IndexOperationMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: IndexOperationMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
