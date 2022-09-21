package typings.findYarnWorkspaceRoot2

import typings.findYarnWorkspaceRoot2.anon.Workspaces
import typings.findYarnWorkspaceRoot2.anon.`0`
import typings.findYarnWorkspaceRoot2.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(initial: String): String = ^.asInstanceOf[js.Dynamic].apply(initial.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("find-yarn-workspace-root2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("find-yarn-workspace-root2", "_a")
  @js.native
  def a: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof imported_core.findWorkspaceRoot */ Any = js.native
  
  inline def a_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof imported_core.findWorkspaceRoot */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_a")(x.asInstanceOf[js.Any])
  
  inline def extractWorkspaces[T /* <: js.Array[String] */](manifest: `0`[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extractWorkspaces")(manifest.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def extractWorkspaces[T /* <: js.Array[String] */](manifest: `1`[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extractWorkspaces")(manifest.asInstanceOf[js.Any]).asInstanceOf[T]
  
  object findWorkspaceRoot {
    
    inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
    inline def apply(initial: String): String = ^.asInstanceOf[js.Dynamic].apply(initial.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("find-yarn-workspace-root2", "findWorkspaceRoot")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("find-yarn-workspace-root2", "findWorkspaceRoot._a")
    @js.native
    def a: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.findWorkspaceRoot */ js.Any = js.native
    
    inline def a_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.findWorkspaceRoot */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_a")(x.asInstanceOf[js.Any])
    
    @JSImport("find-yarn-workspace-root2", "findWorkspaceRoot.extractWorkspaces")
    @js.native
    def extractWorkspaces: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.extractWorkspaces */ js.Any = js.native
    inline def extractWorkspaces_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.extractWorkspaces */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extractWorkspaces")(x.asInstanceOf[js.Any])
    
    @JSImport("find-yarn-workspace-root2", "findWorkspaceRoot.findWorkspaceRoot")
    @js.native
    def findWorkspaceRoot: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.findWorkspaceRoot */ js.Any = js.native
    inline def findWorkspaceRoot_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.findWorkspaceRoot */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findWorkspaceRoot")(x.asInstanceOf[js.Any])
    
    @JSImport("find-yarn-workspace-root2", "findWorkspaceRoot.isMatchWorkspaces")
    @js.native
    def isMatchWorkspaces: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.isMatchWorkspaces */ js.Any = js.native
    inline def isMatchWorkspaces_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.isMatchWorkspaces */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMatchWorkspaces")(x.asInstanceOf[js.Any])
    
    @JSImport("find-yarn-workspace-root2", "findWorkspaceRoot.readPackageJSON")
    @js.native
    def readPackageJSON: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.readPackageJSON */ js.Any = js.native
    inline def readPackageJSON_=(
      x: /* import warning: importer.ImportType#apply Failed type conversion: typeof imported_core.readPackageJSON */ js.Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readPackageJSON")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("find-yarn-workspace-root2", "isMatchWorkspaces")
  @js.native
  def isMatchWorkspaces: js.Function2[/* relativePath */ String, /* workspaces */ js.Array[String], Boolean] = js.native
  inline def isMatchWorkspaces_=(x: js.Function2[/* relativePath */ String, /* workspaces */ js.Array[String], Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMatchWorkspaces")(x.asInstanceOf[js.Any])
  
  inline def readPackageJSON[T /* <: Workspaces */](dir: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("readPackageJSON")(dir.asInstanceOf[js.Any]).asInstanceOf[T]
}
