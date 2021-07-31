package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Alignment extends StObject
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
object Alignment extends StObject {
  
  @js.native
  sealed trait CENTER
    extends StObject
       with Alignment
  
  @js.native
  sealed trait LEFT
    extends StObject
       with Alignment
  
  @js.native
  sealed trait RIGHT
    extends StObject
       with Alignment
}
