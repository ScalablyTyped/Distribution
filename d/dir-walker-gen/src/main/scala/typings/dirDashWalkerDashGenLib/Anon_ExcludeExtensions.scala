package typings
package dirDashWalkerDashGenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludeExtensions extends js.Object {
  /**
    * List of extensions to ignore
    * @default []
    */
  var excludeExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Exclude all folder that ends with any of the given strings
    * @default []
    */
  var excludeFolders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * (Required) List of starting folders
    */
  var folders: js.Array[java.lang.String]
  /**
    * Ignores directories that start with a dot (e.g. .git, .vscode, etc)
    * @default {false}
    */
  var ignoreDotDir: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of extensions to scan (all other extensions are ignored)
    * @default []
    */
  var includeExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Does not show console warning when directories do not exist
    * @default {false}
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ExcludeExtensions {
  @scala.inline
  def apply(
    folders: js.Array[java.lang.String],
    excludeExtensions: js.Array[java.lang.String] = null,
    excludeFolders: js.Array[java.lang.String] = null,
    ignoreDotDir: js.UndefOr[scala.Boolean] = js.undefined,
    includeExtensions: js.Array[java.lang.String] = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
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

