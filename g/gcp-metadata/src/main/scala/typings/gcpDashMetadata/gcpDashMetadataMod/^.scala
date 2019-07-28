package typings.gcpDashMetadata.gcpDashMetadataMod

import typings.gcpDashMetadata.Anon_HEADERNAME
import typings.gcpDashMetadata.gcpDashMetadataStrings.Google
import typings.gcpDashMetadata.gcpDashMetadataStrings.`/computeMetadata/v1`
import typings.gcpDashMetadata.gcpDashMetadataStrings.`Metadata-Flavor`
import typings.gcpDashMetadata.gcpDashMetadataStrings.`http://metadataDOTgoogleDOTinternalDOT`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gcp-metadata", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BASE_PATH: `/computeMetadata/v1` = js.native
  val BASE_URL: String = js.native
  val HEADERS: Anon_HEADERNAME = js.native
  val HEADER_NAME: `Metadata-Flavor` = js.native
  val HEADER_VALUE: Google = js.native
  val HOST_ADDRESS: `http://metadataDOTgoogleDOTinternalDOT` = js.native
  def instance[T](): js.Promise[T] = js.native
  def instance[T](options: String): js.Promise[T] = js.native
  def instance[T](options: Options): js.Promise[T] = js.native
  def isAvailable(): js.Promise[Boolean] = js.native
  def project[T](): js.Promise[T] = js.native
  def project[T](options: String): js.Promise[T] = js.native
  def project[T](options: Options): js.Promise[T] = js.native
}

