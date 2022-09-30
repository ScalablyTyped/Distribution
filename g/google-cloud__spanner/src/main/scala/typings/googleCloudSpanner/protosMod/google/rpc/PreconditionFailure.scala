package typings.googleCloudSpanner.protosMod.google.rpc

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.rpc.PreconditionFailure.IViolation
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PreconditionFailure. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.PreconditionFailure")
@js.native
/**
  * Constructs a new PreconditionFailure.
  * @param [properties] Properties to set
  */
open class PreconditionFailure ()
  extends StObject
     with IPreconditionFailure {
  def this(properties: IPreconditionFailure) = this()
  
  /**
    * Converts this PreconditionFailure to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** PreconditionFailure violations. */
  @JSName("violations")
  var violations_PreconditionFailure: js.Array[IViolation] = js.native
}
object PreconditionFailure {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.PreconditionFailure")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a Violation. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.PreconditionFailure.Violation")
  @js.native
  /**
    * Constructs a new Violation.
    * @param [properties] Properties to set
    */
  open class Violation ()
    extends StObject
       with IViolation {
    def this(properties: IViolation) = this()
    
    /** Violation description. */
    @JSName("description")
    var description_Violation: String = js.native
    
    /** Violation subject. */
    @JSName("subject")
    var subject_Violation: String = js.native
    
    /**
      * Converts this Violation to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** Violation type. */
    @JSName("type")
    var type_Violation: String = js.native
  }
  object Violation {
    
    @JSImport("@google-cloud/spanner/build/protos/protos", "google.rpc.PreconditionFailure.Violation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Violation instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Violation instance
      */
    /* static member */
    inline def create(): Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Violation]
    inline def create(properties: IViolation): Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Violation]
    
    inline def decode(reader: js.typedarray.Uint8Array): Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Violation]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): Violation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Violation]
    /**
      * Decodes a Violation message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Violation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Violation]
    inline def decode(reader: Reader, length: Double): Violation = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Violation]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Violation]
    /**
      * Decodes a Violation message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Violation
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Violation]
    
    /**
      * Encodes the specified Violation message. Does not implicitly {@link google.rpc.PreconditionFailure.Violation.verify|verify} messages.
      * @param message Violation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IViolation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IViolation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Violation message, length delimited. Does not implicitly {@link google.rpc.PreconditionFailure.Violation.verify|verify} messages.
      * @param message Violation message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IViolation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IViolation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Violation message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Violation
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): Violation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Violation]
    
    /**
      * Gets the default type url for Violation
      * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
      * @returns The default type url
      */
    /* static member */
    inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
    inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Creates a plain object from a Violation message. Also converts values to other types if specified.
      * @param message Violation
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: Violation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: Violation, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a Violation message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new PreconditionFailure instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PreconditionFailure instance
    */
  /* static member */
  inline def create(): PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PreconditionFailure]
  inline def create(properties: IPreconditionFailure): PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PreconditionFailure]
  
  inline def decode(reader: js.typedarray.Uint8Array): PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PreconditionFailure]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PreconditionFailure = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PreconditionFailure]
  /**
    * Decodes a PreconditionFailure message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PreconditionFailure
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PreconditionFailure]
  inline def decode(reader: Reader, length: Double): PreconditionFailure = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PreconditionFailure]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PreconditionFailure]
  /**
    * Decodes a PreconditionFailure message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PreconditionFailure
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PreconditionFailure]
  
  /**
    * Encodes the specified PreconditionFailure message. Does not implicitly {@link google.rpc.PreconditionFailure.verify|verify} messages.
    * @param message PreconditionFailure message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPreconditionFailure): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPreconditionFailure, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PreconditionFailure message, length delimited. Does not implicitly {@link google.rpc.PreconditionFailure.verify|verify} messages.
    * @param message PreconditionFailure message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPreconditionFailure): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPreconditionFailure, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PreconditionFailure message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PreconditionFailure
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): PreconditionFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PreconditionFailure]
  
  /**
    * Gets the default type url for PreconditionFailure
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a PreconditionFailure message. Also converts values to other types if specified.
    * @param message PreconditionFailure
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PreconditionFailure): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PreconditionFailure, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PreconditionFailure message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a Violation. */
  trait IViolation extends StObject {
    
    /** Violation description */
    var description: js.UndefOr[String | Null] = js.undefined
    
    /** Violation subject */
    var subject: js.UndefOr[String | Null] = js.undefined
    
    /** Violation type */
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object IViolation {
    
    inline def apply(): IViolation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IViolation]
    }
    
    extension [Self <: IViolation](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectNull: Self = StObject.set(x, "subject", null)
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
