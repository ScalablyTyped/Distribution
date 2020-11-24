package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphAlignment extends js.Object
/**
  * The types of text alignment for a paragraph.
  */
@JSGlobal("GoogleAppsScript.Slides.ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  
  @js.native
  sealed trait CENTER extends ParagraphAlignment
  
  @js.native
  sealed trait END extends ParagraphAlignment
  
  @js.native
  sealed trait JUSTIFIED extends ParagraphAlignment
  
  @js.native
  sealed trait START extends ParagraphAlignment
  
  @js.native
  sealed trait UNSUPPORTED extends ParagraphAlignment
}
