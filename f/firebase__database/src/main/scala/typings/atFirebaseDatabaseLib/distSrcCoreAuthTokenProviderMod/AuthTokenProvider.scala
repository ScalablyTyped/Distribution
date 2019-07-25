package typings
package atFirebaseDatabaseLib.distSrcCoreAuthTokenProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "AuthTokenProvider")
@js.native
class AuthTokenProvider protected () extends js.Object {
  /**
    * @param {!FirebaseApp} app_
    */
  def this(app_ : /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any) = this()
  var app_ : js.Any = js.native
  def addTokenChangeListener(listener: js.Function1[/* token */ java.lang.String | scala.Null, scala.Unit]): scala.Unit = js.native
  /**
    * @param {boolean} forceRefresh
    * @return {!Promise<FirebaseAuthTokenData>}
    */
  def getToken(forceRefresh: scala.Boolean): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FirebaseAuthTokenData */ _
  ] = js.native
  def notifyForInvalidToken(): scala.Unit = js.native
  def removeTokenChangeListener(listener: js.Function1[/* token */ java.lang.String | scala.Null, scala.Unit]): scala.Unit = js.native
}

