package typings.googleGax.mod.IamProtos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.iam.v1.IAuditConfigDelta
import typings.googleGax.iamServiceMod.google.iam.v1.IBinding
import typings.googleGax.iamServiceMod.google.iam.v1.IBindingDelta
import typings.googleGax.iamServiceMod.google.iam.v1.IGetIamPolicyRequest
import typings.googleGax.iamServiceMod.google.iam.v1.IGetPolicyOptions
import typings.googleGax.iamServiceMod.google.iam.v1.IPolicy
import typings.googleGax.iamServiceMod.google.iam.v1.IPolicyDelta
import typings.googleGax.iamServiceMod.google.iam.v1.ISetIamPolicyRequest
import typings.googleGax.iamServiceMod.google.iam.v1.ITestIamPermissionsRequest
import typings.googleGax.iamServiceMod.google.iam.v1.ITestIamPermissionsResponse
import typings.googleGax.iamServiceMod.google.iam.v1.logging.IAuditData
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace iam. */
object iam {
  
  /** Namespace v1. */
  object v1 {
    
    /** Represents an AuditConfigDelta. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta")
    @js.native
    /**
      * Constructs a new AuditConfigDelta.
      * @param [properties] Properties to set
      */
    class AuditConfigDelta ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta {
      def this(properties: IAuditConfigDelta) = this()
    }
    object AuditConfigDelta {
      
      /** Action enum. */
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.Action")
      @js.native
      object Action extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action with Double
              ] = js.native
        
        /* 0 */ val ACTION_UNSPECIFIED: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action.ACTION_UNSPECIFIED with Double = js.native
        
        /* 1 */ val ADD: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action.ADD with Double = js.native
        
        /* 2 */ val REMOVE: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta.Action.REMOVE with Double = js.native
      }
      
      /**
        * Creates a new AuditConfigDelta instance using the specified properties.
        * @param [properties] Properties to set
        * @returns AuditConfigDelta instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.create")
      @js.native
      def create(properties: IAuditConfigDelta): typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta = js.native
      
      /**
        * Decodes an AuditConfigDelta message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns AuditConfigDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta = js.native
      
      /**
        * Decodes an AuditConfigDelta message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns AuditConfigDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta = js.native
      
      /**
        * Encodes the specified AuditConfigDelta message. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
        * @param message AuditConfigDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.encode")
      @js.native
      def encode(message: IAuditConfigDelta): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.encode")
      @js.native
      def encode(message: IAuditConfigDelta, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified AuditConfigDelta message, length delimited. Does not implicitly {@link google.iam.v1.AuditConfigDelta.verify|verify} messages.
        * @param message AuditConfigDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.encodeDelimited")
      @js.native
      def encodeDelimited(message: IAuditConfigDelta): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.encodeDelimited")
      @js.native
      def encodeDelimited(message: IAuditConfigDelta, writer: Writer): Writer = js.native
      
      /**
        * Creates an AuditConfigDelta message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns AuditConfigDelta
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta = js.native
      
      /**
        * Creates a plain object from an AuditConfigDelta message. Also converts values to other types if specified.
        * @param message AuditConfigDelta
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.toObject")
      @js.native
      def toObject(
        message: typings.googleGax.iamServiceMod.google.iam.v1.AuditConfigDelta,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies an AuditConfigDelta message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.AuditConfigDelta.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a Binding. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.Binding")
    @js.native
    /**
      * Constructs a new Binding.
      * @param [properties] Properties to set
      */
    class Binding ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.Binding {
      def this(properties: IBinding) = this()
    }
    object Binding {
      
      /**
        * Creates a new Binding instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Binding instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.Binding = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.create")
      @js.native
      def create(properties: IBinding): typings.googleGax.iamServiceMod.google.iam.v1.Binding = js.native
      
      /**
        * Decodes a Binding message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Binding
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.Binding = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.Binding = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.Binding = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.Binding = js.native
      
      /**
        * Decodes a Binding message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Binding
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.Binding = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.Binding = js.native
      
      /**
        * Encodes the specified Binding message. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
        * @param message Binding message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.encode")
      @js.native
      def encode(message: IBinding): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.encode")
      @js.native
      def encode(message: IBinding, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Binding message, length delimited. Does not implicitly {@link google.iam.v1.Binding.verify|verify} messages.
        * @param message Binding message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBinding): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBinding, writer: Writer): Writer = js.native
      
      /**
        * Creates a Binding message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Binding
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.Binding = js.native
      
      /**
        * Creates a plain object from a Binding message. Also converts values to other types if specified.
        * @param message Binding
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.Binding): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.Binding, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Binding message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Binding.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a BindingDelta. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta")
    @js.native
    /**
      * Constructs a new BindingDelta.
      * @param [properties] Properties to set
      */
    class BindingDelta ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta {
      def this(properties: IBindingDelta) = this()
    }
    object BindingDelta {
      
