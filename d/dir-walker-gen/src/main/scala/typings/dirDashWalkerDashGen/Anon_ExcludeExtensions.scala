package typings.dirDashWalkerDashGen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeExtensions extends js.Object {
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

object Anon_ExcludeExtensions {
  @scala.inline
  def apply(
    folders: js.Array[String],
    excludeExtensions: js.Array[String] = null,
    excludeFolders: js.Array[String] = null,
    ignoreDotDir: js.UndefOr[Boolean] = js.undefined,
    includeExtensions: js.Array[String] = null,
    silent: js.UndefOr[Boolean] = js.undefined
  ): Anon_ExcludeExtensions = {
    val __obj = js.Dynamic.literal(folders = folders)
    if (excludeExtensions != null) __obj.updateDynamic("excludeExtensions")(excludeExtensions)
    if (excludeFolders != null) __obj.updateDynamic("excludeFolders")(excludeFolders)
    if (!js.isUndefined(ignoreDotDir)) __obj.updateDynamic("ignoreDotDir")(ignoreDotDir)
    if (includeExtensions != null) __obj.updateDynamic("includeExtensions")(includeExtensions)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Anon_ExcludeExtensions]
  }
}

