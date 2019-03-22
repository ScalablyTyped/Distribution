package typings
package gitlabLib.distEs5InfrastructureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/es5/infrastructure", "RequestHelper")
@js.native
class RequestHelper ()
  extends gitlabLib.distEs5InfrastructureRequestHelperMod.default

/* static members */
@JSImport("gitlab/dist/es5/infrastructure", "RequestHelper")
@js.native
object RequestHelper extends js.Object {
  def delete(service: gitlabLib.distEs5InfrastructureMod.BaseService, endpoint: java.lang.String): js.Promise[_] = js.native
  def delete(
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def get(service: gitlabLib.distEs5InfrastructureMod.BaseService, endpoint: java.lang.String): js.Promise[_] = js.native
  def get(
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def get(
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions,
    hasStream: gitlabLib.Anon_Stream
  ): js.Promise[_] = js.native
  def handleRequestError(
    err: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ): js.Promise[js.Object] = js.native
  def post(service: gitlabLib.distEs5InfrastructureMod.BaseService, endpoint: java.lang.String): js.Promise[_] = js.native
  def post(
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def post(
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions,
    form: scala.Boolean
  ): js.Promise[_] = js.native
  def put(service: gitlabLib.distEs5InfrastructureMod.BaseService, endpoint: java.lang.String): js.Promise[_] = js.native
  def put(
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def request(
    `type`: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestType,
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ _
  ] = js.native
  def request(
    `type`: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestType,
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ _
  ] = js.native
  def request(
    `type`: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestType,
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions,
    form: scala.Boolean
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ _
  ] = js.native
  def request(
    `type`: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestType,
    service: gitlabLib.distEs5InfrastructureMod.BaseService,
    endpoint: java.lang.String,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions,
    form: scala.Boolean,
    stream: scala.Boolean
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ _
  ] = js.native
}

