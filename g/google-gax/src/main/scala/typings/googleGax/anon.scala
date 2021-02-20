package typings.googleGax

import org.scalablytyped.runtime.Instantiable0
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.grpcGrpcJs.callCredentialsMod.CallMetadataGenerator
import typings.grpcGrpcJs.channelCredentialsMod.VerifyOptions
import typings.grpcGrpcJs.mod.CallCredentials
import typings.grpcGrpcJs.mod.ChannelCredentials
import typings.grpcGrpcJs.mod.Metadata
import typings.grpcGrpcJs.mod.ServerCredentials
import typings.grpcGrpcJs.serverCredentialsMod.KeyCertPair
import typings.node.Buffer
import typings.node.http2Mod.IncomingHttpHeaders
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Auth extends StObject {
    
    var auth: OAuth2Client = js.native
  }
  object Auth {
    
    @scala.inline
    def apply(auth: OAuth2Client): Auth = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth]
    }
    
    @scala.inline
    implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: OAuth2Client): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Deadline extends StObject {
    
    var deadline: js.UndefOr[Date] = js.native
  }
  object Deadline {
    
    @scala.inline
    def apply(): Deadline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deadline]
    }
    
    @scala.inline
    implicit class DeadlineMutableBuilder[Self <: Deadline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
    }
  }
  
  @js.native
  trait Encode extends StObject {
    
    def encode(obj: js.Object): Finish = js.native
  }
  object Encode {
    
    @scala.inline
    def apply(encode: js.Object => Finish): Encode = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Encode]
    }
    
    @scala.inline
    implicit class EncodeMutableBuilder[Self <: Encode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncode(value: js.Object => Finish): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Finish extends StObject {
    
    def finish(): js.Array[js.Object] = js.native
  }
  object Finish {
    
    @scala.inline
    def apply(finish: () => js.Array[js.Object]): Finish = {
      val __obj = js.Dynamic.literal(finish = js.Any.fromFunction0(finish))
      __obj.asInstanceOf[Finish]
    }
    
    @scala.inline
    implicit class FinishMutableBuilder[Self <: Finish] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinish(value: () => js.Array[js.Object]): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TypeofCallCredentials extends Instantiable0[CallCredentials] {
    
    def createEmpty(): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Create a gRPC credential from a Google credential object.
      * @param googleCredentials The authentication client to use.
      * @return The resulting CallCredentials object.
      */
    def createFromGoogleCredential(googleCredentials: typings.grpcGrpcJs.callCredentialsMod.OAuth2Client): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Creates a new CallCredentials object from a given function that generates
      * Metadata objects.
      * @param metadataGenerator A function that accepts a set of options, and
      * generates a Metadata object based on these options, which is passed back
      * to the caller via a supplied (err, metadata) callback.
      */
    def createFromMetadataGenerator(metadataGenerator: CallMetadataGenerator): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
  }
  
  @js.native
  trait TypeofChannelCredentials extends Instantiable0[ChannelCredentials] {
    
    /**
      * Return a new ChannelCredentials instance with no credentials.
      */
    def createInsecure(): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
    /**
      * Return a new ChannelCredentials instance with a given set of credentials.
      * The resulting instance can be used to construct a Channel that communicates
      * over TLS.
      * @param rootCerts The root certificate data.
      * @param privateKey The client certificate private key, if available.
      * @param certChain The client certificate key chain, if available.
      */
    def createSsl(
      rootCerts: js.UndefOr[Buffer | Null],
      privateKey: js.UndefOr[Buffer | Null],
      certChain: js.UndefOr[Buffer | Null],
      verifyOptions: js.UndefOr[VerifyOptions]
    ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
  }
  
  @js.native
  trait TypeofMetadata extends Instantiable0[Metadata] {
    
    /**
      * Returns a new Metadata object based fields in a given IncomingHttpHeaders
      * object.
      * @param headers An IncomingHttpHeaders object.
      */
    def fromHttp2Headers(headers: IncomingHttpHeaders): typings.grpcGrpcJs.metadataMod.Metadata = js.native
  }
  
  @js.native
  trait TypeofServerCredentials extends Instantiable0[ServerCredentials] {
    
    def createInsecure(): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
    def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials = js.native
  }
  
  @js.native
  trait Typeofcredentials extends StObject {
    
    /**
      * Combine any number of CallCredentials into a single CallCredentials
      * object.
      * @param first The first CallCredentials object.
      * @param additional Any number of additional CallCredentials objects.
      * @return The resulting CallCredentials object.
      */
    def combineCallCredentials(
      first: typings.grpcGrpcJs.callCredentialsMod.CallCredentials,
      additional: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.callCredentialsMod.CallCredentials = js.native
    
    /**
      * Combine a ChannelCredentials with any number of CallCredentials into a
      * single ChannelCredentials object.
      * @param channelCredentials The ChannelCredentials object.
      * @param callCredentials Any number of CallCredentials objects.
      * @return The resulting ChannelCredentials object.
      */
    def combineChannelCredentials(
      channelCredentials: typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      callCredentials: typings.grpcGrpcJs.callCredentialsMod.CallCredentials*
    ): typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials = js.native
    
    var createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any = js.native
    
    var createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any = js.native
    
    var createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any = js.native
    
    var createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any = js.native
    
    var createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any = js.native
  }
  object Typeofcredentials {
    
    @scala.inline
    def apply(
      combineCallCredentials: (typings.grpcGrpcJs.callCredentialsMod.CallCredentials, /* repeated */ typings.grpcGrpcJs.callCredentialsMod.CallCredentials) => typings.grpcGrpcJs.callCredentialsMod.CallCredentials,
      combineChannelCredentials: (typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials, /* repeated */ typings.grpcGrpcJs.callCredentialsMod.CallCredentials) => typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials,
      createEmpty: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any,
      createFromGoogleCredential: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any,
      createFromMetadataGenerator: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any,
      createInsecure: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any,
      createSsl: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any
    ): Typeofcredentials = {
      val __obj = js.Dynamic.literal(combineCallCredentials = js.Any.fromFunction2(combineCallCredentials), combineChannelCredentials = js.Any.fromFunction2(combineChannelCredentials), createEmpty = createEmpty.asInstanceOf[js.Any], createFromGoogleCredential = createFromGoogleCredential.asInstanceOf[js.Any], createFromMetadataGenerator = createFromMetadataGenerator.asInstanceOf[js.Any], createInsecure = createInsecure.asInstanceOf[js.Any], createSsl = createSsl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofcredentials]
    }
    
    @scala.inline
    implicit class TypeofcredentialsMutableBuilder[Self <: Typeofcredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCombineCallCredentials(
        value: (typings.grpcGrpcJs.callCredentialsMod.CallCredentials, /* repeated */ typings.grpcGrpcJs.callCredentialsMod.CallCredentials) => typings.grpcGrpcJs.callCredentialsMod.CallCredentials
      ): Self = StObject.set(x, "combineCallCredentials", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCombineChannelCredentials(
        value: (typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials, /* repeated */ typings.grpcGrpcJs.callCredentialsMod.CallCredentials) => typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
      ): Self = StObject.set(x, "combineChannelCredentials", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateEmpty(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createEmpty */ js.Any
      ): Self = StObject.set(x, "createEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFromGoogleCredential(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromGoogleCredential */ js.Any
      ): Self = StObject.set(x, "createFromGoogleCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFromMetadataGenerator(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CallCredentials.createFromMetadataGenerator */ js.Any
      ): Self = StObject.set(x, "createFromMetadataGenerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateInsecure(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createInsecure */ js.Any
      ): Self = StObject.set(x, "createInsecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateSsl(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChannelCredentials.createSsl */ js.Any
      ): Self = StObject.set(x, "createSsl", value.asInstanceOf[js.Any])
    }
  }
}
