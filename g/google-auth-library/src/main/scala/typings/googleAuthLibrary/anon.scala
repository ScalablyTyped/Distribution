package typings.googleAuthLibrary

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.gaxios.buildSrcCommonMod.GaxiosResponse
import typings.googleAuthLibrary.buildSrcAuthDownscopedclientMod.AccessBoundaryRule
import typings.googleAuthLibrary.buildSrcAuthIdentitypoolclientMod.SubjectTokenFormatType
import typings.googleAuthLibrary.buildSrcAuthLoginticketMod.TokenPayload
import typings.googleAuthLibrary.buildSrcTransportersMod.DefaultTransporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessBoundaryRules extends StObject {
    
    var accessBoundaryRules: js.Array[AccessBoundaryRule]
  }
  object AccessBoundaryRules {
    
    inline def apply(accessBoundaryRules: js.Array[AccessBoundaryRule]): AccessBoundaryRules = {
      val __obj = js.Dynamic.literal(accessBoundaryRules = accessBoundaryRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessBoundaryRules]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessBoundaryRules] (val x: Self) extends AnyVal {
      
      inline def setAccessBoundaryRules(value: js.Array[AccessBoundaryRule]): Self = StObject.set(x, "accessBoundaryRules", value.asInstanceOf[js.Any])
      
      inline def setAccessBoundaryRulesVarargs(value: AccessBoundaryRule*): Self = StObject.set(x, "accessBoundaryRules", js.Array(value*))
    }
  }
  
  trait ActorToken extends StObject {
    
    /**
      * OPTIONAL. A security token that represents the identity of the acting
      * party.  Typically, this will be the party that is authorized to use the
      * requested security token and act on behalf of the subject.
      */
    var actorToken: String
    
    /**
      * An identifier, as described in Section 3, that indicates the type of the
      * security token in the "actor_token" parameter. This is REQUIRED when the
      * "actor_token" parameter is present in the request but MUST NOT be
      * included otherwise.
      */
    var actorTokenType: String
  }
  object ActorToken {
    
    inline def apply(actorToken: String, actorTokenType: String): ActorToken = {
      val __obj = js.Dynamic.literal(actorToken = actorToken.asInstanceOf[js.Any], actorTokenType = actorTokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActorToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActorToken] (val x: Self) extends AnyVal {
      
      inline def setActorToken(value: String): Self = StObject.set(x, "actorToken", value.asInstanceOf[js.Any])
      
      inline def setActorTokenType(value: String): Self = StObject.set(x, "actorTokenType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Command extends StObject {
    
    /**
      * The command used to retrieve the 3rd party token.
      */
    var command: String
    
    /**
      * An optional output file location that will be checked for a cached response
      * from a previous run of the executable.
      */
    var output_file: js.UndefOr[String] = js.undefined
    
    /**
      * The timeout for executable to run in milliseconds. If none is provided it
      * will be set to the default timeout of 30 seconds.
      */
    var timeout_millis: js.UndefOr[Double] = js.undefined
  }
  object Command {
    
    inline def apply(command: String): Command = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setOutput_file(value: String): Self = StObject.set(x, "output_file", value.asInstanceOf[js.Any])
      
      inline def setOutput_fileUndefined: Self = StObject.set(x, "output_file", js.undefined)
      
      inline def setTimeout_millis(value: Double): Self = StObject.set(x, "timeout_millis", value.asInstanceOf[js.Any])
      
      inline def setTimeout_millisUndefined: Self = StObject.set(x, "timeout_millis", js.undefined)
    }
  }
  
  trait Envelope extends StObject {
    
    var envelope: js.UndefOr[String] = js.undefined
    
    var payload: js.UndefOr[TokenPayload] = js.undefined
  }
  object Envelope {
    
    inline def apply(): Envelope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Envelope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Envelope] (val x: Self) extends AnyVal {
      
      inline def setEnvelope(value: String): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
      
      inline def setPayload(value: TokenPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  trait Environmentid extends StObject {
    
    var environment_id: String
    
    var imdsv2_session_token_url: js.UndefOr[String] = js.undefined
    
    var region_url: js.UndefOr[String] = js.undefined
    
    var regional_cred_verification_url: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Environmentid {
    
    inline def apply(environment_id: String, regional_cred_verification_url: String): Environmentid = {
      val __obj = js.Dynamic.literal(environment_id = environment_id.asInstanceOf[js.Any], regional_cred_verification_url = regional_cred_verification_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environmentid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Environmentid] (val x: Self) extends AnyVal {
      
      inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
      
      inline def setImdsv2_session_token_url(value: String): Self = StObject.set(x, "imdsv2_session_token_url", value.asInstanceOf[js.Any])
      
      inline def setImdsv2_session_token_urlUndefined: Self = StObject.set(x, "imdsv2_session_token_url", js.undefined)
      
      inline def setRegion_url(value: String): Self = StObject.set(x, "region_url", value.asInstanceOf[js.Any])
      
      inline def setRegion_urlUndefined: Self = StObject.set(x, "region_url", js.undefined)
      
      inline def setRegional_cred_verification_url(value: String): Self = StObject.set(x, "regional_cred_verification_url", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Executable extends StObject {
    
    var executable: Command
  }
  object Executable {
    
    inline def apply(executable: Command): Executable = {
      val __obj = js.Dynamic.literal(executable = executable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Executable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Executable] (val x: Self) extends AnyVal {
      
      inline def setExecutable(value: Command): Self = StObject.set(x, "executable", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[Subjecttokenfieldname] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object File {
    
    inline def apply(): File = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFormat(value: Subjecttokenfieldname): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var headers: js.UndefOr[typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.Headers] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Res extends StObject {
    
    var res: js.UndefOr[GaxiosResponse[Any] | Null] = js.undefined
    
    var token: js.UndefOr[String | Null] = js.undefined
  }
  object Res {
    
    inline def apply(): Res = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Res]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Res] (val x: Self) extends AnyVal {
      
      inline def setRes(value: GaxiosResponse[Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResNull: Self = StObject.set(x, "res", null)
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenNull: Self = StObject.set(x, "token", null)
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait Subjecttokenfieldname extends StObject {
    
    var subject_token_field_name: js.UndefOr[String] = js.undefined
    
    var `type`: SubjectTokenFormatType
  }
  object Subjecttokenfieldname {
    
    inline def apply(`type`: SubjectTokenFormatType): Subjecttokenfieldname = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subjecttokenfieldname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subjecttokenfieldname] (val x: Self) extends AnyVal {
      
      inline def setSubject_token_field_name(value: String): Self = StObject.set(x, "subject_token_field_name", value.asInstanceOf[js.Any])
      
      inline def setSubject_token_field_nameUndefined: Self = StObject.set(x, "subject_token_field_name", js.undefined)
      
      inline def setType(value: SubjectTokenFormatType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tokenlifetimeseconds extends StObject {
    
    var token_lifetime_seconds: js.UndefOr[Double] = js.undefined
  }
  object Tokenlifetimeseconds {
    
    inline def apply(): Tokenlifetimeseconds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tokenlifetimeseconds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tokenlifetimeseconds] (val x: Self) extends AnyVal {
      
      inline def setToken_lifetime_seconds(value: Double): Self = StObject.set(x, "token_lifetime_seconds", value.asInstanceOf[js.Any])
      
      inline def setToken_lifetime_secondsUndefined: Self = StObject.set(x, "token_lifetime_seconds", js.undefined)
    }
  }
  
  @js.native
  trait TypeofDefaultTransporter
    extends StObject
       with Instantiable0[DefaultTransporter] {
    
    /**
      * Default user agent.
      */
    val USER_AGENT: String = js.native
  }
  
  trait Xgoogiamauthorityselector extends StObject {
    
    var `x-goog-iam-authority-selector`: String
    
    var `x-goog-iam-authorization-token`: String
  }
  object Xgoogiamauthorityselector {
    
    inline def apply(`x-goog-iam-authority-selector`: String, `x-goog-iam-authorization-token`: String): Xgoogiamauthorityselector = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("x-goog-iam-authority-selector")(`x-goog-iam-authority-selector`.asInstanceOf[js.Any])
      __obj.updateDynamic("x-goog-iam-authorization-token")(`x-goog-iam-authorization-token`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xgoogiamauthorityselector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Xgoogiamauthorityselector] (val x: Self) extends AnyVal {
      
      inline def `setX-goog-iam-authority-selector`(value: String): Self = StObject.set(x, "x-goog-iam-authority-selector", value.asInstanceOf[js.Any])
      
      inline def `setX-goog-iam-authorization-token`(value: String): Self = StObject.set(x, "x-goog-iam-authorization-token", value.asInstanceOf[js.Any])
    }
  }
}
