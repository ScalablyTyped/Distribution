package typings.embroiderMacros

import typings.babelTraverse.mod.NodePath
import typings.babelTypes.mod.Node
import typings.babelTypes.mod.Program_
import typings.embroiderMacros.anon.AppPackageRoot
import typings.embroiderMacros.anon.Typeoftypes
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBabelStateMod {
  
  @JSImport("@embroider/macros/src/babel/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initState(t: Typeoftypes, path: NodePath[Program_], state: State): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initState")(t.asInstanceOf[js.Any], path.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait State extends StObject {
    
    var calledIdentifiers: Set[Node]
    
    def cloneDeep(node: Node): Node
    
    var generatedRequires: Set[Node]
    
    var importUtil: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImportUtil */ Any
    
    var jobs: js.Array[js.Function0[Unit]]
    
    var opts: AppPackageRoot
    
    def owningPackage(): Any
    
    var packageCache: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageCache */ Any
    
    def pathToOurAddon(moduleName: String): String
    
    var removed: Set[Node]
    
    var sourceFile: String
  }
  object State {
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setCalledIdentifiers(value: Set[Node]): Self = StObject.set(x, "calledIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setCloneDeep(value: Node => Node): Self = StObject.set(x, "cloneDeep", js.Any.fromFunction1(value))
      
      inline def setGeneratedRequires(value: Set[Node]): Self = StObject.set(x, "generatedRequires", value.asInstanceOf[js.Any])
      
      inline def setImportUtil(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImportUtil */ Any
      ): Self = StObject.set(x, "importUtil", value.asInstanceOf[js.Any])
      
      inline def setJobs(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
      
      inline def setJobsVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "jobs", js.Array(value*))
      
      inline def setOpts(value: AppPackageRoot): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOwningPackage(value: () => Any): Self = StObject.set(x, "owningPackage", js.Any.fromFunction0(value))
      
      inline def setPackageCache(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageCache */ Any
      ): Self = StObject.set(x, "packageCache", value.asInstanceOf[js.Any])
      
      inline def setPathToOurAddon(value: String => String): Self = StObject.set(x, "pathToOurAddon", js.Any.fromFunction1(value))
      
      inline def setRemoved(value: Set[Node]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    }
  }
}
