package typings.fixturifyProject.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Project extends js.Object {
  
  var _dependencies: js.Any = js.native
  
  var _devDependencies: js.Any = js.native
  
  var _root: js.Any = js.native
  
  var _tmp: js.Any = js.native
  
  def addDependency(name: String): Project = js.native
  def addDependency(name: String, version: js.UndefOr[scala.Nothing], cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
  def addDependency(name: String, version: String): Project = js.native
  def addDependency(name: String, version: String, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
  def addDependency(name: Project): Project = js.native
  def addDependency(name: Project, version: js.UndefOr[scala.Nothing], cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
  def addDependency(name: Project, version: String): Project = js.native
  def addDependency(name: Project, version: String, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
  
  def addDevDependency(name: String): Project = js.native
  def addDevDependency(name: String, version: js.UndefOr[scala.Nothing], cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
  def addDevDependency(name: String, version: String): Project = js.native
  def addDevDependency(name: String, version: String, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
  def addDevDependency(name: Project): Project = js.native
  def addDevDependency(name: Project, version: js.UndefOr[scala.Nothing], cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
  def addDevDependency(name: Project, version: String): Project = js.native
  def addDevDependency(name: Project, version: String, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
  
  val baseDir: String = js.native
  
  def dependencies(): js.Array[Project] = js.native
  
  def devDependencies(): js.Array[Project] = js.native
  
  def dispose(): Unit = js.native
  
  var files: DirJSON = js.native
  
  val isDependency: /* true */ Boolean = js.native
  
  var name: String = js.native
  
  var pkg: js.Any = js.native
  
  def readSync(): Unit = js.native
  def readSync(root: String): Unit = js.native
  
  def removeDependency(name: String): Unit = js.native
  
  def removeDevDependency(name: String): Unit = js.native
  
  val root: String = js.native
  
  def toJSON(): DirJSON = js.native
  def toJSON(key: String): DirJSON | String = js.native
  
  def validate(): Unit = js.native
  
  var version: String = js.native
  
  def writeSync(): Unit = js.native
  def writeSync(root: String): Unit = js.native
}
