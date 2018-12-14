package typings
package globLib.globMod.GNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGlobBase extends js.Object {
  var aborted: scala.Boolean
  var cache: org.scalablytyped.runtime.StringDictionary[
    scala.Boolean | globLib.globLibStrings.DIR | globLib.globLibStrings.FILE | js.Array[java.lang.String]
  ]
  var found: js.Array[java.lang.String]
  var minimatch: minimatchLib.minimatchMod.MNs.IMinimatch
  var options: IOptions
  var realpathCache: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var statCache: org.scalablytyped.runtime.StringDictionary[js.UndefOr[globLib.globLibNumbers.`false` | globLib.Anon_IsDirectory]]
  var symlinks: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean]]
}

