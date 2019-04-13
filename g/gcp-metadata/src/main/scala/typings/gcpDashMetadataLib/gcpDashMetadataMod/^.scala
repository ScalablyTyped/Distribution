package typings
package gcpDashMetadataLib.gcpDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gcp-metadata", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BASE_PATH: gcpDashMetadataLib.gcpDashMetadataLibStrings.`/computeMetadata/v1` = js.native
  val BASE_URL: java.lang.String = js.native
  val HEADERS: stdLib.Readonly[gcpDashMetadataLib.Anon_HEADERNAME] = js.native
  val HEADER_NAME: gcpDashMetadataLib.gcpDashMetadataLibStrings.`Metadata-Flavor` = js.native
  val HEADER_VALUE: gcpDashMetadataLib.gcpDashMetadataLibStrings.Google = js.native
  val HOST_ADDRESS: gcpDashMetadataLib.gcpDashMetadataLibStrings.`http://metadataDOTgoogleDOTinternalDOT` = js.native
  def instance[T](): js.Promise[T] = js.native
  def instance[T](options: Options): js.Promise[T] = js.native
  def instance[T](options: java.lang.String): js.Promise[T] = js.native
  def isAvailable(): js.Promise[scala.Boolean] = js.native
  def project[T](): js.Promise[T] = js.native
  def project[T](options: Options): js.Promise[T] = js.native
  def project[T](options: java.lang.String): js.Promise[T] = js.native
}

