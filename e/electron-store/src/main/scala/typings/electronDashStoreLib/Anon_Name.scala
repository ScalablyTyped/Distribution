package typings
package electronDashStoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  /**
  		Name of the storage file (without extension).
  		This is useful if you want multiple storage files for your app. Or if you're making a reusable Electron module that persists some data, in which case you should **not** use the name `config`.
  		@default 'config'
  		*/
  val name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String = null): Anon_Name = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}