      /** Action enum. */
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.Action")
      @js.native
      object Action extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta.Action with Double] = js.native
        
        /* 0 */ val ACTION_UNSPECIFIED: typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta.Action.ACTION_UNSPECIFIED with Double = js.native
        
        /* 1 */ val ADD: typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta.Action.ADD with Double = js.native
        
        /* 2 */ val REMOVE: typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta.Action.REMOVE with Double = js.native
      }
      
      /**
        * Creates a new BindingDelta instance using the specified properties.
        * @param [properties] Properties to set
        * @returns BindingDelta instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.create")
      @js.native
      def create(properties: IBindingDelta): typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta = js.native
      
      /**
        * Decodes a BindingDelta message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns BindingDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta = js.native
      
      /**
        * Decodes a BindingDelta message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns BindingDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta = js.native
      
      /**
        * Encodes the specified BindingDelta message. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
        * @param message BindingDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.encode")
      @js.native
      def encode(message: IBindingDelta): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.encode")
      @js.native
      def encode(message: IBindingDelta, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified BindingDelta message, length delimited. Does not implicitly {@link google.iam.v1.BindingDelta.verify|verify} messages.
        * @param message BindingDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBindingDelta): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.encodeDelimited")
      @js.native
      def encodeDelimited(message: IBindingDelta, writer: Writer): Writer = js.native
      
      /**
        * Creates a BindingDelta message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns BindingDelta
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta = js.native
      
      /**
        * Creates a plain object from a BindingDelta message. Also converts values to other types if specified.
        * @param message BindingDelta
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.BindingDelta, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a BindingDelta message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.BindingDelta.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a GetIamPolicyRequest. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest")
    @js.native
    /**
      * Constructs a new GetIamPolicyRequest.
      * @param [properties] Properties to set
      */
    class GetIamPolicyRequest ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest {
      def this(properties: IGetIamPolicyRequest) = this()
    }
    object GetIamPolicyRequest {
      
      /**
        * Creates a new GetIamPolicyRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns GetIamPolicyRequest instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.create")
      @js.native
      def create(properties: IGetIamPolicyRequest): typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest = js.native
      
      /**
        * Decodes a GetIamPolicyRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GetIamPolicyRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest = js.native
      
      /**
        * Decodes a GetIamPolicyRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GetIamPolicyRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest = js.native
      
      /**
        * Encodes the specified GetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
        * @param message GetIamPolicyRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.encode")
      @js.native
      def encode(message: IGetIamPolicyRequest): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.encode")
      @js.native
      def encode(message: IGetIamPolicyRequest, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified GetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.GetIamPolicyRequest.verify|verify} messages.
        * @param message GetIamPolicyRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.encodeDelimited")
      @js.native
      def encodeDelimited(message: IGetIamPolicyRequest): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.encodeDelimited")
      @js.native
      def encodeDelimited(message: IGetIamPolicyRequest, writer: Writer): Writer = js.native
      
      /**
        * Creates a GetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns GetIamPolicyRequest
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest = js.native
      
      /**
        * Creates a plain object from a GetIamPolicyRequest message. Also converts values to other types if specified.
        * @param message GetIamPolicyRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.toObject")
      @js.native
      def toObject(
        message: typings.googleGax.iamServiceMod.google.iam.v1.GetIamPolicyRequest,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a GetIamPolicyRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetIamPolicyRequest.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a GetPolicyOptions. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions")
    @js.native
    /**
      * Constructs a new GetPolicyOptions.
      * @param [properties] Properties to set
      */
    class GetPolicyOptions ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions {
      def this(properties: IGetPolicyOptions) = this()
    }
    object GetPolicyOptions {
      
