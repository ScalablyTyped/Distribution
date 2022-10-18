package typings.googleAuthLibrary

import typings.googleAuthLibrary.buildSrcAuthIdentitypoolclientMod.SubjectTokenFormatType
import typings.googleAuthLibrary.buildSrcAuthOauth2commonMod.ConfidentialClientType
import typings.googleAuthLibrary.buildSrcAuthOauth2commonMod._OAuthErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleAuthLibraryStrings {
  
  @js.native
  sealed trait basic
    extends StObject
       with ConfidentialClientType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait invalid_client
    extends StObject
       with _OAuthErrorCode
  inline def invalid_client: invalid_client = "invalid_client".asInstanceOf[invalid_client]
  
  @js.native
  sealed trait invalid_grant
    extends StObject
       with _OAuthErrorCode
  inline def invalid_grant: invalid_grant = "invalid_grant".asInstanceOf[invalid_grant]
  
  @js.native
  sealed trait invalid_request
    extends StObject
       with _OAuthErrorCode
  inline def invalid_request: invalid_request = "invalid_request".asInstanceOf[invalid_request]
  
  @js.native
  sealed trait invalid_scope
    extends StObject
       with _OAuthErrorCode
  inline def invalid_scope: invalid_scope = "invalid_scope".asInstanceOf[invalid_scope]
  
  @js.native
  sealed trait json
    extends StObject
       with SubjectTokenFormatType
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait `request-body`
    extends StObject
       with ConfidentialClientType
  inline def `request-body`: `request-body` = "request-body".asInstanceOf[`request-body`]
  
  @js.native
  sealed trait text
    extends StObject
       with SubjectTokenFormatType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait tokens extends StObject
  inline def tokens: tokens = "tokens".asInstanceOf[tokens]
  
  @js.native
  sealed trait unauthorized_client
    extends StObject
       with _OAuthErrorCode
  inline def unauthorized_client: unauthorized_client = "unauthorized_client".asInstanceOf[unauthorized_client]
  
  @js.native
  sealed trait unsupported_grant_type
    extends StObject
       with _OAuthErrorCode
  inline def unsupported_grant_type: unsupported_grant_type = "unsupported_grant_type".asInstanceOf[unsupported_grant_type]
}
