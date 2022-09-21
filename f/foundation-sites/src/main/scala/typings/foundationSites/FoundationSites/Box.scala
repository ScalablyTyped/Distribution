package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Utilities
// ---------
@js.native
trait Box extends StObject {
  
  def GetDimensions(element: js.Object): js.Object = js.native
  
  def GetExplicitOffsets(
    element: Any,
    anchor: Any,
    position: String,
    alignment: Any,
    vOffset: Double,
    hOffset: Double,
    isOverflow: Boolean
  ): js.Object = js.native
  
  def ImNotTouchingYou(element: js.Object): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: Boolean, tbOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: js.Object, lrOnly: Unit, tbOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: Unit, lrOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: Unit, lrOnly: Boolean, tbOnly: Boolean): Boolean = js.native
  def ImNotTouchingYou(element: js.Object, parent: Unit, lrOnly: Unit, tbOnly: Boolean): Boolean = js.native
  
  def OverlapArea(element: js.Object): Double = js.native
  def OverlapArea(element: js.Object, parent: js.Object): Double = js.native
  def OverlapArea(element: js.Object, parent: js.Object, lrOnly: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: js.Object, lrOnly: Boolean, tbOnly: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: js.Object, lrOnly: Boolean, tbOnly: Boolean, ignoreBottom: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: js.Object, lrOnly: Boolean, tbOnly: Unit, ignoreBottom: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: js.Object, lrOnly: Unit, tbOnly: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: js.Object, lrOnly: Unit, tbOnly: Boolean, ignoreBottom: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: js.Object, lrOnly: Unit, tbOnly: Unit, ignoreBottom: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: Unit, lrOnly: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: Unit, lrOnly: Boolean, tbOnly: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: Unit, lrOnly: Boolean, tbOnly: Boolean, ignoreBottom: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: Unit, lrOnly: Boolean, tbOnly: Unit, ignoreBottom: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: Unit, lrOnly: Unit, tbOnly: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: Unit, lrOnly: Unit, tbOnly: Boolean, ignoreBottom: Boolean): Double = js.native
  def OverlapArea(element: js.Object, parent: Unit, lrOnly: Unit, tbOnly: Unit, ignoreBottom: Boolean): Double = js.native
}
