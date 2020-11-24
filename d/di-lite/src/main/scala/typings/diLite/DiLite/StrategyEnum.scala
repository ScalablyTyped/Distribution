package typings.diLite.DiLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyEnum extends js.Object {
  
  def proto[TObject, TType](
    name: String,
    `object`: TObject,
    `type`: TType,
    args: js.Any,
    ctx: CreateContext,
    dependencies: js.Any
  ): TObject = js.native
  
  def singleton[TObject, TType](name: String, `object`: TObject, `type`: TType, args: js.Any): TObject = js.native
  def singleton[TObject, TType](
    name: String,
    `object`: TObject,
    `type`: TType,
    args: js.Any,
    ctx: js.UndefOr[scala.Nothing],
    dependencies: js.Any
  ): TObject = js.native
  def singleton[TObject, TType](name: String, `object`: TObject, `type`: TType, args: js.Any, ctx: CreateContext): TObject = js.native
  def singleton[TObject, TType](
    name: String,
    `object`: TObject,
    `type`: TType,
    args: js.Any,
    ctx: CreateContext,
    dependencies: js.Any
  ): TObject = js.native
}