      /**
        * Creates a new GetPolicyOptions instance using the specified properties.
        * @param [properties] Properties to set
        * @returns GetPolicyOptions instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.create")
      @js.native
      def create(properties: IGetPolicyOptions): typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions = js.native
      
      /**
        * Decodes a GetPolicyOptions message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GetPolicyOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions = js.native
      
      /**
        * Decodes a GetPolicyOptions message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GetPolicyOptions
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions = js.native
      
      /**
        * Encodes the specified GetPolicyOptions message. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
        * @param message GetPolicyOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.encode")
      @js.native
      def encode(message: IGetPolicyOptions): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.encode")
      @js.native
      def encode(message: IGetPolicyOptions, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified GetPolicyOptions message, length delimited. Does not implicitly {@link google.iam.v1.GetPolicyOptions.verify|verify} messages.
        * @param message GetPolicyOptions message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.encodeDelimited")
      @js.native
      def encodeDelimited(message: IGetPolicyOptions): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.encodeDelimited")
      @js.native
      def encodeDelimited(message: IGetPolicyOptions, writer: Writer): Writer = js.native
      
      /**
        * Creates a GetPolicyOptions message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns GetPolicyOptions
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions = js.native
      
      /**
        * Creates a plain object from a GetPolicyOptions message. Also converts values to other types if specified.
        * @param message GetPolicyOptions
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.toObject")
      @js.native
      def toObject(
        message: typings.googleGax.iamServiceMod.google.iam.v1.GetPolicyOptions,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a GetPolicyOptions message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.GetPolicyOptions.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a IAMPolicy */
    @JSImport("google-gax", "IamProtos.google.iam.v1.IAMPolicy")
    @js.native
    class IAMPolicy protected ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.IAMPolicy {
      /**
        * Constructs a new IAMPolicy service.
        * @param rpcImpl RPC implementation
        * @param [requestDelimited=false] Whether requests are length-delimited
        * @param [responseDelimited=false] Whether responses are length-delimited
        */
      def this(rpcImpl: RPCImpl) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
    }
    object IAMPolicy {
      
      /**
        * Creates new IAMPolicy service using the specified rpc implementation.
        * @param rpcImpl RPC implementation
        * @param [requestDelimited=false] Whether requests are length-delimited
        * @param [responseDelimited=false] Whether responses are length-delimited
        * @returns RPC service. Useful where requests and/or responses are streamed.
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.IAMPolicy.create")
      @js.native
      def create(rpcImpl: RPCImpl): typings.googleGax.iamServiceMod.google.iam.v1.IAMPolicy = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.IAMPolicy.create")
      @js.native
      def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): typings.googleGax.iamServiceMod.google.iam.v1.IAMPolicy = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.IAMPolicy.create")
      @js.native
      def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleGax.iamServiceMod.google.iam.v1.IAMPolicy = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.IAMPolicy.create")
      @js.native
      def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleGax.iamServiceMod.google.iam.v1.IAMPolicy = js.native
    }
    
    /** Represents a Policy. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.Policy")
    @js.native
    /**
      * Constructs a new Policy.
      * @param [properties] Properties to set
      */
    class Policy ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.Policy {
      def this(properties: IPolicy) = this()
    }
    object Policy {
      
      /**
        * Creates a new Policy instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Policy instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.Policy = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.create")
      @js.native
      def create(properties: IPolicy): typings.googleGax.iamServiceMod.google.iam.v1.Policy = js.native
      
      /**
        * Decodes a Policy message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Policy
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.Policy = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.Policy = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.Policy = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.Policy = js.native
      
      /**
        * Decodes a Policy message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Policy
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.Policy = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.Policy = js.native
      
      /**
        * Encodes the specified Policy message. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
        * @param message Policy message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.encode")
      @js.native
      def encode(message: IPolicy): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.encode")
      @js.native
      def encode(message: IPolicy, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified Policy message, length delimited. Does not implicitly {@link google.iam.v1.Policy.verify|verify} messages.
        * @param message Policy message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPolicy): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPolicy, writer: Writer): Writer = js.native
      
      /**
        * Creates a Policy message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Policy
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.Policy = js.native
      
      /**
        * Creates a plain object from a Policy message. Also converts values to other types if specified.
        * @param message Policy
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.Policy): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.Policy, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a Policy message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.Policy.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a PolicyDelta. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta")
    @js.native
    /**
      * Constructs a new PolicyDelta.
      * @param [properties] Properties to set
      */
    class PolicyDelta ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta {
      def this(properties: IPolicyDelta) = this()
    }
    object PolicyDelta {
      
