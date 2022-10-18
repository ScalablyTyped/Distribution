package typings.esfxCanceltoken

import typings.std.Credential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialsContainer extends StObject {
  
  def create(): js.Promise[Credential | Null] = js.native
  def create(options: CredentialCreationOptionsWithCancelToken): js.Promise[Credential | Null] = js.native
  
  def get(): js.Promise[Credential | Null] = js.native
  def get(options: CredentialRequestOptionsWithCancelToken): js.Promise[Credential | Null] = js.native
}
