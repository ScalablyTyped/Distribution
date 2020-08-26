package typings.eslint.mod.Linter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/eslint/eslint/blob/v6.8.0/conf/config-schema.js
@js.native
trait Config extends BaseConfig {
  var ignorePatterns: js.UndefOr[String | js.Array[String]] = js.native
  var root: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setIgnorePatternsVarargs(value: String*): Self = this.set("ignorePatterns", js.Array(value :_*))
    @scala.inline
    def setIgnorePatterns(value: String | js.Array[String]): Self = this.set("ignorePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePatterns: Self = this.set("ignorePatterns", js.undefined)
    @scala.inline
    def setRoot(value: Boolean): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

