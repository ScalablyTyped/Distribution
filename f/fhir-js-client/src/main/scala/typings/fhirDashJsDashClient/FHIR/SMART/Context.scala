package typings.fhirDashJsDashClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context passed to create a SMART client directly without completing the SMART on FHIR OAuth2 authorization workflow
  */
trait Context extends js.Object {
  /**
    * Authorization context
    */
  var auth: js.UndefOr[AuthContext] = js.undefined
  /**
    * Patient in context
    */
  var patientId: js.UndefOr[String] = js.undefined
  /**
    * FHIR service base url
    */
  var serviceUrl: String
  /**
    * User in context
    */
  var userId: js.UndefOr[String] = js.undefined
}

object Context {
  @scala.inline
  def apply(serviceUrl: String, auth: AuthContext = null, patientId: String = null, userId: String = null): Context = {
    val __obj = js.Dynamic.literal(serviceUrl = serviceUrl.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (patientId != null) __obj.updateDynamic("patientId")(patientId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

