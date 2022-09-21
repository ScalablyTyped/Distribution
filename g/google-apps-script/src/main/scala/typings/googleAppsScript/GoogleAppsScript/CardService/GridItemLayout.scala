package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GridItemLayout extends StObject
/**
  * An enum that defines the image and text style of a GridItem.
  */
@JSGlobal("GoogleAppsScript.Card_Service.GridItemLayout")
@js.native
object GridItemLayout extends StObject {
  
  /** The title and subtitle are shown above the grid item's image. */
  @js.native
  sealed trait TEXT_ABOVE
    extends StObject
       with GridItemLayout
  
  /** The title and subtitle are shown below the grid item's image. */
  @js.native
  sealed trait TEXT_BELOW
    extends StObject
       with GridItemLayout
}
