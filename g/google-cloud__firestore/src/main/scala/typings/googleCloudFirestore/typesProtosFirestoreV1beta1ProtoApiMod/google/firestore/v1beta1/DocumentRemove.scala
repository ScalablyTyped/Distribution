package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DocumentRemove. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.DocumentRemove")
@js.native
/**
  * Constructs a new DocumentRemove.
  * @param [properties] Properties to set
  */
open class DocumentRemove ()
  extends StObject
     with IDocumentRemove {
  def this(properties: IDocumentRemove) = this()
  
  /** DocumentRemove document. */
  @JSName("document")
  var document_DocumentRemove: String = js.native
  
  /** DocumentRemove removedTargetIds. */
  @JSName("removedTargetIds")
  var removedTargetIds_DocumentRemove: js.Array[Double] = js.native
  
  /**
    * Converts this DocumentRemove to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DocumentRemove {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.DocumentRemove")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a DocumentRemove message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DocumentRemove
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DocumentRemove = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DocumentRemove]
  
  /**
    * Creates a plain object from a DocumentRemove message. Also converts values to other types if specified.
    * @param message DocumentRemove
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DocumentRemove): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DocumentRemove, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