      /**
        * Creates a new PolicyDelta instance using the specified properties.
        * @param [properties] Properties to set
        * @returns PolicyDelta instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.create")
      @js.native
      def create(properties: IPolicyDelta): typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta = js.native
      
      /**
        * Decodes a PolicyDelta message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns PolicyDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta = js.native
      
      /**
        * Decodes a PolicyDelta message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns PolicyDelta
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta = js.native
      
      /**
        * Encodes the specified PolicyDelta message. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
        * @param message PolicyDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.encode")
      @js.native
      def encode(message: IPolicyDelta): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.encode")
      @js.native
      def encode(message: IPolicyDelta, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified PolicyDelta message, length delimited. Does not implicitly {@link google.iam.v1.PolicyDelta.verify|verify} messages.
        * @param message PolicyDelta message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPolicyDelta): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPolicyDelta, writer: Writer): Writer = js.native
      
      /**
        * Creates a PolicyDelta message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns PolicyDelta
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta = js.native
      
      /**
        * Creates a plain object from a PolicyDelta message. Also converts values to other types if specified.
        * @param message PolicyDelta
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.PolicyDelta, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a PolicyDelta message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.PolicyDelta.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a SetIamPolicyRequest. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest")
    @js.native
    /**
      * Constructs a new SetIamPolicyRequest.
      * @param [properties] Properties to set
      */
    class SetIamPolicyRequest ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest {
      def this(properties: ISetIamPolicyRequest) = this()
    }
    object SetIamPolicyRequest {
      
      /**
        * Creates a new SetIamPolicyRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SetIamPolicyRequest instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.create")
      @js.native
      def create(properties: ISetIamPolicyRequest): typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest = js.native
      
      /**
        * Decodes a SetIamPolicyRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SetIamPolicyRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest = js.native
      
      /**
        * Decodes a SetIamPolicyRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SetIamPolicyRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest = js.native
      
      /**
        * Encodes the specified SetIamPolicyRequest message. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
        * @param message SetIamPolicyRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.encode")
      @js.native
      def encode(message: ISetIamPolicyRequest): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.encode")
      @js.native
      def encode(message: ISetIamPolicyRequest, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified SetIamPolicyRequest message, length delimited. Does not implicitly {@link google.iam.v1.SetIamPolicyRequest.verify|verify} messages.
        * @param message SetIamPolicyRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISetIamPolicyRequest): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.encodeDelimited")
      @js.native
      def encodeDelimited(message: ISetIamPolicyRequest, writer: Writer): Writer = js.native
      
      /**
        * Creates a SetIamPolicyRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SetIamPolicyRequest
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest = js.native
      
      /**
        * Creates a plain object from a SetIamPolicyRequest message. Also converts values to other types if specified.
        * @param message SetIamPolicyRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.toObject")
      @js.native
      def toObject(
        message: typings.googleGax.iamServiceMod.google.iam.v1.SetIamPolicyRequest,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a SetIamPolicyRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.SetIamPolicyRequest.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a TestIamPermissionsRequest. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest")
    @js.native
    /**
      * Constructs a new TestIamPermissionsRequest.
      * @param [properties] Properties to set
      */
    class TestIamPermissionsRequest ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest {
      def this(properties: ITestIamPermissionsRequest) = this()
    }
    object TestIamPermissionsRequest {
      
      /**
        * Creates a new TestIamPermissionsRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TestIamPermissionsRequest instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.create")
      @js.native
      def create(properties: ITestIamPermissionsRequest): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest = js.native
      
      /**
        * Decodes a TestIamPermissionsRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TestIamPermissionsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest = js.native
      
      /**
        * Decodes a TestIamPermissionsRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TestIamPermissionsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest = js.native
      
      /**
        * Encodes the specified TestIamPermissionsRequest message. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
        * @param message TestIamPermissionsRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.encode")
      @js.native
      def encode(message: ITestIamPermissionsRequest): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.encode")
      @js.native
      def encode(message: ITestIamPermissionsRequest, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified TestIamPermissionsRequest message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsRequest.verify|verify} messages.
        * @param message TestIamPermissionsRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITestIamPermissionsRequest): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITestIamPermissionsRequest, writer: Writer): Writer = js.native
      
      /**
        * Creates a TestIamPermissionsRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TestIamPermissionsRequest
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest = js.native
      
      /**
        * Creates a plain object from a TestIamPermissionsRequest message. Also converts values to other types if specified.
        * @param message TestIamPermissionsRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.toObject")
      @js.native
      def toObject(
        message: typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsRequest,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a TestIamPermissionsRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsRequest.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Represents a TestIamPermissionsResponse. */
    @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse")
    @js.native
    /**
      * Constructs a new TestIamPermissionsResponse.
      * @param [properties] Properties to set
      */
    class TestIamPermissionsResponse ()
      extends typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse {
      def this(properties: ITestIamPermissionsResponse) = this()
    }
    object TestIamPermissionsResponse {
      
