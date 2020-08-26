package typings.fastGlob.mod

import typings.fastGlob.fastGlobBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ TKey in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'stats'> ]: -? true} */
@js.native
trait EntryStatsPredicate extends EntryObjectPredicate {
  var stats: `true` = js.native
}

object EntryStatsPredicate {
  @scala.inline
  def apply(stats: `true`): EntryStatsPredicate = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryStatsPredicate]
  }
  @scala.inline
  implicit class EntryStatsPredicateOps[Self <: EntryStatsPredicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStats(value: `true`): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
  
}

