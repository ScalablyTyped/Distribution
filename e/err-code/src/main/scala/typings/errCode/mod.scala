package typings.errCode

import typings.errCode.anon.Code
import typings.errCode.anon.CodeNonNullable
import typings.errCode.anon.`0`
import typings.errCode.anon.`1`
import typings.errCode.anon.`2`
import typings.errCode.anon.`3`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err): Err & Props = ^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any]).asInstanceOf[Err & Props]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: String): Err & Props & CodeNonNullable = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Err & Props & CodeNonNullable]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: String, props: Props): Err & Props & CodeNonNullable = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Err & Props & CodeNonNullable]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: js.BigInt): Err & Props & `1` = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Err & Props & `1`]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: js.BigInt, props: Props): Err & Props & `1` = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Err & Props & `1`]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Boolean): Err & Props & `0` = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Err & Props & `0`]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Boolean, props: Props): Err & Props & `0` = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Err & Props & `0`]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Double): Err & Props & Code = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Err & Props & Code]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Double, props: Props): Err & Props & Code = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Err & Props & Code]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Null, props: Props): Err & Props & `2` = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Err & Props & `2`]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, code: Unit, props: Props): Err & Props & `3` = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], code.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Err & Props & `3`]
  @scala.inline
  def apply[Props /* <: js.Object */, Err /* <: Error */](error: Err, props: Props): Err & Props = (^.asInstanceOf[js.Dynamic].apply(error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Err & Props]
  
  @JSImport("err-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Scalar = js.UndefOr[Double | String | Boolean | js.BigInt | Null]
}
