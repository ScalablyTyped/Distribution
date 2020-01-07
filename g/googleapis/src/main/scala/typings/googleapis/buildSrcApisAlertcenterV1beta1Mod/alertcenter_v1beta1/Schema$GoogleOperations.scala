package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An incident reported by Google Operations for a G Suite application.
  */
@js.native
trait Schema$GoogleOperations extends js.Object {
  /**
    * The list of emails which correspond to the users directly affected by the
    * incident.
    */
  var affectedUserEmails: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. Application-specific data for an incident, provided when the G
    * Suite application which reported the incident cannot be completely
    * restored to a valid state.
    */
  var attachmentData: js.UndefOr[Schema$Attachment] = js.native
  /**
    * A detailed, freeform incident description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A one-line incident description.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$GoogleOperations {
  @scala.inline
  def apply(
    affectedUserEmails: js.Array[String] = null,
    attachmentData: Schema$Attachment = null,
    description: String = null,
    title: String = null
  ): Schema$GoogleOperations = {
    val __obj = js.Dynamic.literal()
    if (affectedUserEmails != null) __obj.updateDynamic("affectedUserEmails")(affectedUserEmails.asInstanceOf[js.Any])
    if (attachmentData != null) __obj.updateDynamic("attachmentData")(attachmentData.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleOperations]
  }
}

