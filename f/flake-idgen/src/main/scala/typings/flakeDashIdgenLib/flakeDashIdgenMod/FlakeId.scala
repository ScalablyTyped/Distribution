package typings
package flakeDashIdgenLib.flakeDashIdgenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlakeId extends js.Object {
  def next(): nodeLib.Buffer = js.native
  def next(callback: js.Function2[/* err */ nodeLib.Error, /* id */ nodeLib.Buffer, scala.Unit]): nodeLib.Buffer = js.native
}

