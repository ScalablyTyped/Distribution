package typings.firebase.mod.default.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A utility class to parse email action URLs.
  */
@JSImport("firebase", "auth.ActionCodeURL")
@js.native
class ActionCodeURL protected ()
  extends typings.firebase.mod.firebase.auth.ActionCodeURL
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
  def parseLink(link: String): typings.firebase.mod.firebase.auth.ActionCodeURL | Null = js.native
}
