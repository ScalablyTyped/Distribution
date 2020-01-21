package typings.googleAppsScript.GoogleAppsScript.Sites

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

/**
  * A typesafe enum for sites attachment type.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
@JSGlobal("GoogleAppsScript.Sites.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  @js.native
  sealed trait HOSTED extends AttachmentType
  
  @js.native
  sealed trait WEB extends AttachmentType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
  /* 1 */ @js.native
  object HOSTED extends TopLevel[HOSTED with Double]
  
  /* 0 */ @js.native
  object WEB extends TopLevel[WEB with Double]
  
}

