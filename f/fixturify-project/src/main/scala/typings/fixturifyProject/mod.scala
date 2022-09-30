package typings.fixturifyProject

import typings.fixturify.mod.DirJSON
import typings.fixturifyProject.anon.OmitProjectArgsname
import typings.fixturifyProject.anon.OmitProjectArgsnameversio
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fixturify-project", "Project")
  @js.native
  open class Project () extends StObject {
    def this(args: ProjectArgs) = this()
    def this(name: String) = this()
    def this(args: Unit, projectCallback: ProjectCallback) = this()
    def this(args: ProjectArgs, projectCallback: ProjectCallback) = this()
    def this(name: String, args: OmitProjectArgsname) = this()
    def this(name: String, version: String) = this()
    def this(name: Unit, args: OmitProjectArgsname) = this()
    def this(name: Unit, version: String) = this()
    def this(name: String, args: OmitProjectArgsname, projectCallback: ProjectCallback) = this()
    def this(name: String, version: String, args: OmitProjectArgsnameversio) = this()
    def this(name: String, version: String, projectCallback: ProjectCallback) = this()
    def this(name: String, version: Unit, args: OmitProjectArgsnameversio) = this()
    def this(name: String, version: Unit, projectCallback: ProjectCallback) = this()
    def this(name: Unit, args: OmitProjectArgsname, projectCallback: ProjectCallback) = this()
    def this(name: Unit, version: String, args: OmitProjectArgsnameversio) = this()
    def this(name: Unit, version: String, projectCallback: ProjectCallback) = this()
    def this(name: Unit, version: Unit, args: OmitProjectArgsnameversio) = this()
    def this(name: Unit, version: Unit, projectCallback: ProjectCallback) = this()
    def this(name: String, version: String, args: Unit, projectCallback: ProjectCallback) = this()
    def this(name: String, version: String, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback) = this()
    def this(name: String, version: Unit, args: Unit, projectCallback: ProjectCallback) = this()
    def this(name: String, version: Unit, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback) = this()
    def this(name: Unit, version: String, args: Unit, projectCallback: ProjectCallback) = this()
    def this(name: Unit, version: String, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback) = this()
    def this(name: Unit, version: Unit, args: Unit, projectCallback: ProjectCallback) = this()
    def this(name: Unit, version: Unit, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback) = this()
    
    /* private */ var _baseDir: Any = js.native
    
    /* private */ var _dependencies: Any = js.native
    
    /* private */ var _devDependencies: Any = js.native
    
    /* private */ var _tmp: Any = js.native
    
    /* private */ var addDep: Any = js.native
    
    def addDependency(): Project = js.native
    def addDependency(args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDependency(args: Project): Project = js.native
    def addDependency(args: ProjectArgs): Project = js.native
    def addDependency(args: ProjectArgs, projectCallback: ProjectCallback): Project = js.native
    def addDependency(args: Project, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: String): Project = js.native
    def addDependency(name: String, args: OmitProjectArgsname): Project = js.native
    def addDependency(name: String, args: OmitProjectArgsname, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: String, version: String): Project = js.native
    def addDependency(name: String, version: String, args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: String, version: String, args: OmitProjectArgsnameversio): Project = js.native
    def addDependency(name: String, version: String, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: String, version: String, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: String, version: Unit, args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: String, version: Unit, args: OmitProjectArgsnameversio): Project = js.native
    def addDependency(name: String, version: Unit, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: String, version: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: Unit, args: OmitProjectArgsname): Project = js.native
    def addDependency(name: Unit, args: OmitProjectArgsname, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: Unit, version: String): Project = js.native
    def addDependency(name: Unit, version: String, args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: Unit, version: String, args: OmitProjectArgsnameversio): Project = js.native
    def addDependency(name: Unit, version: String, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: Unit, version: String, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: Unit, version: Unit, args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: Unit, version: Unit, args: OmitProjectArgsnameversio): Project = js.native
    def addDependency(name: Unit, version: Unit, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback): Project = js.native
    def addDependency(name: Unit, version: Unit, projectCallback: ProjectCallback): Project = js.native
    
    /**
      * Adds a devDependency to the Project's package.json.
      *
      * @returns - The Project instance.
      */
    def addDevDependency(): Project = js.native
    def addDevDependency(args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(args: Project): Project = js.native
    def addDevDependency(args: ProjectArgs): Project = js.native
    def addDevDependency(args: ProjectArgs, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(args: Project, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: String): Project = js.native
    def addDevDependency(name: String, args: OmitProjectArgsname): Project = js.native
    def addDevDependency(name: String, args: OmitProjectArgsname, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: String, version: String): Project = js.native
    def addDevDependency(name: String, version: String, args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: String, version: String, args: OmitProjectArgsnameversio): Project = js.native
    def addDevDependency(name: String, version: String, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: String, version: String, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: String, version: Unit, args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: String, version: Unit, args: OmitProjectArgsnameversio): Project = js.native
    def addDevDependency(name: String, version: Unit, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: String, version: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: Unit, args: OmitProjectArgsname): Project = js.native
    def addDevDependency(name: Unit, args: OmitProjectArgsname, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: Unit, version: String): Project = js.native
    def addDevDependency(name: Unit, version: String, args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: Unit, version: String, args: OmitProjectArgsnameversio): Project = js.native
    def addDevDependency(name: Unit, version: String, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: Unit, version: String, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: Unit, version: Unit, args: Unit, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: Unit, version: Unit, args: OmitProjectArgsnameversio): Project = js.native
    def addDevDependency(name: Unit, version: Unit, args: OmitProjectArgsnameversio, projectCallback: ProjectCallback): Project = js.native
    def addDevDependency(name: Unit, version: Unit, projectCallback: ProjectCallback): Project = js.native
    
    /* private */ var assignBaseDirs: Any = js.native
    
    /* private */ var autoBaseDir: Any = js.native
    
    /**
      * Gets the base directory path, usually a tmp directory unless a baseDir has been explicitly set.
      *
      * @readonly
      * @memberof Project
      */
    def baseDir: String = js.native
    /**
      * Sets the base directory of the project.
      *
      * @memberof Project
      * @param dir - The directory path.
      */
    def baseDir_=(dir: String): Unit = js.native
    
    /* private */ var binLinks: Any = js.native
    
    /* private */ var dependencyLinks: Any = js.native
    
    /**
      * @returns - An array of the dependencies for this Projct.
      */
    def dependencyProjects(): js.Array[Project] = js.native
    
    /* private */ var depsToObject: Any = js.native
    
    /**
      * @returns - An array of the devDependencies for this Projct.
      */
    def devDependencyProjects(): js.Array[Project] = js.native
    
    /**
      * Disposes of the tmp directory that the Project is stored in.
      */
    def dispose(): Unit = js.native
    
    var files: DirJSON = js.native
    
    /* private */ var finalizeWrite: Any = js.native
    
    /* private */ var hardLinkContents: Any = js.native
    
    /* private */ var hardLinkFile: Any = js.native
    
    val isDependency: /* true */ Boolean = js.native
    
    /**
      * Links a dependency.
      *
      * @param name - The name of the dependency to link.
      */
    def linkDependency(name: String, opts: LinkParams): Unit = js.native
    
    /**
      * Links a devDependency.
      *
      * @param name - The name of the dependency to link.
      */
    def linkDevDependency(name: String, opts: LinkParams): Unit = js.native
    
    /* private */ var linkIsDevDependency: Any = js.native
    
    /**
      * Merges an object containing a directory represention with the existing files.
      *
      * @param dirJSON - An object containing a directory representation to merge.
      */
    def mergeFiles(dirJSON: DirJSON): Unit = js.native
    
    /**
      * Gets the package name from the package.json.
      *
      * @type {string}
      * @memberof Project
      */
    def name: String = js.native
    /**
      * Sets the package name in the package.json.
      *
      * @memberof Project
      */
    def name_=(value: String): Unit = js.native
    
    var pkg: PackageJson = js.native
    
    /* private */ var pkgJSONWithDeps: Any = js.native
    
    /* private */ var readSync: Any = js.native
    
    /**
      * Removes a dependency to the Project's package.json.
      *
      * @param name - The name of the dependency to remove.
      */
    def removeDependency(name: String): Unit = js.native
    
    /**
      * Removes a devDependency.
      *
      * @param name - The name of the devDependency to remove.
      */
    def removeDevDependency(name: String): Unit = js.native
    
    /* private */ var requestedRange: Any = js.native
    
    /* private */ var resolutionCache: Any = js.native
    
    /* private */ var resolveLinks: Any = js.native
    
    /**
      * @deprecated Please use baseDir instead.
      *
      * @readonly
      * @memberof Project
      */
    def root: Unit = js.native
    
    /* private */ var usingHardLinks: Any = js.native
    
    /**
      * Gets the version number from the package.json.
      *
      * @type {string}
      * @memberof Project
      */
    def version: String = js.native
    /**
      * Sets the version number in the package.json.
      *
      * @memberof Project
      */
    def version_=(value: String): Unit = js.native
    
    /**
      * Writes the existing files property containing a directory representation to the tmp directory.
      *
      * @param dirJSON? - An optional object containing a directory representation to write.
      */
    def write(): js.Promise[Unit] = js.native
    def write(dirJSON: DirJSON): js.Promise[Unit] = js.native
    
    /* private */ var writeFiles: Any = js.native
    
    /* private */ var writeLinkedPackage: Any = js.native
    
    /* protected */ def writeProject(): Unit = js.native
    
    /**
      * @deprecated Please use `await project.write()` instead.
      */
    def writeSync(): Unit = js.native
  }
  object Project {
    
    @JSImport("fixturify-project", "Project")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Reads an existing project from the specified root.
      *
      * @param root - The base directory to read the project from.
      * @param opts - An options object.
      * @param opts.linkDeps - Include linking dependencies from the Project's node_modules.
      * @param opts.linkDevDeps - Include linking devDependencies from the Project's node_modules.
      * @returns - The deserialized Project.
      */
    /* static member */
    inline def fromDir(root: String): Project = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDir")(root.asInstanceOf[js.Any]).asInstanceOf[Project]
    inline def fromDir(root: String, opts: ReadDirOpts): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDir")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Project]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fixturifyProject.anon.BaseDir
    - typings.fixturifyProject.anon.RequestedRange
    - typings.fixturifyProject.anon.Project
  */
  trait LinkParams extends StObject
  object LinkParams {
    
    inline def BaseDir(baseDir: String): typings.fixturifyProject.anon.BaseDir = {
      val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fixturifyProject.anon.BaseDir]
    }
    
    inline def Project(project: typings.fixturifyProject.mod.Project): typings.fixturifyProject.anon.Project = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fixturifyProject.anon.Project]
    }
    
    inline def RequestedRange(target: String): typings.fixturifyProject.anon.RequestedRange = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fixturifyProject.anon.RequestedRange]
    }
  }
  
  type PackageJson = typings.typeFest.packageJsonMod.PackageJson & (Record[String, Any])
  
  trait ProjectArgs extends StObject {
    
    var files: js.UndefOr[DirJSON] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var requestedRange: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ProjectArgs {
    
    inline def apply(): ProjectArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectArgs]
    }
    
    extension [Self <: ProjectArgs](x: Self) {
      
      inline def setFiles(value: DirJSON): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequestedRange(value: String): Self = StObject.set(x, "requestedRange", value.asInstanceOf[js.Any])
      
      inline def setRequestedRangeUndefined: Self = StObject.set(x, "requestedRange", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type ProjectCallback = js.Function1[/* project */ Project, Unit]
  
  trait ReadDirOpts extends StObject {
    
    var linkDeps: js.UndefOr[Boolean] = js.undefined
    
    var linkDevDeps: js.UndefOr[Boolean] = js.undefined
  }
  object ReadDirOpts {
    
    inline def apply(): ReadDirOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadDirOpts]
    }
    
    extension [Self <: ReadDirOpts](x: Self) {
      
      inline def setLinkDeps(value: Boolean): Self = StObject.set(x, "linkDeps", value.asInstanceOf[js.Any])
      
      inline def setLinkDepsUndefined: Self = StObject.set(x, "linkDeps", js.undefined)
      
      inline def setLinkDevDeps(value: Boolean): Self = StObject.set(x, "linkDevDeps", value.asInstanceOf[js.Any])
      
      inline def setLinkDevDepsUndefined: Self = StObject.set(x, "linkDevDeps", js.undefined)
    }
  }
}
