package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationsCollection extends js.Object {
  // Creates a `Registration`, causing Classroom to start sending notifications
  // from the provided `feed` to the destination provided in `cloudPubSubTopic`.
  // Returns the created `Registration`. Currently, this will be the same as
  // the argument, but with server-assigned fields such as `expiry_time` and
  // `id` filled in.
  // Note that any value specified for the `expiry_time` or `id` fields will be
  // ignored.
  // While Classroom may validate the `cloudPubSubTopic` and return errors on a
  // best effort basis, it is the caller's responsibility to ensure that it
  // exists and that Classroom has permission to publish to it.
  // This method may return the following error codes:
  // * `PERMISSION_DENIED` if:
  //     * the authenticated user does not have permission to receive
  //       notifications from the requested field; or
  //     * the credential provided does not include the appropriate scope for
  //       the requested feed.
  //     * another access error is encountered.
  // * `INVALID_ARGUMENT` if:
  //     * no `cloudPubsubTopic` is specified, or the specified
  //       `cloudPubsubTopic` is not valid; or
  //     * no `feed` is specified, or the specified `feed` is not valid.
  // * `NOT_FOUND` if:
  //     * the specified `feed` cannot be located, or the requesting user does
  //       not have permission to determine whether or not it exists; or
  //     * the specified `cloudPubsubTopic` cannot be located, or Classroom has
  //       not been granted permission to publish to it.
  def create(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs.Registration): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs.Registration
  // Deletes a `Registration`, causing Classroom to stop sending notifications
  // for that `Registration`.
  def remove(registrationId: java.lang.String): scala.Unit
}

object RegistrationsCollection {
  @scala.inline
  def apply(
    create: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs.Registration => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs.Registration,
    remove: java.lang.String => scala.Unit
  ): RegistrationsCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[RegistrationsCollection]
  }
}

