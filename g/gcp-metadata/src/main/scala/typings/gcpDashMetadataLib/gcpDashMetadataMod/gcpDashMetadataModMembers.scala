package typings
package gcpDashMetadataLib.gcpDashMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gcp-metadata", JSImport.Namespace)
@js.native
object gcpDashMetadataModMembers extends js.Object {
  val BASE_PATH: /* /computeMetadata/v1 */ java.lang.String = js.native
  val BASE_URL: java.lang.String = js.native
  val HEADERS: stdLib.Readonly[
    /* import warning: Failed type conversion: TsTypeObject(List(TsMemberIndex(NoComments,false,Default,IndexingSingle(TsQIdent(List(TsIdentSimple(HEADER_NAME)))),false,TsTypeRef(TsQIdent(List(TsIdentSimple(string))),List())))) */js.Any
  ] = js.native
  val HEADER_NAME: /* Metadata-Flavor */ java.lang.String = js.native
  val HEADER_VALUE: /* Google */ java.lang.String = js.native
  val HOST_ADDRESS: /* http://metadata.google.internal */ java.lang.String = js.native
  def instance(): js.Promise[axiosLib.axiosMod.AxiosResponse[_]] = js.native
  def instance(options: Options): js.Promise[axiosLib.axiosMod.AxiosResponse[_]] = js.native
  def instance(options: java.lang.String): js.Promise[axiosLib.axiosMod.AxiosResponse[_]] = js.native
  def isAvailable(): js.Promise[scala.Boolean] = js.native
  def project(): js.Promise[axiosLib.axiosMod.AxiosResponse[_]] = js.native
  def project(options: Options): js.Promise[axiosLib.axiosMod.AxiosResponse[_]] = js.native
  def project(options: java.lang.String): js.Promise[axiosLib.axiosMod.AxiosResponse[_]] = js.native
}

