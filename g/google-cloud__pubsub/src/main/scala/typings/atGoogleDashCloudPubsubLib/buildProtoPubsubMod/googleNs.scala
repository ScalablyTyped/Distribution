package typings
package atGoogleDashCloudPubsubLib.buildProtoPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google")
@js.native
object googleNs extends js.Object {
  /** Namespace api. */
  @JSName("api")
  @js.native
  object apiNs extends js.Object {
    /** Represents a CustomHttpPattern. */
    @js.native
    /**
      * Constructs a new CustomHttpPattern.
      * @param [properties] Properties to set
      */
    class CustomHttpPattern () extends ICustomHttpPattern {
      def this(properties: ICustomHttpPattern) = this()
      /** CustomHttpPattern kind. */
      @JSName("kind")
      var kind_CustomHttpPattern: java.lang.String = js.native
      /** CustomHttpPattern path. */
      @JSName("path")
      var path_CustomHttpPattern: java.lang.String = js.native
      /**
        * Converts this CustomHttpPattern to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a Http. */
    @js.native
    /**
      * Constructs a new Http.
      * @param [properties] Properties to set
      */
    class Http () extends IHttp {
      def this(properties: IHttp) = this()
      /** Http rules. */
      @JSName("rules")
      var rules_Http: js.Array[IHttpRule] = js.native
      /**
        * Converts this Http to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a HttpRule. */
    @js.native
    /**
      * Constructs a new HttpRule.
      * @param [properties] Properties to set
      */
    class HttpRule () extends IHttpRule {
      def this(properties: IHttpRule) = this()
      /** HttpRule additionalBindings. */
      @JSName("additionalBindings")
      var additionalBindings_HttpRule: js.Array[IHttpRule] = js.native
      /** HttpRule body. */
      @JSName("body")
      var body_HttpRule: java.lang.String = js.native
      /** HttpRule delete. */
      @JSName("delete")
      var delete_HttpRule: java.lang.String = js.native
      /** HttpRule get. */
      @JSName("get")
      var get_HttpRule: java.lang.String = js.native
      /** HttpRule patch. */
      @JSName("patch")
      var patch_HttpRule: java.lang.String = js.native
      /** HttpRule pattern. */
      var pattern: js.UndefOr[
            atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.get | atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.put | atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.post | atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.delete | atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.patch | atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.custom
          ] = js.native
      /** HttpRule post. */
      @JSName("post")
      var post_HttpRule: java.lang.String = js.native
      /** HttpRule put. */
      @JSName("put")
      var put_HttpRule: java.lang.String = js.native
      /** HttpRule selector. */
      @JSName("selector")
      var selector_HttpRule: java.lang.String = js.native
      /**
        * Converts this HttpRule to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Properties of a CustomHttpPattern. */
    trait ICustomHttpPattern extends js.Object {
      /** CustomHttpPattern kind */
      var kind: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** CustomHttpPattern path */
      var path: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    }
    
    /** Properties of a Http. */
    trait IHttp extends js.Object {
      /** Http rules */
      var rules: js.UndefOr[js.Array[IHttpRule] | scala.Null] = js.undefined
    }
    
    /** Properties of a HttpRule. */
    trait IHttpRule extends js.Object {
      /** HttpRule additionalBindings */
      var additionalBindings: js.UndefOr[js.Array[IHttpRule] | scala.Null] = js.undefined
      /** HttpRule body */
      var body: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** HttpRule custom */
      var custom: js.UndefOr[ICustomHttpPattern | scala.Null] = js.undefined
      /** HttpRule delete */
      var delete: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** HttpRule get */
      var get: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** HttpRule patch */
      var patch: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** HttpRule post */
      var post: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** HttpRule put */
      var put: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** HttpRule selector */
      var selector: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    }
    
    /* static members */
    @js.native
    object CustomHttpPattern extends js.Object {
      /**
        * Creates a new CustomHttpPattern instance using the specified properties.
        * @param [properties] Properties to set
        * @returns CustomHttpPattern instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.ICustomHttpPattern): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern = js.native
      /**
        * Decodes a CustomHttpPattern message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns CustomHttpPattern
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern = js.native
      /**
        * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns CustomHttpPattern
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern = js.native
      /**
        * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
        * @param message CustomHttpPattern message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.ICustomHttpPattern): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.ICustomHttpPattern,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
        * @param message CustomHttpPattern message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.ICustomHttpPattern): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.ICustomHttpPattern,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns CustomHttpPattern
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern = js.native
      /**
        * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
        * @param message CustomHttpPattern
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.CustomHttpPattern,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a CustomHttpPattern message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object Http extends js.Object {
      /**
        * Creates a new Http instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Http instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttp): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http = js.native
      /**
        * Decodes a Http message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Http
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http = js.native
      /**
        * Decodes a Http message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Http
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http = js.native
      /**
        * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
        * @param message Http message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttp): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttp,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
        * @param message Http message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttp): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttp,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a Http message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Http
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http = js.native
      /**
        * Creates a plain object from a Http message. Also converts values to other types if specified.
        * @param message Http
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.Http,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a Http message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object HttpRule extends js.Object {
      /**
        * Creates a new HttpRule instance using the specified properties.
        * @param [properties] Properties to set
        * @returns HttpRule instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttpRule): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule = js.native
      /**
        * Decodes a HttpRule message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns HttpRule
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule = js.native
      /**
        * Decodes a HttpRule message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns HttpRule
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule = js.native
      /**
        * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
        * @param message HttpRule message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttpRule): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttpRule,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
        * @param message HttpRule message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttpRule): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttpRule,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns HttpRule
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule = js.native
      /**
        * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
        * @param message HttpRule
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.HttpRule,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a HttpRule message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
  }
  
  /** Namespace protobuf. */
  @JSName("protobuf")
  @js.native
  object protobufNs extends js.Object {
    /** Represents a DescriptorProto. */
    @js.native
    /**
      * Constructs a new DescriptorProto.
      * @param [properties] Properties to set
      */
    class DescriptorProto () extends IDescriptorProto {
      def this(properties: IDescriptorProto) = this()
      /** DescriptorProto enumType. */
      @JSName("enumType")
      var enumType_DescriptorProto: js.Array[IEnumDescriptorProto] = js.native
      /** DescriptorProto extensionRange. */
      @JSName("extensionRange")
      var extensionRange_DescriptorProto: js.Array[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
          ] = js.native
      /** DescriptorProto extension. */
      @JSName("extension")
      var extension_DescriptorProto: js.Array[IFieldDescriptorProto] = js.native
      /** DescriptorProto field. */
      @JSName("field")
      var field_DescriptorProto: js.Array[IFieldDescriptorProto] = js.native
      /** DescriptorProto name. */
      @JSName("name")
      var name_DescriptorProto: java.lang.String = js.native
      /** DescriptorProto nestedType. */
      @JSName("nestedType")
      var nestedType_DescriptorProto: js.Array[IDescriptorProto] = js.native
      /** DescriptorProto oneofDecl. */
      @JSName("oneofDecl")
      var oneofDecl_DescriptorProto: js.Array[IOneofDescriptorProto] = js.native
      /** DescriptorProto reservedName. */
      @JSName("reservedName")
      var reservedName_DescriptorProto: js.Array[java.lang.String] = js.native
      /** DescriptorProto reservedRange. */
      @JSName("reservedRange")
      var reservedRange_DescriptorProto: js.Array[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
          ] = js.native
      /**
        * Converts this DescriptorProto to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a Duration. */
    @js.native
    /**
      * Constructs a new Duration.
      * @param [properties] Properties to set
      */
    class Duration () extends IDuration {
      def this(properties: IDuration) = this()
      /** Duration nanos. */
      @JSName("nanos")
      var nanos_Duration: scala.Double = js.native
      /** Duration seconds. */
      @JSName("seconds")
      var seconds_Duration: scala.Double | longLib.longMod.^  = js.native
      /**
        * Converts this Duration to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents an Empty. */
    @js.native
    /**
      * Constructs a new Empty.
      * @param [properties] Properties to set
      */
    class Empty () extends IEmpty {
      def this(properties: IEmpty) = this()
      /**
        * Converts this Empty to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents an EnumDescriptorProto. */
    @js.native
    /**
      * Constructs a new EnumDescriptorProto.
      * @param [properties] Properties to set
      */
    class EnumDescriptorProto () extends IEnumDescriptorProto {
      def this(properties: IEnumDescriptorProto) = this()
      /** EnumDescriptorProto name. */
      @JSName("name")
      var name_EnumDescriptorProto: java.lang.String = js.native
      /** EnumDescriptorProto value. */
      @JSName("value")
      var value_EnumDescriptorProto: js.Array[IEnumValueDescriptorProto] = js.native
      /**
        * Converts this EnumDescriptorProto to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents an EnumOptions. */
    @js.native
    /**
      * Constructs a new EnumOptions.
      * @param [properties] Properties to set
      */
    class EnumOptions () extends IEnumOptions {
      def this(properties: IEnumOptions) = this()
      /** EnumOptions allowAlias. */
      @JSName("allowAlias")
      var allowAlias_EnumOptions: scala.Boolean = js.native
      /** EnumOptions deprecated. */
      @JSName("deprecated")
      var deprecated_EnumOptions: scala.Boolean = js.native
      /** EnumOptions uninterpretedOption. */
      @JSName("uninterpretedOption")
      var uninterpretedOption_EnumOptions: js.Array[IUninterpretedOption] = js.native
      /**
        * Converts this EnumOptions to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents an EnumValueDescriptorProto. */
    @js.native
    /**
      * Constructs a new EnumValueDescriptorProto.
      * @param [properties] Properties to set
      */
    class EnumValueDescriptorProto () extends IEnumValueDescriptorProto {
      def this(properties: IEnumValueDescriptorProto) = this()
      /** EnumValueDescriptorProto name. */
      @JSName("name")
      var name_EnumValueDescriptorProto: java.lang.String = js.native
      /** EnumValueDescriptorProto number. */
      @JSName("number")
      var number_EnumValueDescriptorProto: scala.Double = js.native
      /**
        * Converts this EnumValueDescriptorProto to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents an EnumValueOptions. */
    @js.native
    /**
      * Constructs a new EnumValueOptions.
      * @param [properties] Properties to set
      */
    class EnumValueOptions () extends IEnumValueOptions {
      def this(properties: IEnumValueOptions) = this()
      /** EnumValueOptions deprecated. */
      @JSName("deprecated")
      var deprecated_EnumValueOptions: scala.Boolean = js.native
      /** EnumValueOptions uninterpretedOption. */
      @JSName("uninterpretedOption")
      var uninterpretedOption_EnumValueOptions: js.Array[IUninterpretedOption] = js.native
      /**
        * Converts this EnumValueOptions to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a FieldDescriptorProto. */
    @js.native
    /**
      * Constructs a new FieldDescriptorProto.
      * @param [properties] Properties to set
      */
    class FieldDescriptorProto () extends IFieldDescriptorProto {
      def this(properties: IFieldDescriptorProto) = this()
      /** FieldDescriptorProto defaultValue. */
      @JSName("defaultValue")
      var defaultValue_FieldDescriptorProto: java.lang.String = js.native
      /** FieldDescriptorProto extendee. */
      @JSName("extendee")
      var extendee_FieldDescriptorProto: java.lang.String = js.native
      /** FieldDescriptorProto jsonName. */
      @JSName("jsonName")
      var jsonName_FieldDescriptorProto: java.lang.String = js.native
      /** FieldDescriptorProto label. */
      @JSName("label")
      var label_FieldDescriptorProto: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label = js.native
      /** FieldDescriptorProto name. */
      @JSName("name")
      var name_FieldDescriptorProto: java.lang.String = js.native
      /** FieldDescriptorProto number. */
      @JSName("number")
      var number_FieldDescriptorProto: scala.Double = js.native
      /** FieldDescriptorProto oneofIndex. */
      @JSName("oneofIndex")
      var oneofIndex_FieldDescriptorProto: scala.Double = js.native
      /** FieldDescriptorProto typeName. */
      @JSName("typeName")
      var typeName_FieldDescriptorProto: java.lang.String = js.native
      /** FieldDescriptorProto type. */
      @JSName("type")
      var type_FieldDescriptorProto: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type = js.native
      /**
        * Converts this FieldDescriptorProto to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a FieldMask. */
    @js.native
    /**
      * Constructs a new FieldMask.
      * @param [properties] Properties to set
      */
    class FieldMask () extends IFieldMask {
      def this(properties: IFieldMask) = this()
      /** FieldMask paths. */
      @JSName("paths")
      var paths_FieldMask: js.Array[java.lang.String] = js.native
      /**
        * Converts this FieldMask to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a FieldOptions. */
    @js.native
    /**
      * Constructs a new FieldOptions.
      * @param [properties] Properties to set
      */
    class FieldOptions () extends IFieldOptions {
      def this(properties: IFieldOptions) = this()
      /** FieldOptions ctype. */
      @JSName("ctype")
      var ctype_FieldOptions: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.CType = js.native
      /** FieldOptions deprecated. */
      @JSName("deprecated")
      var deprecated_FieldOptions: scala.Boolean = js.native
      /** FieldOptions jstype. */
      @JSName("jstype")
      var jstype_FieldOptions: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.JSType = js.native
      /** FieldOptions lazy. */
      @JSName("lazy")
      var lazy_FieldOptions: scala.Boolean = js.native
      /** FieldOptions packed. */
      @JSName("packed")
      var packed_FieldOptions: scala.Boolean = js.native
      /** FieldOptions uninterpretedOption. */
      @JSName("uninterpretedOption")
      var uninterpretedOption_FieldOptions: js.Array[IUninterpretedOption] = js.native
      /** FieldOptions weak. */
      @JSName("weak")
      var weak_FieldOptions: scala.Boolean = js.native
      /**
        * Converts this FieldOptions to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a FileDescriptorProto. */
    @js.native
    /**
      * Constructs a new FileDescriptorProto.
      * @param [properties] Properties to set
      */
    class FileDescriptorProto () extends IFileDescriptorProto {
      def this(properties: IFileDescriptorProto) = this()
      /** FileDescriptorProto dependency. */
      @JSName("dependency")
      var dependency_FileDescriptorProto: js.Array[java.lang.String] = js.native
      /** FileDescriptorProto enumType. */
      @JSName("enumType")
      var enumType_FileDescriptorProto: js.Array[IEnumDescriptorProto] = js.native
      /** FileDescriptorProto extension. */
      @JSName("extension")
      var extension_FileDescriptorProto: js.Array[IFieldDescriptorProto] = js.native
      /** FileDescriptorProto messageType. */
      @JSName("messageType")
      var messageType_FileDescriptorProto: js.Array[IDescriptorProto] = js.native
      /** FileDescriptorProto name. */
      @JSName("name")
      var name_FileDescriptorProto: java.lang.String = js.native
      /** FileDescriptorProto package. */
      @JSName("package")
      var package_FileDescriptorProto: java.lang.String = js.native
      /** FileDescriptorProto publicDependency. */
      @JSName("publicDependency")
      var publicDependency_FileDescriptorProto: js.Array[scala.Double] = js.native
      /** FileDescriptorProto service. */
      @JSName("service")
      var service_FileDescriptorProto: js.Array[IServiceDescriptorProto] = js.native
      /** FileDescriptorProto syntax. */
      @JSName("syntax")
      var syntax_FileDescriptorProto: java.lang.String = js.native
      /** FileDescriptorProto weakDependency. */
      @JSName("weakDependency")
      var weakDependency_FileDescriptorProto: js.Array[scala.Double] = js.native
      /**
        * Converts this FileDescriptorProto to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a FileDescriptorSet. */
    @js.native
    /**
      * Constructs a new FileDescriptorSet.
      * @param [properties] Properties to set
      */
    class FileDescriptorSet () extends IFileDescriptorSet {
      def this(properties: IFileDescriptorSet) = this()
      /** FileDescriptorSet file. */
      @JSName("file")
      var file_FileDescriptorSet: js.Array[IFileDescriptorProto] = js.native
      /**
        * Converts this FileDescriptorSet to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a FileOptions. */
    @js.native
    /**
      * Constructs a new FileOptions.
      * @param [properties] Properties to set
      */
    class FileOptions () extends IFileOptions {
      def this(properties: IFileOptions) = this()
      /** FileOptions ccEnableArenas. */
      @JSName("ccEnableArenas")
      var ccEnableArenas_FileOptions: scala.Boolean = js.native
      /** FileOptions ccGenericServices. */
      @JSName("ccGenericServices")
      var ccGenericServices_FileOptions: scala.Boolean = js.native
      /** FileOptions csharpNamespace. */
      @JSName("csharpNamespace")
      var csharpNamespace_FileOptions: java.lang.String = js.native
      /** FileOptions deprecated. */
      @JSName("deprecated")
      var deprecated_FileOptions: scala.Boolean = js.native
      /** FileOptions goPackage. */
      @JSName("goPackage")
      var goPackage_FileOptions: java.lang.String = js.native
      /** FileOptions javaGenerateEqualsAndHash. */
      @JSName("javaGenerateEqualsAndHash")
      var javaGenerateEqualsAndHash_FileOptions: scala.Boolean = js.native
      /** FileOptions javaGenericServices. */
      @JSName("javaGenericServices")
      var javaGenericServices_FileOptions: scala.Boolean = js.native
      /** FileOptions javaMultipleFiles. */
      @JSName("javaMultipleFiles")
      var javaMultipleFiles_FileOptions: scala.Boolean = js.native
      /** FileOptions javaOuterClassname. */
      @JSName("javaOuterClassname")
      var javaOuterClassname_FileOptions: java.lang.String = js.native
      /** FileOptions javaPackage. */
      @JSName("javaPackage")
      var javaPackage_FileOptions: java.lang.String = js.native
      /** FileOptions javaStringCheckUtf8. */
      @JSName("javaStringCheckUtf8")
      var javaStringCheckUtf8_FileOptions: scala.Boolean = js.native
      /** FileOptions objcClassPrefix. */
      @JSName("objcClassPrefix")
      var objcClassPrefix_FileOptions: java.lang.String = js.native
      /** FileOptions optimizeFor. */
      @JSName("optimizeFor")
      var optimizeFor_FileOptions: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode = js.native
      /** FileOptions phpClassPrefix. */
      @JSName("phpClassPrefix")
      var phpClassPrefix_FileOptions: java.lang.String = js.native
      /** FileOptions pyGenericServices. */
      @JSName("pyGenericServices")
      var pyGenericServices_FileOptions: scala.Boolean = js.native
      /** FileOptions swiftPrefix. */
      @JSName("swiftPrefix")
      var swiftPrefix_FileOptions: java.lang.String = js.native
      /** FileOptions uninterpretedOption. */
      @JSName("uninterpretedOption")
      var uninterpretedOption_FileOptions: js.Array[IUninterpretedOption] = js.native
      /**
        * Converts this FileOptions to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a GeneratedCodeInfo. */
    @js.native
    /**
      * Constructs a new GeneratedCodeInfo.
      * @param [properties] Properties to set
      */
    class GeneratedCodeInfo () extends IGeneratedCodeInfo {
      def this(properties: IGeneratedCodeInfo) = this()
      /** GeneratedCodeInfo annotation. */
      @JSName("annotation")
      var annotation_GeneratedCodeInfo: js.Array[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
          ] = js.native
      /**
        * Converts this GeneratedCodeInfo to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Properties of a DescriptorProto. */
    trait IDescriptorProto extends js.Object {
      /** DescriptorProto enumType */
      var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | scala.Null] = js.undefined
      /** DescriptorProto extension */
      var extension: js.UndefOr[js.Array[IFieldDescriptorProto] | scala.Null] = js.undefined
      /** DescriptorProto extensionRange */
      var extensionRange: js.UndefOr[
            (js.Array[
              atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
            ]) | scala.Null
          ] = js.undefined
      /** DescriptorProto field */
      var field: js.UndefOr[js.Array[IFieldDescriptorProto] | scala.Null] = js.undefined
      /** DescriptorProto name */
      var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** DescriptorProto nestedType */
      var nestedType: js.UndefOr[js.Array[IDescriptorProto] | scala.Null] = js.undefined
      /** DescriptorProto oneofDecl */
      var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto] | scala.Null] = js.undefined
      /** DescriptorProto options */
      var options: js.UndefOr[IMessageOptions | scala.Null] = js.undefined
      /** DescriptorProto reservedName */
      var reservedName: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
      /** DescriptorProto reservedRange */
      var reservedRange: js.UndefOr[
            (js.Array[
              atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
            ]) | scala.Null
          ] = js.undefined
    }
    
