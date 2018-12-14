package typings
package globLib.globMod.GNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOptions
  extends minimatchLib.minimatchMod.MNs.IOptions {
  var absolute: js.UndefOr[scala.Boolean] = js.undefined
  var cache: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      scala.Boolean | globLib.globLibStrings.DIR | globLib.globLibStrings.FILE | js.Array[java.lang.String]
    ]
  ] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var follow: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var mark: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("matchBase")
  var matchBase_IOptions: js.UndefOr[js.Any] = js.undefined
  var nodir: js.UndefOr[scala.Boolean] = js.undefined
  var nomount: js.UndefOr[scala.Boolean] = js.undefined
  var nosort: js.UndefOr[scala.Boolean] = js.undefined
  var nounique: js.UndefOr[scala.Boolean] = js.undefined
  var realpath: js.UndefOr[scala.Boolean] = js.undefined
  var realpathCache: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var stat: js.UndefOr[scala.Boolean] = js.undefined
  var statCache: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.UndefOr[globLib.globLibNumbers.`false` | globLib.Anon_IsDirectory]]
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var symlinks: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Boolean]]] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

