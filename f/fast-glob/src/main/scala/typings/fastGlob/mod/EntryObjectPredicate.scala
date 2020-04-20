package typings.fastGlob.mod

import typings.fastGlob.fastGlobBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fastGlob.mod.EntryObjectModePredicate
  - typings.fastGlob.mod.EntryStatsPredicate
*/
trait EntryObjectPredicate extends js.Object

object EntryObjectPredicate {
  @scala.inline
  def EntryObjectModePredicate(objectMode: `true`): EntryObjectPredicate = {
    val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryObjectPredicate]
  }
  @scala.inline
  def EntryStatsPredicate(stats: `true`): EntryObjectPredicate = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryObjectPredicate]
  }
}