    /** Properties of a Duration. */
    trait IDuration extends js.Object {
      /** Duration nanos */
      var nanos: js.UndefOr[scala.Double | scala.Null] = js.undefined
      /** Duration seconds */
      var seconds: js.UndefOr[scala.Double | longLib.longMod.^  | scala.Null] = js.undefined
    }
    
    /** Properties of an Empty. */
    trait IEmpty extends js.Object
    
    /** Properties of an EnumDescriptorProto. */
    trait IEnumDescriptorProto extends js.Object {
      /** EnumDescriptorProto name */
      var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** EnumDescriptorProto options */
      var options: js.UndefOr[IEnumOptions | scala.Null] = js.undefined
      /** EnumDescriptorProto value */
      var value: js.UndefOr[js.Array[IEnumValueDescriptorProto] | scala.Null] = js.undefined
    }
    
    /** Properties of an EnumOptions. */
    trait IEnumOptions extends js.Object {
      /** EnumOptions allowAlias */
      var allowAlias: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** EnumOptions deprecated */
      var deprecated: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** EnumOptions uninterpretedOption */
      var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | scala.Null] = js.undefined
    }
    
    /** Properties of an EnumValueDescriptorProto. */
    trait IEnumValueDescriptorProto extends js.Object {
      /** EnumValueDescriptorProto name */
      var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** EnumValueDescriptorProto number */
      var number: js.UndefOr[scala.Double | scala.Null] = js.undefined
      /** EnumValueDescriptorProto options */
      var options: js.UndefOr[IEnumValueOptions | scala.Null] = js.undefined
    }
    
    /** Properties of an EnumValueOptions. */
    trait IEnumValueOptions extends js.Object {
      /** EnumValueOptions deprecated */
      var deprecated: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** EnumValueOptions uninterpretedOption */
      var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | scala.Null] = js.undefined
    }
    
    /** Properties of a FieldDescriptorProto. */
    trait IFieldDescriptorProto extends js.Object {
      /** FieldDescriptorProto defaultValue */
      var defaultValue: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FieldDescriptorProto extendee */
      var extendee: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FieldDescriptorProto jsonName */
      var jsonName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FieldDescriptorProto label */
      var label: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label | scala.Null
          ] = js.undefined
      /** FieldDescriptorProto name */
      var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FieldDescriptorProto number */
      var number: js.UndefOr[scala.Double | scala.Null] = js.undefined
      /** FieldDescriptorProto oneofIndex */
      var oneofIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
      /** FieldDescriptorProto options */
      var options: js.UndefOr[IFieldOptions | scala.Null] = js.undefined
      /** FieldDescriptorProto type */
      var `type`: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type | scala.Null
          ] = js.undefined
      /** FieldDescriptorProto typeName */
      var typeName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    }
    
    /** Properties of a FieldMask. */
    trait IFieldMask extends js.Object {
      /** FieldMask paths */
      var paths: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
    }
    
    /** Properties of a FieldOptions. */
    trait IFieldOptions extends js.Object {
      /** FieldOptions ctype */
      var ctype: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.CType | scala.Null
          ] = js.undefined
      /** FieldOptions deprecated */
      var deprecated: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FieldOptions jstype */
      var jstype: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.JSType | scala.Null
          ] = js.undefined
      /** FieldOptions lazy */
      var `lazy`: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FieldOptions packed */
      var packed: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FieldOptions uninterpretedOption */
      var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | scala.Null] = js.undefined
      /** FieldOptions weak */
      var weak: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    }
    
    /** Properties of a FileDescriptorProto. */
    trait IFileDescriptorProto extends js.Object {
      /** FileDescriptorProto dependency */
      var dependency: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
      /** FileDescriptorProto enumType */
      var enumType: js.UndefOr[js.Array[IEnumDescriptorProto] | scala.Null] = js.undefined
      /** FileDescriptorProto extension */
      var extension: js.UndefOr[js.Array[IFieldDescriptorProto] | scala.Null] = js.undefined
      /** FileDescriptorProto messageType */
      var messageType: js.UndefOr[js.Array[IDescriptorProto] | scala.Null] = js.undefined
      /** FileDescriptorProto name */
      var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileDescriptorProto options */
      var options: js.UndefOr[IFileOptions | scala.Null] = js.undefined
      /** FileDescriptorProto package */
      var `package`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileDescriptorProto publicDependency */
      var publicDependency: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
      /** FileDescriptorProto service */
      var service: js.UndefOr[js.Array[IServiceDescriptorProto] | scala.Null] = js.undefined
      /** FileDescriptorProto sourceCodeInfo */
      var sourceCodeInfo: js.UndefOr[ISourceCodeInfo | scala.Null] = js.undefined
      /** FileDescriptorProto syntax */
      var syntax: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileDescriptorProto weakDependency */
      var weakDependency: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
    }
    
    /** Properties of a FileDescriptorSet. */
    trait IFileDescriptorSet extends js.Object {
      /** FileDescriptorSet file */
      var file: js.UndefOr[js.Array[IFileDescriptorProto] | scala.Null] = js.undefined
    }
    
    /** Properties of a FileOptions. */
    trait IFileOptions extends js.Object {
      /** FileOptions ccEnableArenas */
      var ccEnableArenas: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FileOptions ccGenericServices */
      var ccGenericServices: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FileOptions csharpNamespace */
      var csharpNamespace: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileOptions deprecated */
      var deprecated: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FileOptions goPackage */
      var goPackage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileOptions javaGenerateEqualsAndHash */
      var javaGenerateEqualsAndHash: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FileOptions javaGenericServices */
      var javaGenericServices: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FileOptions javaMultipleFiles */
      var javaMultipleFiles: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FileOptions javaOuterClassname */
      var javaOuterClassname: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileOptions javaPackage */
      var javaPackage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileOptions javaStringCheckUtf8 */
      var javaStringCheckUtf8: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FileOptions objcClassPrefix */
      var objcClassPrefix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileOptions optimizeFor */
      var optimizeFor: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode | scala.Null
          ] = js.undefined
      /** FileOptions phpClassPrefix */
      var phpClassPrefix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileOptions pyGenericServices */
      var pyGenericServices: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FileOptions swiftPrefix */
      var swiftPrefix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** FileOptions uninterpretedOption */
      var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | scala.Null] = js.undefined
    }
    
    /** Properties of a GeneratedCodeInfo. */
    trait IGeneratedCodeInfo extends js.Object {
      /** GeneratedCodeInfo annotation */
      var annotation: js.UndefOr[
            (js.Array[
              atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
            ]) | scala.Null
          ] = js.undefined
    }
    
    /** Properties of a MessageOptions. */
    trait IMessageOptions extends js.Object {
      /** MessageOptions deprecated */
      var deprecated: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** MessageOptions mapEntry */
      var mapEntry: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** MessageOptions messageSetWireFormat */
      var messageSetWireFormat: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** MessageOptions noStandardDescriptorAccessor */
      var noStandardDescriptorAccessor: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** MessageOptions uninterpretedOption */
      var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | scala.Null] = js.undefined
    }
    
    /** Properties of a MethodDescriptorProto. */
    trait IMethodDescriptorProto extends js.Object {
      /** MethodDescriptorProto clientStreaming */
      var clientStreaming: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** MethodDescriptorProto inputType */
      var inputType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** MethodDescriptorProto name */
      var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** MethodDescriptorProto options */
      var options: js.UndefOr[IMethodOptions | scala.Null] = js.undefined
      /** MethodDescriptorProto outputType */
      var outputType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** MethodDescriptorProto serverStreaming */
      var serverStreaming: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    }
    
    /** Properties of a MethodOptions. */
    trait IMethodOptions extends js.Object {
      /** MethodOptions .google.api.http */
      var `.google.api.http`: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.apiNs.IHttpRule | scala.Null
          ] = js.undefined
      /** MethodOptions deprecated */
      var deprecated: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** MethodOptions idempotencyLevel */
      var idempotencyLevel: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel | scala.Null
          ] = js.undefined
      /** MethodOptions uninterpretedOption */
      var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | scala.Null] = js.undefined
    }
    
    /** Properties of an OneofDescriptorProto. */
    trait IOneofDescriptorProto extends js.Object {
      /** OneofDescriptorProto name */
      var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** OneofDescriptorProto options */
      var options: js.UndefOr[IOneofOptions | scala.Null] = js.undefined
    }
    
    /** Properties of an OneofOptions. */
    trait IOneofOptions extends js.Object {
      /** OneofOptions uninterpretedOption */
      var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | scala.Null] = js.undefined
    }
    
    /** Properties of a ServiceDescriptorProto. */
    trait IServiceDescriptorProto extends js.Object {
      /** ServiceDescriptorProto method */
      var method: js.UndefOr[js.Array[IMethodDescriptorProto] | scala.Null] = js.undefined
      /** ServiceDescriptorProto name */
      var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** ServiceDescriptorProto options */
      var options: js.UndefOr[IServiceOptions | scala.Null] = js.undefined
    }
    
    /** Properties of a ServiceOptions. */
    trait IServiceOptions extends js.Object {
      /** ServiceOptions deprecated */
      var deprecated: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** ServiceOptions uninterpretedOption */
      var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | scala.Null] = js.undefined
    }
    
    /** Properties of a SourceCodeInfo. */
    trait ISourceCodeInfo extends js.Object {
      /** SourceCodeInfo location */
      var location: js.UndefOr[
            (js.Array[
              atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
            ]) | scala.Null
          ] = js.undefined
    }
    
    /** Properties of a Timestamp. */
    trait ITimestamp extends js.Object {
      /** Timestamp nanos */
      var nanos: js.UndefOr[scala.Double | scala.Null] = js.undefined
      /** Timestamp seconds */
      var seconds: js.UndefOr[scala.Double | longLib.longMod.^  | scala.Null] = js.undefined
    }
    
    /** Properties of an UninterpretedOption. */
    trait IUninterpretedOption extends js.Object {
      /** UninterpretedOption aggregateValue */
      var aggregateValue: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** UninterpretedOption doubleValue */
      var doubleValue: js.UndefOr[scala.Double | scala.Null] = js.undefined
      /** UninterpretedOption identifierValue */
      var identifierValue: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      /** UninterpretedOption name */
      var name: js.UndefOr[
            (js.Array[
              atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
            ]) | scala.Null
          ] = js.undefined
      /** UninterpretedOption negativeIntValue */
      var negativeIntValue: js.UndefOr[scala.Double | longLib.longMod.^  | scala.Null] = js.undefined
      /** UninterpretedOption positiveIntValue */
      var positiveIntValue: js.UndefOr[scala.Double | longLib.longMod.^  | scala.Null] = js.undefined
      /** UninterpretedOption stringValue */
      var stringValue: js.UndefOr[stdLib.Uint8Array | scala.Null] = js.undefined
    }
    
    /** Represents a MessageOptions. */
    @js.native
    /**
      * Constructs a new MessageOptions.
      * @param [properties] Properties to set
      */
    class MessageOptions () extends IMessageOptions {
      def this(properties: IMessageOptions) = this()
      /** MessageOptions deprecated. */
      @JSName("deprecated")
      var deprecated_MessageOptions: scala.Boolean = js.native
      /** MessageOptions mapEntry. */
      @JSName("mapEntry")
      var mapEntry_MessageOptions: scala.Boolean = js.native
      /** MessageOptions messageSetWireFormat. */
      @JSName("messageSetWireFormat")
      var messageSetWireFormat_MessageOptions: scala.Boolean = js.native
      /** MessageOptions noStandardDescriptorAccessor. */
      @JSName("noStandardDescriptorAccessor")
      var noStandardDescriptorAccessor_MessageOptions: scala.Boolean = js.native
      /** MessageOptions uninterpretedOption. */
      @JSName("uninterpretedOption")
      var uninterpretedOption_MessageOptions: js.Array[IUninterpretedOption] = js.native
      /**
        * Converts this MessageOptions to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a MethodDescriptorProto. */
    @js.native
    /**
      * Constructs a new MethodDescriptorProto.
      * @param [properties] Properties to set
      */
    class MethodDescriptorProto () extends IMethodDescriptorProto {
      def this(properties: IMethodDescriptorProto) = this()
      /** MethodDescriptorProto clientStreaming. */
      @JSName("clientStreaming")
      var clientStreaming_MethodDescriptorProto: scala.Boolean = js.native
      /** MethodDescriptorProto inputType. */
      @JSName("inputType")
      var inputType_MethodDescriptorProto: java.lang.String = js.native
      /** MethodDescriptorProto name. */
      @JSName("name")
      var name_MethodDescriptorProto: java.lang.String = js.native
      /** MethodDescriptorProto outputType. */
      @JSName("outputType")
      var outputType_MethodDescriptorProto: java.lang.String = js.native
      /** MethodDescriptorProto serverStreaming. */
      @JSName("serverStreaming")
      var serverStreaming_MethodDescriptorProto: scala.Boolean = js.native
      /**
        * Converts this MethodDescriptorProto to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a MethodOptions. */
    @js.native
    /**
      * Constructs a new MethodOptions.
      * @param [properties] Properties to set
      */
    class MethodOptions () extends IMethodOptions {
      def this(properties: IMethodOptions) = this()
      /** MethodOptions deprecated. */
      @JSName("deprecated")
      var deprecated_MethodOptions: scala.Boolean = js.native
      /** MethodOptions idempotencyLevel. */
      @JSName("idempotencyLevel")
      var idempotencyLevel_MethodOptions: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel = js.native
      /** MethodOptions uninterpretedOption. */
      @JSName("uninterpretedOption")
      var uninterpretedOption_MethodOptions: js.Array[IUninterpretedOption] = js.native
      /**
        * Converts this MethodOptions to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents an OneofDescriptorProto. */
    @js.native
    /**
      * Constructs a new OneofDescriptorProto.
      * @param [properties] Properties to set
      */
    class OneofDescriptorProto () extends IOneofDescriptorProto {
      def this(properties: IOneofDescriptorProto) = this()
      /** OneofDescriptorProto name. */
      @JSName("name")
      var name_OneofDescriptorProto: java.lang.String = js.native
      /**
        * Converts this OneofDescriptorProto to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents an OneofOptions. */
    @js.native
    /**
      * Constructs a new OneofOptions.
      * @param [properties] Properties to set
      */
    class OneofOptions () extends IOneofOptions {
      def this(properties: IOneofOptions) = this()
      /** OneofOptions uninterpretedOption. */
      @JSName("uninterpretedOption")
      var uninterpretedOption_OneofOptions: js.Array[IUninterpretedOption] = js.native
      /**
        * Converts this OneofOptions to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a ServiceDescriptorProto. */
    @js.native
    /**
      * Constructs a new ServiceDescriptorProto.
      * @param [properties] Properties to set
      */
    class ServiceDescriptorProto () extends IServiceDescriptorProto {
      def this(properties: IServiceDescriptorProto) = this()
      /** ServiceDescriptorProto method. */
      @JSName("method")
      var method_ServiceDescriptorProto: js.Array[IMethodDescriptorProto] = js.native
      /** ServiceDescriptorProto name. */
      @JSName("name")
      var name_ServiceDescriptorProto: java.lang.String = js.native
      /**
        * Converts this ServiceDescriptorProto to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a ServiceOptions. */
    @js.native
    /**
      * Constructs a new ServiceOptions.
      * @param [properties] Properties to set
      */
    class ServiceOptions () extends IServiceOptions {
      def this(properties: IServiceOptions) = this()
      /** ServiceOptions deprecated. */
      @JSName("deprecated")
      var deprecated_ServiceOptions: scala.Boolean = js.native
      /** ServiceOptions uninterpretedOption. */
      @JSName("uninterpretedOption")
      var uninterpretedOption_ServiceOptions: js.Array[IUninterpretedOption] = js.native
      /**
        * Converts this ServiceOptions to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a SourceCodeInfo. */
    @js.native
    /**
      * Constructs a new SourceCodeInfo.
      * @param [properties] Properties to set
      */
    class SourceCodeInfo () extends ISourceCodeInfo {
      def this(properties: ISourceCodeInfo) = this()
      /** SourceCodeInfo location. */
      @JSName("location")
      var location_SourceCodeInfo: js.Array[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
          ] = js.native
      /**
        * Converts this SourceCodeInfo to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents a Timestamp. */
    @js.native
    /**
      * Constructs a new Timestamp.
      * @param [properties] Properties to set
      */
    class Timestamp () extends ITimestamp {
      def this(properties: ITimestamp) = this()
      /** Timestamp nanos. */
      @JSName("nanos")
      var nanos_Timestamp: scala.Double = js.native
      /** Timestamp seconds. */
      @JSName("seconds")
      var seconds_Timestamp: scala.Double | longLib.longMod.^  = js.native
      /**
        * Converts this Timestamp to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /** Represents an UninterpretedOption. */
    @js.native
    /**
      * Constructs a new UninterpretedOption.
      * @param [properties] Properties to set
      */
    class UninterpretedOption () extends IUninterpretedOption {
      def this(properties: IUninterpretedOption) = this()
      /** UninterpretedOption aggregateValue. */
      @JSName("aggregateValue")
      var aggregateValue_UninterpretedOption: java.lang.String = js.native
      /** UninterpretedOption doubleValue. */
      @JSName("doubleValue")
      var doubleValue_UninterpretedOption: scala.Double = js.native
      /** UninterpretedOption identifierValue. */
      @JSName("identifierValue")
      var identifierValue_UninterpretedOption: java.lang.String = js.native
      /** UninterpretedOption name. */
      @JSName("name")
      var name_UninterpretedOption: js.Array[
            atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
          ] = js.native
      /** UninterpretedOption negativeIntValue. */
      @JSName("negativeIntValue")
      var negativeIntValue_UninterpretedOption: scala.Double | longLib.longMod.^  = js.native
      /** UninterpretedOption positiveIntValue. */
      @JSName("positiveIntValue")
      var positiveIntValue_UninterpretedOption: scala.Double | longLib.longMod.^  = js.native
      /** UninterpretedOption stringValue. */
      @JSName("stringValue")
      var stringValue_UninterpretedOption: stdLib.Uint8Array = js.native
      /**
        * Converts this UninterpretedOption to JSON.
        * @returns JSON object
        */
      def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    }
    
