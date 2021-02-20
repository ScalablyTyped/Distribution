package typings.folderHash

import typings.folderHash.folderHashStrings.base64
import typings.folderHash.folderHashStrings.binary
import typings.folderHash.folderHashStrings.hex
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement(path: String): Unit = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement(
    path: String,
    dir: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[Error], /* result */ js.UndefOr[HashElementNode], _]
  ): Unit = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement(path: String, dir: js.UndefOr[scala.Nothing], options: HashElementOptions): Unit = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement(
    path: String,
    dir: js.UndefOr[scala.Nothing],
    options: HashElementOptions,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* result */ js.UndefOr[HashElementNode], _]
  ): Unit = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement(path: String, dir: String): Unit = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement(
    path: String,
    dir: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[Error], /* result */ js.UndefOr[HashElementNode], _]
  ): Unit = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement(path: String, dir: String, options: HashElementOptions): Unit = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement(
    path: String,
    dir: String,
    options: HashElementOptions,
    callback: js.Function2[/* error */ js.UndefOr[Error], /* result */ js.UndefOr[HashElementNode], _]
  ): Unit = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement(path: String, options: HashElementOptions): js.Promise[HashElementNode] = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement_Promise(path: String): js.Promise[HashElementNode] = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement_Promise(path: String, dir: js.UndefOr[scala.Nothing], options: HashElementOptions): js.Promise[HashElementNode] = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement_Promise(path: String, dir: String): js.Promise[HashElementNode] = js.native
  @JSImport("folder-hash", "hashElement")
  @js.native
  def hashElement_Promise(path: String, dir: String, options: HashElementOptions): js.Promise[HashElementNode] = js.native
  
  @js.native
  trait FolderAndFileOptions extends StObject {
    
    var exclude: js.UndefOr[js.Array[String] | PathGlobFunction] = js.native
    
    var ignoreBasename: js.UndefOr[Boolean] = js.native
    
    var ignoreRootName: js.UndefOr[Boolean] = js.native
    
    var include: js.UndefOr[js.Array[String] | PathGlobFunction] = js.native
    
    var matchBasename: js.UndefOr[Boolean] = js.native
    
    var matchPath: js.UndefOr[Boolean] = js.native
  }
  object FolderAndFileOptions {
    
    @scala.inline
    def apply(): FolderAndFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderAndFileOptions]
    }
    
    @scala.inline
    implicit class FolderAndFileOptionsMutableBuilder[Self <: FolderAndFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Array[String] | PathGlobFunction): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFunction0(value: () => js.Array[String]): Self = StObject.set(x, "exclude", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreBasename(value: Boolean): Self = StObject.set(x, "ignoreBasename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreBasenameUndefined: Self = StObject.set(x, "ignoreBasename", js.undefined)
      
      @scala.inline
      def setIgnoreRootName(value: Boolean): Self = StObject.set(x, "ignoreRootName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRootNameUndefined: Self = StObject.set(x, "ignoreRootName", js.undefined)
      
      @scala.inline
      def setInclude(value: js.Array[String] | PathGlobFunction): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFunction0(value: () => js.Array[String]): Self = StObject.set(x, "include", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setMatchBasename(value: Boolean): Self = StObject.set(x, "matchBasename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBasenameUndefined: Self = StObject.set(x, "matchBasename", js.undefined)
      
      @scala.inline
      def setMatchPath(value: Boolean): Self = StObject.set(x, "matchPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchPathUndefined: Self = StObject.set(x, "matchPath", js.undefined)
    }
  }
  
  @js.native
  trait HashElementNode extends StObject {
    
    var children: js.Array[HashElementNode] = js.native
    
    var hash: String = js.native
    
    var name: String = js.native
  }
  object HashElementNode {
    
    @scala.inline
    def apply(children: js.Array[HashElementNode], hash: String, name: String): HashElementNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashElementNode]
    }
    
    @scala.inline
    implicit class HashElementNodeMutableBuilder[Self <: HashElementNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[HashElementNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: HashElementNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HashElementOptions extends StObject {
    
    // See crypto.getHashes() for options.
    // Defaults to 'sha1'.
    var algo: js.UndefOr[String] = js.native
    
    // Defaults to 'base64'
    var encoding: js.UndefOr[base64 | hex | binary] = js.native
    
    var files: js.UndefOr[FolderAndFileOptions] = js.native
    
    var folders: js.UndefOr[FolderAndFileOptions] = js.native
  }
  object HashElementOptions {
    
    @scala.inline
    def apply(): HashElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashElementOptions]
    }
    
    @scala.inline
    implicit class HashElementOptionsMutableBuilder[Self <: HashElementOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgo(value: String): Self = StObject.set(x, "algo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgoUndefined: Self = StObject.set(x, "algo", js.undefined)
      
      @scala.inline
      def setEncoding(value: base64 | hex | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFiles(value: FolderAndFileOptions): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFolders(value: FolderAndFileOptions): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    }
  }
  
  type PathGlobFunction = js.Function0[js.Array[String]]
}
