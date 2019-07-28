package typings.expired.expiredMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait expired extends js.Object {
  /**
    * @returns A boolean relating to whether the resource has expired or not.
    * `true` means it's expired, `false` means it's fresh.
    */
  def apply(headers: Headers): Boolean = js.native
  def apply(headers: Headers, compareWith: Date): Boolean = js.native
  /**
    * @returns The amount of milliseconds from the current date until the resource will expire.
    * If the resource has already expired it will return a negative integer.
    */
  def in(headers: Headers): Double = js.native
  def in(headers: Headers, compareWith: Date): Double = js.native
  /**
    * @returns A JavaScript `Date` object for the date the resource will expire.
    */
  def on(headers: Headers): Date = js.native
}