    /* static members */
    @js.native
    object DescriptorProto extends js.Object {
      /**
        * Creates a new DescriptorProto instance using the specified properties.
        * @param [properties] Properties to set
        * @returns DescriptorProto instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDescriptorProto): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto = js.native
      /**
        * Decodes a DescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns DescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto = js.native
      /**
        * Decodes a DescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns DescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto = js.native
      /**
        * Encodes the specified DescriptorProto message. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
        * @param message DescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified DescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
        * @param message DescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a DescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns DescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto = js.native
      /**
        * Creates a plain object from a DescriptorProto message. Also converts values to other types if specified.
        * @param message DescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProto,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a DescriptorProto message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    @JSName("DescriptorProto")
    @js.native
    object DescriptorProtoNs extends js.Object {
      /** Represents an ExtensionRange. */
      @js.native
      /**
        * Constructs a new ExtensionRange.
        * @param [properties] Properties to set
        */
      class ExtensionRange () extends IExtensionRange {
        def this(properties: IExtensionRange) = this()
        /** ExtensionRange end. */
        @JSName("end")
        var end_ExtensionRange: scala.Double = js.native
        /** ExtensionRange start. */
        @JSName("start")
        var start_ExtensionRange: scala.Double = js.native
        /**
          * Converts this ExtensionRange to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Properties of an ExtensionRange. */
      trait IExtensionRange extends js.Object {
        /** ExtensionRange end */
        var end: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** ExtensionRange start */
        var start: js.UndefOr[scala.Double | scala.Null] = js.undefined
      }
      
      /** Properties of a ReservedRange. */
      trait IReservedRange extends js.Object {
        /** ReservedRange end */
        var end: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** ReservedRange start */
        var start: js.UndefOr[scala.Double | scala.Null] = js.undefined
      }
      
      /** Represents a ReservedRange. */
      @js.native
      /**
        * Constructs a new ReservedRange.
        * @param [properties] Properties to set
        */
      class ReservedRange () extends IReservedRange {
        def this(properties: IReservedRange) = this()
        /** ReservedRange end. */
        @JSName("end")
        var end_ReservedRange: scala.Double = js.native
        /** ReservedRange start. */
        @JSName("start")
        var start_ReservedRange: scala.Double = js.native
        /**
          * Converts this ReservedRange to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /* static members */
      @js.native
      object ExtensionRange extends js.Object {
        /**
          * Creates a new ExtensionRange instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ExtensionRange instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        /**
          * Decodes an ExtensionRange message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ExtensionRange
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        /**
          * Decodes an ExtensionRange message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ExtensionRange
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        /**
          * Encodes the specified ExtensionRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
          * @param message ExtensionRange message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ExtensionRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
          * @param message ExtensionRange message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates an ExtensionRange message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ExtensionRange
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        /**
          * Creates a plain object from an ExtensionRange message. Also converts values to other types if specified.
          * @param message ExtensionRange
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies an ExtensionRange message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ReservedRange extends js.Object {
        /**
          * Creates a new ReservedRange instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ReservedRange instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        /**
          * Decodes a ReservedRange message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ReservedRange
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        /**
          * Decodes a ReservedRange message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ReservedRange
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        /**
          * Encodes the specified ReservedRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
          * @param message ReservedRange message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ReservedRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
          * @param message ReservedRange message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ReservedRange message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ReservedRange
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        /**
          * Creates a plain object from a ReservedRange message. Also converts values to other types if specified.
          * @param message ReservedRange
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ReservedRange message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object Duration extends js.Object {
      /**
        * Creates a new Duration instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Duration instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDuration): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration = js.native
      /**
        * Decodes a Duration message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Duration
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration = js.native
      /**
        * Decodes a Duration message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Duration
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration = js.native
      /**
        * Encodes the specified Duration message. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
        * @param message Duration message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDuration): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDuration,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified Duration message, length delimited. Does not implicitly {@link google.protobuf.Duration.verify|verify} messages.
        * @param message Duration message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDuration): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDuration,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a Duration message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Duration
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration = js.native
      /**
        * Creates a plain object from a Duration message. Also converts values to other types if specified.
        * @param message Duration
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Duration,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a Duration message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object Empty extends js.Object {
      /**
        * Creates a new Empty instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Empty instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEmpty): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty = js.native
      /**
        * Decodes an Empty message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Empty
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty = js.native
      /**
        * Decodes an Empty message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Empty
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty = js.native
      /**
        * Encodes the specified Empty message. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
        * @param message Empty message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEmpty): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEmpty,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified Empty message, length delimited. Does not implicitly {@link google.protobuf.Empty.verify|verify} messages.
        * @param message Empty message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEmpty): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEmpty,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an Empty message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Empty
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty = js.native
      /**
        * Creates a plain object from an Empty message. Also converts values to other types if specified.
        * @param message Empty
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an Empty message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object EnumDescriptorProto extends js.Object {
      /**
        * Creates a new EnumDescriptorProto instance using the specified properties.
        * @param [properties] Properties to set
        * @returns EnumDescriptorProto instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumDescriptorProto
      ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      /**
        * Decodes an EnumDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns EnumDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      /**
        * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns EnumDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      /**
        * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
        * @param message EnumDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
        * @param message EnumDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns EnumDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      /**
        * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
        * @param message EnumDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumDescriptorProto,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an EnumDescriptorProto message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object EnumOptions extends js.Object {
      /**
        * Creates a new EnumOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns EnumOptions instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumOptions): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions = js.native
      /**
        * Decodes an EnumOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns EnumOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions = js.native
      /**
        * Decodes an EnumOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns EnumOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions = js.native
      /**
        * Encodes the specified EnumOptions message. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
        * @param message EnumOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified EnumOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
        * @param message EnumOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an EnumOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns EnumOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions = js.native
      /**
        * Creates a plain object from an EnumOptions message. Also converts values to other types if specified.
        * @param message EnumOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumOptions,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an EnumOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object EnumValueDescriptorProto extends js.Object {
      /**
        * Creates a new EnumValueDescriptorProto instance using the specified properties.
        * @param [properties] Properties to set
        * @returns EnumValueDescriptorProto instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueDescriptorProto
      ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      /**
        * Decodes an EnumValueDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns EnumValueDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      /**
        * Decodes an EnumValueDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns EnumValueDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      /**
        * Encodes the specified EnumValueDescriptorProto message. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
        * @param message EnumValueDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueDescriptorProto
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified EnumValueDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
        * @param message EnumValueDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueDescriptorProto
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an EnumValueDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns EnumValueDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      /**
        * Creates a plain object from an EnumValueDescriptorProto message. Also converts values to other types if specified.
        * @param message EnumValueDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueDescriptorProto,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an EnumValueDescriptorProto message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object EnumValueOptions extends js.Object {
      /**
        * Creates a new EnumValueOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns EnumValueOptions instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueOptions): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions = js.native
      /**
        * Decodes an EnumValueOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns EnumValueOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions = js.native
      /**
        * Decodes an EnumValueOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns EnumValueOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions = js.native
      /**
        * Encodes the specified EnumValueOptions message. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
        * @param message EnumValueOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified EnumValueOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
        * @param message EnumValueOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IEnumValueOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an EnumValueOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns EnumValueOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions = js.native
      /**
        * Creates a plain object from an EnumValueOptions message. Also converts values to other types if specified.
        * @param message EnumValueOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.EnumValueOptions,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an EnumValueOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object FieldDescriptorProto extends js.Object {
      /**
        * Creates a new FieldDescriptorProto instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FieldDescriptorProto instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldDescriptorProto
      ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      /**
        * Decodes a FieldDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FieldDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      /**
        * Decodes a FieldDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FieldDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      /**
        * Encodes the specified FieldDescriptorProto message. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
        * @param message FieldDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FieldDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
        * @param message FieldDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FieldDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      /**
        * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
        * @param message FieldDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProto,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a FieldDescriptorProto message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    @JSName("FieldDescriptorProto")
    @js.native
    object FieldDescriptorProtoNs extends js.Object {
      @js.native
      sealed trait Label extends js.Object
      
      @js.native
      sealed trait Type extends js.Object
      
      /** Label enum. */
      @js.native
      object Label extends js.Object {
        @js.native
        sealed trait LABEL_OPTIONAL
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label
        
        @js.native
        sealed trait LABEL_REPEATED
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label
        
        @js.native
        sealed trait LABEL_REQUIRED
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label
        
        /* 1 */ val LABEL_OPTIONAL: LABEL_OPTIONAL with scala.Double = js.native
        /* 3 */ val LABEL_REPEATED: LABEL_REPEATED with scala.Double = js.native
        /* 2 */ val LABEL_REQUIRED: LABEL_REQUIRED with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label with scala.Double
              ] = js.native
      }
      
      /** Type enum. */
      @js.native
      object Type extends js.Object {
        @js.native
        sealed trait TYPE_BOOL
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_BYTES
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_DOUBLE
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_ENUM
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_FIXED32
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_FIXED64
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_FLOAT
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_GROUP
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_INT32
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_INT64
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_MESSAGE
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_SFIXED32
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_SFIXED64
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_SINT32
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_SINT64
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_STRING
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_UINT32
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_UINT64
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        /* 8 */ val TYPE_BOOL: TYPE_BOOL with scala.Double = js.native
        /* 12 */ val TYPE_BYTES: TYPE_BYTES with scala.Double = js.native
        /* 1 */ val TYPE_DOUBLE: TYPE_DOUBLE with scala.Double = js.native
        /* 14 */ val TYPE_ENUM: TYPE_ENUM with scala.Double = js.native
        /* 7 */ val TYPE_FIXED32: TYPE_FIXED32 with scala.Double = js.native
        /* 6 */ val TYPE_FIXED64: TYPE_FIXED64 with scala.Double = js.native
        /* 2 */ val TYPE_FLOAT: TYPE_FLOAT with scala.Double = js.native
        /* 10 */ val TYPE_GROUP: TYPE_GROUP with scala.Double = js.native
        /* 5 */ val TYPE_INT32: TYPE_INT32 with scala.Double = js.native
        /* 3 */ val TYPE_INT64: TYPE_INT64 with scala.Double = js.native
        /* 11 */ val TYPE_MESSAGE: TYPE_MESSAGE with scala.Double = js.native
        /* 15 */ val TYPE_SFIXED32: TYPE_SFIXED32 with scala.Double = js.native
        /* 16 */ val TYPE_SFIXED64: TYPE_SFIXED64 with scala.Double = js.native
        /* 17 */ val TYPE_SINT32: TYPE_SINT32 with scala.Double = js.native
        /* 18 */ val TYPE_SINT64: TYPE_SINT64 with scala.Double = js.native
        /* 9 */ val TYPE_STRING: TYPE_STRING with scala.Double = js.native
        /* 13 */ val TYPE_UINT32: TYPE_UINT32 with scala.Double = js.native
        /* 4 */ val TYPE_UINT64: TYPE_UINT64 with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type with scala.Double
              ] = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object FieldMask extends js.Object {
      /**
        * Creates a new FieldMask instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FieldMask instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldMask): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask = js.native
      /**
        * Decodes a FieldMask message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FieldMask
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask = js.native
      /**
        * Decodes a FieldMask message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FieldMask
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask = js.native
      /**
        * Encodes the specified FieldMask message. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
        * @param message FieldMask message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldMask): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldMask,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FieldMask message, length delimited. Does not implicitly {@link google.protobuf.FieldMask.verify|verify} messages.
        * @param message FieldMask message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldMask): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldMask,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FieldMask message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FieldMask
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask = js.native
      /**
        * Creates a plain object from a FieldMask message. Also converts values to other types if specified.
        * @param message FieldMask
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldMask,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a FieldMask message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object FieldOptions extends js.Object {
      /**
        * Creates a new FieldOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FieldOptions instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldOptions): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions = js.native
      /**
        * Decodes a FieldOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FieldOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions = js.native
      /**
        * Decodes a FieldOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FieldOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions = js.native
      /**
        * Encodes the specified FieldOptions message. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
        * @param message FieldOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FieldOptions message, length delimited. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
        * @param message FieldOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FieldOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FieldOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions = js.native
      /**
        * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
        * @param message FieldOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptions,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a FieldOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    @JSName("FieldOptions")
    @js.native
    object FieldOptionsNs extends js.Object {
      @js.native
      sealed trait CType extends js.Object
      
      @js.native
      sealed trait JSType extends js.Object
      
      /** CType enum. */
      @js.native
      object CType extends js.Object {
        @js.native
        sealed trait CORD
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.CType
        
        @js.native
        sealed trait STRING
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.CType
        
        @js.native
        sealed trait STRING_PIECE
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.CType
        
        /* 1 */ val CORD: CORD with scala.Double = js.native
        /* 0 */ val STRING: STRING with scala.Double = js.native
        /* 2 */ val STRING_PIECE: STRING_PIECE with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.CType with scala.Double
              ] = js.native
      }
      
      /** JSType enum. */
      @js.native
      object JSType extends js.Object {
        @js.native
        sealed trait JS_NORMAL
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.JSType
        
        @js.native
        sealed trait JS_NUMBER
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.JSType
        
        @js.native
        sealed trait JS_STRING
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.JSType
        
