package typings.googleAppsScript.GoogleAppsScript.Classroom.Collection

import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Registration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def create(resource: Registration): Registration = js.native
  
  // Deletes a `Registration`, causing Classroom to stop sending notifications
  // for that `Registration`.
  def remove(registrationId: String): Unit = js.native
}
object RegistrationsCollection {
  
  @scala.inline
  def apply(create: Registration => Registration, remove: String => Unit): RegistrationsCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[RegistrationsCollection]
  }
  
  @scala.inline
  implicit class RegistrationsCollectionOps[Self <: RegistrationsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreate(value: Registration => Registration): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
