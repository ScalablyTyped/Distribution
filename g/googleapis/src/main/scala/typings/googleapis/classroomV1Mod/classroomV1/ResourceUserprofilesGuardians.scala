package typings.googleapis.classroomV1Mod.classroomV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Resource$Userprofiles$Guardians")
@js.native
class ResourceUserprofilesGuardians protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * classroom.userProfiles.guardians.delete
    * @desc Deletes a guardian.  The guardian will no longer receive guardian
    * notifications and the guardian will no longer be accessible via the API.
    * This method returns the following error codes:  * `PERMISSION_DENIED` if
    * no user that matches the provided `student_id`   is visible to the
    * requesting user, if the requesting user is not   permitted to manage
    * guardians for the student identified by the   `student_id`, if guardians
    * are not enabled for the domain in question,   or for other access errors.
    * * `INVALID_ARGUMENT` if a `student_id` is specified, but its format
    * cannot   be recognized (it is not an email address, nor a `student_id`
    * from the   API). * `NOT_FOUND` if the requesting user is permitted to
    * modify guardians for   the requested `student_id`, but no `Guardian`
    * record exists for that   student with the provided `guardian_id`.
    * @alias classroom.userProfiles.guardians.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.guardianId The `id` field from a `Guardian`.
    * @param {string} params.studentId The student whose guardian is to be deleted. One of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceUserprofilesGuardiansDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceUserprofilesGuardiansDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceUserprofilesGuardiansDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceUserprofilesGuardiansDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceUserprofilesGuardiansDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * classroom.userProfiles.guardians.get
    * @desc Returns a specific guardian.  This method returns the following
    * error codes:  * `PERMISSION_DENIED` if no user that matches the provided
    * `student_id`   is visible to the requesting user, if the requesting user
    * is not   permitted to view guardian information for the student
    * identified by the   `student_id`, if guardians are not enabled for the
    * domain in question,   or for other access errors. * `INVALID_ARGUMENT` if
    * a `student_id` is specified, but its format cannot   be recognized (it is
    * not an email address, nor a `student_id` from the   API, nor the literal
    * string `me`). * `NOT_FOUND` if the requesting user is permitted to view
    * guardians for   the requested `student_id`, but no `Guardian` record
    * exists for that   student that matches the provided `guardian_id`.
    * @alias classroom.userProfiles.guardians.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.guardianId The `id` field from a `Guardian`.
    * @param {string} params.studentId The student whose guardian is being requested. One of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGuardian] = js.native
  def get(callback: BodyResponseCallback[SchemaGuardian]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGuardian] = js.native
  def get(params: ParamsResourceUserprofilesGuardiansGet): GaxiosPromise[SchemaGuardian] = js.native
  def get(params: ParamsResourceUserprofilesGuardiansGet, callback: BodyResponseCallback[SchemaGuardian]): Unit = js.native
  def get(
    params: ParamsResourceUserprofilesGuardiansGet,
    options: BodyResponseCallback[SchemaGuardian],
    callback: BodyResponseCallback[SchemaGuardian]
  ): Unit = js.native
  def get(params: ParamsResourceUserprofilesGuardiansGet, options: MethodOptions): GaxiosPromise[SchemaGuardian] = js.native
  def get(
    params: ParamsResourceUserprofilesGuardiansGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGuardian]
  ): Unit = js.native
  
  /**
    * classroom.userProfiles.guardians.list
    * @desc Returns a list of guardians that the requesting user is permitted
    * to view, restricted to those that match the request.  To list guardians
    * for any student that the requesting user may view guardians for, use the
    * literal character `-` for the student ID.  This method returns the
    * following error codes:  * `PERMISSION_DENIED` if a `student_id` is
    * specified, and the requesting   user is not permitted to view guardian
    * information for that student, if   `"-"` is specified as the `student_id`
    * and the user is not a domain   administrator, if guardians are not
    * enabled for the domain in question,   if the `invited_email_address`
    * filter is set by a user who is not a   domain administrator, or for other
    * access errors. * `INVALID_ARGUMENT` if a `student_id` is specified, but
    * its format cannot   be recognized (it is not an email address, nor a
    * `student_id` from the   API, nor the literal string `me`). May also be
    * returned if an invalid   `page_token` is provided. * `NOT_FOUND` if a
    * `student_id` is specified, and its format can be   recognized, but
    * Classroom has no record of that student.
    * @alias classroom.userProfiles.guardians.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.invitedEmailAddress Filter results by the email address that the original invitation was sent to, resulting in this guardian link. This filter can only be used by domain administrators.
    * @param {integer=} params.pageSize Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum.  The server may return fewer than the specified number of results.
    * @param {string=} params.pageToken nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned.  The list request must be otherwise identical to the one that resulted in this token.
    * @param {string} params.studentId Filter results by the student who the guardian is linked to. The identifier can be one of the following:  * the numeric identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user * the string literal `"-"`, indicating that results should be returned for   all students that the requesting user has access to view.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListGuardiansResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGuardiansResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListGuardiansResponse] = js.native
  def list(params: ParamsResourceUserprofilesGuardiansList): GaxiosPromise[SchemaListGuardiansResponse] = js.native
  def list(
    params: ParamsResourceUserprofilesGuardiansList,
    callback: BodyResponseCallback[SchemaListGuardiansResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUserprofilesGuardiansList,
    options: BodyResponseCallback[SchemaListGuardiansResponse],
    callback: BodyResponseCallback[SchemaListGuardiansResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUserprofilesGuardiansList, options: MethodOptions): GaxiosPromise[SchemaListGuardiansResponse] = js.native
  def list(
    params: ParamsResourceUserprofilesGuardiansList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGuardiansResponse]
  ): Unit = js.native
}