        /* 0 */ val JS_NORMAL: JS_NORMAL with scala.Double = js.native
        /* 2 */ val JS_NUMBER: JS_NUMBER with scala.Double = js.native
        /* 1 */ val JS_STRING: JS_STRING with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FieldOptionsNs.JSType with scala.Double
              ] = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object FileDescriptorProto extends js.Object {
      /**
        * Creates a new FileDescriptorProto instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FileDescriptorProto instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorProto
      ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto = js.native
      /**
        * Decodes a FileDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FileDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto = js.native
      /**
        * Decodes a FileDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FileDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto = js.native
      /**
        * Encodes the specified FileDescriptorProto message. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
        * @param message FileDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FileDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
        * @param message FileDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FileDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FileDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto = js.native
      /**
        * Creates a plain object from a FileDescriptorProto message. Also converts values to other types if specified.
        * @param message FileDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorProto,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a FileDescriptorProto message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object FileDescriptorSet extends js.Object {
      /**
        * Creates a new FileDescriptorSet instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FileDescriptorSet instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorSet): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet = js.native
      /**
        * Decodes a FileDescriptorSet message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FileDescriptorSet
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet = js.native
      /**
        * Decodes a FileDescriptorSet message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FileDescriptorSet
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet = js.native
      /**
        * Encodes the specified FileDescriptorSet message. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
        * @param message FileDescriptorSet message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorSet): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorSet,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FileDescriptorSet message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
        * @param message FileDescriptorSet message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorSet): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileDescriptorSet,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FileDescriptorSet message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FileDescriptorSet
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet = js.native
      /**
        * Creates a plain object from a FileDescriptorSet message. Also converts values to other types if specified.
        * @param message FileDescriptorSet
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileDescriptorSet,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a FileDescriptorSet message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object FileOptions extends js.Object {
      /**
        * Creates a new FileOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FileOptions instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileOptions): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions = js.native
      /**
        * Decodes a FileOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FileOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions = js.native
      /**
        * Decodes a FileOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FileOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions = js.native
      /**
        * Encodes the specified FileOptions message. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
        * @param message FileOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FileOptions message, length delimited. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
        * @param message FileOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFileOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FileOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FileOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions = js.native
      /**
        * Creates a plain object from a FileOptions message. Also converts values to other types if specified.
        * @param message FileOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptions,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a FileOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    @JSName("FileOptions")
    @js.native
    object FileOptionsNs extends js.Object {
      @js.native
      sealed trait OptimizeMode extends js.Object
      
      /** OptimizeMode enum. */
      @js.native
      object OptimizeMode extends js.Object {
        @js.native
        sealed trait CODE_SIZE
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode
        
        @js.native
        sealed trait LITE_RUNTIME
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode
        
        @js.native
        sealed trait SPEED
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode
        
        /* 2 */ val CODE_SIZE: CODE_SIZE with scala.Double = js.native
        /* 3 */ val LITE_RUNTIME: LITE_RUNTIME with scala.Double = js.native
        /* 1 */ val SPEED: SPEED with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode with scala.Double
              ] = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object GeneratedCodeInfo extends js.Object {
      /**
        * Creates a new GeneratedCodeInfo instance using the specified properties.
        * @param [properties] Properties to set
        * @returns GeneratedCodeInfo instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IGeneratedCodeInfo): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      /**
        * Decodes a GeneratedCodeInfo message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GeneratedCodeInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      /**
        * Decodes a GeneratedCodeInfo message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GeneratedCodeInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      /**
        * Encodes the specified GeneratedCodeInfo message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
        * @param message GeneratedCodeInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IGeneratedCodeInfo): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IGeneratedCodeInfo,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified GeneratedCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
        * @param message GeneratedCodeInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IGeneratedCodeInfo): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IGeneratedCodeInfo,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns GeneratedCodeInfo
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      /**
        * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
        * @param message GeneratedCodeInfo
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfo,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a GeneratedCodeInfo message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    @JSName("GeneratedCodeInfo")
    @js.native
    object GeneratedCodeInfoNs extends js.Object {
      /** Represents an Annotation. */
      @js.native
      /**
        * Constructs a new Annotation.
        * @param [properties] Properties to set
        */
      class Annotation () extends IAnnotation {
        def this(properties: IAnnotation) = this()
        /** Annotation begin. */
        @JSName("begin")
        var begin_Annotation: scala.Double = js.native
        /** Annotation end. */
        @JSName("end")
        var end_Annotation: scala.Double = js.native
        /** Annotation path. */
        @JSName("path")
        var path_Annotation: js.Array[scala.Double] = js.native
        /** Annotation sourceFile. */
        @JSName("sourceFile")
        var sourceFile_Annotation: java.lang.String = js.native
        /**
          * Converts this Annotation to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Properties of an Annotation. */
      trait IAnnotation extends js.Object {
        /** Annotation begin */
        var begin: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** Annotation end */
        var end: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** Annotation path */
        var path: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
        /** Annotation sourceFile */
        var sourceFile: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /* static members */
      @js.native
      object Annotation extends js.Object {
        /**
          * Creates a new Annotation instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Annotation instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        /**
          * Decodes an Annotation message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Annotation
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        /**
          * Decodes an Annotation message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Annotation
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        /**
          * Encodes the specified Annotation message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
          * @param message Annotation message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified Annotation message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
          * @param message Annotation message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Annotation
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        /**
          * Creates a plain object from an Annotation message. Also converts values to other types if specified.
          * @param message Annotation
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies an Annotation message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object MessageOptions extends js.Object {
      /**
        * Creates a new MessageOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns MessageOptions instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMessageOptions): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions = js.native
      /**
        * Decodes a MessageOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MessageOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions = js.native
      /**
        * Decodes a MessageOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MessageOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions = js.native
      /**
        * Encodes the specified MessageOptions message. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
        * @param message MessageOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMessageOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMessageOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified MessageOptions message, length delimited. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
        * @param message MessageOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMessageOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMessageOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a MessageOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MessageOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions = js.native
      /**
        * Creates a plain object from a MessageOptions message. Also converts values to other types if specified.
        * @param message MessageOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MessageOptions,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a MessageOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object MethodDescriptorProto extends js.Object {
      /**
        * Creates a new MethodDescriptorProto instance using the specified properties.
        * @param [properties] Properties to set
        * @returns MethodDescriptorProto instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodDescriptorProto
      ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      /**
        * Decodes a MethodDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MethodDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      /**
        * Decodes a MethodDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MethodDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      /**
        * Encodes the specified MethodDescriptorProto message. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
        * @param message MethodDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified MethodDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
        * @param message MethodDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a MethodDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MethodDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      /**
        * Creates a plain object from a MethodDescriptorProto message. Also converts values to other types if specified.
        * @param message MethodDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodDescriptorProto,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a MethodDescriptorProto message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object MethodOptions extends js.Object {
      /**
        * Creates a new MethodOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns MethodOptions instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodOptions): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions = js.native
      /**
        * Decodes a MethodOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MethodOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions = js.native
      /**
        * Decodes a MethodOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MethodOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions = js.native
      /**
        * Encodes the specified MethodOptions message. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
        * @param message MethodOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified MethodOptions message, length delimited. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
        * @param message MethodOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IMethodOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a MethodOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MethodOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions = js.native
      /**
        * Creates a plain object from a MethodOptions message. Also converts values to other types if specified.
        * @param message MethodOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptions,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a MethodOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    @JSName("MethodOptions")
    @js.native
    object MethodOptionsNs extends js.Object {
      @js.native
      sealed trait IdempotencyLevel extends js.Object
      
      /** IdempotencyLevel enum. */
      @js.native
      object IdempotencyLevel extends js.Object {
        @js.native
        sealed trait IDEMPOTENCY_UNKNOWN
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel
        
        @js.native
        sealed trait IDEMPOTENT
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel
        
        @js.native
        sealed trait NO_SIDE_EFFECTS
          extends atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel
        
        /* 0 */ val IDEMPOTENCY_UNKNOWN: IDEMPOTENCY_UNKNOWN with scala.Double = js.native
        /* 2 */ val IDEMPOTENT: IDEMPOTENT with scala.Double = js.native
        /* 1 */ val NO_SIDE_EFFECTS: NO_SIDE_EFFECTS with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel with scala.Double
              ] = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object OneofDescriptorProto extends js.Object {
      /**
        * Creates a new OneofDescriptorProto instance using the specified properties.
        * @param [properties] Properties to set
        * @returns OneofDescriptorProto instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofDescriptorProto
      ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      /**
        * Decodes an OneofDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns OneofDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      /**
        * Decodes an OneofDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns OneofDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      /**
        * Encodes the specified OneofDescriptorProto message. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
        * @param message OneofDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified OneofDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
        * @param message OneofDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an OneofDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns OneofDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      /**
        * Creates a plain object from an OneofDescriptorProto message. Also converts values to other types if specified.
        * @param message OneofDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofDescriptorProto,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an OneofDescriptorProto message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object OneofOptions extends js.Object {
      /**
        * Creates a new OneofOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns OneofOptions instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofOptions): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions = js.native
      /**
        * Decodes an OneofOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns OneofOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions = js.native
      /**
        * Decodes an OneofOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns OneofOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions = js.native
      /**
        * Encodes the specified OneofOptions message. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
        * @param message OneofOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified OneofOptions message, length delimited. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
        * @param message OneofOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IOneofOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an OneofOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns OneofOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions = js.native
      /**
        * Creates a plain object from an OneofOptions message. Also converts values to other types if specified.
        * @param message OneofOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.OneofOptions,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an OneofOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object ServiceDescriptorProto extends js.Object {
      /**
        * Creates a new ServiceDescriptorProto instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ServiceDescriptorProto instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceDescriptorProto
      ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      /**
        * Decodes a ServiceDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ServiceDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      /**
        * Decodes a ServiceDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ServiceDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      /**
        * Encodes the specified ServiceDescriptorProto message. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
        * @param message ServiceDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceDescriptorProto
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified ServiceDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
        * @param message ServiceDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceDescriptorProto
      ): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a ServiceDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ServiceDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      /**
        * Creates a plain object from a ServiceDescriptorProto message. Also converts values to other types if specified.
        * @param message ServiceDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceDescriptorProto,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a ServiceDescriptorProto message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object ServiceOptions extends js.Object {
      /**
        * Creates a new ServiceOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ServiceOptions instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceOptions): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions = js.native
      /**
        * Decodes a ServiceOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ServiceOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions = js.native
      /**
        * Decodes a ServiceOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ServiceOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions = js.native
      /**
        * Encodes the specified ServiceOptions message. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
        * @param message ServiceOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified ServiceOptions message, length delimited. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
        * @param message ServiceOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IServiceOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a ServiceOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ServiceOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions = js.native
      /**
        * Creates a plain object from a ServiceOptions message. Also converts values to other types if specified.
        * @param message ServiceOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ServiceOptions,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a ServiceOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object SourceCodeInfo extends js.Object {
      /**
        * Creates a new SourceCodeInfo instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SourceCodeInfo instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ISourceCodeInfo): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo = js.native
      /**
        * Decodes a SourceCodeInfo message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SourceCodeInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo = js.native
      /**
        * Decodes a SourceCodeInfo message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SourceCodeInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo = js.native
      /**
        * Encodes the specified SourceCodeInfo message. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
        * @param message SourceCodeInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ISourceCodeInfo): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ISourceCodeInfo,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified SourceCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
        * @param message SourceCodeInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ISourceCodeInfo): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ISourceCodeInfo,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SourceCodeInfo
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo = js.native
      /**
        * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
        * @param message SourceCodeInfo
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfo,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a SourceCodeInfo message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    @JSName("SourceCodeInfo")
    @js.native
    object SourceCodeInfoNs extends js.Object {
      /** Properties of a Location. */
      trait ILocation extends js.Object {
        /** Location leadingComments */
        var leadingComments: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** Location leadingDetachedComments */
        var leadingDetachedComments: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
        /** Location path */
        var path: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
        /** Location span */
        var span: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
        /** Location trailingComments */
        var trailingComments: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Represents a Location. */
      @js.native
      /**
        * Constructs a new Location.
        * @param [properties] Properties to set
        */
      class Location () extends ILocation {
        def this(properties: ILocation) = this()
        /** Location leadingComments. */
        @JSName("leadingComments")
        var leadingComments_Location: java.lang.String = js.native
        /** Location leadingDetachedComments. */
        @JSName("leadingDetachedComments")
        var leadingDetachedComments_Location: js.Array[java.lang.String] = js.native
        /** Location path. */
        @JSName("path")
        var path_Location: js.Array[scala.Double] = js.native
        /** Location span. */
        @JSName("span")
        var span_Location: js.Array[scala.Double] = js.native
        /** Location trailingComments. */
        @JSName("trailingComments")
        var trailingComments_Location: java.lang.String = js.native
        /**
          * Converts this Location to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /* static members */
      @js.native
      object Location extends js.Object {
        /**
          * Creates a new Location instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Location instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        /**
          * Decodes a Location message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Location
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        /**
          * Decodes a Location message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Location
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        /**
          * Encodes the specified Location message. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
          * @param message Location message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified Location message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
          * @param message Location message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a Location message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Location
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        /**
          * Creates a plain object from a Location message. Also converts values to other types if specified.
          * @param message Location
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.SourceCodeInfoNs.Location,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a Location message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object Timestamp extends js.Object {
      /**
        * Creates a new Timestamp instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Timestamp instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ITimestamp): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp = js.native
      /**
        * Decodes a Timestamp message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp = js.native
      /**
        * Decodes a Timestamp message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp = js.native
      /**
        * Encodes the specified Timestamp message. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ITimestamp): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ITimestamp,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ITimestamp): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ITimestamp,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Timestamp
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp = js.native
      /**
        * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
        * @param message Timestamp
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Timestamp,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies a Timestamp message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    /* static members */
    @js.native
    object UninterpretedOption extends js.Object {
      /**
        * Creates a new UninterpretedOption instance using the specified properties.
        * @param [properties] Properties to set
        * @returns UninterpretedOption instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IUninterpretedOption
      ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption = js.native
      /**
        * Decodes an UninterpretedOption message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns UninterpretedOption
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption = js.native
      /**
        * Decodes an UninterpretedOption message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns UninterpretedOption
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption = js.native
      /**
        * Encodes the specified UninterpretedOption message. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
        * @param message UninterpretedOption message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IUninterpretedOption): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IUninterpretedOption,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified UninterpretedOption message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
        * @param message UninterpretedOption message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IUninterpretedOption): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IUninterpretedOption,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an UninterpretedOption message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns UninterpretedOption
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption = js.native
      /**
        * Creates a plain object from an UninterpretedOption message. Also converts values to other types if specified.
        * @param message UninterpretedOption
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOption,
        options: protobufjsLib.protobufjsMod.IConversionOptions
      ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      /**
        * Verifies an UninterpretedOption message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
    }
    
    @JSName("UninterpretedOption")
    @js.native
    object UninterpretedOptionNs extends js.Object {
      /** Properties of a NamePart. */
      trait INamePart extends js.Object {
        /** NamePart isExtension */
        var isExtension: scala.Boolean
        /** NamePart namePart */
        var namePart: java.lang.String
      }
      
      /** Represents a NamePart. */
      @js.native
      /**
        * Constructs a new NamePart.
        * @param [properties] Properties to set
        */
      class NamePart () extends INamePart {
        def this(properties: INamePart) = this()
        /** NamePart isExtension */
        /* CompleteClass */
        override var isExtension: scala.Boolean = js.native
        /** NamePart namePart */
        /* CompleteClass */
        override var namePart: java.lang.String = js.native
        /**
          * Converts this NamePart to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /* static members */
      @js.native
      object NamePart extends js.Object {
        /**
          * Creates a new NamePart instance using the specified properties.
          * @param [properties] Properties to set
          * @returns NamePart instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        /**
          * Decodes a NamePart message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns NamePart
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        /**
          * Decodes a NamePart message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns NamePart
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        /**
          * Encodes the specified NamePart message. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
          * @param message NamePart message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified NamePart message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
          * @param message NamePart message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a NamePart message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns NamePart
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        /**
          * Creates a plain object from a NamePart message. Also converts values to other types if specified.
          * @param message NamePart
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a NamePart message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
    }
    
  }
  
  /** Namespace pubsub. */
  @JSName("pubsub")
  @js.native
  object pubsubNs extends js.Object {
    /** Namespace v1. */
    @JSName("v1")
    @js.native
    object v1Ns extends js.Object {
      /** Represents an AcknowledgeRequest. */
      @js.native
      /**
        * Constructs a new AcknowledgeRequest.
        * @param [properties] Properties to set
        */
      class AcknowledgeRequest () extends IAcknowledgeRequest {
        def this(properties: IAcknowledgeRequest) = this()
        /** AcknowledgeRequest ackIds. */
        @JSName("ackIds")
        var ackIds_AcknowledgeRequest: js.Array[java.lang.String] = js.native
        /** AcknowledgeRequest subscription. */
        @JSName("subscription")
        var subscription_AcknowledgeRequest: java.lang.String = js.native
        /**
          * Converts this AcknowledgeRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a CreateSnapshotRequest. */
      @js.native
      /**
        * Constructs a new CreateSnapshotRequest.
        * @param [properties] Properties to set
        */
      class CreateSnapshotRequest () extends ICreateSnapshotRequest {
        def this(properties: ICreateSnapshotRequest) = this()
        /** CreateSnapshotRequest labels. */
        @JSName("labels")
        var labels_CreateSnapshotRequest: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
        /** CreateSnapshotRequest name. */
        @JSName("name")
        var name_CreateSnapshotRequest: java.lang.String = js.native
        /** CreateSnapshotRequest subscription. */
        @JSName("subscription")
        var subscription_CreateSnapshotRequest: java.lang.String = js.native
        /**
          * Converts this CreateSnapshotRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a DeleteSnapshotRequest. */
      @js.native
      /**
        * Constructs a new DeleteSnapshotRequest.
        * @param [properties] Properties to set
        */
      class DeleteSnapshotRequest () extends IDeleteSnapshotRequest {
        def this(properties: IDeleteSnapshotRequest) = this()
        /** DeleteSnapshotRequest snapshot. */
        @JSName("snapshot")
        var snapshot_DeleteSnapshotRequest: java.lang.String = js.native
        /**
          * Converts this DeleteSnapshotRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a DeleteSubscriptionRequest. */
      @js.native
      /**
        * Constructs a new DeleteSubscriptionRequest.
        * @param [properties] Properties to set
        */
      class DeleteSubscriptionRequest () extends IDeleteSubscriptionRequest {
        def this(properties: IDeleteSubscriptionRequest) = this()
        /** DeleteSubscriptionRequest subscription. */
        @JSName("subscription")
        var subscription_DeleteSubscriptionRequest: java.lang.String = js.native
        /**
          * Converts this DeleteSubscriptionRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a DeleteTopicRequest. */
      @js.native
      /**
        * Constructs a new DeleteTopicRequest.
        * @param [properties] Properties to set
        */
      class DeleteTopicRequest () extends IDeleteTopicRequest {
        def this(properties: IDeleteTopicRequest) = this()
        /** DeleteTopicRequest topic. */
        @JSName("topic")
        var topic_DeleteTopicRequest: java.lang.String = js.native
        /**
          * Converts this DeleteTopicRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents an ExpirationPolicy. */
      @js.native
      /**
        * Constructs a new ExpirationPolicy.
        * @param [properties] Properties to set
        */
      class ExpirationPolicy () extends IExpirationPolicy {
        def this(properties: IExpirationPolicy) = this()
        /**
          * Converts this ExpirationPolicy to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a GetSnapshotRequest. */
      @js.native
      /**
        * Constructs a new GetSnapshotRequest.
        * @param [properties] Properties to set
        */
      class GetSnapshotRequest () extends IGetSnapshotRequest {
        def this(properties: IGetSnapshotRequest) = this()
        /** GetSnapshotRequest snapshot. */
        @JSName("snapshot")
        var snapshot_GetSnapshotRequest: java.lang.String = js.native
        /**
          * Converts this GetSnapshotRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a GetSubscriptionRequest. */
      @js.native
      /**
        * Constructs a new GetSubscriptionRequest.
        * @param [properties] Properties to set
        */
      class GetSubscriptionRequest () extends IGetSubscriptionRequest {
        def this(properties: IGetSubscriptionRequest) = this()
        /** GetSubscriptionRequest subscription. */
        @JSName("subscription")
        var subscription_GetSubscriptionRequest: java.lang.String = js.native
        /**
          * Converts this GetSubscriptionRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a GetTopicRequest. */
      @js.native
      /**
        * Constructs a new GetTopicRequest.
        * @param [properties] Properties to set
        */
      class GetTopicRequest () extends IGetTopicRequest {
        def this(properties: IGetTopicRequest) = this()
        /** GetTopicRequest topic. */
        @JSName("topic")
        var topic_GetTopicRequest: java.lang.String = js.native
        /**
          * Converts this GetTopicRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Properties of an AcknowledgeRequest. */
      trait IAcknowledgeRequest extends js.Object {
        /** AcknowledgeRequest ackIds */
        var ackIds: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
        /** AcknowledgeRequest subscription */
        var subscription: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a CreateSnapshotRequest. */
      trait ICreateSnapshotRequest extends js.Object {
        /** CreateSnapshotRequest labels */
        var labels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
        /** CreateSnapshotRequest name */
        var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** CreateSnapshotRequest subscription */
        var subscription: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a DeleteSnapshotRequest. */
      trait IDeleteSnapshotRequest extends js.Object {
        /** DeleteSnapshotRequest snapshot */
        var snapshot: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a DeleteSubscriptionRequest. */
      trait IDeleteSubscriptionRequest extends js.Object {
        /** DeleteSubscriptionRequest subscription */
        var subscription: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a DeleteTopicRequest. */
      trait IDeleteTopicRequest extends js.Object {
        /** DeleteTopicRequest topic */
        var topic: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of an ExpirationPolicy. */
      trait IExpirationPolicy extends js.Object {
        /** ExpirationPolicy ttl */
        var ttl: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDuration | scala.Null
              ] = js.undefined
      }
      
      /** Properties of a GetSnapshotRequest. */
      trait IGetSnapshotRequest extends js.Object {
        /** GetSnapshotRequest snapshot */
        var snapshot: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a GetSubscriptionRequest. */
      trait IGetSubscriptionRequest extends js.Object {
        /** GetSubscriptionRequest subscription */
        var subscription: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a GetTopicRequest. */
      trait IGetTopicRequest extends js.Object {
        /** GetTopicRequest topic */
        var topic: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a ListSnapshotsRequest. */
      trait IListSnapshotsRequest extends js.Object {
        /** ListSnapshotsRequest pageSize */
        var pageSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** ListSnapshotsRequest pageToken */
        var pageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListSnapshotsRequest project */
        var project: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a ListSnapshotsResponse. */
      trait IListSnapshotsResponse extends js.Object {
        /** ListSnapshotsResponse nextPageToken */
        var nextPageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListSnapshotsResponse snapshots */
        var snapshots: js.UndefOr[js.Array[ISnapshot] | scala.Null] = js.undefined
      }
      
      /** Properties of a ListSubscriptionsRequest. */
      trait IListSubscriptionsRequest extends js.Object {
        /** ListSubscriptionsRequest pageSize */
        var pageSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** ListSubscriptionsRequest pageToken */
        var pageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListSubscriptionsRequest project */
        var project: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a ListSubscriptionsResponse. */
      trait IListSubscriptionsResponse extends js.Object {
        /** ListSubscriptionsResponse nextPageToken */
        var nextPageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListSubscriptionsResponse subscriptions */
        var subscriptions: js.UndefOr[js.Array[ISubscription] | scala.Null] = js.undefined
      }
      
      /** Properties of a ListTopicSnapshotsRequest. */
      trait IListTopicSnapshotsRequest extends js.Object {
        /** ListTopicSnapshotsRequest pageSize */
        var pageSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** ListTopicSnapshotsRequest pageToken */
        var pageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListTopicSnapshotsRequest topic */
        var topic: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a ListTopicSnapshotsResponse. */
      trait IListTopicSnapshotsResponse extends js.Object {
        /** ListTopicSnapshotsResponse nextPageToken */
        var nextPageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListTopicSnapshotsResponse snapshots */
        var snapshots: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
      }
      
      /** Properties of a ListTopicSubscriptionsRequest. */
      trait IListTopicSubscriptionsRequest extends js.Object {
        /** ListTopicSubscriptionsRequest pageSize */
        var pageSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** ListTopicSubscriptionsRequest pageToken */
        var pageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListTopicSubscriptionsRequest topic */
        var topic: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a ListTopicSubscriptionsResponse. */
      trait IListTopicSubscriptionsResponse extends js.Object {
        /** ListTopicSubscriptionsResponse nextPageToken */
        var nextPageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListTopicSubscriptionsResponse subscriptions */
        var subscriptions: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
      }
      
      /** Properties of a ListTopicsRequest. */
      trait IListTopicsRequest extends js.Object {
        /** ListTopicsRequest pageSize */
        var pageSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** ListTopicsRequest pageToken */
        var pageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListTopicsRequest project */
        var project: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a ListTopicsResponse. */
      trait IListTopicsResponse extends js.Object {
        /** ListTopicsResponse nextPageToken */
        var nextPageToken: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ListTopicsResponse topics */
        var topics: js.UndefOr[js.Array[ITopic] | scala.Null] = js.undefined
      }
      
      /** Properties of a MessageStoragePolicy. */
      trait IMessageStoragePolicy extends js.Object {
        /** MessageStoragePolicy allowedPersistenceRegions */
        var allowedPersistenceRegions: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
      }
      
      /** Properties of a ModifyAckDeadlineRequest. */
      trait IModifyAckDeadlineRequest extends js.Object {
        /** ModifyAckDeadlineRequest ackDeadlineSeconds */
        var ackDeadlineSeconds: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** ModifyAckDeadlineRequest ackIds */
        var ackIds: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
        /** ModifyAckDeadlineRequest subscription */
        var subscription: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a ModifyPushConfigRequest. */
      trait IModifyPushConfigRequest extends js.Object {
        /** ModifyPushConfigRequest pushConfig */
        var pushConfig: js.UndefOr[IPushConfig | scala.Null] = js.undefined
        /** ModifyPushConfigRequest subscription */
        var subscription: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a PublishRequest. */
      trait IPublishRequest extends js.Object {
        /** PublishRequest messages */
        var messages: js.UndefOr[js.Array[IPubsubMessage] | scala.Null] = js.undefined
        /** PublishRequest topic */
        var topic: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a PublishResponse. */
      trait IPublishResponse extends js.Object {
        /** PublishResponse messageIds */
        var messageIds: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
      }
      
      /** Properties of a PubsubMessage. */
      trait IPubsubMessage extends js.Object {
        /** PubsubMessage attributes */
        var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
        /** PubsubMessage data */
        var data: js.UndefOr[stdLib.Uint8Array | scala.Null] = js.undefined
        /** PubsubMessage messageId */
        var messageId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** PubsubMessage publishTime */
        var publishTime: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ITimestamp | scala.Null
              ] = js.undefined
      }
      
      /** Properties of a PullRequest. */
      trait IPullRequest extends js.Object {
        /** PullRequest maxMessages */
        var maxMessages: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** PullRequest returnImmediately */
        var returnImmediately: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
        /** PullRequest subscription */
        var subscription: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a PullResponse. */
      trait IPullResponse extends js.Object {
        /** PullResponse receivedMessages */
        var receivedMessages: js.UndefOr[js.Array[IReceivedMessage] | scala.Null] = js.undefined
      }
      
      /** Properties of a PushConfig. */
      trait IPushConfig extends js.Object {
        /** PushConfig attributes */
        var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
        /** PushConfig oidcToken */
        var oidcToken: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.IOidcToken | scala.Null
              ] = js.undefined
        /** PushConfig pushEndpoint */
        var pushEndpoint: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a ReceivedMessage. */
      trait IReceivedMessage extends js.Object {
        /** ReceivedMessage ackId */
        var ackId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** ReceivedMessage message */
        var message: js.UndefOr[IPubsubMessage | scala.Null] = js.undefined
      }
      
      /** Properties of a SeekRequest. */
      trait ISeekRequest extends js.Object {
        /** SeekRequest snapshot */
        var snapshot: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** SeekRequest subscription */
        var subscription: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** SeekRequest time */
        var time: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ITimestamp | scala.Null
              ] = js.undefined
      }
      
      /** Properties of a SeekResponse. */
      trait ISeekResponse extends js.Object
      
      /** Properties of a Snapshot. */
      trait ISnapshot extends js.Object {
        /** Snapshot expireTime */
        var expireTime: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.ITimestamp | scala.Null
              ] = js.undefined
        /** Snapshot labels */
        var labels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
        /** Snapshot name */
        var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** Snapshot topic */
        var topic: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a StreamingPullRequest. */
      trait IStreamingPullRequest extends js.Object {
        /** StreamingPullRequest ackIds */
        var ackIds: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
        /** StreamingPullRequest modifyDeadlineAckIds */
        var modifyDeadlineAckIds: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
        /** StreamingPullRequest modifyDeadlineSeconds */
        var modifyDeadlineSeconds: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
        /** StreamingPullRequest streamAckDeadlineSeconds */
        var streamAckDeadlineSeconds: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** StreamingPullRequest subscription */
        var subscription: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a StreamingPullResponse. */
      trait IStreamingPullResponse extends js.Object {
        /** StreamingPullResponse receivedMessages */
        var receivedMessages: js.UndefOr[js.Array[IReceivedMessage] | scala.Null] = js.undefined
      }
      
      /** Properties of a Subscription. */
      trait ISubscription extends js.Object {
        /** Subscription ackDeadlineSeconds */
        var ackDeadlineSeconds: js.UndefOr[scala.Double | scala.Null] = js.undefined
        /** Subscription expirationPolicy */
        var expirationPolicy: js.UndefOr[IExpirationPolicy | scala.Null] = js.undefined
        /** Subscription labels */
        var labels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
        /** Subscription messageRetentionDuration */
        var messageRetentionDuration: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IDuration | scala.Null
              ] = js.undefined
        /** Subscription name */
        var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** Subscription pushConfig */
        var pushConfig: js.UndefOr[IPushConfig | scala.Null] = js.undefined
        /** Subscription retainAckedMessages */
        var retainAckedMessages: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
        /** Subscription topic */
        var topic: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a Topic. */
      trait ITopic extends js.Object {
        /** Topic labels */
        var labels: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
        /** Topic messageStoragePolicy */
        var messageStoragePolicy: js.UndefOr[IMessageStoragePolicy | scala.Null] = js.undefined
        /** Topic name */
        var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of an UpdateSnapshotRequest. */
      trait IUpdateSnapshotRequest extends js.Object {
        /** UpdateSnapshotRequest snapshot */
        var snapshot: js.UndefOr[ISnapshot | scala.Null] = js.undefined
        /** UpdateSnapshotRequest updateMask */
        var updateMask: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldMask | scala.Null
              ] = js.undefined
      }
      
      /** Properties of an UpdateSubscriptionRequest. */
      trait IUpdateSubscriptionRequest extends js.Object {
        /** UpdateSubscriptionRequest subscription */
        var subscription: js.UndefOr[ISubscription | scala.Null] = js.undefined
        /** UpdateSubscriptionRequest updateMask */
        var updateMask: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldMask | scala.Null
              ] = js.undefined
      }
      
      /** Properties of an UpdateTopicRequest. */
      trait IUpdateTopicRequest extends js.Object {
        /** UpdateTopicRequest topic */
        var topic: js.UndefOr[ITopic | scala.Null] = js.undefined
        /** UpdateTopicRequest updateMask */
        var updateMask: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.IFieldMask | scala.Null
              ] = js.undefined
      }
      
      /** Represents a ListSnapshotsRequest. */
      @js.native
      /**
        * Constructs a new ListSnapshotsRequest.
        * @param [properties] Properties to set
        */
      class ListSnapshotsRequest () extends IListSnapshotsRequest {
        def this(properties: IListSnapshotsRequest) = this()
        /** ListSnapshotsRequest pageSize. */
        @JSName("pageSize")
        var pageSize_ListSnapshotsRequest: scala.Double = js.native
        /** ListSnapshotsRequest pageToken. */
        @JSName("pageToken")
        var pageToken_ListSnapshotsRequest: java.lang.String = js.native
        /** ListSnapshotsRequest project. */
        @JSName("project")
        var project_ListSnapshotsRequest: java.lang.String = js.native
        /**
          * Converts this ListSnapshotsRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ListSnapshotsResponse. */
      @js.native
      /**
        * Constructs a new ListSnapshotsResponse.
        * @param [properties] Properties to set
        */
      class ListSnapshotsResponse () extends IListSnapshotsResponse {
        def this(properties: IListSnapshotsResponse) = this()
        /** ListSnapshotsResponse nextPageToken. */
        @JSName("nextPageToken")
        var nextPageToken_ListSnapshotsResponse: java.lang.String = js.native
        /** ListSnapshotsResponse snapshots. */
        @JSName("snapshots")
        var snapshots_ListSnapshotsResponse: js.Array[ISnapshot] = js.native
        /**
          * Converts this ListSnapshotsResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ListSubscriptionsRequest. */
      @js.native
      /**
        * Constructs a new ListSubscriptionsRequest.
        * @param [properties] Properties to set
        */
      class ListSubscriptionsRequest () extends IListSubscriptionsRequest {
        def this(properties: IListSubscriptionsRequest) = this()
        /** ListSubscriptionsRequest pageSize. */
        @JSName("pageSize")
        var pageSize_ListSubscriptionsRequest: scala.Double = js.native
        /** ListSubscriptionsRequest pageToken. */
        @JSName("pageToken")
        var pageToken_ListSubscriptionsRequest: java.lang.String = js.native
        /** ListSubscriptionsRequest project. */
        @JSName("project")
        var project_ListSubscriptionsRequest: java.lang.String = js.native
        /**
          * Converts this ListSubscriptionsRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ListSubscriptionsResponse. */
      @js.native
      /**
        * Constructs a new ListSubscriptionsResponse.
        * @param [properties] Properties to set
        */
      class ListSubscriptionsResponse () extends IListSubscriptionsResponse {
        def this(properties: IListSubscriptionsResponse) = this()
        /** ListSubscriptionsResponse nextPageToken. */
        @JSName("nextPageToken")
        var nextPageToken_ListSubscriptionsResponse: java.lang.String = js.native
        /** ListSubscriptionsResponse subscriptions. */
        @JSName("subscriptions")
        var subscriptions_ListSubscriptionsResponse: js.Array[ISubscription] = js.native
        /**
          * Converts this ListSubscriptionsResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ListTopicSnapshotsRequest. */
      @js.native
      /**
        * Constructs a new ListTopicSnapshotsRequest.
        * @param [properties] Properties to set
        */
      class ListTopicSnapshotsRequest () extends IListTopicSnapshotsRequest {
        def this(properties: IListTopicSnapshotsRequest) = this()
        /** ListTopicSnapshotsRequest pageSize. */
        @JSName("pageSize")
        var pageSize_ListTopicSnapshotsRequest: scala.Double = js.native
        /** ListTopicSnapshotsRequest pageToken. */
        @JSName("pageToken")
        var pageToken_ListTopicSnapshotsRequest: java.lang.String = js.native
        /** ListTopicSnapshotsRequest topic. */
        @JSName("topic")
        var topic_ListTopicSnapshotsRequest: java.lang.String = js.native
        /**
          * Converts this ListTopicSnapshotsRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ListTopicSnapshotsResponse. */
      @js.native
      /**
        * Constructs a new ListTopicSnapshotsResponse.
        * @param [properties] Properties to set
        */
      class ListTopicSnapshotsResponse () extends IListTopicSnapshotsResponse {
        def this(properties: IListTopicSnapshotsResponse) = this()
        /** ListTopicSnapshotsResponse nextPageToken. */
        @JSName("nextPageToken")
        var nextPageToken_ListTopicSnapshotsResponse: java.lang.String = js.native
        /** ListTopicSnapshotsResponse snapshots. */
        @JSName("snapshots")
        var snapshots_ListTopicSnapshotsResponse: js.Array[java.lang.String] = js.native
        /**
          * Converts this ListTopicSnapshotsResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ListTopicSubscriptionsRequest. */
      @js.native
      /**
        * Constructs a new ListTopicSubscriptionsRequest.
        * @param [properties] Properties to set
        */
      class ListTopicSubscriptionsRequest () extends IListTopicSubscriptionsRequest {
        def this(properties: IListTopicSubscriptionsRequest) = this()
        /** ListTopicSubscriptionsRequest pageSize. */
        @JSName("pageSize")
        var pageSize_ListTopicSubscriptionsRequest: scala.Double = js.native
        /** ListTopicSubscriptionsRequest pageToken. */
        @JSName("pageToken")
        var pageToken_ListTopicSubscriptionsRequest: java.lang.String = js.native
        /** ListTopicSubscriptionsRequest topic. */
        @JSName("topic")
        var topic_ListTopicSubscriptionsRequest: java.lang.String = js.native
        /**
          * Converts this ListTopicSubscriptionsRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ListTopicSubscriptionsResponse. */
      @js.native
      /**
        * Constructs a new ListTopicSubscriptionsResponse.
        * @param [properties] Properties to set
        */
      class ListTopicSubscriptionsResponse () extends IListTopicSubscriptionsResponse {
        def this(properties: IListTopicSubscriptionsResponse) = this()
        /** ListTopicSubscriptionsResponse nextPageToken. */
        @JSName("nextPageToken")
        var nextPageToken_ListTopicSubscriptionsResponse: java.lang.String = js.native
        /** ListTopicSubscriptionsResponse subscriptions. */
        @JSName("subscriptions")
        var subscriptions_ListTopicSubscriptionsResponse: js.Array[java.lang.String] = js.native
        /**
          * Converts this ListTopicSubscriptionsResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ListTopicsRequest. */
      @js.native
      /**
        * Constructs a new ListTopicsRequest.
        * @param [properties] Properties to set
        */
      class ListTopicsRequest () extends IListTopicsRequest {
        def this(properties: IListTopicsRequest) = this()
        /** ListTopicsRequest pageSize. */
        @JSName("pageSize")
        var pageSize_ListTopicsRequest: scala.Double = js.native
        /** ListTopicsRequest pageToken. */
        @JSName("pageToken")
        var pageToken_ListTopicsRequest: java.lang.String = js.native
        /** ListTopicsRequest project. */
        @JSName("project")
        var project_ListTopicsRequest: java.lang.String = js.native
        /**
          * Converts this ListTopicsRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ListTopicsResponse. */
      @js.native
      /**
        * Constructs a new ListTopicsResponse.
        * @param [properties] Properties to set
        */
      class ListTopicsResponse () extends IListTopicsResponse {
        def this(properties: IListTopicsResponse) = this()
        /** ListTopicsResponse nextPageToken. */
        @JSName("nextPageToken")
        var nextPageToken_ListTopicsResponse: java.lang.String = js.native
        /** ListTopicsResponse topics. */
        @JSName("topics")
        var topics_ListTopicsResponse: js.Array[ITopic] = js.native
        /**
          * Converts this ListTopicsResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a MessageStoragePolicy. */
      @js.native
      /**
        * Constructs a new MessageStoragePolicy.
        * @param [properties] Properties to set
        */
      class MessageStoragePolicy () extends IMessageStoragePolicy {
        def this(properties: IMessageStoragePolicy) = this()
        /** MessageStoragePolicy allowedPersistenceRegions. */
        @JSName("allowedPersistenceRegions")
        var allowedPersistenceRegions_MessageStoragePolicy: js.Array[java.lang.String] = js.native
        /**
          * Converts this MessageStoragePolicy to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ModifyAckDeadlineRequest. */
      @js.native
      /**
        * Constructs a new ModifyAckDeadlineRequest.
        * @param [properties] Properties to set
        */
      class ModifyAckDeadlineRequest () extends IModifyAckDeadlineRequest {
        def this(properties: IModifyAckDeadlineRequest) = this()
        /** ModifyAckDeadlineRequest ackDeadlineSeconds. */
        @JSName("ackDeadlineSeconds")
        var ackDeadlineSeconds_ModifyAckDeadlineRequest: scala.Double = js.native
        /** ModifyAckDeadlineRequest ackIds. */
        @JSName("ackIds")
        var ackIds_ModifyAckDeadlineRequest: js.Array[java.lang.String] = js.native
        /** ModifyAckDeadlineRequest subscription. */
        @JSName("subscription")
        var subscription_ModifyAckDeadlineRequest: java.lang.String = js.native
        /**
          * Converts this ModifyAckDeadlineRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ModifyPushConfigRequest. */
      @js.native
      /**
        * Constructs a new ModifyPushConfigRequest.
        * @param [properties] Properties to set
        */
      class ModifyPushConfigRequest () extends IModifyPushConfigRequest {
        def this(properties: IModifyPushConfigRequest) = this()
        /** ModifyPushConfigRequest subscription. */
        @JSName("subscription")
        var subscription_ModifyPushConfigRequest: java.lang.String = js.native
        /**
          * Converts this ModifyPushConfigRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a PublishRequest. */
      @js.native
      /**
        * Constructs a new PublishRequest.
        * @param [properties] Properties to set
        */
      class PublishRequest () extends IPublishRequest {
        def this(properties: IPublishRequest) = this()
        /** PublishRequest messages. */
        @JSName("messages")
        var messages_PublishRequest: js.Array[IPubsubMessage] = js.native
        /** PublishRequest topic. */
        @JSName("topic")
        var topic_PublishRequest: java.lang.String = js.native
        /**
          * Converts this PublishRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a PublishResponse. */
      @js.native
      /**
        * Constructs a new PublishResponse.
        * @param [properties] Properties to set
        */
      class PublishResponse () extends IPublishResponse {
        def this(properties: IPublishResponse) = this()
        /** PublishResponse messageIds. */
        @JSName("messageIds")
        var messageIds_PublishResponse: js.Array[java.lang.String] = js.native
        /**
          * Converts this PublishResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a Publisher */
      @js.native
      class Publisher protected ()
        extends protobufjsLib.protobufjsMod.rpcNs.Service {
        /**
          * Constructs a new Publisher service.
          * @param rpcImpl RPC implementation
          * @param [requestDelimited=false] Whether requests are length-delimited
          * @param [responseDelimited=false] Whether responses are length-delimited
          */
        def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl) = this()
        def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean) = this()
        def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean, responseDelimited: scala.Boolean) = this()
        /**
          * Calls CreateTopic.
          * @param request Topic message or plain object
          * @returns Promise
          */
        def createTopic(request: ITopic): js.Promise[Topic] = js.native
        /**
          * Calls CreateTopic.
          * @param request Topic message or plain object
          * @param callback Node-style callback called with the error, if any, and Topic
          */
        def createTopic(
          request: ITopic,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublisherNs.CreateTopicCallback
        ): scala.Unit = js.native
        /**
          * Calls DeleteTopic.
          * @param request DeleteTopicRequest message or plain object
          * @returns Promise
          */
        def deleteTopic(request: IDeleteTopicRequest): js.Promise[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty] = js.native
        /**
          * Calls DeleteTopic.
          * @param request DeleteTopicRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Empty
          */
        def deleteTopic(
          request: IDeleteTopicRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublisherNs.DeleteTopicCallback
        ): scala.Unit = js.native
        /**
          * Calls GetTopic.
          * @param request GetTopicRequest message or plain object
          * @returns Promise
          */
        def getTopic(request: IGetTopicRequest): js.Promise[Topic] = js.native
        /**
          * Calls GetTopic.
          * @param request GetTopicRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Topic
          */
        def getTopic(
          request: IGetTopicRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublisherNs.GetTopicCallback
        ): scala.Unit = js.native
        /**
          * Calls ListTopicSnapshots.
          * @param request ListTopicSnapshotsRequest message or plain object
          * @returns Promise
          */
        def listTopicSnapshots(request: IListTopicSnapshotsRequest): js.Promise[ListTopicSnapshotsResponse] = js.native
        /**
          * Calls ListTopicSnapshots.
          * @param request ListTopicSnapshotsRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and ListTopicSnapshotsResponse
          */
        def listTopicSnapshots(
          request: IListTopicSnapshotsRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublisherNs.ListTopicSnapshotsCallback
        ): scala.Unit = js.native
        /**
          * Calls ListTopicSubscriptions.
          * @param request ListTopicSubscriptionsRequest message or plain object
          * @returns Promise
          */
        def listTopicSubscriptions(request: IListTopicSubscriptionsRequest): js.Promise[ListTopicSubscriptionsResponse] = js.native
        /**
          * Calls ListTopicSubscriptions.
          * @param request ListTopicSubscriptionsRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and ListTopicSubscriptionsResponse
          */
        def listTopicSubscriptions(
          request: IListTopicSubscriptionsRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublisherNs.ListTopicSubscriptionsCallback
        ): scala.Unit = js.native
        /**
          * Calls ListTopics.
          * @param request ListTopicsRequest message or plain object
          * @returns Promise
          */
        def listTopics(request: IListTopicsRequest): js.Promise[ListTopicsResponse] = js.native
        /**
          * Calls ListTopics.
          * @param request ListTopicsRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and ListTopicsResponse
          */
        def listTopics(
          request: IListTopicsRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublisherNs.ListTopicsCallback
        ): scala.Unit = js.native
        /**
          * Calls Publish.
          * @param request PublishRequest message or plain object
          * @returns Promise
          */
        def publish(request: IPublishRequest): js.Promise[PublishResponse] = js.native
        /**
          * Calls Publish.
          * @param request PublishRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and PublishResponse
          */
        def publish(
          request: IPublishRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublisherNs.PublishCallback
        ): scala.Unit = js.native
        /**
          * Calls UpdateTopic.
          * @param request UpdateTopicRequest message or plain object
          * @returns Promise
          */
        def updateTopic(request: IUpdateTopicRequest): js.Promise[Topic] = js.native
        /**
          * Calls UpdateTopic.
          * @param request UpdateTopicRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Topic
          */
        def updateTopic(
          request: IUpdateTopicRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublisherNs.UpdateTopicCallback
        ): scala.Unit = js.native
      }
      
      /** Represents a PubsubMessage. */
      @js.native
      /**
        * Constructs a new PubsubMessage.
        * @param [properties] Properties to set
        */
      class PubsubMessage () extends IPubsubMessage {
        def this(properties: IPubsubMessage) = this()
        /** PubsubMessage attributes. */
        @JSName("attributes")
        var attributes_PubsubMessage: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
        /** PubsubMessage data. */
        @JSName("data")
        var data_PubsubMessage: stdLib.Uint8Array = js.native
        /** PubsubMessage messageId. */
        @JSName("messageId")
        var messageId_PubsubMessage: java.lang.String = js.native
        /**
          * Converts this PubsubMessage to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a PullRequest. */
      @js.native
      /**
        * Constructs a new PullRequest.
        * @param [properties] Properties to set
        */
      class PullRequest () extends IPullRequest {
        def this(properties: IPullRequest) = this()
        /** PullRequest maxMessages. */
        @JSName("maxMessages")
        var maxMessages_PullRequest: scala.Double = js.native
        /** PullRequest returnImmediately. */
        @JSName("returnImmediately")
        var returnImmediately_PullRequest: scala.Boolean = js.native
        /** PullRequest subscription. */
        @JSName("subscription")
        var subscription_PullRequest: java.lang.String = js.native
        /**
          * Converts this PullRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a PullResponse. */
      @js.native
      /**
        * Constructs a new PullResponse.
        * @param [properties] Properties to set
        */
      class PullResponse () extends IPullResponse {
        def this(properties: IPullResponse) = this()
        /** PullResponse receivedMessages. */
        @JSName("receivedMessages")
        var receivedMessages_PullResponse: js.Array[IReceivedMessage] = js.native
        /**
          * Converts this PullResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a PushConfig. */
      @js.native
      /**
        * Constructs a new PushConfig.
        * @param [properties] Properties to set
        */
      class PushConfig () extends IPushConfig {
        def this(properties: IPushConfig) = this()
        /** PushConfig attributes. */
        @JSName("attributes")
        var attributes_PushConfig: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
        /** PushConfig authenticationMethod. */
        var authenticationMethod: js.UndefOr[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.oidcToken] = js.native
        /** PushConfig pushEndpoint. */
        @JSName("pushEndpoint")
        var pushEndpoint_PushConfig: java.lang.String = js.native
        /**
          * Converts this PushConfig to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a ReceivedMessage. */
      @js.native
      /**
        * Constructs a new ReceivedMessage.
        * @param [properties] Properties to set
        */
      class ReceivedMessage () extends IReceivedMessage {
        def this(properties: IReceivedMessage) = this()
        /** ReceivedMessage ackId. */
        @JSName("ackId")
        var ackId_ReceivedMessage: java.lang.String = js.native
        /**
          * Converts this ReceivedMessage to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a SeekRequest. */
      @js.native
      /**
        * Constructs a new SeekRequest.
        * @param [properties] Properties to set
        */
      class SeekRequest () extends ISeekRequest {
        def this(properties: ISeekRequest) = this()
        /** SeekRequest snapshot. */
        @JSName("snapshot")
        var snapshot_SeekRequest: java.lang.String = js.native
        /** SeekRequest subscription. */
        @JSName("subscription")
        var subscription_SeekRequest: java.lang.String = js.native
        /** SeekRequest target. */
        var target: js.UndefOr[
                atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.time | atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.snapshot
              ] = js.native
        /**
          * Converts this SeekRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a SeekResponse. */
      @js.native
      /**
        * Constructs a new SeekResponse.
        * @param [properties] Properties to set
        */
      class SeekResponse () extends ISeekResponse {
        def this(properties: ISeekResponse) = this()
        /**
          * Converts this SeekResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a Snapshot. */
      @js.native
      /**
        * Constructs a new Snapshot.
        * @param [properties] Properties to set
        */
      class Snapshot () extends ISnapshot {
        def this(properties: ISnapshot) = this()
        /** Snapshot labels. */
        @JSName("labels")
        var labels_Snapshot: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
        /** Snapshot name. */
        @JSName("name")
        var name_Snapshot: java.lang.String = js.native
        /** Snapshot topic. */
        @JSName("topic")
        var topic_Snapshot: java.lang.String = js.native
        /**
          * Converts this Snapshot to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a StreamingPullRequest. */
      @js.native
      /**
        * Constructs a new StreamingPullRequest.
        * @param [properties] Properties to set
        */
      class StreamingPullRequest () extends IStreamingPullRequest {
        def this(properties: IStreamingPullRequest) = this()
        /** StreamingPullRequest ackIds. */
        @JSName("ackIds")
        var ackIds_StreamingPullRequest: js.Array[java.lang.String] = js.native
        /** StreamingPullRequest modifyDeadlineAckIds. */
        @JSName("modifyDeadlineAckIds")
        var modifyDeadlineAckIds_StreamingPullRequest: js.Array[java.lang.String] = js.native
        /** StreamingPullRequest modifyDeadlineSeconds. */
        @JSName("modifyDeadlineSeconds")
        var modifyDeadlineSeconds_StreamingPullRequest: js.Array[scala.Double] = js.native
        /** StreamingPullRequest streamAckDeadlineSeconds. */
        @JSName("streamAckDeadlineSeconds")
        var streamAckDeadlineSeconds_StreamingPullRequest: scala.Double = js.native
        /** StreamingPullRequest subscription. */
        @JSName("subscription")
        var subscription_StreamingPullRequest: java.lang.String = js.native
        /**
          * Converts this StreamingPullRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a StreamingPullResponse. */
      @js.native
      /**
        * Constructs a new StreamingPullResponse.
        * @param [properties] Properties to set
        */
      class StreamingPullResponse () extends IStreamingPullResponse {
        def this(properties: IStreamingPullResponse) = this()
        /** StreamingPullResponse receivedMessages. */
        @JSName("receivedMessages")
        var receivedMessages_StreamingPullResponse: js.Array[IReceivedMessage] = js.native
        /**
          * Converts this StreamingPullResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a Subscriber */
      @js.native
      class Subscriber protected ()
        extends protobufjsLib.protobufjsMod.rpcNs.Service {
        /**
          * Constructs a new Subscriber service.
          * @param rpcImpl RPC implementation
          * @param [requestDelimited=false] Whether requests are length-delimited
          * @param [responseDelimited=false] Whether responses are length-delimited
          */
        def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl) = this()
        def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean) = this()
        def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean, responseDelimited: scala.Boolean) = this()
        /**
          * Calls Acknowledge.
          * @param request AcknowledgeRequest message or plain object
          * @returns Promise
          */
        def acknowledge(request: IAcknowledgeRequest): js.Promise[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty] = js.native
        /**
          * Calls Acknowledge.
          * @param request AcknowledgeRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Empty
          */
        def acknowledge(
          request: IAcknowledgeRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.AcknowledgeCallback
        ): scala.Unit = js.native
        /**
          * Calls CreateSnapshot.
          * @param request CreateSnapshotRequest message or plain object
          * @returns Promise
          */
        def createSnapshot(request: ICreateSnapshotRequest): js.Promise[Snapshot] = js.native
        /**
          * Calls CreateSnapshot.
          * @param request CreateSnapshotRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Snapshot
          */
        def createSnapshot(
          request: ICreateSnapshotRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.CreateSnapshotCallback
        ): scala.Unit = js.native
        /**
          * Calls CreateSubscription.
          * @param request Subscription message or plain object
          * @returns Promise
          */
        def createSubscription(request: ISubscription): js.Promise[Subscription] = js.native
        /**
          * Calls CreateSubscription.
          * @param request Subscription message or plain object
          * @param callback Node-style callback called with the error, if any, and Subscription
          */
        def createSubscription(
          request: ISubscription,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.CreateSubscriptionCallback
        ): scala.Unit = js.native
        /**
          * Calls DeleteSnapshot.
          * @param request DeleteSnapshotRequest message or plain object
          * @returns Promise
          */
        def deleteSnapshot(request: IDeleteSnapshotRequest): js.Promise[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty] = js.native
        /**
          * Calls DeleteSnapshot.
          * @param request DeleteSnapshotRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Empty
          */
        def deleteSnapshot(
          request: IDeleteSnapshotRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.DeleteSnapshotCallback
        ): scala.Unit = js.native
        /**
          * Calls DeleteSubscription.
          * @param request DeleteSubscriptionRequest message or plain object
          * @returns Promise
          */
        def deleteSubscription(request: IDeleteSubscriptionRequest): js.Promise[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty] = js.native
        /**
          * Calls DeleteSubscription.
          * @param request DeleteSubscriptionRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Empty
          */
        def deleteSubscription(
          request: IDeleteSubscriptionRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.DeleteSubscriptionCallback
        ): scala.Unit = js.native
        /**
          * Calls GetSnapshot.
          * @param request GetSnapshotRequest message or plain object
          * @returns Promise
          */
        def getSnapshot(request: IGetSnapshotRequest): js.Promise[Snapshot] = js.native
        /**
          * Calls GetSnapshot.
          * @param request GetSnapshotRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Snapshot
          */
        def getSnapshot(
          request: IGetSnapshotRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.GetSnapshotCallback
        ): scala.Unit = js.native
        /**
          * Calls GetSubscription.
          * @param request GetSubscriptionRequest message or plain object
          * @returns Promise
          */
        def getSubscription(request: IGetSubscriptionRequest): js.Promise[Subscription] = js.native
        /**
          * Calls GetSubscription.
          * @param request GetSubscriptionRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Subscription
          */
        def getSubscription(
          request: IGetSubscriptionRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.GetSubscriptionCallback
        ): scala.Unit = js.native
        /**
          * Calls ListSnapshots.
          * @param request ListSnapshotsRequest message or plain object
          * @returns Promise
          */
        def listSnapshots(request: IListSnapshotsRequest): js.Promise[ListSnapshotsResponse] = js.native
        /**
          * Calls ListSnapshots.
          * @param request ListSnapshotsRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and ListSnapshotsResponse
          */
        def listSnapshots(
          request: IListSnapshotsRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.ListSnapshotsCallback
        ): scala.Unit = js.native
        /**
          * Calls ListSubscriptions.
          * @param request ListSubscriptionsRequest message or plain object
          * @returns Promise
          */
        def listSubscriptions(request: IListSubscriptionsRequest): js.Promise[ListSubscriptionsResponse] = js.native
        /**
          * Calls ListSubscriptions.
          * @param request ListSubscriptionsRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and ListSubscriptionsResponse
          */
        def listSubscriptions(
          request: IListSubscriptionsRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.ListSubscriptionsCallback
        ): scala.Unit = js.native
        /**
          * Calls ModifyAckDeadline.
          * @param request ModifyAckDeadlineRequest message or plain object
          * @returns Promise
          */
        def modifyAckDeadline(request: IModifyAckDeadlineRequest): js.Promise[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty] = js.native
        /**
          * Calls ModifyAckDeadline.
          * @param request ModifyAckDeadlineRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Empty
          */
        def modifyAckDeadline(
          request: IModifyAckDeadlineRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.ModifyAckDeadlineCallback
        ): scala.Unit = js.native
        /**
          * Calls ModifyPushConfig.
          * @param request ModifyPushConfigRequest message or plain object
          * @returns Promise
          */
        def modifyPushConfig(request: IModifyPushConfigRequest): js.Promise[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty] = js.native
        /**
          * Calls ModifyPushConfig.
          * @param request ModifyPushConfigRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Empty
          */
        def modifyPushConfig(
          request: IModifyPushConfigRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.ModifyPushConfigCallback
        ): scala.Unit = js.native
        /**
          * Calls Pull.
          * @param request PullRequest message or plain object
          * @returns Promise
          */
        def pull(request: IPullRequest): js.Promise[PullResponse] = js.native
        /**
          * Calls Pull.
          * @param request PullRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and PullResponse
          */
        def pull(
          request: IPullRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.PullCallback
        ): scala.Unit = js.native
        /**
          * Calls Seek.
          * @param request SeekRequest message or plain object
          * @returns Promise
          */
        def seek(request: ISeekRequest): js.Promise[SeekResponse] = js.native
        /**
          * Calls Seek.
          * @param request SeekRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and SeekResponse
          */
        def seek(
          request: ISeekRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.SeekCallback
        ): scala.Unit = js.native
        /**
          * Calls StreamingPull.
          * @param request StreamingPullRequest message or plain object
          * @returns Promise
          */
        def streamingPull(request: IStreamingPullRequest): js.Promise[StreamingPullResponse] = js.native
        /**
          * Calls StreamingPull.
          * @param request StreamingPullRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and StreamingPullResponse
          */
        def streamingPull(
          request: IStreamingPullRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.StreamingPullCallback
        ): scala.Unit = js.native
        /**
          * Calls UpdateSnapshot.
          * @param request UpdateSnapshotRequest message or plain object
          * @returns Promise
          */
        def updateSnapshot(request: IUpdateSnapshotRequest): js.Promise[Snapshot] = js.native
        /**
          * Calls UpdateSnapshot.
          * @param request UpdateSnapshotRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Snapshot
          */
        def updateSnapshot(
          request: IUpdateSnapshotRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.UpdateSnapshotCallback
        ): scala.Unit = js.native
        /**
          * Calls UpdateSubscription.
          * @param request UpdateSubscriptionRequest message or plain object
          * @returns Promise
          */
        def updateSubscription(request: IUpdateSubscriptionRequest): js.Promise[Subscription] = js.native
        /**
          * Calls UpdateSubscription.
          * @param request UpdateSubscriptionRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Subscription
          */
        def updateSubscription(
          request: IUpdateSubscriptionRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SubscriberNs.UpdateSubscriptionCallback
        ): scala.Unit = js.native
      }
      
      /** Represents a Subscription. */
      @js.native
      /**
        * Constructs a new Subscription.
        * @param [properties] Properties to set
        */
      class Subscription () extends ISubscription {
        def this(properties: ISubscription) = this()
        /** Subscription ackDeadlineSeconds. */
        @JSName("ackDeadlineSeconds")
        var ackDeadlineSeconds_Subscription: scala.Double = js.native
        /** Subscription labels. */
        @JSName("labels")
        var labels_Subscription: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
        /** Subscription name. */
        @JSName("name")
        var name_Subscription: java.lang.String = js.native
        /** Subscription retainAckedMessages. */
        @JSName("retainAckedMessages")
        var retainAckedMessages_Subscription: scala.Boolean = js.native
        /** Subscription topic. */
        @JSName("topic")
        var topic_Subscription: java.lang.String = js.native
        /**
          * Converts this Subscription to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a Topic. */
      @js.native
      /**
        * Constructs a new Topic.
        * @param [properties] Properties to set
        */
      class Topic () extends ITopic {
        def this(properties: ITopic) = this()
        /** Topic labels. */
        @JSName("labels")
        var labels_Topic: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
        /** Topic name. */
        @JSName("name")
        var name_Topic: java.lang.String = js.native
        /**
          * Converts this Topic to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents an UpdateSnapshotRequest. */
      @js.native
      /**
        * Constructs a new UpdateSnapshotRequest.
        * @param [properties] Properties to set
        */
      class UpdateSnapshotRequest () extends IUpdateSnapshotRequest {
        def this(properties: IUpdateSnapshotRequest) = this()
        /**
          * Converts this UpdateSnapshotRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents an UpdateSubscriptionRequest. */
      @js.native
      /**
        * Constructs a new UpdateSubscriptionRequest.
        * @param [properties] Properties to set
        */
      class UpdateSubscriptionRequest () extends IUpdateSubscriptionRequest {
        def this(properties: IUpdateSubscriptionRequest) = this()
        /**
          * Converts this UpdateSubscriptionRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents an UpdateTopicRequest. */
      @js.native
      /**
        * Constructs a new UpdateTopicRequest.
        * @param [properties] Properties to set
        */
      class UpdateTopicRequest () extends IUpdateTopicRequest {
        def this(properties: IUpdateTopicRequest) = this()
        /**
          * Converts this UpdateTopicRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /* static members */
      @js.native
      object AcknowledgeRequest extends js.Object {
        /**
          * Creates a new AcknowledgeRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns AcknowledgeRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IAcknowledgeRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest = js.native
        /**
          * Decodes an AcknowledgeRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns AcknowledgeRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest = js.native
        /**
          * Decodes an AcknowledgeRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns AcknowledgeRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest = js.native
        /**
          * Encodes the specified AcknowledgeRequest message. Does not implicitly {@link google.pubsub.v1.AcknowledgeRequest.verify|verify} messages.
          * @param message AcknowledgeRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IAcknowledgeRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IAcknowledgeRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified AcknowledgeRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.AcknowledgeRequest.verify|verify} messages.
          * @param message AcknowledgeRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IAcknowledgeRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IAcknowledgeRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates an AcknowledgeRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns AcknowledgeRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest = js.native
        /**
          * Creates a plain object from an AcknowledgeRequest message. Also converts values to other types if specified.
          * @param message AcknowledgeRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.AcknowledgeRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies an AcknowledgeRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object CreateSnapshotRequest extends js.Object {
        /**
          * Creates a new CreateSnapshotRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns CreateSnapshotRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ICreateSnapshotRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest = js.native
        /**
          * Decodes a CreateSnapshotRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns CreateSnapshotRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest = js.native
        /**
          * Decodes a CreateSnapshotRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns CreateSnapshotRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest = js.native
        /**
          * Encodes the specified CreateSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.CreateSnapshotRequest.verify|verify} messages.
          * @param message CreateSnapshotRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ICreateSnapshotRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ICreateSnapshotRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified CreateSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.CreateSnapshotRequest.verify|verify} messages.
          * @param message CreateSnapshotRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ICreateSnapshotRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ICreateSnapshotRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a CreateSnapshotRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns CreateSnapshotRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest = js.native
        /**
          * Creates a plain object from a CreateSnapshotRequest message. Also converts values to other types if specified.
          * @param message CreateSnapshotRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.CreateSnapshotRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a CreateSnapshotRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object DeleteSnapshotRequest extends js.Object {
        /**
          * Creates a new DeleteSnapshotRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DeleteSnapshotRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSnapshotRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest = js.native
        /**
          * Decodes a DeleteSnapshotRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DeleteSnapshotRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest = js.native
        /**
          * Decodes a DeleteSnapshotRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DeleteSnapshotRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest = js.native
        /**
          * Encodes the specified DeleteSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.DeleteSnapshotRequest.verify|verify} messages.
          * @param message DeleteSnapshotRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSnapshotRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSnapshotRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified DeleteSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteSnapshotRequest.verify|verify} messages.
          * @param message DeleteSnapshotRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSnapshotRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSnapshotRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a DeleteSnapshotRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns DeleteSnapshotRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest = js.native
        /**
          * Creates a plain object from a DeleteSnapshotRequest message. Also converts values to other types if specified.
          * @param message DeleteSnapshotRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSnapshotRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a DeleteSnapshotRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object DeleteSubscriptionRequest extends js.Object {
        /**
          * Creates a new DeleteSubscriptionRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DeleteSubscriptionRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSubscriptionRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest = js.native
        /**
          * Decodes a DeleteSubscriptionRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DeleteSubscriptionRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest = js.native
        /**
          * Decodes a DeleteSubscriptionRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DeleteSubscriptionRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest = js.native
        /**
          * Encodes the specified DeleteSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.DeleteSubscriptionRequest.verify|verify} messages.
          * @param message DeleteSubscriptionRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSubscriptionRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSubscriptionRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified DeleteSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteSubscriptionRequest.verify|verify} messages.
          * @param message DeleteSubscriptionRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSubscriptionRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteSubscriptionRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a DeleteSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns DeleteSubscriptionRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest = js.native
        /**
          * Creates a plain object from a DeleteSubscriptionRequest message. Also converts values to other types if specified.
          * @param message DeleteSubscriptionRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteSubscriptionRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a DeleteSubscriptionRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object DeleteTopicRequest extends js.Object {
        /**
          * Creates a new DeleteTopicRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns DeleteTopicRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteTopicRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest = js.native
        /**
          * Decodes a DeleteTopicRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns DeleteTopicRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest = js.native
        /**
          * Decodes a DeleteTopicRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns DeleteTopicRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest = js.native
        /**
          * Encodes the specified DeleteTopicRequest message. Does not implicitly {@link google.pubsub.v1.DeleteTopicRequest.verify|verify} messages.
          * @param message DeleteTopicRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteTopicRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteTopicRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified DeleteTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.DeleteTopicRequest.verify|verify} messages.
          * @param message DeleteTopicRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteTopicRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IDeleteTopicRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a DeleteTopicRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns DeleteTopicRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest = js.native
        /**
          * Creates a plain object from a DeleteTopicRequest message. Also converts values to other types if specified.
          * @param message DeleteTopicRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.DeleteTopicRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a DeleteTopicRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ExpirationPolicy extends js.Object {
        /**
          * Creates a new ExpirationPolicy instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ExpirationPolicy instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IExpirationPolicy
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy = js.native
        /**
          * Decodes an ExpirationPolicy message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ExpirationPolicy
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy = js.native
        /**
          * Decodes an ExpirationPolicy message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ExpirationPolicy
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy = js.native
        /**
          * Encodes the specified ExpirationPolicy message. Does not implicitly {@link google.pubsub.v1.ExpirationPolicy.verify|verify} messages.
          * @param message ExpirationPolicy message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IExpirationPolicy): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IExpirationPolicy,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ExpirationPolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.ExpirationPolicy.verify|verify} messages.
          * @param message ExpirationPolicy message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IExpirationPolicy): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IExpirationPolicy,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates an ExpirationPolicy message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ExpirationPolicy
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy = js.native
        /**
          * Creates a plain object from an ExpirationPolicy message. Also converts values to other types if specified.
          * @param message ExpirationPolicy
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ExpirationPolicy,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies an ExpirationPolicy message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object GetSnapshotRequest extends js.Object {
        /**
          * Creates a new GetSnapshotRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns GetSnapshotRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSnapshotRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest = js.native
        /**
          * Decodes a GetSnapshotRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns GetSnapshotRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest = js.native
        /**
          * Decodes a GetSnapshotRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns GetSnapshotRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest = js.native
        /**
          * Encodes the specified GetSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.GetSnapshotRequest.verify|verify} messages.
          * @param message GetSnapshotRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSnapshotRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSnapshotRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified GetSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetSnapshotRequest.verify|verify} messages.
          * @param message GetSnapshotRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSnapshotRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSnapshotRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a GetSnapshotRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns GetSnapshotRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest = js.native
        /**
          * Creates a plain object from a GetSnapshotRequest message. Also converts values to other types if specified.
          * @param message GetSnapshotRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSnapshotRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a GetSnapshotRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object GetSubscriptionRequest extends js.Object {
        /**
          * Creates a new GetSubscriptionRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns GetSubscriptionRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSubscriptionRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest = js.native
        /**
          * Decodes a GetSubscriptionRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns GetSubscriptionRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest = js.native
        /**
          * Decodes a GetSubscriptionRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns GetSubscriptionRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest = js.native
        /**
          * Encodes the specified GetSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.GetSubscriptionRequest.verify|verify} messages.
          * @param message GetSubscriptionRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSubscriptionRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSubscriptionRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified GetSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetSubscriptionRequest.verify|verify} messages.
          * @param message GetSubscriptionRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSubscriptionRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetSubscriptionRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a GetSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns GetSubscriptionRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest = js.native
        /**
          * Creates a plain object from a GetSubscriptionRequest message. Also converts values to other types if specified.
          * @param message GetSubscriptionRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetSubscriptionRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a GetSubscriptionRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object GetTopicRequest extends js.Object {
        /**
          * Creates a new GetTopicRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns GetTopicRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetTopicRequest): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest = js.native
        /**
          * Decodes a GetTopicRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns GetTopicRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest = js.native
        /**
          * Decodes a GetTopicRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns GetTopicRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest = js.native
        /**
          * Encodes the specified GetTopicRequest message. Does not implicitly {@link google.pubsub.v1.GetTopicRequest.verify|verify} messages.
          * @param message GetTopicRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetTopicRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetTopicRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified GetTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.GetTopicRequest.verify|verify} messages.
          * @param message GetTopicRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetTopicRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IGetTopicRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a GetTopicRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns GetTopicRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest = js.native
        /**
          * Creates a plain object from a GetTopicRequest message. Also converts values to other types if specified.
          * @param message GetTopicRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.GetTopicRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a GetTopicRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListSnapshotsRequest extends js.Object {
        /**
          * Creates a new ListSnapshotsRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListSnapshotsRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest = js.native
        /**
          * Decodes a ListSnapshotsRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListSnapshotsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest = js.native
        /**
          * Decodes a ListSnapshotsRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListSnapshotsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest = js.native
        /**
          * Encodes the specified ListSnapshotsRequest message. Does not implicitly {@link google.pubsub.v1.ListSnapshotsRequest.verify|verify} messages.
          * @param message ListSnapshotsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListSnapshotsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSnapshotsRequest.verify|verify} messages.
          * @param message ListSnapshotsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListSnapshotsRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListSnapshotsRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest = js.native
        /**
          * Creates a plain object from a ListSnapshotsRequest message. Also converts values to other types if specified.
          * @param message ListSnapshotsRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListSnapshotsRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListSnapshotsResponse extends js.Object {
        /**
          * Creates a new ListSnapshotsResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListSnapshotsResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsResponse
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse = js.native
        /**
          * Decodes a ListSnapshotsResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListSnapshotsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse = js.native
        /**
          * Decodes a ListSnapshotsResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListSnapshotsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse = js.native
        /**
          * Encodes the specified ListSnapshotsResponse message. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
          * @param message ListSnapshotsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListSnapshotsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSnapshotsResponse.verify|verify} messages.
          * @param message ListSnapshotsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSnapshotsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListSnapshotsResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListSnapshotsResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse = js.native
        /**
          * Creates a plain object from a ListSnapshotsResponse message. Also converts values to other types if specified.
          * @param message ListSnapshotsResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListSnapshotsResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListSubscriptionsRequest extends js.Object {
        /**
          * Creates a new ListSubscriptionsRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListSubscriptionsRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest = js.native
        /**
          * Decodes a ListSubscriptionsRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListSubscriptionsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest = js.native
        /**
          * Decodes a ListSubscriptionsRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListSubscriptionsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest = js.native
        /**
          * Encodes the specified ListSubscriptionsRequest message. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsRequest.verify|verify} messages.
          * @param message ListSubscriptionsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListSubscriptionsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsRequest.verify|verify} messages.
          * @param message ListSubscriptionsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListSubscriptionsRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListSubscriptionsRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest = js.native
        /**
          * Creates a plain object from a ListSubscriptionsRequest message. Also converts values to other types if specified.
          * @param message ListSubscriptionsRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListSubscriptionsRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListSubscriptionsResponse extends js.Object {
        /**
          * Creates a new ListSubscriptionsResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListSubscriptionsResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsResponse
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse = js.native
        /**
          * Decodes a ListSubscriptionsResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListSubscriptionsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse = js.native
        /**
          * Decodes a ListSubscriptionsResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListSubscriptionsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse = js.native
        /**
          * Encodes the specified ListSubscriptionsResponse message. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsResponse.verify|verify} messages.
          * @param message ListSubscriptionsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListSubscriptionsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListSubscriptionsResponse.verify|verify} messages.
          * @param message ListSubscriptionsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListSubscriptionsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListSubscriptionsResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListSubscriptionsResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse = js.native
        /**
          * Creates a plain object from a ListSubscriptionsResponse message. Also converts values to other types if specified.
          * @param message ListSubscriptionsResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListSubscriptionsResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListTopicSnapshotsRequest extends js.Object {
        /**
          * Creates a new ListTopicSnapshotsRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListTopicSnapshotsRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest = js.native
        /**
          * Decodes a ListTopicSnapshotsRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListTopicSnapshotsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest = js.native
        /**
          * Decodes a ListTopicSnapshotsRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListTopicSnapshotsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest = js.native
        /**
          * Encodes the specified ListTopicSnapshotsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsRequest.verify|verify} messages.
          * @param message ListTopicSnapshotsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListTopicSnapshotsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsRequest.verify|verify} messages.
          * @param message ListTopicSnapshotsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListTopicSnapshotsRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListTopicSnapshotsRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest = js.native
        /**
          * Creates a plain object from a ListTopicSnapshotsRequest message. Also converts values to other types if specified.
          * @param message ListTopicSnapshotsRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListTopicSnapshotsRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListTopicSnapshotsResponse extends js.Object {
        /**
          * Creates a new ListTopicSnapshotsResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListTopicSnapshotsResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsResponse
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse = js.native
        /**
          * Decodes a ListTopicSnapshotsResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListTopicSnapshotsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse = js.native
        /**
          * Decodes a ListTopicSnapshotsResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListTopicSnapshotsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse = js.native
        /**
          * Encodes the specified ListTopicSnapshotsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsResponse.verify|verify} messages.
          * @param message ListTopicSnapshotsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListTopicSnapshotsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSnapshotsResponse.verify|verify} messages.
          * @param message ListTopicSnapshotsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSnapshotsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListTopicSnapshotsResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListTopicSnapshotsResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse = js.native
        /**
          * Creates a plain object from a ListTopicSnapshotsResponse message. Also converts values to other types if specified.
          * @param message ListTopicSnapshotsResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListTopicSnapshotsResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListTopicSubscriptionsRequest extends js.Object {
        /**
          * Creates a new ListTopicSubscriptionsRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListTopicSubscriptionsRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest = js.native
        /**
          * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListTopicSubscriptionsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest = js.native
        /**
          * Decodes a ListTopicSubscriptionsRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListTopicSubscriptionsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest = js.native
        /**
          * Encodes the specified ListTopicSubscriptionsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
          * @param message ListTopicSubscriptionsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListTopicSubscriptionsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsRequest.verify|verify} messages.
          * @param message ListTopicSubscriptionsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListTopicSubscriptionsRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListTopicSubscriptionsRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest = js.native
        /**
          * Creates a plain object from a ListTopicSubscriptionsRequest message. Also converts values to other types if specified.
          * @param message ListTopicSubscriptionsRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListTopicSubscriptionsRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListTopicSubscriptionsResponse extends js.Object {
        /**
          * Creates a new ListTopicSubscriptionsResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListTopicSubscriptionsResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsResponse
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse = js.native
        /**
          * Decodes a ListTopicSubscriptionsResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListTopicSubscriptionsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse = js.native
        /**
          * Decodes a ListTopicSubscriptionsResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListTopicSubscriptionsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse = js.native
        /**
          * Encodes the specified ListTopicSubscriptionsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsResponse.verify|verify} messages.
          * @param message ListTopicSubscriptionsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListTopicSubscriptionsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicSubscriptionsResponse.verify|verify} messages.
          * @param message ListTopicSubscriptionsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicSubscriptionsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListTopicSubscriptionsResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListTopicSubscriptionsResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse = js.native
        /**
          * Creates a plain object from a ListTopicSubscriptionsResponse message. Also converts values to other types if specified.
          * @param message ListTopicSubscriptionsResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListTopicSubscriptionsResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListTopicsRequest extends js.Object {
        /**
          * Creates a new ListTopicsRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListTopicsRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest = js.native
        /**
          * Decodes a ListTopicsRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListTopicsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest = js.native
        /**
          * Decodes a ListTopicsRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListTopicsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest = js.native
        /**
          * Encodes the specified ListTopicsRequest message. Does not implicitly {@link google.pubsub.v1.ListTopicsRequest.verify|verify} messages.
          * @param message ListTopicsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListTopicsRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicsRequest.verify|verify} messages.
          * @param message ListTopicsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListTopicsRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListTopicsRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest = js.native
        /**
          * Creates a plain object from a ListTopicsRequest message. Also converts values to other types if specified.
          * @param message ListTopicsRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListTopicsRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ListTopicsResponse extends js.Object {
        /**
          * Creates a new ListTopicsResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ListTopicsResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsResponse
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse = js.native
        /**
          * Decodes a ListTopicsResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ListTopicsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse = js.native
        /**
          * Decodes a ListTopicsResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ListTopicsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse = js.native
        /**
          * Encodes the specified ListTopicsResponse message. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
          * @param message ListTopicsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsResponse): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ListTopicsResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.ListTopicsResponse.verify|verify} messages.
          * @param message ListTopicsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsResponse): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IListTopicsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ListTopicsResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ListTopicsResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse = js.native
        /**
          * Creates a plain object from a ListTopicsResponse message. Also converts values to other types if specified.
          * @param message ListTopicsResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ListTopicsResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object MessageStoragePolicy extends js.Object {
        /**
          * Creates a new MessageStoragePolicy instance using the specified properties.
          * @param [properties] Properties to set
          * @returns MessageStoragePolicy instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IMessageStoragePolicy
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy = js.native
        /**
          * Decodes a MessageStoragePolicy message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns MessageStoragePolicy
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy = js.native
        /**
          * Decodes a MessageStoragePolicy message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns MessageStoragePolicy
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy = js.native
        /**
          * Encodes the specified MessageStoragePolicy message. Does not implicitly {@link google.pubsub.v1.MessageStoragePolicy.verify|verify} messages.
          * @param message MessageStoragePolicy message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IMessageStoragePolicy
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IMessageStoragePolicy,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified MessageStoragePolicy message, length delimited. Does not implicitly {@link google.pubsub.v1.MessageStoragePolicy.verify|verify} messages.
          * @param message MessageStoragePolicy message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IMessageStoragePolicy
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IMessageStoragePolicy,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a MessageStoragePolicy message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns MessageStoragePolicy
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy = js.native
        /**
          * Creates a plain object from a MessageStoragePolicy message. Also converts values to other types if specified.
          * @param message MessageStoragePolicy
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.MessageStoragePolicy,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a MessageStoragePolicy message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ModifyAckDeadlineRequest extends js.Object {
        /**
          * Creates a new ModifyAckDeadlineRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ModifyAckDeadlineRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyAckDeadlineRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest = js.native
        /**
          * Decodes a ModifyAckDeadlineRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ModifyAckDeadlineRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest = js.native
        /**
          * Decodes a ModifyAckDeadlineRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ModifyAckDeadlineRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest = js.native
        /**
          * Encodes the specified ModifyAckDeadlineRequest message. Does not implicitly {@link google.pubsub.v1.ModifyAckDeadlineRequest.verify|verify} messages.
          * @param message ModifyAckDeadlineRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyAckDeadlineRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyAckDeadlineRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ModifyAckDeadlineRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ModifyAckDeadlineRequest.verify|verify} messages.
          * @param message ModifyAckDeadlineRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyAckDeadlineRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyAckDeadlineRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ModifyAckDeadlineRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ModifyAckDeadlineRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest = js.native
        /**
          * Creates a plain object from a ModifyAckDeadlineRequest message. Also converts values to other types if specified.
          * @param message ModifyAckDeadlineRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyAckDeadlineRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ModifyAckDeadlineRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object ModifyPushConfigRequest extends js.Object {
        /**
          * Creates a new ModifyPushConfigRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ModifyPushConfigRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyPushConfigRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest = js.native
        /**
          * Decodes a ModifyPushConfigRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ModifyPushConfigRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest = js.native
        /**
          * Decodes a ModifyPushConfigRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ModifyPushConfigRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest = js.native
        /**
          * Encodes the specified ModifyPushConfigRequest message. Does not implicitly {@link google.pubsub.v1.ModifyPushConfigRequest.verify|verify} messages.
          * @param message ModifyPushConfigRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyPushConfigRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyPushConfigRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ModifyPushConfigRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.ModifyPushConfigRequest.verify|verify} messages.
          * @param message ModifyPushConfigRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyPushConfigRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IModifyPushConfigRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ModifyPushConfigRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ModifyPushConfigRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest = js.native
        /**
          * Creates a plain object from a ModifyPushConfigRequest message. Also converts values to other types if specified.
          * @param message ModifyPushConfigRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ModifyPushConfigRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ModifyPushConfigRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object PublishRequest extends js.Object {
        /**
          * Creates a new PublishRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PublishRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishRequest): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest = js.native
        /**
          * Decodes a PublishRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PublishRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest = js.native
        /**
          * Decodes a PublishRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PublishRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest = js.native
        /**
          * Encodes the specified PublishRequest message. Does not implicitly {@link google.pubsub.v1.PublishRequest.verify|verify} messages.
          * @param message PublishRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified PublishRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.PublishRequest.verify|verify} messages.
          * @param message PublishRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a PublishRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PublishRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest = js.native
        /**
          * Creates a plain object from a PublishRequest message. Also converts values to other types if specified.
          * @param message PublishRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a PublishRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object PublishResponse extends js.Object {
        /**
          * Creates a new PublishResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PublishResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishResponse): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse = js.native
        /**
          * Decodes a PublishResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PublishResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse = js.native
        /**
          * Decodes a PublishResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PublishResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse = js.native
        /**
          * Encodes the specified PublishResponse message. Does not implicitly {@link google.pubsub.v1.PublishResponse.verify|verify} messages.
          * @param message PublishResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishResponse): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified PublishResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.PublishResponse.verify|verify} messages.
          * @param message PublishResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishResponse): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPublishResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a PublishResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PublishResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse = js.native
        /**
          * Creates a plain object from a PublishResponse message. Also converts values to other types if specified.
          * @param message PublishResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a PublishResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object Publisher extends js.Object {
        /**
          * Creates new Publisher service using the specified rpc implementation.
          * @param rpcImpl RPC implementation
          * @param [requestDelimited=false] Whether requests are length-delimited
          * @param [responseDelimited=false] Whether responses are length-delimited
          * @returns RPC service. Useful where requests and/or responses are streamed.
          */
        def create(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Publisher = js.native
        def create(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Publisher = js.native
        def create(
          rpcImpl: protobufjsLib.protobufjsMod.RPCImpl,
          requestDelimited: scala.Boolean,
          responseDelimited: scala.Boolean
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Publisher = js.native
      }
      
      @JSName("Publisher")
      @js.native
      object PublisherNs extends js.Object {
        /**
          * Callback as used by {@link google.pubsub.v1.Publisher#createTopic}.
          * @param error Error, if any
          * @param [response] Topic
          */
        type CreateTopicCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Publisher#deleteTopic}.
          * @param error Error, if any
          * @param [response] Empty
          */
        type DeleteTopicCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Publisher#getTopic}.
          * @param error Error, if any
          * @param [response] Topic
          */
        type GetTopicCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Publisher#listTopicSnapshots}.
          * @param error Error, if any
          * @param [response] ListTopicSnapshotsResponse
          */
        type ListTopicSnapshotsCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSnapshotsResponse
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Publisher#listTopicSubscriptions}.
          * @param error Error, if any
          * @param [response] ListTopicSubscriptionsResponse
          */
        type ListTopicSubscriptionsCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicSubscriptionsResponse
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Publisher#listTopics}.
          * @param error Error, if any
          * @param [response] ListTopicsResponse
          */
        type ListTopicsCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListTopicsResponse
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Publisher#publish}.
          * @param error Error, if any
          * @param [response] PublishResponse
          */
        type PublishCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PublishResponse
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Publisher#updateTopic}.
          * @param error Error, if any
          * @param [response] Topic
          */
        type UpdateTopicCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic], 
                scala.Unit
              ]
      }
      
      /* static members */
      @js.native
      object PubsubMessage extends js.Object {
        /**
          * Creates a new PubsubMessage instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PubsubMessage instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPubsubMessage): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage = js.native
        /**
          * Decodes a PubsubMessage message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PubsubMessage
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage = js.native
        /**
          * Decodes a PubsubMessage message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PubsubMessage
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage = js.native
        /**
          * Encodes the specified PubsubMessage message. Does not implicitly {@link google.pubsub.v1.PubsubMessage.verify|verify} messages.
          * @param message PubsubMessage message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPubsubMessage): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPubsubMessage,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified PubsubMessage message, length delimited. Does not implicitly {@link google.pubsub.v1.PubsubMessage.verify|verify} messages.
          * @param message PubsubMessage message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPubsubMessage): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPubsubMessage,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a PubsubMessage message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PubsubMessage
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage = js.native
        /**
          * Creates a plain object from a PubsubMessage message. Also converts values to other types if specified.
          * @param message PubsubMessage
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PubsubMessage,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a PubsubMessage message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object PullRequest extends js.Object {
        /**
          * Creates a new PullRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PullRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullRequest): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest = js.native
        /**
          * Decodes a PullRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PullRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest = js.native
        /**
          * Decodes a PullRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PullRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest = js.native
        /**
          * Encodes the specified PullRequest message. Does not implicitly {@link google.pubsub.v1.PullRequest.verify|verify} messages.
          * @param message PullRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified PullRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.PullRequest.verify|verify} messages.
          * @param message PullRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a PullRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PullRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest = js.native
        /**
          * Creates a plain object from a PullRequest message. Also converts values to other types if specified.
          * @param message PullRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a PullRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object PullResponse extends js.Object {
        /**
          * Creates a new PullResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PullResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullResponse): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse = js.native
        /**
          * Decodes a PullResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PullResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse = js.native
        /**
          * Decodes a PullResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PullResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse = js.native
        /**
          * Encodes the specified PullResponse message. Does not implicitly {@link google.pubsub.v1.PullResponse.verify|verify} messages.
          * @param message PullResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullResponse): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified PullResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.PullResponse.verify|verify} messages.
          * @param message PullResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullResponse): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPullResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a PullResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PullResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse = js.native
        /**
          * Creates a plain object from a PullResponse message. Also converts values to other types if specified.
          * @param message PullResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a PullResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object PushConfig extends js.Object {
        /**
          * Creates a new PushConfig instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PushConfig instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPushConfig): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig = js.native
        /**
          * Decodes a PushConfig message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PushConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig = js.native
        /**
          * Decodes a PushConfig message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PushConfig
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig = js.native
        /**
          * Encodes the specified PushConfig message. Does not implicitly {@link google.pubsub.v1.PushConfig.verify|verify} messages.
          * @param message PushConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPushConfig): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPushConfig,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified PushConfig message, length delimited. Does not implicitly {@link google.pubsub.v1.PushConfig.verify|verify} messages.
          * @param message PushConfig message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPushConfig): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IPushConfig,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a PushConfig message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PushConfig
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig = js.native
        /**
          * Creates a plain object from a PushConfig message. Also converts values to other types if specified.
          * @param message PushConfig
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfig,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a PushConfig message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      @JSName("PushConfig")
      @js.native
      object PushConfigNs extends js.Object {
        /** Properties of an OidcToken. */
        trait IOidcToken extends js.Object {
          /** OidcToken audience */
          var audience: js.UndefOr[java.lang.String | scala.Null] = js.undefined
          /** OidcToken serviceAccountEmail */
          var serviceAccountEmail: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        }
        
        /** Represents an OidcToken. */
        @js.native
        /**
          * Constructs a new OidcToken.
          * @param [properties] Properties to set
          */
        class OidcToken () extends IOidcToken {
          def this(properties: IOidcToken) = this()
          /** OidcToken audience. */
          @JSName("audience")
          var audience_OidcToken: java.lang.String = js.native
          /** OidcToken serviceAccountEmail. */
          @JSName("serviceAccountEmail")
          var serviceAccountEmail_OidcToken: java.lang.String = js.native
          /**
            * Converts this OidcToken to JSON.
            * @returns JSON object
            */
          def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        }
        
        /* static members */
        @js.native
        object OidcToken extends js.Object {
          /**
            * Creates a new OidcToken instance using the specified properties.
            * @param [properties] Properties to set
            * @returns OidcToken instance
            */
          def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken = js.native
          def create(
            properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.IOidcToken
          ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken = js.native
          /**
            * Decodes an OidcToken message from the specified reader or buffer.
            * @param reader Reader or buffer to decode from
            * @param [length] Message length if known beforehand
            * @returns OidcToken
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken = js.native
          def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken = js.native
          def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken = js.native
          def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken = js.native
          /**
            * Decodes an OidcToken message from the specified reader or buffer, length delimited.
            * @param reader Reader or buffer to decode from
            * @returns OidcToken
            * @throws {Error} If the payload is not a reader or valid buffer
            * @throws {$protobuf.util.ProtocolError} If required fields are missing
            */
          def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken = js.native
          def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken = js.native
          /**
            * Encodes the specified OidcToken message. Does not implicitly {@link google.pubsub.v1.PushConfig.OidcToken.verify|verify} messages.
            * @param message OidcToken message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          def encode(
            message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.IOidcToken
          ): protobufjsLib.protobufjsMod.Writer = js.native
          def encode(
            message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.IOidcToken,
            writer: protobufjsLib.protobufjsMod.Writer
          ): protobufjsLib.protobufjsMod.Writer = js.native
          /**
            * Encodes the specified OidcToken message, length delimited. Does not implicitly {@link google.pubsub.v1.PushConfig.OidcToken.verify|verify} messages.
            * @param message OidcToken message or plain object to encode
            * @param [writer] Writer to encode to
            * @returns Writer
            */
          def encodeDelimited(
            message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.IOidcToken
          ): protobufjsLib.protobufjsMod.Writer = js.native
          def encodeDelimited(
            message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.IOidcToken,
            writer: protobufjsLib.protobufjsMod.Writer
          ): protobufjsLib.protobufjsMod.Writer = js.native
          /**
            * Creates an OidcToken message from a plain object. Also converts values to their respective internal types.
            * @param object Plain object
            * @returns OidcToken
            */
          def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken = js.native
          /**
            * Creates a plain object from an OidcToken message. Also converts values to other types if specified.
            * @param message OidcToken
            * @param [options] Conversion options
            * @returns Plain object
            */
          def toObject(
            message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken
          ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
          def toObject(
            message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PushConfigNs.OidcToken,
            options: protobufjsLib.protobufjsMod.IConversionOptions
          ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
          /**
            * Verifies an OidcToken message.
            * @param message Plain object to verify
            * @returns `null` if valid, otherwise the reason why it is not
            */
          def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
        }
        
      }
      
      /* static members */
      @js.native
      object ReceivedMessage extends js.Object {
        /**
          * Creates a new ReceivedMessage instance using the specified properties.
          * @param [properties] Properties to set
          * @returns ReceivedMessage instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IReceivedMessage): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage = js.native
        /**
          * Decodes a ReceivedMessage message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ReceivedMessage
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage = js.native
        /**
          * Decodes a ReceivedMessage message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ReceivedMessage
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage = js.native
        /**
          * Encodes the specified ReceivedMessage message. Does not implicitly {@link google.pubsub.v1.ReceivedMessage.verify|verify} messages.
          * @param message ReceivedMessage message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IReceivedMessage): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IReceivedMessage,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ReceivedMessage message, length delimited. Does not implicitly {@link google.pubsub.v1.ReceivedMessage.verify|verify} messages.
          * @param message ReceivedMessage message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IReceivedMessage): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IReceivedMessage,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ReceivedMessage message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ReceivedMessage
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage = js.native
        /**
          * Creates a plain object from a ReceivedMessage message. Also converts values to other types if specified.
          * @param message ReceivedMessage
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ReceivedMessage,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a ReceivedMessage message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object SeekRequest extends js.Object {
        /**
          * Creates a new SeekRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns SeekRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekRequest): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest = js.native
        /**
          * Decodes a SeekRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns SeekRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest = js.native
        /**
          * Decodes a SeekRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns SeekRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest = js.native
        /**
          * Encodes the specified SeekRequest message. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
          * @param message SeekRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified SeekRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.SeekRequest.verify|verify} messages.
          * @param message SeekRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a SeekRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns SeekRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest = js.native
        /**
          * Creates a plain object from a SeekRequest message. Also converts values to other types if specified.
          * @param message SeekRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a SeekRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object SeekResponse extends js.Object {
        /**
          * Creates a new SeekResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns SeekResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekResponse): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse = js.native
        /**
          * Decodes a SeekResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns SeekResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse = js.native
        /**
          * Decodes a SeekResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns SeekResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse = js.native
        /**
          * Encodes the specified SeekResponse message. Does not implicitly {@link google.pubsub.v1.SeekResponse.verify|verify} messages.
          * @param message SeekResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekResponse): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified SeekResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.SeekResponse.verify|verify} messages.
          * @param message SeekResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekResponse): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a SeekResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns SeekResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse = js.native
        /**
          * Creates a plain object from a SeekResponse message. Also converts values to other types if specified.
          * @param message SeekResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a SeekResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object Snapshot extends js.Object {
        /**
          * Creates a new Snapshot instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Snapshot instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISnapshot): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot = js.native
        /**
          * Decodes a Snapshot message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Snapshot
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot = js.native
        /**
          * Decodes a Snapshot message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Snapshot
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot = js.native
        /**
          * Encodes the specified Snapshot message. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
          * @param message Snapshot message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISnapshot): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISnapshot,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified Snapshot message, length delimited. Does not implicitly {@link google.pubsub.v1.Snapshot.verify|verify} messages.
          * @param message Snapshot message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISnapshot): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISnapshot,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a Snapshot message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Snapshot
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot = js.native
        /**
          * Creates a plain object from a Snapshot message. Also converts values to other types if specified.
          * @param message Snapshot
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a Snapshot message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object StreamingPullRequest extends js.Object {
        /**
          * Creates a new StreamingPullRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns StreamingPullRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest = js.native
        /**
          * Decodes a StreamingPullRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns StreamingPullRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest = js.native
        /**
          * Decodes a StreamingPullRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns StreamingPullRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest = js.native
        /**
          * Encodes the specified StreamingPullRequest message. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
          * @param message StreamingPullRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified StreamingPullRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullRequest.verify|verify} messages.
          * @param message StreamingPullRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a StreamingPullRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns StreamingPullRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest = js.native
        /**
          * Creates a plain object from a StreamingPullRequest message. Also converts values to other types if specified.
          * @param message StreamingPullRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a StreamingPullRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object StreamingPullResponse extends js.Object {
        /**
          * Creates a new StreamingPullResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns StreamingPullResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullResponse
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse = js.native
        /**
          * Decodes a StreamingPullResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns StreamingPullResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse = js.native
        /**
          * Decodes a StreamingPullResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns StreamingPullResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse = js.native
        /**
          * Encodes the specified StreamingPullResponse message. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.verify|verify} messages.
          * @param message StreamingPullResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified StreamingPullResponse message, length delimited. Does not implicitly {@link google.pubsub.v1.StreamingPullResponse.verify|verify} messages.
          * @param message StreamingPullResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IStreamingPullResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a StreamingPullResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns StreamingPullResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse = js.native
        /**
          * Creates a plain object from a StreamingPullResponse message. Also converts values to other types if specified.
          * @param message StreamingPullResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a StreamingPullResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object Subscriber extends js.Object {
        /**
          * Creates new Subscriber service using the specified rpc implementation.
          * @param rpcImpl RPC implementation
          * @param [requestDelimited=false] Whether requests are length-delimited
          * @param [responseDelimited=false] Whether responses are length-delimited
          * @returns RPC service. Useful where requests and/or responses are streamed.
          */
        def create(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscriber = js.native
        def create(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscriber = js.native
        def create(
          rpcImpl: protobufjsLib.protobufjsMod.RPCImpl,
          requestDelimited: scala.Boolean,
          responseDelimited: scala.Boolean
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscriber = js.native
      }
      
      @JSName("Subscriber")
      @js.native
      object SubscriberNs extends js.Object {
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#acknowledge}.
          * @param error Error, if any
          * @param [response] Empty
          */
        type AcknowledgeCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#createSnapshot}.
          * @param error Error, if any
          * @param [response] Snapshot
          */
        type CreateSnapshotCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#createSubscription}.
          * @param error Error, if any
          * @param [response] Subscription
          */
        type CreateSubscriptionCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#deleteSnapshot}.
          * @param error Error, if any
          * @param [response] Empty
          */
        type DeleteSnapshotCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#deleteSubscription}.
          * @param error Error, if any
          * @param [response] Empty
          */
        type DeleteSubscriptionCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#getSnapshot}.
          * @param error Error, if any
          * @param [response] Snapshot
          */
        type GetSnapshotCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#getSubscription}.
          * @param error Error, if any
          * @param [response] Subscription
          */
        type GetSubscriptionCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#listSnapshots}.
          * @param error Error, if any
          * @param [response] ListSnapshotsResponse
          */
        type ListSnapshotsCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSnapshotsResponse
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#listSubscriptions}.
          * @param error Error, if any
          * @param [response] ListSubscriptionsResponse
          */
        type ListSubscriptionsCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ListSubscriptionsResponse
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#modifyAckDeadline}.
          * @param error Error, if any
          * @param [response] Empty
          */
        type ModifyAckDeadlineCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#modifyPushConfig}.
          * @param error Error, if any
          * @param [response] Empty
          */
        type ModifyPushConfigCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.protobufNs.Empty], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#pull}.
          * @param error Error, if any
          * @param [response] PullResponse
          */
        type PullCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.PullResponse
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#seek}.
          * @param error Error, if any
          * @param [response] SeekResponse
          */
        type SeekCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.SeekResponse
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#streamingPull}.
          * @param error Error, if any
          * @param [response] StreamingPullResponse
          */
        type StreamingPullCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.StreamingPullResponse
                ], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#updateSnapshot}.
          * @param error Error, if any
          * @param [response] Snapshot
          */
        type UpdateSnapshotCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Snapshot], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.pubsub.v1.Subscriber#updateSubscription}.
          * @param error Error, if any
          * @param [response] Subscription
          */
        type UpdateSubscriptionCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription
                ], 
                scala.Unit
              ]
      }
      
      /* static members */
      @js.native
      object Subscription extends js.Object {
        /**
          * Creates a new Subscription instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Subscription instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription = js.native
        /**
          * Decodes a Subscription message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Subscription
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription = js.native
        /**
          * Decodes a Subscription message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Subscription
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription = js.native
        /**
          * Encodes the specified Subscription message. Does not implicitly {@link google.pubsub.v1.Subscription.verify|verify} messages.
          * @param message Subscription message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified Subscription message, length delimited. Does not implicitly {@link google.pubsub.v1.Subscription.verify|verify} messages.
          * @param message Subscription message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISubscription,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a Subscription message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Subscription
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription = js.native
        /**
          * Creates a plain object from a Subscription message. Also converts values to other types if specified.
          * @param message Subscription
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Subscription,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a Subscription message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object Topic extends js.Object {
        /**
          * Creates a new Topic instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Topic instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ITopic): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic = js.native
        /**
          * Decodes a Topic message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Topic
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic = js.native
        /**
          * Decodes a Topic message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Topic
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic = js.native
        /**
          * Encodes the specified Topic message. Does not implicitly {@link google.pubsub.v1.Topic.verify|verify} messages.
          * @param message Topic message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ITopic): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ITopic,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified Topic message, length delimited. Does not implicitly {@link google.pubsub.v1.Topic.verify|verify} messages.
          * @param message Topic message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ITopic): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ITopic,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a Topic message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Topic
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic = js.native
        /**
          * Creates a plain object from a Topic message. Also converts values to other types if specified.
          * @param message Topic
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.Topic,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a Topic message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object UpdateSnapshotRequest extends js.Object {
        /**
          * Creates a new UpdateSnapshotRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns UpdateSnapshotRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSnapshotRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest = js.native
        /**
          * Decodes an UpdateSnapshotRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns UpdateSnapshotRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest = js.native
        /**
          * Decodes an UpdateSnapshotRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns UpdateSnapshotRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest = js.native
        /**
          * Encodes the specified UpdateSnapshotRequest message. Does not implicitly {@link google.pubsub.v1.UpdateSnapshotRequest.verify|verify} messages.
          * @param message UpdateSnapshotRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSnapshotRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSnapshotRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified UpdateSnapshotRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateSnapshotRequest.verify|verify} messages.
          * @param message UpdateSnapshotRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSnapshotRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSnapshotRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates an UpdateSnapshotRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns UpdateSnapshotRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest = js.native
        /**
          * Creates a plain object from an UpdateSnapshotRequest message. Also converts values to other types if specified.
          * @param message UpdateSnapshotRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSnapshotRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies an UpdateSnapshotRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object UpdateSubscriptionRequest extends js.Object {
        /**
          * Creates a new UpdateSubscriptionRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns UpdateSubscriptionRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSubscriptionRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest = js.native
        /**
          * Decodes an UpdateSubscriptionRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns UpdateSubscriptionRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest = js.native
        /**
          * Decodes an UpdateSubscriptionRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns UpdateSubscriptionRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest = js.native
        /**
          * Encodes the specified UpdateSubscriptionRequest message. Does not implicitly {@link google.pubsub.v1.UpdateSubscriptionRequest.verify|verify} messages.
          * @param message UpdateSubscriptionRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSubscriptionRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSubscriptionRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified UpdateSubscriptionRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateSubscriptionRequest.verify|verify} messages.
          * @param message UpdateSubscriptionRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSubscriptionRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateSubscriptionRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates an UpdateSubscriptionRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns UpdateSubscriptionRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest = js.native
        /**
          * Creates a plain object from an UpdateSubscriptionRequest message. Also converts values to other types if specified.
          * @param message UpdateSubscriptionRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateSubscriptionRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies an UpdateSubscriptionRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object UpdateTopicRequest extends js.Object {
        /**
          * Creates a new UpdateTopicRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns UpdateTopicRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateTopicRequest
        ): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest = js.native
        /**
          * Decodes an UpdateTopicRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns UpdateTopicRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest = js.native
        /**
          * Decodes an UpdateTopicRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns UpdateTopicRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest = js.native
        /**
          * Encodes the specified UpdateTopicRequest message. Does not implicitly {@link google.pubsub.v1.UpdateTopicRequest.verify|verify} messages.
          * @param message UpdateTopicRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateTopicRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateTopicRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified UpdateTopicRequest message, length delimited. Does not implicitly {@link google.pubsub.v1.UpdateTopicRequest.verify|verify} messages.
          * @param message UpdateTopicRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateTopicRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.IUpdateTopicRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates an UpdateTopicRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns UpdateTopicRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest = js.native
        /**
          * Creates a plain object from an UpdateTopicRequest message. Also converts values to other types if specified.
          * @param message UpdateTopicRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.UpdateTopicRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies an UpdateTopicRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
    }
    
  }
  
}

