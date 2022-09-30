package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DocumentDelete. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.DocumentDelete")
@js.native
/**
  * Constructs a new DocumentDelete.
  * @param [properties] Properties to set
  */
open class DocumentDelete ()
  extends StObject
     with IDocumentDelete {
  def this(properties: IDocumentDelete) = this()
  
  /** DocumentDelete document. */
  @JSName("document")
  var document_DocumentDelete: String = js.native
  
  /** DocumentDelete removedTargetIds. */
  @JSName("removedTargetIds")
  var removedTargetIds_DocumentDelete: js.Array[Double] = js.native
  
  /**
    * Converts this DocumentDelete to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DocumentDelete {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.DocumentDelete")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a DocumentDelete message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DocumentDelete
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DocumentDelete = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DocumentDelete]
  
  /**
    * Creates a plain object from a DocumentDelete message. Also converts values to other types if specified.
    * @param message DocumentDelete
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DocumentDelete): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DocumentDelete, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
