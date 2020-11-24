package typings.easyJsend.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  def error(err: js.Any): Unit = js.native
  def error(err: js.Any, status: Double): Unit = js.native
  
  def fail(data: js.Any): Unit = js.native
  def fail(data: js.Any, status: Double): Unit = js.native
  
  var makePartial: js.UndefOr[js.Function1[/* data */ MakePartialInput, Unit]] = js.native
  
  var partial: js.UndefOr[js.Function2[/* data */ PartialInput, /* status */ js.UndefOr[Double], Unit]] = js.native
  
  def success(): Unit = js.native
  def success(data: js.UndefOr[scala.Nothing], status: Double): Unit = js.native
  def success(data: js.Any): Unit = js.native
  def success(data: js.Any, status: Double): Unit = js.native
}
