package typings.fixturifyProject

import typings.fixturify.mod.DirJSON
import typings.fixturifyProject.mod.LinkParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseDir
    extends StObject
       with LinkParams {
    
    var baseDir: String
    
    var requestedRange: js.UndefOr[String] = js.undefined
    
    var resolveName: js.UndefOr[String] = js.undefined
  }
  object BaseDir {
    
    inline def apply(baseDir: String): BaseDir = {
      val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDir]
    }
    
    extension [Self <: BaseDir](x: Self) {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setRequestedRange(value: String): Self = StObject.set(x, "requestedRange", value.asInstanceOf[js.Any])
      
      inline def setRequestedRangeUndefined: Self = StObject.set(x, "requestedRange", js.undefined)
      
      inline def setResolveName(value: String): Self = StObject.set(x, "resolveName", value.asInstanceOf[js.Any])
      
      inline def setResolveNameUndefined: Self = StObject.set(x, "resolveName", js.undefined)
    }
  }
  
  /* Inlined std.Omit<fixturify-project.fixturify-project.ProjectArgs, 'name'> */
  trait OmitProjectArgsname extends StObject {
    
    var files: js.UndefOr[DirJSON] = js.undefined
    
    var requestedRange: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object OmitProjectArgsname {
    
    inline def apply(): OmitProjectArgsname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitProjectArgsname]
    }
    
    extension [Self <: OmitProjectArgsname](x: Self) {
      
      inline def setFiles(value: DirJSON): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setRequestedRange(value: String): Self = StObject.set(x, "requestedRange", value.asInstanceOf[js.Any])
      
      inline def setRequestedRangeUndefined: Self = StObject.set(x, "requestedRange", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined std.Omit<fixturify-project.fixturify-project.ProjectArgs, 'name' | 'version'> */
  trait OmitProjectArgsnameversio extends StObject {
    
    var files: js.UndefOr[DirJSON] = js.undefined
    
    var requestedRange: js.UndefOr[String] = js.undefined
  }
  object OmitProjectArgsnameversio {
    
    inline def apply(): OmitProjectArgsnameversio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitProjectArgsnameversio]
    }
    
    extension [Self <: OmitProjectArgsnameversio](x: Self) {
      
      inline def setFiles(value: DirJSON): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setRequestedRange(value: String): Self = StObject.set(x, "requestedRange", value.asInstanceOf[js.Any])
      
      inline def setRequestedRangeUndefined: Self = StObject.set(x, "requestedRange", js.undefined)
    }
  }
  
  trait Project
    extends StObject
       with LinkParams {
    
    var project: typings.fixturifyProject.mod.Project
    
    var requestedRange: js.UndefOr[String] = js.undefined
  }
  object Project {
    
    inline def apply(project: typings.fixturifyProject.mod.Project): Project = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[Project]
    }
    
    extension [Self <: Project](x: Self) {
      
      inline def setProject(value: typings.fixturifyProject.mod.Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setRequestedRange(value: String): Self = StObject.set(x, "requestedRange", value.asInstanceOf[js.Any])
      
      inline def setRequestedRangeUndefined: Self = StObject.set(x, "requestedRange", js.undefined)
    }
  }
  
  trait RequestedRange
    extends StObject
       with LinkParams {
    
    var requestedRange: js.UndefOr[String] = js.undefined
    
    var target: String
  }
  object RequestedRange {
    
    inline def apply(target: String): RequestedRange = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestedRange]
    }
    
    extension [Self <: RequestedRange](x: Self) {
      
      inline def setRequestedRange(value: String): Self = StObject.set(x, "requestedRange", value.asInstanceOf[js.Any])
      
      inline def setRequestedRangeUndefined: Self = StObject.set(x, "requestedRange", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
