package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PositionedLayout extends StObject
/**
  * An enumeration that specifies how to lay out a PositionedImage in relation to surrounding
  * text.
  */
@JSGlobal("GoogleAppsScript.Document.PositionedLayout")
@js.native
object PositionedLayout extends StObject {
  
  @js.native
  sealed trait ABOVE_TEXT extends PositionedLayout
  
  @js.native
  sealed trait BREAK_BOTH extends PositionedLayout
  
  @js.native
  sealed trait BREAK_LEFT extends PositionedLayout
  
  @js.native
  sealed trait BREAK_RIGHT extends PositionedLayout
  
  @js.native
  sealed trait WRAP_TEXT extends PositionedLayout
}
