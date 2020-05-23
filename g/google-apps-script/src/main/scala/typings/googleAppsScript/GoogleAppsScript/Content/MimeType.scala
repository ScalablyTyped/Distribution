package typings.googleAppsScript.GoogleAppsScript.Content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MimeType extends js.Object

/**
  * An enum for mime types that can be served from a script.
  */
@JSGlobal("GoogleAppsScript.Content.MimeType")
@js.native
object MimeType extends js.Object {
  @js.native
  sealed trait ATOM extends MimeType
  
  @js.native
  sealed trait CSV extends MimeType
  
  @js.native
  sealed trait ICAL extends MimeType
  
  @js.native
  sealed trait JAVASCRIPT extends MimeType
  
  @js.native
  sealed trait JSON extends MimeType
  
  @js.native
  sealed trait RSS extends MimeType
  
  @js.native
  sealed trait TEXT extends MimeType
  
  @js.native
  sealed trait VCARD extends MimeType
  
  @js.native
  sealed trait XML extends MimeType
  
}

