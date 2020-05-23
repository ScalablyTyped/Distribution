package typings.dirWalkerGen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludeExtensions extends js.Object {
  /**
    * List of extensions to ignore
    * @default []
    */
  var excludeExtensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Exclude all folder that ends with any of the given strings
    * @default []
    */
  var excludeFolders: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Required) List of starting folders
    */
  var folders: js.Array[String]
  /**
    * Ignores directories that start with a dot (e.g. .git, .vscode, etc)
    * @default {false}
    */
  var ignoreDotDir: js.UndefOr[Boolean] = js.undefined
  /**
    * List of extensions to scan (all other extensions are ignored)
    * @default []
    */
  var includeExtensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Does not show console warning when directories do not exist
    * @default {false}
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}

object ExcludeExtensions {
  @scala.inline
  def apply(
    folders: js.Array[String],
    excludeExtensions: js.Array[String] = null,
    excludeFolders: js.Array[String] = null,
    ignoreDotDir: js.UndefOr[Boolean] = js.undefined,
    includeExtensions: js.Array[String] = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): ExcludeExtensions = {
    val __obj = js.Dynamic.literal(folders = folders.asInstanceOf[js.Any])
    if (excludeExtensions != null) __obj.updateDynamic("excludeExtensions")(excludeExtensions.asInstanceOf[js.Any])
    if (excludeFolders != null) __obj.updateDynamic("excludeFolders")(excludeFolders.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDotDir)) __obj.updateDynamic("ignoreDotDir")(ignoreDotDir.get.asInstanceOf[js.Any])
    if (includeExtensions != null) __obj.updateDynamic("includeExtensions")(includeExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeExtensions]
  }
}

