package typings.glob.globMod

import org.scalablytyped.runtime.StringDictionary
import typings.glob.Anon_IsDirectory
import typings.glob.globNumbers.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import typings.minimatch.minimatchMod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobBase extends js.Object {
  var aborted: Boolean
  var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]]
  var found: js.Array[String]
  var minimatch: IMinimatch
  var options: IOptions
  var realpathCache: StringDictionary[String]
  var statCache: StringDictionary[js.UndefOr[`false` | Anon_IsDirectory]]
  var symlinks: StringDictionary[js.UndefOr[Boolean]]
}

object IGlobBase {
  @scala.inline
  def apply(
    aborted: Boolean,
    cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]],
    found: js.Array[String],
    minimatch: IMinimatch,
    options: IOptions,
    realpathCache: StringDictionary[String],
    statCache: StringDictionary[js.UndefOr[`false` | Anon_IsDirectory]],
    symlinks: StringDictionary[js.UndefOr[Boolean]]
  ): IGlobBase = {
    val __obj = js.Dynamic.literal(aborted = aborted, cache = cache, found = found, minimatch = minimatch, options = options, realpathCache = realpathCache, statCache = statCache, symlinks = symlinks)
  
    __obj.asInstanceOf[IGlobBase]
  }
}

