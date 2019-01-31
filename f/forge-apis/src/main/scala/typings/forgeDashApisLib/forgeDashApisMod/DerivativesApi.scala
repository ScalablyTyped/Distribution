package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "DerivativesApi")
@js.native
class DerivativesApi () extends js.Object {
  def deleteManifest(urn: java.lang.String, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getDerivativeManifest(urn: java.lang.String, derivativeUrn: java.lang.String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getFormats(opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getManifest(urn: java.lang.String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getMetadata(urn: java.lang.String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getModelviewMetadata(urn: java.lang.String, guid: java.lang.String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getModelviewProperties(urn: java.lang.String, guid: java.lang.String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getThumbnail(urn: java.lang.String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def translate(job: JobPayload, opts: forgeDashApisLib.Anon_XAdsForce, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

