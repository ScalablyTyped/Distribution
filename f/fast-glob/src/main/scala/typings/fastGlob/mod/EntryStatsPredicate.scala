package typings.fastGlob.mod

import typings.fastGlob.fastGlobBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ TKey in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'stats'> ]: -? true} */
trait EntryStatsPredicate extends EntryObjectPredicate {
  var stats: `true`
}

object EntryStatsPredicate {
  @scala.inline
  def apply(stats: `true`): EntryStatsPredicate = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntryStatsPredicate]
  }
}

