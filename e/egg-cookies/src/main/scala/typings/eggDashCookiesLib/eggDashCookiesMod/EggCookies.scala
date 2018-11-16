package typings
package eggDashCookiesLib.eggDashCookiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EggCookies extends js.Object {
  /**
     * Get the Egg's cookies by name with optional options.
     * @param name The Egg's cookie's unique name.
     * @param opts Optional. The options for cookie's getting.
     * @returns The cookie's value according to the specific name.
     */
  def get(name: java.lang.String): java.lang.String = js.native
  /**
     * Get the Egg's cookies by name with optional options.
     * @param name The Egg's cookie's unique name.
     * @param opts Optional. The options for cookie's getting.
     * @returns The cookie's value according to the specific name.
     */
  def get(name: java.lang.String, opts: eggDashCookiesLib.eggDashCookiesMod.EggCookiesNs.CookieGetOptions): java.lang.String = js.native
  /**
     * Set the Egg's cookies by name with optional options.
     * @param name The Egg cookie's unique name.
     * @param value Optional. The Egg cookie's real value.
     * @param opts Optional. The options for cookie's setting.
     * @returns The current 'EggCookie' instance.
     */
  def set(name: java.lang.String): this.type = js.native
  /**
     * Set the Egg's cookies by name with optional options.
     * @param name The Egg cookie's unique name.
     * @param value Optional. The Egg cookie's real value.
     * @param opts Optional. The options for cookie's setting.
     * @returns The current 'EggCookie' instance.
     */
  def set(name: java.lang.String, value: java.lang.String): this.type = js.native
  /**
     * Set the Egg's cookies by name with optional options.
     * @param name The Egg cookie's unique name.
     * @param value Optional. The Egg cookie's real value.
     * @param opts Optional. The options for cookie's setting.
     * @returns The current 'EggCookie' instance.
     */
  def set(
    name: java.lang.String,
    value: java.lang.String,
    opts: eggDashCookiesLib.eggDashCookiesMod.EggCookiesNs.CookieSetOptions
  ): this.type = js.native
}

