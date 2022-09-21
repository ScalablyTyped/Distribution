package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImageCropType extends StObject
/**
  * An enum that represents the crop styles applied to image components.
  * If you want to apply a crop style to an IconImage, you can only use SQUARE or CIRCLE.
  */
@JSGlobal("GoogleAppsScript.Card_Service.ImageCropType")
@js.native
object ImageCropType extends StObject {
  
  /** Circle shape crop style. */
  @js.native
  sealed trait CIRCLE
    extends StObject
       with ImageCropType
  
  /** Rectangle shape crop style with 4:3 ratio. */
  @js.native
  sealed trait RECTANGLE_4_3
    extends StObject
       with ImageCropType
  
  /** Rectangle shape crop style with custom ratio. */
  @js.native
  sealed trait RECTANGLE_CUSTOM
    extends StObject
       with ImageCropType
  
  /** Square shape crop style. */
  @js.native
  sealed trait SQUARE
    extends StObject
       with ImageCropType
}
