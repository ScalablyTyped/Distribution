package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineCategory extends js.Object
/**
  * The line category.
  *
  * The exact LineType created is determined based on the category and how it's routed to
  * connect to other page elements.
  */
@JSGlobal("GoogleAppsScript.Slides.LineCategory")
@js.native
object LineCategory extends js.Object {
  
  @js.native
  sealed trait BENT extends LineCategory
  
  @js.native
  sealed trait CURVED extends LineCategory
  
  @js.native
  sealed trait STRAIGHT extends LineCategory
  
  @js.native
  sealed trait UNSUPPORTED extends LineCategory
}
