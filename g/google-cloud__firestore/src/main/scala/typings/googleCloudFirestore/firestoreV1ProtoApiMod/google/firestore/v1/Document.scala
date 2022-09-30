package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Document. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Document")
@js.native
/**
  * Constructs a new Document.
  * @param [properties] Properties to set
  */
open class Document ()
  extends StObject
     with IDocument {
  def this(properties: IDocument) = this()
  
  /** Document fields. */
  @JSName("fields")
  var fields_Document: StringDictionary[IValue] = js.native
  
  /** Document name. */
  @JSName("name")
  var name_Document: String = js.native
  
  /**
    * Converts this Document to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Document {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Document")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Document message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Document
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  /**
    * Creates a plain object from a Document message. Also converts values to other types if specified.
    * @param message Document
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Document): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Document, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
