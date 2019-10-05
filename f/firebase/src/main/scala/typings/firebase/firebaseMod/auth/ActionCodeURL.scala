package typings.firebase.firebaseMod.auth

import typings.firebase.firebaseMod.auth.ActionCodeInfo.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A utility class to parse email action URLs.
  */
@JSImport("firebase", "auth.ActionCodeURL")
@js.native
class ActionCodeURL protected () extends js.Object {
  /**
    * The API key of the email action link.
    */
  var apiKey: String = js.native
  /**
    * The action code of the email action link.
    */
  var code: String = js.native
  /**
    * The continue URL of the email action link. Null if not provided.
    */
  var continueUrl: String | Null = js.native
  /**
    * The language code of the email action link. Null if not provided.
    */
  var languageCode: String | Null = js.native
  /**
    * The action performed by the email action link. It returns from one
    * of the types from {@link firebase.auth.ActionCodeInfo}.
    */
  var operation: Operation = js.native
  /**
    * The tenant ID of the email action link. Null if the email action
    * is from the parent project.
    */
  var tenantId: String | Null = js.native
}

/* static members */
@JSImport("firebase", "auth.ActionCodeURL")
@js.native
object ActionCodeURL extends js.Object {
  /**
    * Parses the email action link string and returns an ActionCodeURL object
    * if the link is valid, otherwise returns null.
    *
    * @param link The email action link string.
    * @return The ActionCodeURL object, or null if the link is invalid.
    */
  def parseLink(link: String): ActionCodeURL | Null = js.native
}

