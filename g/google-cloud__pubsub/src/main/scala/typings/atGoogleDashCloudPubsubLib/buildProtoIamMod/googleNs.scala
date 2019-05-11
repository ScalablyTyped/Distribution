package typings
package atGoogleDashCloudPubsubLib.buildProtoIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/proto/iam", "google")
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.ICustomHttpPattern): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern = js.native
      /**
        * Decodes a CustomHttpPattern message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns CustomHttpPattern
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern = js.native
      /**
        * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns CustomHttpPattern
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern = js.native
      /**
        * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
        * @param message CustomHttpPattern message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.ICustomHttpPattern): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.ICustomHttpPattern,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
        * @param message CustomHttpPattern message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.ICustomHttpPattern): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.ICustomHttpPattern,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns CustomHttpPattern
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern = js.native
      /**
        * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
        * @param message CustomHttpPattern
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.CustomHttpPattern,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttp): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http = js.native
      /**
        * Decodes a Http message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Http
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http = js.native
      /**
        * Decodes a Http message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Http
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http = js.native
      /**
        * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
        * @param message Http message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttp): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttp,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
        * @param message Http message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttp): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttp,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a Http message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Http
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http = js.native
      /**
        * Creates a plain object from a Http message. Also converts values to other types if specified.
        * @param message Http
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.Http,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttpRule): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule = js.native
      /**
        * Decodes a HttpRule message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns HttpRule
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule = js.native
      /**
        * Decodes a HttpRule message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns HttpRule
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule = js.native
      /**
        * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
        * @param message HttpRule message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttpRule): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttpRule,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
        * @param message HttpRule message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttpRule): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttpRule,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns HttpRule
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule = js.native
      /**
        * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
        * @param message HttpRule
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.HttpRule,
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
  
  /** Namespace iam. */
  @JSName("iam")
  @js.native
  object iamNs extends js.Object {
    /** Namespace v1. */
    @JSName("v1")
    @js.native
    object v1Ns extends js.Object {
      /** Represents a Binding. */
      @js.native
      /**
        * Constructs a new Binding.
        * @param [properties] Properties to set
        */
      class Binding () extends IBinding {
        def this(properties: IBinding) = this()
        /** Binding members. */
        @JSName("members")
        var members_Binding: js.Array[java.lang.String] = js.native
        /** Binding role. */
        @JSName("role")
        var role_Binding: java.lang.String = js.native
        /**
          * Converts this Binding to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a BindingDelta. */
      @js.native
      /**
        * Constructs a new BindingDelta.
        * @param [properties] Properties to set
        */
      class BindingDelta () extends IBindingDelta {
        def this(properties: IBindingDelta) = this()
        /** BindingDelta action. */
        @JSName("action")
        var action_BindingDelta: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDeltaNs.Action = js.native
        /** BindingDelta member. */
        @JSName("member")
        var member_BindingDelta: java.lang.String = js.native
        /** BindingDelta role. */
        @JSName("role")
        var role_BindingDelta: java.lang.String = js.native
        /**
          * Converts this BindingDelta to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a GetIamPolicyRequest. */
      @js.native
      /**
        * Constructs a new GetIamPolicyRequest.
        * @param [properties] Properties to set
        */
      class GetIamPolicyRequest () extends IGetIamPolicyRequest {
        def this(properties: IGetIamPolicyRequest) = this()
        /** GetIamPolicyRequest resource. */
        @JSName("resource")
        var resource_GetIamPolicyRequest: java.lang.String = js.native
        /**
          * Converts this GetIamPolicyRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a IAMPolicy */
      @js.native
      class IAMPolicy protected ()
        extends protobufjsLib.protobufjsMod.rpcNs.Service {
        /**
          * Constructs a new IAMPolicy service.
          * @param rpcImpl RPC implementation
          * @param [requestDelimited=false] Whether requests are length-delimited
          * @param [responseDelimited=false] Whether responses are length-delimited
          */
        def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl) = this()
        def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean) = this()
        def this(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean, responseDelimited: scala.Boolean) = this()
        /**
          * Calls GetIamPolicy.
          * @param request GetIamPolicyRequest message or plain object
          * @returns Promise
          */
        def getIamPolicy(request: IGetIamPolicyRequest): js.Promise[Policy] = js.native
        /**
          * Calls GetIamPolicy.
          * @param request GetIamPolicyRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Policy
          */
        def getIamPolicy(
          request: IGetIamPolicyRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IAMPolicyNs.GetIamPolicyCallback
        ): scala.Unit = js.native
        /**
          * Calls SetIamPolicy.
          * @param request SetIamPolicyRequest message or plain object
          * @returns Promise
          */
        def setIamPolicy(request: ISetIamPolicyRequest): js.Promise[Policy] = js.native
        /**
          * Calls SetIamPolicy.
          * @param request SetIamPolicyRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and Policy
          */
        def setIamPolicy(
          request: ISetIamPolicyRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IAMPolicyNs.SetIamPolicyCallback
        ): scala.Unit = js.native
        /**
          * Calls TestIamPermissions.
          * @param request TestIamPermissionsRequest message or plain object
          * @returns Promise
          */
        def testIamPermissions(request: ITestIamPermissionsRequest): js.Promise[TestIamPermissionsResponse] = js.native
        /**
          * Calls TestIamPermissions.
          * @param request TestIamPermissionsRequest message or plain object
          * @param callback Node-style callback called with the error, if any, and TestIamPermissionsResponse
          */
        def testIamPermissions(
          request: ITestIamPermissionsRequest,
          callback: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IAMPolicyNs.TestIamPermissionsCallback
        ): scala.Unit = js.native
      }
      
      /** Properties of a Binding. */
      trait IBinding extends js.Object {
        /** Binding members */
        var members: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
        /** Binding role */
        var role: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a BindingDelta. */
      trait IBindingDelta extends js.Object {
        /** BindingDelta action */
        var action: js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDeltaNs.Action | scala.Null
              ] = js.undefined
        /** BindingDelta member */
        var member: js.UndefOr[java.lang.String | scala.Null] = js.undefined
        /** BindingDelta role */
        var role: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a GetIamPolicyRequest. */
      trait IGetIamPolicyRequest extends js.Object {
        /** GetIamPolicyRequest resource */
        var resource: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a Policy. */
      trait IPolicy extends js.Object {
        /** Policy bindings */
        var bindings: js.UndefOr[js.Array[IBinding] | scala.Null] = js.undefined
        /** Policy etag */
        var etag: js.UndefOr[stdLib.Uint8Array | scala.Null] = js.undefined
        /** Policy version */
        var version: js.UndefOr[scala.Double | scala.Null] = js.undefined
      }
      
      /** Properties of a PolicyDelta. */
      trait IPolicyDelta extends js.Object {
        /** PolicyDelta bindingDeltas */
        var bindingDeltas: js.UndefOr[js.Array[IBindingDelta] | scala.Null] = js.undefined
      }
      
      /** Properties of a SetIamPolicyRequest. */
      trait ISetIamPolicyRequest extends js.Object {
        /** SetIamPolicyRequest policy */
        var policy: js.UndefOr[IPolicy | scala.Null] = js.undefined
        /** SetIamPolicyRequest resource */
        var resource: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a TestIamPermissionsRequest. */
      trait ITestIamPermissionsRequest extends js.Object {
        /** TestIamPermissionsRequest permissions */
        var permissions: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
        /** TestIamPermissionsRequest resource */
        var resource: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      }
      
      /** Properties of a TestIamPermissionsResponse. */
      trait ITestIamPermissionsResponse extends js.Object {
        /** TestIamPermissionsResponse permissions */
        var permissions: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
      }
      
      /** Represents a Policy. */
      @js.native
      /**
        * Constructs a new Policy.
        * @param [properties] Properties to set
        */
      class Policy () extends IPolicy {
        def this(properties: IPolicy) = this()
        /** Policy bindings. */
        @JSName("bindings")
        var bindings_Policy: js.Array[IBinding] = js.native
        /** Policy etag. */
        @JSName("etag")
        var etag_Policy: stdLib.Uint8Array = js.native
        /** Policy version. */
        @JSName("version")
        var version_Policy: scala.Double = js.native
        /**
          * Converts this Policy to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a PolicyDelta. */
      @js.native
      /**
        * Constructs a new PolicyDelta.
        * @param [properties] Properties to set
        */
      class PolicyDelta () extends IPolicyDelta {
        def this(properties: IPolicyDelta) = this()
        /** PolicyDelta bindingDeltas. */
        @JSName("bindingDeltas")
        var bindingDeltas_PolicyDelta: js.Array[IBindingDelta] = js.native
        /**
          * Converts this PolicyDelta to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a SetIamPolicyRequest. */
      @js.native
      /**
        * Constructs a new SetIamPolicyRequest.
        * @param [properties] Properties to set
        */
      class SetIamPolicyRequest () extends ISetIamPolicyRequest {
        def this(properties: ISetIamPolicyRequest) = this()
        /** SetIamPolicyRequest resource. */
        @JSName("resource")
        var resource_SetIamPolicyRequest: java.lang.String = js.native
        /**
          * Converts this SetIamPolicyRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a TestIamPermissionsRequest. */
      @js.native
      /**
        * Constructs a new TestIamPermissionsRequest.
        * @param [properties] Properties to set
        */
      class TestIamPermissionsRequest () extends ITestIamPermissionsRequest {
        def this(properties: ITestIamPermissionsRequest) = this()
        /** TestIamPermissionsRequest permissions. */
        @JSName("permissions")
        var permissions_TestIamPermissionsRequest: js.Array[java.lang.String] = js.native
        /** TestIamPermissionsRequest resource. */
        @JSName("resource")
        var resource_TestIamPermissionsRequest: java.lang.String = js.native
        /**
          * Converts this TestIamPermissionsRequest to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /** Represents a TestIamPermissionsResponse. */
      @js.native
      /**
        * Constructs a new TestIamPermissionsResponse.
        * @param [properties] Properties to set
        */
      class TestIamPermissionsResponse () extends ITestIamPermissionsResponse {
        def this(properties: ITestIamPermissionsResponse) = this()
        /** TestIamPermissionsResponse permissions. */
        @JSName("permissions")
        var permissions_TestIamPermissionsResponse: js.Array[java.lang.String] = js.native
        /**
          * Converts this TestIamPermissionsResponse to JSON.
          * @returns JSON object
          */
        def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      }
      
      /* static members */
      @js.native
      object Binding extends js.Object {
        /**
          * Creates a new Binding instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Binding instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBinding): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding = js.native
        /**
          * Decodes a Binding message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Binding
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding = js.native
        /**
          * Decodes a Binding message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Binding
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding = js.native
        /**
          * Encodes the specified Binding message. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
          * @param message Binding message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBinding): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBinding,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified Binding message, length delimited. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
          * @param message Binding message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBinding): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBinding,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a Binding message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Binding
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding = js.native
        /**
          * Creates a plain object from a Binding message. Also converts values to other types if specified.
          * @param message Binding
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Binding,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a Binding message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object BindingDelta extends js.Object {
        /**
          * Creates a new BindingDelta instance using the specified properties.
          * @param [properties] Properties to set
          * @returns BindingDelta instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBindingDelta): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta = js.native
        /**
          * Decodes a BindingDelta message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns BindingDelta
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta = js.native
        /**
          * Decodes a BindingDelta message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns BindingDelta
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta = js.native
        /**
          * Encodes the specified BindingDelta message. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
          * @param message BindingDelta message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBindingDelta): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBindingDelta,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified BindingDelta message, length delimited. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
          * @param message BindingDelta message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBindingDelta): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IBindingDelta,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a BindingDelta message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns BindingDelta
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta = js.native
        /**
          * Creates a plain object from a BindingDelta message. Also converts values to other types if specified.
          * @param message BindingDelta
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDelta,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a BindingDelta message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      @JSName("BindingDelta")
      @js.native
      object BindingDeltaNs extends js.Object {
        @js.native
        sealed trait Action extends js.Object
        
        /** Action enum. */
        @js.native
        object Action extends js.Object {
          @js.native
          sealed trait ACTION_UNSPECIFIED
            extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDeltaNs.Action
          
          @js.native
          sealed trait ADD
            extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDeltaNs.Action
          
          @js.native
          sealed trait REMOVE
            extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDeltaNs.Action
          
          /* 0 */ val ACTION_UNSPECIFIED: ACTION_UNSPECIFIED with scala.Double = js.native
          /* 1 */ val ADD: ADD with scala.Double = js.native
          /* 2 */ val REMOVE: REMOVE with scala.Double = js.native
          @JSBracketAccess
          def apply(value: scala.Double): js.UndefOr[
                    atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.BindingDeltaNs.Action with scala.Double
                  ] = js.native
        }
        
      }
      
      /* static members */
      @js.native
      object GetIamPolicyRequest extends js.Object {
        /**
          * Creates a new GetIamPolicyRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns GetIamPolicyRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IGetIamPolicyRequest): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest = js.native
        /**
          * Decodes a GetIamPolicyRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns GetIamPolicyRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest = js.native
        /**
          * Decodes a GetIamPolicyRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns GetIamPolicyRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest = js.native
        /**
          * Encodes the specified GetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
          * @param message GetIamPolicyRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IGetIamPolicyRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IGetIamPolicyRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified GetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
          * @param message GetIamPolicyRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IGetIamPolicyRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IGetIamPolicyRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a GetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns GetIamPolicyRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest = js.native
        /**
          * Creates a plain object from a GetIamPolicyRequest message. Also converts values to other types if specified.
          * @param message GetIamPolicyRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.GetIamPolicyRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a GetIamPolicyRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object IAMPolicy extends js.Object {
        /**
          * Creates new IAMPolicy service using the specified rpc implementation.
          * @param rpcImpl RPC implementation
          * @param [requestDelimited=false] Whether requests are length-delimited
          * @param [responseDelimited=false] Whether responses are length-delimited
          * @returns RPC service. Useful where requests and/or responses are streamed.
          */
        def create(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IAMPolicy = js.native
        def create(rpcImpl: protobufjsLib.protobufjsMod.RPCImpl, requestDelimited: scala.Boolean): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IAMPolicy = js.native
        def create(
          rpcImpl: protobufjsLib.protobufjsMod.RPCImpl,
          requestDelimited: scala.Boolean,
          responseDelimited: scala.Boolean
        ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IAMPolicy = js.native
      }
      
      @JSName("IAMPolicy")
      @js.native
      object IAMPolicyNs extends js.Object {
        /**
          * Callback as used by {@link google.iam.v1.IAMPolicy#getIamPolicy}.
          * @param error Error, if any
          * @param [response] Policy
          */
        type GetIamPolicyCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.iam.v1.IAMPolicy#setIamPolicy}.
          * @param error Error, if any
          * @param [response] Policy
          */
        type SetIamPolicyCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy], 
                scala.Unit
              ]
        /**
          * Callback as used by {@link google.iam.v1.IAMPolicy#testIamPermissions}.
          * @param error Error, if any
          * @param [response] TestIamPermissionsResponse
          */
        type TestIamPermissionsCallback = js.Function2[
                /* error */ stdLib.Error | scala.Null, 
                /* response */ js.UndefOr[
                  atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse
                ], 
                scala.Unit
              ]
      }
      
      /* static members */
      @js.native
      object Policy extends js.Object {
        /**
          * Creates a new Policy instance using the specified properties.
          * @param [properties] Properties to set
          * @returns Policy instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicy): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy = js.native
        /**
          * Decodes a Policy message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Policy
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy = js.native
        /**
          * Decodes a Policy message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Policy
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy = js.native
        /**
          * Encodes the specified Policy message. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
          * @param message Policy message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicy): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicy,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified Policy message, length delimited. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
          * @param message Policy message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicy): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicy,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a Policy message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Policy
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy = js.native
        /**
          * Creates a plain object from a Policy message. Also converts values to other types if specified.
          * @param message Policy
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.Policy,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a Policy message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object PolicyDelta extends js.Object {
        /**
          * Creates a new PolicyDelta instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PolicyDelta instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicyDelta): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta = js.native
        /**
          * Decodes a PolicyDelta message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PolicyDelta
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta = js.native
        /**
          * Decodes a PolicyDelta message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PolicyDelta
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta = js.native
        /**
          * Encodes the specified PolicyDelta message. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
          * @param message PolicyDelta message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicyDelta): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicyDelta,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified PolicyDelta message, length delimited. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
          * @param message PolicyDelta message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicyDelta): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicyDelta,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a PolicyDelta message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PolicyDelta
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta = js.native
        /**
          * Creates a plain object from a PolicyDelta message. Also converts values to other types if specified.
          * @param message PolicyDelta
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.PolicyDelta,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a PolicyDelta message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object SetIamPolicyRequest extends js.Object {
        /**
          * Creates a new SetIamPolicyRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns SetIamPolicyRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest = js.native
        def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ISetIamPolicyRequest): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest = js.native
        /**
          * Decodes a SetIamPolicyRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns SetIamPolicyRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest = js.native
        /**
          * Decodes a SetIamPolicyRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns SetIamPolicyRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest = js.native
        /**
          * Encodes the specified SetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
          * @param message SetIamPolicyRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ISetIamPolicyRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ISetIamPolicyRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified SetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
          * @param message SetIamPolicyRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ISetIamPolicyRequest): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ISetIamPolicyRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a SetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns SetIamPolicyRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest = js.native
        /**
          * Creates a plain object from a SetIamPolicyRequest message. Also converts values to other types if specified.
          * @param message SetIamPolicyRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.SetIamPolicyRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a SetIamPolicyRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object TestIamPermissionsRequest extends js.Object {
        /**
          * Creates a new TestIamPermissionsRequest instance using the specified properties.
          * @param [properties] Properties to set
          * @returns TestIamPermissionsRequest instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsRequest
        ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest = js.native
        /**
          * Decodes a TestIamPermissionsRequest message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns TestIamPermissionsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest = js.native
        /**
          * Decodes a TestIamPermissionsRequest message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns TestIamPermissionsRequest
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest = js.native
        /**
          * Encodes the specified TestIamPermissionsRequest message. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
          * @param message TestIamPermissionsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified TestIamPermissionsRequest message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
          * @param message TestIamPermissionsRequest message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsRequest
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsRequest,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a TestIamPermissionsRequest message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns TestIamPermissionsRequest
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest = js.native
        /**
          * Creates a plain object from a TestIamPermissionsRequest message. Also converts values to other types if specified.
          * @param message TestIamPermissionsRequest
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsRequest,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a TestIamPermissionsRequest message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
      /* static members */
      @js.native
      object TestIamPermissionsResponse extends js.Object {
        /**
          * Creates a new TestIamPermissionsResponse instance using the specified properties.
          * @param [properties] Properties to set
          * @returns TestIamPermissionsResponse instance
          */
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsResponse
        ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse = js.native
        /**
          * Decodes a TestIamPermissionsResponse message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns TestIamPermissionsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse = js.native
        /**
          * Decodes a TestIamPermissionsResponse message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns TestIamPermissionsResponse
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse = js.native
        /**
          * Encodes the specified TestIamPermissionsResponse message. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
          * @param message TestIamPermissionsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified TestIamPermissionsResponse message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
          * @param message TestIamPermissionsResponse message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsResponse
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsResponse,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a TestIamPermissionsResponse message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns TestIamPermissionsResponse
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse = js.native
        /**
          * Creates a plain object from a TestIamPermissionsResponse message. Also converts values to other types if specified.
          * @param message TestIamPermissionsResponse
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.TestIamPermissionsResponse,
          options: protobufjsLib.protobufjsMod.IConversionOptions
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        /**
          * Verifies a TestIamPermissionsResponse message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
      }
      
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
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
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
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
          ] = js.native
      /**
        * Converts this DescriptorProto to JSON.
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
      var label_FieldDescriptorProto: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label = js.native
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
      var type_FieldDescriptorProto: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type = js.native
      /**
        * Converts this FieldDescriptorProto to JSON.
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
      var ctype_FieldOptions: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.CType = js.native
      /** FieldOptions deprecated. */
      @JSName("deprecated")
      var deprecated_FieldOptions: scala.Boolean = js.native
      /** FieldOptions jstype. */
      @JSName("jstype")
      var jstype_FieldOptions: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.JSType = js.native
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
      var optimizeFor_FileOptions: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode = js.native
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
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
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
              atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
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
              atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
            ]) | scala.Null
          ] = js.undefined
    }
    
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
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label | scala.Null
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
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type | scala.Null
          ] = js.undefined
      /** FieldDescriptorProto typeName */
      var typeName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    }
    
    /** Properties of a FieldOptions. */
    trait IFieldOptions extends js.Object {
      /** FieldOptions ctype */
      var ctype: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.CType | scala.Null
          ] = js.undefined
      /** FieldOptions deprecated */
      var deprecated: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** FieldOptions jstype */
      var jstype: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.JSType | scala.Null
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
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode | scala.Null
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
              atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
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
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.apiNs.IHttpRule | scala.Null
          ] = js.undefined
      /** MethodOptions deprecated */
      var deprecated: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
      /** MethodOptions idempotencyLevel */
      var idempotencyLevel: js.UndefOr[
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel | scala.Null
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
              atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
            ]) | scala.Null
          ] = js.undefined
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
              atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
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
      var idempotencyLevel_MethodOptions: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel = js.native
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
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
          ] = js.native
      /**
        * Converts this SourceCodeInfo to JSON.
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
            atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IDescriptorProto): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto = js.native
      /**
        * Decodes a DescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns DescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto = js.native
      /**
        * Decodes a DescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns DescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto = js.native
      /**
        * Encodes the specified DescriptorProto message. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
        * @param message DescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified DescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
        * @param message DescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a DescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns DescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto = js.native
      /**
        * Creates a plain object from a DescriptorProto message. Also converts values to other types if specified.
        * @param message DescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProto,
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
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
        ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        /**
          * Decodes an ExtensionRange message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ExtensionRange
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        /**
          * Decodes an ExtensionRange message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ExtensionRange
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        /**
          * Encodes the specified ExtensionRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
          * @param message ExtensionRange message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ExtensionRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
          * @param message ExtensionRange message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IExtensionRange,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates an ExtensionRange message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ExtensionRange
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange = js.native
        /**
          * Creates a plain object from an ExtensionRange message. Also converts values to other types if specified.
          * @param message ExtensionRange
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ExtensionRange,
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
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
        ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        /**
          * Decodes a ReservedRange message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns ReservedRange
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        /**
          * Decodes a ReservedRange message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns ReservedRange
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        /**
          * Encodes the specified ReservedRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
          * @param message ReservedRange message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified ReservedRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
          * @param message ReservedRange message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.IReservedRange,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a ReservedRange message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns ReservedRange
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange = js.native
        /**
          * Creates a plain object from a ReservedRange message. Also converts values to other types if specified.
          * @param message ReservedRange
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.DescriptorProtoNs.ReservedRange,
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
    object EnumDescriptorProto extends js.Object {
      /**
        * Creates a new EnumDescriptorProto instance using the specified properties.
        * @param [properties] Properties to set
        * @returns EnumDescriptorProto instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumDescriptorProto): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      /**
        * Decodes an EnumDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns EnumDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      /**
        * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns EnumDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      /**
        * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
        * @param message EnumDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
        * @param message EnumDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns EnumDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto = js.native
      /**
        * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
        * @param message EnumDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumDescriptorProto,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumOptions): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions = js.native
      /**
        * Decodes an EnumOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns EnumOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions = js.native
      /**
        * Decodes an EnumOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns EnumOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions = js.native
      /**
        * Encodes the specified EnumOptions message. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
        * @param message EnumOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified EnumOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumOptions.verify|verify} messages.
        * @param message EnumOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an EnumOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns EnumOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions = js.native
      /**
        * Creates a plain object from an EnumOptions message. Also converts values to other types if specified.
        * @param message EnumOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumOptions,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueDescriptorProto
      ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      /**
        * Decodes an EnumValueDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns EnumValueDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      /**
        * Decodes an EnumValueDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns EnumValueDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      /**
        * Encodes the specified EnumValueDescriptorProto message. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
        * @param message EnumValueDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified EnumValueDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumValueDescriptorProto.verify|verify} messages.
        * @param message EnumValueDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an EnumValueDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns EnumValueDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto = js.native
      /**
        * Creates a plain object from an EnumValueDescriptorProto message. Also converts values to other types if specified.
        * @param message EnumValueDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueDescriptorProto,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueOptions): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions = js.native
      /**
        * Decodes an EnumValueOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns EnumValueOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions = js.native
      /**
        * Decodes an EnumValueOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns EnumValueOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions = js.native
      /**
        * Encodes the specified EnumValueOptions message. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
        * @param message EnumValueOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified EnumValueOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
        * @param message EnumValueOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IEnumValueOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an EnumValueOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns EnumValueOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions = js.native
      /**
        * Creates a plain object from an EnumValueOptions message. Also converts values to other types if specified.
        * @param message EnumValueOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.EnumValueOptions,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldDescriptorProto): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      /**
        * Decodes a FieldDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FieldDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      /**
        * Decodes a FieldDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FieldDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      /**
        * Encodes the specified FieldDescriptorProto message. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
        * @param message FieldDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FieldDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
        * @param message FieldDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FieldDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto = js.native
      /**
        * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
        * @param message FieldDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProto,
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
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label
        
        @js.native
        sealed trait LABEL_REPEATED
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label
        
        @js.native
        sealed trait LABEL_REQUIRED
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label
        
        /* 1 */ val LABEL_OPTIONAL: LABEL_OPTIONAL with scala.Double = js.native
        /* 3 */ val LABEL_REPEATED: LABEL_REPEATED with scala.Double = js.native
        /* 2 */ val LABEL_REQUIRED: LABEL_REQUIRED with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Label with scala.Double
              ] = js.native
      }
      
      /** Type enum. */
      @js.native
      object Type extends js.Object {
        @js.native
        sealed trait TYPE_BOOL
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_BYTES
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_DOUBLE
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_ENUM
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_FIXED32
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_FIXED64
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_FLOAT
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_GROUP
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_INT32
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_INT64
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_MESSAGE
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_SFIXED32
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_SFIXED64
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_SINT32
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_SINT64
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_STRING
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_UINT32
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
        @js.native
        sealed trait TYPE_UINT64
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type
        
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
                atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldDescriptorProtoNs.Type with scala.Double
              ] = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object FieldOptions extends js.Object {
      /**
        * Creates a new FieldOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FieldOptions instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldOptions): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions = js.native
      /**
        * Decodes a FieldOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FieldOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions = js.native
      /**
        * Decodes a FieldOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FieldOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions = js.native
      /**
        * Encodes the specified FieldOptions message. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
        * @param message FieldOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FieldOptions message, length delimited. Does not implicitly {@link google.protobuf.FieldOptions.verify|verify} messages.
        * @param message FieldOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFieldOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FieldOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FieldOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions = js.native
      /**
        * Creates a plain object from a FieldOptions message. Also converts values to other types if specified.
        * @param message FieldOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptions,
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
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.CType
        
        @js.native
        sealed trait STRING
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.CType
        
        @js.native
        sealed trait STRING_PIECE
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.CType
        
        /* 1 */ val CORD: CORD with scala.Double = js.native
        /* 0 */ val STRING: STRING with scala.Double = js.native
        /* 2 */ val STRING_PIECE: STRING_PIECE with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.CType with scala.Double
              ] = js.native
      }
      
      /** JSType enum. */
      @js.native
      object JSType extends js.Object {
        @js.native
        sealed trait JS_NORMAL
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.JSType
        
        @js.native
        sealed trait JS_NUMBER
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.JSType
        
        @js.native
        sealed trait JS_STRING
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.JSType
        
        /* 0 */ val JS_NORMAL: JS_NORMAL with scala.Double = js.native
        /* 2 */ val JS_NUMBER: JS_NUMBER with scala.Double = js.native
        /* 1 */ val JS_STRING: JS_STRING with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FieldOptionsNs.JSType with scala.Double
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorProto): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto = js.native
      /**
        * Decodes a FileDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FileDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto = js.native
      /**
        * Decodes a FileDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FileDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto = js.native
      /**
        * Encodes the specified FileDescriptorProto message. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
        * @param message FileDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FileDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorProto.verify|verify} messages.
        * @param message FileDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FileDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FileDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto = js.native
      /**
        * Creates a plain object from a FileDescriptorProto message. Also converts values to other types if specified.
        * @param message FileDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorProto,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorSet): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet = js.native
      /**
        * Decodes a FileDescriptorSet message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FileDescriptorSet
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet = js.native
      /**
        * Decodes a FileDescriptorSet message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FileDescriptorSet
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet = js.native
      /**
        * Encodes the specified FileDescriptorSet message. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
        * @param message FileDescriptorSet message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorSet): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorSet,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FileDescriptorSet message, length delimited. Does not implicitly {@link google.protobuf.FileDescriptorSet.verify|verify} messages.
        * @param message FileDescriptorSet message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorSet): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileDescriptorSet,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FileDescriptorSet message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FileDescriptorSet
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet = js.native
      /**
        * Creates a plain object from a FileDescriptorSet message. Also converts values to other types if specified.
        * @param message FileDescriptorSet
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileDescriptorSet,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileOptions): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions = js.native
      /**
        * Decodes a FileOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FileOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions = js.native
      /**
        * Decodes a FileOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FileOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions = js.native
      /**
        * Encodes the specified FileOptions message. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
        * @param message FileOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified FileOptions message, length delimited. Does not implicitly {@link google.protobuf.FileOptions.verify|verify} messages.
        * @param message FileOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IFileOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a FileOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FileOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions = js.native
      /**
        * Creates a plain object from a FileOptions message. Also converts values to other types if specified.
        * @param message FileOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptions,
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
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode
        
        @js.native
        sealed trait LITE_RUNTIME
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode
        
        @js.native
        sealed trait SPEED
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode
        
        /* 2 */ val CODE_SIZE: CODE_SIZE with scala.Double = js.native
        /* 3 */ val LITE_RUNTIME: LITE_RUNTIME with scala.Double = js.native
        /* 1 */ val SPEED: SPEED with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.FileOptionsNs.OptimizeMode with scala.Double
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IGeneratedCodeInfo): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      /**
        * Decodes a GeneratedCodeInfo message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GeneratedCodeInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      /**
        * Decodes a GeneratedCodeInfo message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GeneratedCodeInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      /**
        * Encodes the specified GeneratedCodeInfo message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
        * @param message GeneratedCodeInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IGeneratedCodeInfo): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IGeneratedCodeInfo,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified GeneratedCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.verify|verify} messages.
        * @param message GeneratedCodeInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IGeneratedCodeInfo): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IGeneratedCodeInfo,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a GeneratedCodeInfo message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns GeneratedCodeInfo
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo = js.native
      /**
        * Creates a plain object from a GeneratedCodeInfo message. Also converts values to other types if specified.
        * @param message GeneratedCodeInfo
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfo,
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
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
        ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        /**
          * Decodes an Annotation message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Annotation
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        /**
          * Decodes an Annotation message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Annotation
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        /**
          * Encodes the specified Annotation message. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
          * @param message Annotation message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified Annotation message, length delimited. Does not implicitly {@link google.protobuf.GeneratedCodeInfo.Annotation.verify|verify} messages.
          * @param message Annotation message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.IAnnotation,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates an Annotation message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Annotation
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation = js.native
        /**
          * Creates a plain object from an Annotation message. Also converts values to other types if specified.
          * @param message Annotation
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.GeneratedCodeInfoNs.Annotation,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMessageOptions): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions = js.native
      /**
        * Decodes a MessageOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MessageOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions = js.native
      /**
        * Decodes a MessageOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MessageOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions = js.native
      /**
        * Encodes the specified MessageOptions message. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
        * @param message MessageOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMessageOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMessageOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified MessageOptions message, length delimited. Does not implicitly {@link google.protobuf.MessageOptions.verify|verify} messages.
        * @param message MessageOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMessageOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMessageOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a MessageOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MessageOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions = js.native
      /**
        * Creates a plain object from a MessageOptions message. Also converts values to other types if specified.
        * @param message MessageOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MessageOptions,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodDescriptorProto): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      /**
        * Decodes a MethodDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MethodDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      /**
        * Decodes a MethodDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MethodDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      /**
        * Encodes the specified MethodDescriptorProto message. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
        * @param message MethodDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified MethodDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.MethodDescriptorProto.verify|verify} messages.
        * @param message MethodDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a MethodDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MethodDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto = js.native
      /**
        * Creates a plain object from a MethodDescriptorProto message. Also converts values to other types if specified.
        * @param message MethodDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodDescriptorProto,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodOptions): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions = js.native
      /**
        * Decodes a MethodOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns MethodOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions = js.native
      /**
        * Decodes a MethodOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns MethodOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions = js.native
      /**
        * Encodes the specified MethodOptions message. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
        * @param message MethodOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified MethodOptions message, length delimited. Does not implicitly {@link google.protobuf.MethodOptions.verify|verify} messages.
        * @param message MethodOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IMethodOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a MethodOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns MethodOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions = js.native
      /**
        * Creates a plain object from a MethodOptions message. Also converts values to other types if specified.
        * @param message MethodOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptions,
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
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel
        
        @js.native
        sealed trait IDEMPOTENT
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel
        
        @js.native
        sealed trait NO_SIDE_EFFECTS
          extends atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel
        
        /* 0 */ val IDEMPOTENCY_UNKNOWN: IDEMPOTENCY_UNKNOWN with scala.Double = js.native
        /* 2 */ val IDEMPOTENT: IDEMPOTENT with scala.Double = js.native
        /* 1 */ val NO_SIDE_EFFECTS: NO_SIDE_EFFECTS with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.MethodOptionsNs.IdempotencyLevel with scala.Double
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofDescriptorProto): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      /**
        * Decodes an OneofDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns OneofDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      /**
        * Decodes an OneofDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns OneofDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      /**
        * Encodes the specified OneofDescriptorProto message. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
        * @param message OneofDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified OneofDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.OneofDescriptorProto.verify|verify} messages.
        * @param message OneofDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an OneofDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns OneofDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto = js.native
      /**
        * Creates a plain object from an OneofDescriptorProto message. Also converts values to other types if specified.
        * @param message OneofDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofDescriptorProto,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofOptions): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions = js.native
      /**
        * Decodes an OneofOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns OneofOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions = js.native
      /**
        * Decodes an OneofOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns OneofOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions = js.native
      /**
        * Encodes the specified OneofOptions message. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
        * @param message OneofOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified OneofOptions message, length delimited. Does not implicitly {@link google.protobuf.OneofOptions.verify|verify} messages.
        * @param message OneofOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IOneofOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an OneofOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns OneofOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions = js.native
      /**
        * Creates a plain object from an OneofOptions message. Also converts values to other types if specified.
        * @param message OneofOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.OneofOptions,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def create(
        properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceDescriptorProto
      ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      /**
        * Decodes a ServiceDescriptorProto message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ServiceDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      /**
        * Decodes a ServiceDescriptorProto message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ServiceDescriptorProto
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      /**
        * Encodes the specified ServiceDescriptorProto message. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
        * @param message ServiceDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified ServiceDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.ServiceDescriptorProto.verify|verify} messages.
        * @param message ServiceDescriptorProto message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceDescriptorProto): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceDescriptorProto,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a ServiceDescriptorProto message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ServiceDescriptorProto
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto = js.native
      /**
        * Creates a plain object from a ServiceDescriptorProto message. Also converts values to other types if specified.
        * @param message ServiceDescriptorProto
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceDescriptorProto,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceOptions): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions = js.native
      /**
        * Decodes a ServiceOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ServiceOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions = js.native
      /**
        * Decodes a ServiceOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ServiceOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions = js.native
      /**
        * Encodes the specified ServiceOptions message. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
        * @param message ServiceOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified ServiceOptions message, length delimited. Does not implicitly {@link google.protobuf.ServiceOptions.verify|verify} messages.
        * @param message ServiceOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceOptions): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IServiceOptions,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a ServiceOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ServiceOptions
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions = js.native
      /**
        * Creates a plain object from a ServiceOptions message. Also converts values to other types if specified.
        * @param message ServiceOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ServiceOptions,
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
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ISourceCodeInfo): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo = js.native
      /**
        * Decodes a SourceCodeInfo message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SourceCodeInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo = js.native
      /**
        * Decodes a SourceCodeInfo message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SourceCodeInfo
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo = js.native
      /**
        * Encodes the specified SourceCodeInfo message. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
        * @param message SourceCodeInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ISourceCodeInfo): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ISourceCodeInfo,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified SourceCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
        * @param message SourceCodeInfo message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ISourceCodeInfo): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.ISourceCodeInfo,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SourceCodeInfo
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo = js.native
      /**
        * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
        * @param message SourceCodeInfo
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfo,
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
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
        ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        /**
          * Decodes a Location message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns Location
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        /**
          * Decodes a Location message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns Location
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        /**
          * Encodes the specified Location message. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
          * @param message Location message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified Location message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.Location.verify|verify} messages.
          * @param message Location message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.ILocation,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a Location message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns Location
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location = js.native
        /**
          * Creates a plain object from a Location message. Also converts values to other types if specified.
          * @param message Location
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.SourceCodeInfoNs.Location,
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
    object UninterpretedOption extends js.Object {
      /**
        * Creates a new UninterpretedOption instance using the specified properties.
        * @param [properties] Properties to set
        * @returns UninterpretedOption instance
        */
      def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption = js.native
      def create(properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IUninterpretedOption): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption = js.native
      /**
        * Decodes an UninterpretedOption message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns UninterpretedOption
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption = js.native
      def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption = js.native
      def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption = js.native
      def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption = js.native
      /**
        * Decodes an UninterpretedOption message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns UninterpretedOption
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption = js.native
      def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption = js.native
      /**
        * Encodes the specified UninterpretedOption message. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
        * @param message UninterpretedOption message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IUninterpretedOption): protobufjsLib.protobufjsMod.Writer = js.native
      def encode(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IUninterpretedOption,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Encodes the specified UninterpretedOption message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
        * @param message UninterpretedOption message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IUninterpretedOption): protobufjsLib.protobufjsMod.Writer = js.native
      def encodeDelimited(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.IUninterpretedOption,
        writer: protobufjsLib.protobufjsMod.Writer
      ): protobufjsLib.protobufjsMod.Writer = js.native
      /**
        * Creates an UninterpretedOption message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns UninterpretedOption
        */
      def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption = js.native
      /**
        * Creates a plain object from an UninterpretedOption message. Also converts values to other types if specified.
        * @param message UninterpretedOption
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
      def toObject(
        message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOption,
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
        def create(): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def create(
          properties: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
        ): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        /**
          * Decodes a NamePart message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns NamePart
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decode(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def decode(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def decode(reader: stdLib.Uint8Array, length: scala.Double): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        /**
          * Decodes a NamePart message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns NamePart
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        def decodeDelimited(reader: stdLib.Uint8Array): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        /**
          * Encodes the specified NamePart message. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
          * @param message NamePart message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encode(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Encodes the specified NamePart message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
          * @param message NamePart message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart
        ): protobufjsLib.protobufjsMod.Writer = js.native
        def encodeDelimited(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.INamePart,
          writer: protobufjsLib.protobufjsMod.Writer
        ): protobufjsLib.protobufjsMod.Writer = js.native
        /**
          * Creates a NamePart message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns NamePart
          */
        def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart = js.native
        /**
          * Creates a plain object from a NamePart message. Also converts values to other types if specified.
          * @param message NamePart
          * @param [options] Conversion options
          * @returns Plain object
          */
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart
        ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
        def toObject(
          message: atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.protobufNs.UninterpretedOptionNs.NamePart,
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
  
}

