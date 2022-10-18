package typings.firebaseAdmin.anon

import typings.firebaseAdmin.libAppCredentialMod.Credential
import typings.firebaseAdmin.libAppCredentialMod.ServiceAccount
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationDefault extends StObject {
  
  def applicationDefault(): Credential
  def applicationDefault(httpAgent: Agent): Credential
  @JSName("applicationDefault")
  var applicationDefault_Original: js.Function1[/* httpAgent */ js.UndefOr[Agent], Credential]
  
  def cert(serviceAccountPathOrObject: String): Credential
  def cert(serviceAccountPathOrObject: String, httpAgent: Agent): Credential
  def cert(serviceAccountPathOrObject: ServiceAccount): Credential
  def cert(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): Credential
  @JSName("cert")
  var cert_Original: js.Function2[
    /* serviceAccountPathOrObject */ String | ServiceAccount, 
    /* httpAgent */ js.UndefOr[Agent], 
    Credential
  ]
  
  def refreshToken(refreshTokenPathOrObject: String): Credential
  def refreshToken(refreshTokenPathOrObject: String, httpAgent: Agent): Credential
  def refreshToken(refreshTokenPathOrObject: js.Object): Credential
  def refreshToken(refreshTokenPathOrObject: js.Object, httpAgent: Agent): Credential
  @JSName("refreshToken")
  var refreshToken_Original: js.Function2[
    /* refreshTokenPathOrObject */ String | js.Object, 
    /* httpAgent */ js.UndefOr[Agent], 
    Credential
  ]
}
object ApplicationDefault {
  
  inline def apply(
    applicationDefault: /* httpAgent */ js.UndefOr[Agent] => Credential,
    cert: (/* serviceAccountPathOrObject */ String | ServiceAccount, /* httpAgent */ js.UndefOr[Agent]) => Credential,
    refreshToken: (/* refreshTokenPathOrObject */ String | js.Object, /* httpAgent */ js.UndefOr[Agent]) => Credential
  ): ApplicationDefault = {
    val __obj = js.Dynamic.literal(applicationDefault = js.Any.fromFunction1(applicationDefault), cert = js.Any.fromFunction2(cert), refreshToken = js.Any.fromFunction2(refreshToken))
    __obj.asInstanceOf[ApplicationDefault]
  }
  
  extension [Self <: ApplicationDefault](x: Self) {
    
    inline def setApplicationDefault(value: /* httpAgent */ js.UndefOr[Agent] => Credential): Self = StObject.set(x, "applicationDefault", js.Any.fromFunction1(value))
    
    inline def setCert(
      value: (/* serviceAccountPathOrObject */ String | ServiceAccount, /* httpAgent */ js.UndefOr[Agent]) => Credential
    ): Self = StObject.set(x, "cert", js.Any.fromFunction2(value))
    
    inline def setRefreshToken(
      value: (/* refreshTokenPathOrObject */ String | js.Object, /* httpAgent */ js.UndefOr[Agent]) => Credential
    ): Self = StObject.set(x, "refreshToken", js.Any.fromFunction2(value))
  }
}
