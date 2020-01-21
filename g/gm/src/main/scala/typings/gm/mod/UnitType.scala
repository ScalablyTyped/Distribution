package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gm.gmStrings.Undefined
  - typings.gm.gmStrings.PixelsPerInch
  - typings.gm.gmStrings.PixelsPerCentimeter
*/
trait UnitType extends js.Object

object UnitType {
  @scala.inline
  def PixelsPerCentimeter: typings.gm.gmStrings.PixelsPerCentimeter = this.cast("PixelsPerCentimeter")
  @scala.inline
  def PixelsPerInch: typings.gm.gmStrings.PixelsPerInch = this.cast("PixelsPerInch")
  @scala.inline
  def Undefined: typings.gm.gmStrings.Undefined = this.cast("Undefined")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

