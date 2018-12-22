package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JumpListCategory extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/jump-list-category
  /**
       * Array of objects if type is tasks or custom, otherwise it should be omitted.
       */
  var items: js.UndefOr[js.Array[JumpListItem]] = js.undefined
  /**
       * Must be set if type is custom, otherwise it should be omitted.
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
       * One of the following:
       */
  var `type`: js.UndefOr[
    electronLib.electronLibStrings.tasks | electronLib.electronLibStrings.frequent | electronLib.electronLibStrings.recent | electronLib.electronLibStrings.custom
  ] = js.undefined
}

