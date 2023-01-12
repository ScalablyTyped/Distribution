package typings.getChangelogLib

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-changelog-lib", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ChangelogFinder {
    def this(configuration: Configuration) = this()
    def this(configuration: Unit, cache: Cache) = this()
    def this(configuration: Configuration, cache: Cache) = this()
  }
  
  type Cache = StringDictionary[String]
  
  @js.native
  trait ChangelogFinder extends StObject {
    
    /** get npm package changelog */
    def getChangelog(moduleName: String): js.Promise[String] = js.native
    def getChangelog(moduleName: String, moduleVersion: String): js.Promise[String] = js.native
  }
  
  trait Configuration extends StObject {
    
    /** explore additional branches (only master by default) */
    var branches: js.UndefOr[js.Array[String]] = js.undefined
    
    /** mapping between custom repositories identifier and source path */
    var customRepositories: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** explore files with txt extension */
    var exploreTxtFiles: js.UndefOr[Boolean] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      inline def setBranches(value: js.Array[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      inline def setBranchesVarargs(value: String*): Self = StObject.set(x, "branches", js.Array(value*))
      
      inline def setCustomRepositories(value: StringDictionary[String]): Self = StObject.set(x, "customRepositories", value.asInstanceOf[js.Any])
      
      inline def setCustomRepositoriesUndefined: Self = StObject.set(x, "customRepositories", js.undefined)
      
      inline def setExploreTxtFiles(value: Boolean): Self = StObject.set(x, "exploreTxtFiles", value.asInstanceOf[js.Any])
      
      inline def setExploreTxtFilesUndefined: Self = StObject.set(x, "exploreTxtFiles", js.undefined)
    }
  }
}
