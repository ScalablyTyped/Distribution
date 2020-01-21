package typings.distributionsPoissonQuantile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int8
  - typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8
  - typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8_clamped
  - typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int16
  - typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint16
  - typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int32
  - typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint32
  - typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float32
  - typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float64
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def float32: typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float32 = this.cast("float32")
  @scala.inline
  def float64: typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.float64 = this.cast("float64")
  @scala.inline
  def int16: typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int16 = this.cast("int16")
  @scala.inline
  def int32: typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int32 = this.cast("int32")
  @scala.inline
  def int8: typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.int8 = this.cast("int8")
  @scala.inline
  def uint16: typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint16 = this.cast("uint16")
  @scala.inline
  def uint32: typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint32 = this.cast("uint32")
  @scala.inline
  def uint8: typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8 = this.cast("uint8")
  @scala.inline
  def uint8_clamped: typings.distributionsPoissonQuantile.distributionsPoissonQuantileStrings.uint8_clamped = this.cast("uint8_clamped")
}

