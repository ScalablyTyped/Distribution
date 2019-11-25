package typings.dotenvDashFlow.dotenvDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvConfigOptions extends js.Object {
  /**
    * Default node environment to use if `process.env.NODE_ENV` is not present.
    */
  var default_node_env: js.UndefOr[String] = js.undefined
  /**
    * Encoding for reading the `.env*` files.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * Node environment (development/test/production/etc,.).
    */
  var node_env: js.UndefOr[String] = js.undefined
  /**
    * Path to `.env*` files directory.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * In some cases the original "dotenv" library can be used by one of the dependent npm modules.
    * It causes calling the original `dotenv.config()` that loads the `.env` file from your project before you can call `dotenv-flow.config()`.
    *
    * Such cases breaks `.env*` files priority because the previously loaded environment variables are treated as shell-defined thus having the higher priority.
    *
    * Setting the `purge_dotenv` option to `true` can gracefully fix this issue.
    */
  var purge_dotenv: js.UndefOr[Boolean] = js.undefined
}

object DotenvConfigOptions {
  @scala.inline
  def apply(
    default_node_env: String = null,
    encoding: String = null,
    node_env: String = null,
    path: String = null,
    purge_dotenv: js.UndefOr[Boolean] = js.undefined
  ): DotenvConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (default_node_env != null) __obj.updateDynamic("default_node_env")(default_node_env.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (node_env != null) __obj.updateDynamic("node_env")(node_env.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(purge_dotenv)) __obj.updateDynamic("purge_dotenv")(purge_dotenv.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotenvConfigOptions]
  }
}

