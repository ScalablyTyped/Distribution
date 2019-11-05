package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

/**
  * An enum representing the supported types of image alignment. Alignment types can be accessed from
  * FormApp.Alignment.
  *
  *     // Open a form by ID and add a new image item with alignment
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var img = UrlFetchApp.fetch('https://www.google.com/images/srpr/logo4w.png');
  *     form.addImageItem()
  *         .setImage(img)
  *         .setAlignment(FormApp.Alignment.CENTER);
  */
@JSGlobal("GoogleAppsScript.Forms.Alignment")
@js.native
object Alignment extends js.Object {
  @js.native
  sealed trait CENTER extends Alignment
  
  @js.native
  sealed trait LEFT extends Alignment
  
  @js.native
  sealed trait RIGHT extends Alignment
  
  /* 1 */ val CENTER: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.Alignment.CENTER with Double = js.native
  /* 0 */ val LEFT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.Alignment.LEFT with Double = js.native
  /* 2 */ val RIGHT: typings.googleDashAppsDashScript.GoogleAppsScript.Forms.Alignment.RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Alignment with Double] = js.native
}

