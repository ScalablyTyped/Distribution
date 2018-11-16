package typings
package easyDashJsendLib.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var makePartial: js.UndefOr[js.Function1[/* data */ MakePartialInput, scala.Unit]] = js.native
  var partial: js.UndefOr[
    js.Function2[/* data */ PartialInput, /* status */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.native
  def error(err: js.Any): scala.Unit = js.native
  def error(err: js.Any, status: scala.Double): scala.Unit = js.native
  def fail(data: js.Any): scala.Unit = js.native
  def fail(data: js.Any, status: scala.Double): scala.Unit = js.native
  def success(): scala.Unit = js.native
  def success(data: js.Any): scala.Unit = js.native
  def success(data: js.Any, status: scala.Double): scala.Unit = js.native
}

