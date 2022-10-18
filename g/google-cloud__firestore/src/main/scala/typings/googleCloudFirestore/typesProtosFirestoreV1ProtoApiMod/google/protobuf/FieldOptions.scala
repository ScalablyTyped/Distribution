package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.FieldOptions.CType
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.FieldOptions.JSType
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FieldOptions. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.FieldOptions")
@js.native
/**
  * Constructs a new FieldOptions.
  * @param [properties] Properties to set
  */
open class FieldOptions ()
  extends StObject
     with IFieldOptions {
  def this(properties: IFieldOptions) = this()
  
  /** FieldOptions ctype. */
  @JSName("ctype")
  var ctype_FieldOptions: CType = js.native
  
  /** FieldOptions deprecated. */
  @JSName("deprecated")
  var deprecated_FieldOptions: Boolean = js.native
  
  /** FieldOptions jstype. */
  @JSName("jstype")
  var jstype_FieldOptions: JSType = js.native
  
  /** FieldOptions lazy. */
  @JSName("lazy")
  var lazy_FieldOptions: Boolean = js.native
  
  /** FieldOptions packed. */
  @JSName("packed")
  var packed_FieldOptions: Boolean = js.native
  
  /**
    * Converts this FieldOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** FieldOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_FieldOptions: js.Array[IUninterpretedOption] = js.native
  
  /** FieldOptions weak. */
  @JSName("weak")
  var weak_FieldOptions: Boolean = js.native
}
object FieldOptions {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.FieldOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a FieldOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  
  /**
    * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
    * @param message FieldOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FieldOptions): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: FieldOptions, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /** CType enum. */
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.STRING
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.CORD
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.STRING_PIECE
  */
  trait CType extends StObject
  object CType {
    
    inline def CORD: typings.googleCloudFirestore.googleCloudFirestoreStrings.CORD = "CORD".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.CORD]
    
    inline def STRING: typings.googleCloudFirestore.googleCloudFirestoreStrings.STRING = "STRING".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.STRING]
    
    inline def STRING_PIECE: typings.googleCloudFirestore.googleCloudFirestoreStrings.STRING_PIECE = "STRING_PIECE".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.STRING_PIECE]
  }
  
  /** JSType enum. */
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.JS_NORMAL
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.JS_STRING
    - typings.googleCloudFirestore.googleCloudFirestoreStrings.JS_NUMBER
  */
  trait JSType extends StObject
  object JSType {
    
    inline def JS_NORMAL: typings.googleCloudFirestore.googleCloudFirestoreStrings.JS_NORMAL = "JS_NORMAL".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.JS_NORMAL]
    
    inline def JS_NUMBER: typings.googleCloudFirestore.googleCloudFirestoreStrings.JS_NUMBER = "JS_NUMBER".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.JS_NUMBER]
    
    inline def JS_STRING: typings.googleCloudFirestore.googleCloudFirestoreStrings.JS_STRING = "JS_STRING".asInstanceOf[typings.googleCloudFirestore.googleCloudFirestoreStrings.JS_STRING]
  }
}
