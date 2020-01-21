package typings.googleAppsScript.GoogleAppsScript.Content

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MimeType with Double] = js.native
  /* 0 */ @js.native
  object ATOM extends TopLevel[ATOM with Double]
  
  /* 1 */ @js.native
  object CSV extends TopLevel[CSV with Double]
  
  /* 2 */ @js.native
  object ICAL extends TopLevel[ICAL with Double]
  
  /* 3 */ @js.native
  object JAVASCRIPT extends TopLevel[JAVASCRIPT with Double]
  
  /* 4 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  /* 5 */ @js.native
  object RSS extends TopLevel[RSS with Double]
  
  /* 6 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  /* 7 */ @js.native
  object VCARD extends TopLevel[VCARD with Double]
  
  /* 8 */ @js.native
  object XML extends TopLevel[XML with Double]
  
}

