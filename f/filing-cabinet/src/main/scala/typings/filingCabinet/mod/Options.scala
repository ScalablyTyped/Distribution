package typings.filingCabinet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * the parsed AST for filename
    * Useful optimization for avoiding a parse of filename
    */
  var ast: js.UndefOr[js.Any] = js.native
  /**
    * `requirejs` config for resolving aliased JavaScript modules
    */
  var config: js.UndefOr[js.Any] = js.native
  /** the path to all files */
  var directory: String = js.native
  /** the path to the file containing the partial */
  var filename: String = js.native
  /**
    * For typescript files, whether to prefer *.js over *.d.ts
    */
  var noTypeDefinitions: js.UndefOr[Boolean] = js.native
  /**
    * config for resolving entry file for `node_modules`.
    * This value overrides the main attribute in the `package.json` file;
    * used in conjunction with the `packageFilter` of the resolve package
    */
  var nodeModulesConfig: js.UndefOr[js.Any] = js.native
  /** the dependency path */
  var partial: String = js.native
  /**
    * Path to a typescript configuration.
    * Could also be an object representing a pre-parsed typescript config
    */
  var tsConfig: js.UndefOr[String | js.Object] = js.native
  /**
    * `webpack` config for resolving aliased JavaScript modules
    */
  var webpackConfig: js.UndefOr[js.Any] = js.native
}

object Options {
  @scala.inline
  def apply(directory: String, filename: String, partial: String): Options = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
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
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartial(value: String): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def setAst(value: js.Any): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setNoTypeDefinitions(value: Boolean): Self = this.set("noTypeDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoTypeDefinitions: Self = this.set("noTypeDefinitions", js.undefined)
    @scala.inline
    def setNodeModulesConfig(value: js.Any): Self = this.set("nodeModulesConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeModulesConfig: Self = this.set("nodeModulesConfig", js.undefined)
    @scala.inline
    def setTsConfig(value: String | js.Object): Self = this.set("tsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsConfig: Self = this.set("tsConfig", js.undefined)
    @scala.inline
    def setWebpackConfig(value: js.Any): Self = this.set("webpackConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebpackConfig: Self = this.set("webpackConfig", js.undefined)
  }
  
}

