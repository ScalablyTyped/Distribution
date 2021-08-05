package typings.googleGax.iamServiceMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.UninterpretedOption.INamePart
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UninterpretedOption. */
@JSImport("google-gax/build/protos/iam_service", "google.protobuf.UninterpretedOption")
@js.native
/**
  * Constructs a new UninterpretedOption.
  * @param [properties] Properties to set
  */
class UninterpretedOption ()
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
  var negativeIntValue_UninterpretedOption: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** UninterpretedOption positiveIntValue. */
  @JSName("positiveIntValue")
  var positiveIntValue_UninterpretedOption: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  
  /** UninterpretedOption stringValue. */
  @JSName("stringValue")
  var stringValue_UninterpretedOption: Uint8Array = js.native
  
  /**
    * Converts this UninterpretedOption to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object UninterpretedOption {
  
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.UninterpretedOption")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a NamePart. */
  @JSImport("google-gax/build/protos/iam_service", "google.protobuf.UninterpretedOption.NamePart")
  @js.native
  /**
    * Constructs a new NamePart.
    * @param [properties] Properties to set
    */
  class NamePart ()
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
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object NamePart {
    
    @JSImport("google-gax/build/protos/iam_service", "google.protobuf.UninterpretedOption.NamePart")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new NamePart instance using the specified properties.
      * @param [properties] Properties to set
      * @returns NamePart instance
      */
    /* static member */
    inline def create(): NamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[NamePart]
    inline def create(properties: INamePart): NamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[NamePart]
    
    /**
      * Decodes a NamePart message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns NamePart
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): NamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[NamePart]
    inline def decode(reader: Reader, length: Double): NamePart = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[NamePart]
    inline def decode(reader: Uint8Array): NamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[NamePart]
    inline def decode(reader: Uint8Array, length: Double): NamePart = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[NamePart]
    
    /**
      * Decodes a NamePart message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns NamePart
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): NamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[NamePart]
    inline def decodeDelimited(reader: Uint8Array): NamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[NamePart]
    
    /**
      * Encodes the specified NamePart message. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
      * @param message NamePart message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: INamePart): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: INamePart, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified NamePart message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
      * @param message NamePart message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: INamePart): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: INamePart, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a NamePart message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns NamePart
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): NamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[NamePart]
    
    /**
      * Creates a plain object from a NamePart message. Also converts values to other types if specified.
      * @param message NamePart
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: NamePart): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(message: NamePart, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a NamePart message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new UninterpretedOption instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UninterpretedOption instance
    */
  /* static member */
  inline def create(): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[UninterpretedOption]
  inline def create(properties: IUninterpretedOption): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  
  /**
    * Decodes an UninterpretedOption message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UninterpretedOption
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  inline def decode(reader: Reader, length: Double): UninterpretedOption = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UninterpretedOption]
  inline def decode(reader: Uint8Array): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  inline def decode(reader: Uint8Array, length: Double): UninterpretedOption = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[UninterpretedOption]
  
  /**
    * Decodes an UninterpretedOption message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UninterpretedOption
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  inline def decodeDelimited(reader: Uint8Array): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  
  /**
    * Encodes the specified UninterpretedOption message. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
    * @param message UninterpretedOption message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IUninterpretedOption): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IUninterpretedOption, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified UninterpretedOption message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
    * @param message UninterpretedOption message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IUninterpretedOption): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IUninterpretedOption, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an UninterpretedOption message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UninterpretedOption
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  
  /**
    * Creates a plain object from an UninterpretedOption message. Also converts values to other types if specified.
    * @param message UninterpretedOption
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UninterpretedOption): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: UninterpretedOption, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an UninterpretedOption message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
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
    
    extension [Self <: INamePart](x: Self) {
      
      inline def setIsExtension(value: Boolean): Self = StObject.set(x, "isExtension", value.asInstanceOf[js.Any])
      
      inline def setNamePart(value: String): Self = StObject.set(x, "namePart", value.asInstanceOf[js.Any])
    }
  }
}
