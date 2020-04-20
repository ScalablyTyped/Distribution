package typings.fastGlob.mod

import typings.fastGlob.fastGlobBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ TKey in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'objectMode'> ]: -? true} */
trait EntryObjectModePredicate extends EntryObjectPredicate {
  var objectMode: `true`
}

object EntryObjectModePredicate {
  @scala.inline
  def apply(objectMode: `true`): EntryObjectModePredicate = {
    val __obj = js.Dynamic.literal(objectMode = objectMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryObjectModePredicate]
  }
}