      /**
        * Creates a new TestIamPermissionsResponse instance using the specified properties.
        * @param [properties] Properties to set
        * @returns TestIamPermissionsResponse instance
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.create")
      @js.native
      def create(): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.create")
      @js.native
      def create(properties: ITestIamPermissionsResponse): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse = js.native
      
      /**
        * Decodes a TestIamPermissionsResponse message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns TestIamPermissionsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.decode")
      @js.native
      def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.decode")
      @js.native
      def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse = js.native
      
      /**
        * Decodes a TestIamPermissionsResponse message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns TestIamPermissionsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse = js.native
      
      /**
        * Encodes the specified TestIamPermissionsResponse message. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
        * @param message TestIamPermissionsResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.encode")
      @js.native
      def encode(message: ITestIamPermissionsResponse): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.encode")
      @js.native
      def encode(message: ITestIamPermissionsResponse, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified TestIamPermissionsResponse message, length delimited. Does not implicitly {@link google.iam.v1.TestIamPermissionsResponse.verify|verify} messages.
        * @param message TestIamPermissionsResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITestIamPermissionsResponse): Writer = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.encodeDelimited")
      @js.native
      def encodeDelimited(message: ITestIamPermissionsResponse, writer: Writer): Writer = js.native
      
      /**
        * Creates a TestIamPermissionsResponse message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns TestIamPermissionsResponse
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse = js.native
      
      /**
        * Creates a plain object from a TestIamPermissionsResponse message. Also converts values to other types if specified.
        * @param message TestIamPermissionsResponse
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.toObject")
      @js.native
      def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse): StringDictionary[js.Any] = js.native
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.toObject")
      @js.native
      def toObject(
        message: typings.googleGax.iamServiceMod.google.iam.v1.TestIamPermissionsResponse,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a TestIamPermissionsResponse message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("google-gax", "IamProtos.google.iam.v1.TestIamPermissionsResponse.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Namespace logging. */
    object logging {
      
      /** Represents an AuditData. */
      @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData")
      @js.native
      /**
        * Constructs a new AuditData.
        * @param [properties] Properties to set
        */
      class AuditData ()
        extends typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData {
        def this(properties: IAuditData) = this()
      }
      object AuditData {
        
        /**
          * Creates a new AuditData instance using the specified properties.
          * @param [properties] Properties to set
          * @returns AuditData instance
          */
        /* static member */
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.create")
        @js.native
        def create(): typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData = js.native
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.create")
        @js.native
        def create(properties: IAuditData): typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData = js.native
        
        /**
          * Decodes an AuditData message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns AuditData
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.decode")
        @js.native
        def decode(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData = js.native
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.decode")
        @js.native
        def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData = js.native
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.decode")
        @js.native
        def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData = js.native
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData = js.native
        
        /**
          * Decodes an AuditData message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns AuditData
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData = js.native
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData = js.native
        
        /**
          * Encodes the specified AuditData message. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
          * @param message AuditData message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.encode")
        @js.native
        def encode(message: IAuditData): Writer = js.native
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.encode")
        @js.native
        def encode(message: IAuditData, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified AuditData message, length delimited. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
          * @param message AuditData message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.encodeDelimited")
        @js.native
        def encodeDelimited(message: IAuditData): Writer = js.native
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.encodeDelimited")
        @js.native
        def encodeDelimited(message: IAuditData, writer: Writer): Writer = js.native
        
        /**
          * Creates an AuditData message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns AuditData
          */
        /* static member */
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData = js.native
        
        /**
          * Creates a plain object from an AuditData message. Also converts values to other types if specified.
          * @param message AuditData
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.toObject")
        @js.native
        def toObject(message: typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData): StringDictionary[js.Any] = js.native
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.toObject")
        @js.native
        def toObject(
          message: typings.googleGax.iamServiceMod.google.iam.v1.logging.AuditData,
          options: IConversionOptions
        ): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies an AuditData message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("google-gax", "IamProtos.google.iam.v1.logging.AuditData.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
    }
  }
}
