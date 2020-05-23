package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitana", "Release")
@js.native
class Release protected () extends AbstractRepositoryObject {
  def this(repository: js.Any, `object`: js.Any) = this()
  def archive(callback: js.Any): js.Any = js.native
  def finalize(`object`: js.Any, callback: js.Any): js.Any = js.native
  def loadInfo(callback: js.Any): js.Any = js.native
  def releaseImmediately(callback: js.Any): js.Any = js.native
  def startFinalize(`object`: js.Any, callback: js.Any): js.Any = js.native
  def unarchive(callback: js.Any): js.Any = js.native
  def unfinalize(callback: js.Any): js.Any = js.native
}

/* static members */
@JSImport("gitana", "Release")
@js.native
object Release extends js.Object {
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  def implement(args: js.Any*): js.Any = js.native
  def valueOf(`type`: js.Any): js.Any = js.native
}

