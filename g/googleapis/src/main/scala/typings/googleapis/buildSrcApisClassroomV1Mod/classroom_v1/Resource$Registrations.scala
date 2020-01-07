package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Registrations")
@js.native
class Resource$Registrations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * classroom.registrations.create
    * @desc Creates a `Registration`, causing Classroom to start sending
    * notifications from the provided `feed` to the destination provided in
    * `cloudPubSubTopic`.  Returns the created `Registration`. Currently, this
    * will be the same as the argument, but with server-assigned fields such as
    * `expiry_time` and `id` filled in.  Note that any value specified for the
    * `expiry_time` or `id` fields will be ignored.  While Classroom may
    * validate the `cloudPubSubTopic` and return errors on a best effort basis,
    * it is the caller's responsibility to ensure that it exists and that
    * Classroom has permission to publish to it.  This method may return the
    * following error codes:  * `PERMISSION_DENIED` if:     * the authenticated
    * user does not have permission to receive       notifications from the
    * requested field; or     * the credential provided does not include the
    * appropriate scope for       the requested feed.     * another access
    * error is encountered. * `INVALID_ARGUMENT` if:     * no
    * `cloudPubsubTopic` is specified, or the specified `cloudPubsubTopic` is
    * not valid; or     * no `feed` is specified, or the specified `feed` is
    * not valid. * `NOT_FOUND` if:     * the specified `feed` cannot be
    * located, or the requesting user does       not have permission to
    * determine whether or not it exists; or     * the specified
    * `cloudPubsubTopic` cannot be located, or Classroom has       not been
    * granted permission to publish to it.
    * @alias classroom.registrations.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Registration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Registration] = js.native
  def create(callback: BodyResponseCallback[Schema$Registration]): Unit = js.native
  def create(params: ParamsDollarResourceDollarRegistrationsDollarCreate): GaxiosPromise[Schema$Registration] = js.native
  def create(
    params: ParamsDollarResourceDollarRegistrationsDollarCreate,
    callback: BodyResponseCallback[Schema$Registration]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarRegistrationsDollarCreate,
    options: BodyResponseCallback[Schema$Registration],
    callback: BodyResponseCallback[Schema$Registration]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarRegistrationsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Registration] = js.native
  def create(
    params: ParamsDollarResourceDollarRegistrationsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Registration]
  ): Unit = js.native
  /**
    * classroom.registrations.delete
    * @desc Deletes a `Registration`, causing Classroom to stop sending
    * notifications for that `Registration`.
    * @alias classroom.registrations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.registrationId The `registration_id` of the `Registration` to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegistrationsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegistrationsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRegistrationsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegistrationsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegistrationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

