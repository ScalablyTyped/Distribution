package typings.errCode

import typings.errCode.anon.Code
import typings.errCode.anon.CodeNonNullable
import typings.errCode.anon.`0`
import typings.errCode.anon.`1`
import typings.errCode.anon.`2`
import typings.errCode.anon.`3`
import typings.std.BigInt
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("err-code", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err): Err with Props = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: js.UndefOr[scala.Nothing], props: Props): Err with Props with `3` = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: String): Err with Props with CodeNonNullable = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: String, props: Props): Err with Props with CodeNonNullable = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Boolean): Err with Props with `0` = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Boolean, props: Props): Err with Props with `0` = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Double): Err with Props with Code = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Double, props: Props): Err with Props with Code = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Null, props: Props): Err with Props with `2` = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: BigInt): Err with Props with `1` = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: BigInt, props: Props): Err with Props with `1` = js.native
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, props: Props): Err with Props = js.native
  type Scalar = js.UndefOr[Double | String | Boolean | BigInt | Null]
}

