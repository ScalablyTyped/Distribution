package typings.fastGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(source: js.Array[typings.fastGlob.typesMod.Pattern]): js.Promise[js.Array[String]] = js.native
  def apply(
    source: js.Array[typings.fastGlob.typesMod.Pattern],
    options: (typings.fastGlob.settingsMod.Options with EntryObjectPredicate) | typings.fastGlob.settingsMod.Options
  ): js.Promise[js.Array[typings.fastGlob.typesMod.Entry]] = js.native
  def apply(source: typings.fastGlob.typesMod.Pattern): js.Promise[js.Array[String]] = js.native
  def apply(
    source: typings.fastGlob.typesMod.Pattern,
    options: (typings.fastGlob.settingsMod.Options with EntryObjectPredicate) | typings.fastGlob.settingsMod.Options
  ): js.Promise[js.Array[typings.fastGlob.typesMod.Entry]] = js.native
}

