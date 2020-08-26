package typings.dotenvWebpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Whether to allow empty strings in safe mode.
    * If false, will throw an error if any env variables are empty (but only if safe mode is enabled).
    * @default false
    */
  var allowEmptyValues: js.UndefOr[Boolean] = js.native
  /**
    * Adds support for dotenv-defaults. If set to `true`, uses `./.env.defaults`. If a `string`, uses that location for a defaults file.
    * Read more at https://www.npmjs.com/package/dotenv-defaults. Default: `false`.
    */
  var defaults: js.UndefOr[Boolean | String] = js.native
  /**
    * Allows your variables to be "expanded" for reusability within your .env file. Default: `false`.
    */
  var expand: js.UndefOr[Boolean] = js.native
  /**
    * The path to your environment variables. Default: `'./.env'`.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * If `false` ignore safe-mode, if `true` load `'./.env.example'`, if a `string` load that file as the sample. Default: `false`.
    */
  var safe: js.UndefOr[Boolean | String] = js.native
  /**
    * If `true`, all warnings will be surpressed. Default: `false`.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Set to `true` if you would rather load all system variables as well (useful for CI purposes). Default: `false`.
    */
  var systemvars: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowEmptyValues(value: Boolean): Self = this.set("allowEmptyValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmptyValues: Self = this.set("allowEmptyValues", js.undefined)
    @scala.inline
    def setDefaults(value: Boolean | String): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSafe(value: Boolean | String): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setSystemvars(value: Boolean): Self = this.set("systemvars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemvars: Self = this.set("systemvars", js.undefined)
  }
  
}

