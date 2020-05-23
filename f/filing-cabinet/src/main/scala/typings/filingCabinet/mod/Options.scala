package typings.filingCabinet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * the parsed AST for filename
    * Useful optimization for avoiding a parse of filename
    */
  var ast: js.UndefOr[js.Any] = js.undefined
  /**
    * `requirejs` config for resolving aliased JavaScript modules
    */
  var config: js.UndefOr[js.Any] = js.undefined
  /** the path to all files */
  var directory: String
  /** the path to the file containing the partial */
  var filename: String
  /**
    * For typescript files, whether to prefer *.js over *.d.ts
    */
  var noTypeDefinitions: js.UndefOr[Boolean] = js.undefined
  /**
    * config for resolving entry file for `node_modules`.
    * This value overrides the main attribute in the `package.json` file;
    * used in conjunction with the `packageFilter` of the resolve package
    */
  var nodeModulesConfig: js.UndefOr[js.Any] = js.undefined
  /** the dependency path */
  var partial: String
  /**
    * Path to a typescript configuration.
    * Could also be an object representing a pre-parsed typescript config
    */
  var tsConfig: js.UndefOr[String | js.Object] = js.undefined
  /**
    * `webpack` config for resolving aliased JavaScript modules
    */
  var webpackConfig: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    directory: String,
    filename: String,
    partial: String,
    ast: js.Any = null,
    config: js.Any = null,
    noTypeDefinitions: js.UndefOr[Boolean] = js.undefined,
    nodeModulesConfig: js.Any = null,
    tsConfig: String | js.Object = null,
    webpackConfig: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(noTypeDefinitions)) __obj.updateDynamic("noTypeDefinitions")(noTypeDefinitions.get.asInstanceOf[js.Any])
    if (nodeModulesConfig != null) __obj.updateDynamic("nodeModulesConfig")(nodeModulesConfig.asInstanceOf[js.Any])
    if (tsConfig != null) __obj.updateDynamic("tsConfig")(tsConfig.asInstanceOf[js.Any])
    if (webpackConfig != null) __obj.updateDynamic("webpackConfig")(webpackConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

