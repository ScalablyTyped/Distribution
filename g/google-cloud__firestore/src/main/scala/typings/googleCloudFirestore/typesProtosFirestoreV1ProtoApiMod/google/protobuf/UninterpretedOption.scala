package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf.UninterpretedOption.INamePart
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UninterpretedOption. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.UninterpretedOption")
@js.native
/**
  * Constructs a new UninterpretedOption.
  * @param [properties] Properties to set
  */
open class UninterpretedOption ()
  extends StObject
     with IUninterpretedOption {
  def this(properties: IUninterpretedOption) = this()
  
  /** UninterpretedOption aggregateValue. */
  @JSName("aggregateValue")
  var aggregateValue_UninterpretedOption: String = js.native
  
  /** UninterpretedOption doubleValue. */
  @JSName("doubleValue")
  var doubleValue_UninterpretedOption: Double = js.native
  
  /** UninterpretedOption identifierValue. */
  @JSName("identifierValue")
  var identifierValue_UninterpretedOption: String = js.native
  
  /** UninterpretedOption name. */
  @JSName("name")
  var name_UninterpretedOption: js.Array[INamePart] = js.native
  
  /** UninterpretedOption negativeIntValue. */
  @JSName("negativeIntValue")
  var negativeIntValue_UninterpretedOption: Double | String = js.native
  
  /** UninterpretedOption positiveIntValue. */
  @JSName("positiveIntValue")
  var positiveIntValue_UninterpretedOption: Double | String = js.native
  
  /** UninterpretedOption stringValue. */
  @JSName("stringValue")
  var stringValue_UninterpretedOption: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this UninterpretedOption to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object UninterpretedOption {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.UninterpretedOption")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a NamePart. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.UninterpretedOption.NamePart")
  @js.native
  /**
    * Constructs a new NamePart.
    * @param [properties] Properties to set
    */
  open class NamePart ()
    extends StObject
       with INamePart {
    def this(properties: INamePart) = this()
    
    /** NamePart isExtension */
    /* CompleteClass */
    var isExtension: Boolean = js.native
    
    /** NamePart namePart */
    /* CompleteClass */
    var namePart: String = js.native
    
    /**
      * Converts this NamePart to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[scala.Any] = js.native
  }
  object NamePart {
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.UninterpretedOption.NamePart")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a NamePart message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns NamePart
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[scala.Any]): NamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[NamePart]
    
    /**
      * Creates a plain object from a NamePart message. Also converts values to other types if specified.
      * @param message NamePart
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: NamePart): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
    inline def toObject(message: NamePart, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  }
  
  /**
    * Creates an UninterpretedOption message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UninterpretedOption
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  
  /**
    * Creates a plain object from an UninterpretedOption message. Also converts values to other types if specified.
    * @param message UninterpretedOption
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UninterpretedOption): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: UninterpretedOption, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /** Properties of a NamePart. */
  trait INamePart extends StObject {
    
    /** NamePart isExtension */
    var isExtension: Boolean
    
    /** NamePart namePart */
    var namePart: String
  }
  object INamePart {
    
    inline def apply(isExtension: Boolean, namePart: String): INamePart = {
      val __obj = js.Dynamic.literal(isExtension = isExtension.asInstanceOf[js.Any], namePart = namePart.asInstanceOf[js.Any])
      __obj.asInstanceOf[INamePart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INamePart] (val x: Self) extends AnyVal {
      
      inline def setIsExtension(value: Boolean): Self = StObject.set(x, "isExtension", value.asInstanceOf[js.Any])
      
      inline def setNamePart(value: String): Self = StObject.set(x, "namePart", value.asInstanceOf[js.Any])
    }
  }
}
