package typings
package expiredLib.expiredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait expired extends js.Object {
  /**
    * @returns A boolean relating to whether the resource has expired or not.
    * `true` means it's expired, `false` means it's fresh.
    */
  def apply(headers: expiredLib.expiredMod.expiredNs.Headers): scala.Boolean = js.native
  def apply(headers: expiredLib.expiredMod.expiredNs.Headers, compareWith: stdLib.Date): scala.Boolean = js.native
  /**
    * @returns The amount of milliseconds from the current date until the resource will expire.
    * If the resource has already expired it will return a negative integer.
    */
  def in(headers: expiredLib.expiredMod.expiredNs.Headers): scala.Double = js.native
  def in(headers: expiredLib.expiredMod.expiredNs.Headers, compareWith: stdLib.Date): scala.Double = js.native
  /**
    * @returns A JavaScript `Date` object for the date the resource will expire.
    */
  def on(headers: expiredLib.expiredMod.expiredNs.Headers): stdLib.Date = js.native
}

