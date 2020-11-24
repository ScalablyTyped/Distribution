package typings.fixturifyProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fixturify-project", JSImport.Namespace)
@js.native
class ^ protected () extends Project {
  def this(name: String) = this()
  def this(name: String, version: String) = this()
  def this(name: String, version: js.UndefOr[scala.Nothing], cb: js.Function1[/* project */ Project, Unit]) = this()
  def this(name: String, version: String, cb: js.Function1[/* project */ Project, Unit]) = this()
  def this(name: String, version: js.UndefOr[scala.Nothing], cb: js.UndefOr[scala.Nothing], root: String) = this()
  def this(
    name: String,
    version: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* project */ Project, Unit],
    root: String
  ) = this()
  def this(name: String, version: String, cb: js.UndefOr[scala.Nothing], root: String) = this()
  def this(name: String, version: String, cb: js.Function1[/* project */ Project, Unit], root: String) = this()
}
@JSImport("fixturify-project", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def fromDir(root: String): Project = js.native
  def fromDir(root: String, name: String): Project = js.native
  
  def fromJSON(json: DirJSON, name: String): Project = js.native
}
