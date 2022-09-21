package typings.folderHash

import typings.folderHash.folderHashStrings.base64
import typings.folderHash.folderHashStrings.base64url
import typings.folderHash.folderHashStrings.binary
import typings.folderHash.folderHashStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("folder-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("folder-hash", "defaults")
  @js.native
  val defaults: HashElementOptions = js.native
  
  inline def hashElement(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def hashElement(name: String, dir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hashElement(
    name: String,
    dir: String,
    options: Unit,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[HashElementNode], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hashElement(name: String, dir: String, options: HashElementOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hashElement(
    name: String,
    dir: String,
    options: HashElementOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[HashElementNode], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hashElement(
    name: String,
    dir: Unit,
    options: Unit,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[HashElementNode], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hashElement(name: String, dir: Unit, options: HashElementOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hashElement(
    name: String,
    dir: Unit,
    options: HashElementOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* result */ js.UndefOr[HashElementNode], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hashElement(name: String, options: HashElementOptions): js.Promise[HashElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HashElementNode]]
  
  inline def hashElement_Promise(name: String): js.Promise[HashElementNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HashElementNode]]
  inline def hashElement_Promise(name: String, dir: String): js.Promise[HashElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HashElementNode]]
  inline def hashElement_Promise(name: String, dir: String, options: HashElementOptions): js.Promise[HashElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HashElementNode]]
  inline def hashElement_Promise(name: String, dir: Unit, options: HashElementOptions): js.Promise[HashElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("hashElement")(name.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HashElementNode]]
  
  trait FolderAndFileOptions extends StObject {
    
    var exclude: js.UndefOr[js.Array[String] | PathGlobFunction] = js.undefined
    
    var ignoreBasename: js.UndefOr[Boolean] = js.undefined
    
    var ignoreRootName: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[js.Array[String] | PathGlobFunction] = js.undefined
    
    var matchBasename: js.UndefOr[Boolean] = js.undefined
    
    var matchPath: js.UndefOr[Boolean] = js.undefined
  }
  object FolderAndFileOptions {
    
    inline def apply(): FolderAndFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderAndFileOptions]
    }
    
    extension [Self <: FolderAndFileOptions](x: Self) {
      
      inline def setExclude(value: js.Array[String] | PathGlobFunction): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeFunction0(value: () => js.Array[String]): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setIgnoreBasename(value: Boolean): Self = StObject.set(x, "ignoreBasename", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBasenameUndefined: Self = StObject.set(x, "ignoreBasename", js.undefined)
      
      inline def setIgnoreRootName(value: Boolean): Self = StObject.set(x, "ignoreRootName", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRootNameUndefined: Self = StObject.set(x, "ignoreRootName", js.undefined)
      
      inline def setInclude(value: js.Array[String] | PathGlobFunction): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeFunction0(value: () => js.Array[String]): Self = StObject.set(x, "include", js.Any.fromFunction0(value))
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setMatchBasename(value: Boolean): Self = StObject.set(x, "matchBasename", value.asInstanceOf[js.Any])
      
      inline def setMatchBasenameUndefined: Self = StObject.set(x, "matchBasename", js.undefined)
      
      inline def setMatchPath(value: Boolean): Self = StObject.set(x, "matchPath", value.asInstanceOf[js.Any])
      
      inline def setMatchPathUndefined: Self = StObject.set(x, "matchPath", js.undefined)
    }
  }
  
  trait HashElementNode extends StObject {
    
    var children: js.Array[HashElementNode]
    
    var hash: String
    
    var name: String
  }
  object HashElementNode {
    
    inline def apply(children: js.Array[HashElementNode], hash: String, name: String): HashElementNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashElementNode]
    }
    
    extension [Self <: HashElementNode](x: Self) {
      
      inline def setChildren(value: js.Array[HashElementNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: HashElementNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait HashElementOptions extends StObject {
    
    // See crypto.getHashes() for options.
    // Defaults to 'sha1'.
    var algo: js.UndefOr[String] = js.undefined
    
    // Defaults to 'base64'
    var encoding: js.UndefOr[base64 | base64url | hex | binary] = js.undefined
    
    var files: js.UndefOr[FolderAndFileOptions] = js.undefined
    
    var folders: js.UndefOr[FolderAndFileOptions] = js.undefined
    
    var symbolicLinks: js.UndefOr[SymbolicLinkOptions] = js.undefined
  }
  object HashElementOptions {
    
    inline def apply(): HashElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashElementOptions]
    }
    
    extension [Self <: HashElementOptions](x: Self) {
      
      inline def setAlgo(value: String): Self = StObject.set(x, "algo", value.asInstanceOf[js.Any])
      
      inline def setAlgoUndefined: Self = StObject.set(x, "algo", js.undefined)
      
      inline def setEncoding(value: base64 | base64url | hex | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFiles(value: FolderAndFileOptions): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFolders(value: FolderAndFileOptions): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      inline def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
      
      inline def setSymbolicLinks(value: SymbolicLinkOptions): Self = StObject.set(x, "symbolicLinks", value.asInstanceOf[js.Any])
      
      inline def setSymbolicLinksUndefined: Self = StObject.set(x, "symbolicLinks", js.undefined)
    }
  }
  
  type PathGlobFunction = js.Function0[js.Array[String]]
  
  /* Inlined std.Omit<folder-hash.folder-hash.FolderAndFileOptions, 'exclude' | 'include'> & {  include :boolean | undefined,   ignoreTargetPath :boolean | undefined,   ignoreTargetContent :boolean | undefined,   ignoreTargetContentAfterError :boolean | undefined} */
  trait SymbolicLinkOptions extends StObject {
    
    var ignoreBasename: js.UndefOr[Boolean] = js.undefined
    
    var ignoreRootName: js.UndefOr[Boolean] = js.undefined
    
    var ignoreTargetContent: js.UndefOr[Boolean] = js.undefined
    
    var ignoreTargetContentAfterError: js.UndefOr[Boolean] = js.undefined
    
    var ignoreTargetPath: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[Boolean] = js.undefined
    
    var matchBasename: js.UndefOr[Boolean] = js.undefined
    
    var matchPath: js.UndefOr[Boolean] = js.undefined
  }
  object SymbolicLinkOptions {
    
    inline def apply(): SymbolicLinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SymbolicLinkOptions]
    }
    
    extension [Self <: SymbolicLinkOptions](x: Self) {
      
      inline def setIgnoreBasename(value: Boolean): Self = StObject.set(x, "ignoreBasename", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBasenameUndefined: Self = StObject.set(x, "ignoreBasename", js.undefined)
      
      inline def setIgnoreRootName(value: Boolean): Self = StObject.set(x, "ignoreRootName", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRootNameUndefined: Self = StObject.set(x, "ignoreRootName", js.undefined)
      
      inline def setIgnoreTargetContent(value: Boolean): Self = StObject.set(x, "ignoreTargetContent", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTargetContentAfterError(value: Boolean): Self = StObject.set(x, "ignoreTargetContentAfterError", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTargetContentAfterErrorUndefined: Self = StObject.set(x, "ignoreTargetContentAfterError", js.undefined)
      
      inline def setIgnoreTargetContentUndefined: Self = StObject.set(x, "ignoreTargetContent", js.undefined)
      
      inline def setIgnoreTargetPath(value: Boolean): Self = StObject.set(x, "ignoreTargetPath", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTargetPathUndefined: Self = StObject.set(x, "ignoreTargetPath", js.undefined)
      
      inline def setInclude(value: Boolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setMatchBasename(value: Boolean): Self = StObject.set(x, "matchBasename", value.asInstanceOf[js.Any])
      
      inline def setMatchBasenameUndefined: Self = StObject.set(x, "matchBasename", js.undefined)
      
      inline def setMatchPath(value: Boolean): Self = StObject.set(x, "matchPath", value.asInstanceOf[js.Any])
      
      inline def setMatchPathUndefined: Self = StObject.set(x, "matchPath", js.undefined)
    }
  }
}
