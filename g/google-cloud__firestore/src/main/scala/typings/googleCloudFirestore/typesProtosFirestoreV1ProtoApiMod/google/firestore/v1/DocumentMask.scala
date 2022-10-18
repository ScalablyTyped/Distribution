package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DocumentMask. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.DocumentMask")
@js.native
/**
  * Constructs a new DocumentMask.
  * @param [properties] Properties to set
  */
open class DocumentMask ()
  extends StObject
     with IDocumentMask {
  def this(properties: IDocumentMask) = this()
  
  /** DocumentMask fieldPaths. */
  @JSName("fieldPaths")
  var fieldPaths_DocumentMask: js.Array[String] = js.native
  
  /**
    * Converts this DocumentMask to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DocumentMask {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.DocumentMask")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a DocumentMask message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DocumentMask
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DocumentMask = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DocumentMask]
  
  /**
    * Creates a plain object from a DocumentMask message. Also converts values to other types if specified.
    * @param message DocumentMask
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DocumentMask): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DocumentMask, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
