package typings.eggCookies.mod

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
  def get(name: String): String = js.native
  def get(name: String, opts: CookieGetOptions): String = js.native
  /**
    * Set the Egg's cookies by name with optional options.
    * @param name The Egg cookie's unique name.
    * @param value Optional. The Egg cookie's real value.
    * @param opts Optional. The options for cookie's setting.
    * @returns The current 'EggCookie' instance.
    */
  def set(name: String): this.type = js.native
  def set(name: String, value: String): this.type = js.native
  def set(name: String, value: String, opts: CookieSetOptions): this.type = js.native
}

