package typings.fixturifyProject

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fixturify-project", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Project {
    def this(name: String) = this()
    def this(name: String, version: String) = this()
    def this(name: String, version: String, cb: js.Function1[/* project */ Project, Unit]) = this()
    def this(name: String, version: Unit, cb: js.Function1[/* project */ Project, Unit]) = this()
    def this(name: String, version: String, cb: js.Function1[/* project */ Project, Unit], root: String) = this()
    def this(name: String, version: String, cb: Unit, root: String) = this()
    def this(name: String, version: Unit, cb: js.Function1[/* project */ Project, Unit], root: String) = this()
    def this(name: String, version: Unit, cb: Unit, root: String) = this()
  }
  @JSImport("fixturify-project", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromDir(root: String): Project = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDir")(root.asInstanceOf[js.Any]).asInstanceOf[Project]
  @scala.inline
  def fromDir(root: String, name: String): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDir")(root.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Project]
  
  /* static member */
  @scala.inline
  def fromJSON(json: DirJSON, name: String): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Project]
  
  trait DirJSON
    extends StObject
       with /* filename */ StringDictionary[DirJSON | String]
  object DirJSON {
    
    @scala.inline
    def apply(): DirJSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirJSON]
    }
  }
  
  @js.native
  trait Project extends StObject {
    
    var _dependencies: js.Any = js.native
    
    var _devDependencies: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _tmp: js.Any = js.native
    
    def addDependency(name: String): Project = js.native
    def addDependency(name: String, version: String): Project = js.native
    def addDependency(name: String, version: String, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
    def addDependency(name: String, version: Unit, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
    def addDependency(name: Project): Project = js.native
    def addDependency(name: Project, version: String): Project = js.native
    def addDependency(name: Project, version: String, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
    def addDependency(name: Project, version: Unit, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
    
    def addDevDependency(name: String): Project = js.native
    def addDevDependency(name: String, version: String): Project = js.native
    def addDevDependency(name: String, version: String, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
    def addDevDependency(name: String, version: Unit, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
    def addDevDependency(name: Project): Project = js.native
    def addDevDependency(name: Project, version: String): Project = js.native
    def addDevDependency(name: Project, version: String, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
    def addDevDependency(name: Project, version: Unit, cb: js.Function1[/* project */ this.type, Unit]): Project = js.native
    
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
}
