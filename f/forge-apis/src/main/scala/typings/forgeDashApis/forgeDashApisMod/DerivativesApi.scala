package typings.forgeDashApis.forgeDashApisMod

import typings.forgeDashApis.Anon_XAdsForce
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "DerivativesApi")
@js.native
class DerivativesApi () extends js.Object {
  def deleteManifest(urn: String, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getDerivativeManifest(urn: String, derivativeUrn: String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getFormats(opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getManifest(urn: String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getMetadata(urn: String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getModelviewMetadata(urn: String, guid: String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getModelviewProperties(urn: String, guid: String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def getThumbnail(urn: String, opts: js.Object, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  def translate(job: JobPayload, opts: Anon_XAdsForce, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

