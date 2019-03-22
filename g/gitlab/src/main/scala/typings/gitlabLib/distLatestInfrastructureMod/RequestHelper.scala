package typings
package gitlabLib.distLatestInfrastructureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/latest/infrastructure", "RequestHelper")
@js.native
class RequestHelper ()
  extends gitlabLib.distLatestInfrastructureRequestHelperMod.default

/* static members */
@JSImport("gitlab/dist/latest/infrastructure", "RequestHelper")
@js.native
object RequestHelper extends js.Object {
  def delete(service: gitlabLib.distLatestInfrastructureMod.BaseService, endpoint: java.lang.String): js.Promise[_] = js.native
  def delete(
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def get(service: gitlabLib.distLatestInfrastructureMod.BaseService, endpoint: java.lang.String): js.Promise[_] = js.native
  def get(
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def get(
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions,
    hasStream: gitlabLib.Anon_Stream
  ): js.Promise[_] = js.native
  def handleRequestError(
    err: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ): js.Promise[js.Object] = js.native
  def post(service: gitlabLib.distLatestInfrastructureMod.BaseService, endpoint: java.lang.String): js.Promise[_] = js.native
  def post(
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def post(
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions,
    form: scala.Boolean
  ): js.Promise[_] = js.native
  def put(service: gitlabLib.distLatestInfrastructureMod.BaseService, endpoint: java.lang.String): js.Promise[_] = js.native
  def put(
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def request(
    `type`: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestType,
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ _
  ] = js.native
  def request(
    `type`: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestType,
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ _
  ] = js.native
  def request(
    `type`: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestType,
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions,
    form: scala.Boolean
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ _
  ] = js.native
  def request(
    `type`: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestType,
    service: gitlabLib.distLatestInfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions,
    form: scala.Boolean,
    stream: scala.Boolean
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ _
  ] = js.native
}

