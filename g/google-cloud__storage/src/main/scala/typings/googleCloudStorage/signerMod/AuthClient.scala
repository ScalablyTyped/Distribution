package typings.googleCloudStorage.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthClient extends js.Object {
  def getCredentials(): js.Promise[GetCredentialsResponse]
  def sign(blobToSign: String): js.Promise[String]
}

object AuthClient {
  @scala.inline
  def apply(getCredentials: () => js.Promise[GetCredentialsResponse], sign: String => js.Promise[String]): AuthClient = {
    val __obj = js.Dynamic.literal(getCredentials = js.Any.fromFunction0(getCredentials), sign = js.Any.fromFunction1(sign))
  
    __obj.asInstanceOf[AuthClient]
  }
}

