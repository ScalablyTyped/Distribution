package typings
package gcpDashMetadataLib.gcpDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gcp-metadata", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BASE_PATH: /* /computeMetadata/v1 */ java.lang.String = js.native
  val BASE_URL: java.lang.String = js.native
  val HEADERS: stdLib.Readonly[
    /* import warning: ImportType.apply Failed type conversion: {[HEADER_NAME] : string} */ js.Any
  ] = js.native
  val HEADER_NAME: /* Metadata-Flavor */ java.lang.String = js.native
  val HEADER_VALUE: /* Google */ java.lang.String = js.native
  val HOST_ADDRESS: /* http://metadata.google.internal */ java.lang.String = js.native
  def instance[T](): js.Promise[T] = js.native
  def instance[T](options: Options): js.Promise[T] = js.native
  def instance[T](options: java.lang.String): js.Promise[T] = js.native
  def isAvailable(): js.Promise[scala.Boolean] = js.native
  def project[T](): js.Promise[T] = js.native
  def project[T](options: Options): js.Promise[T] = js.native
  def project[T](options: java.lang.String): js.Promise[T] = js.native
}

