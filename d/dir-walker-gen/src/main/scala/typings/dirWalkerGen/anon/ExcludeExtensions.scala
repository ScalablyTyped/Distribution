package typings.dirWalkerGen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludeExtensions extends js.Object {
  
  /**
    * List of extensions to ignore
    * @default []
    */
  var excludeExtensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Exclude all folder that ends with any of the given strings
    * @default []
    */
  var excludeFolders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * (Required) List of starting folders
    */
  var folders: js.Array[String] = js.native
  
  /**
    * Ignores directories that start with a dot (e.g. .git, .vscode, etc)
    * @default {false}
    */
  var ignoreDotDir: js.UndefOr[Boolean] = js.native
  
  /**
    * List of extensions to scan (all other extensions are ignored)
    * @default []
    */
  var includeExtensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Does not show console warning when directories do not exist
    * @default {false}
    */
  var silent: js.UndefOr[Boolean] = js.native
}
object ExcludeExtensions {
  
  @scala.inline
  def apply(folders: js.Array[String]): ExcludeExtensions = {
    val __obj = js.Dynamic.literal(folders = folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeExtensions]
  }
  
  @scala.inline
  implicit class ExcludeExtensionsOps[Self <: ExcludeExtensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFoldersVarargs(value: String*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[String]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeExtensionsVarargs(value: String*): Self = this.set("excludeExtensions", js.Array(value :_*))
    
    @scala.inline
    def setExcludeExtensions(value: js.Array[String]): Self = this.set("excludeExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeExtensions: Self = this.set("excludeExtensions", js.undefined)
    
    @scala.inline
    def setExcludeFoldersVarargs(value: String*): Self = this.set("excludeFolders", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFolders(value: js.Array[String]): Self = this.set("excludeFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeFolders: Self = this.set("excludeFolders", js.undefined)
    
    @scala.inline
    def setIgnoreDotDir(value: Boolean): Self = this.set("ignoreDotDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDotDir: Self = this.set("ignoreDotDir", js.undefined)
    
    @scala.inline
    def setIncludeExtensionsVarargs(value: String*): Self = this.set("includeExtensions", js.Array(value :_*))
    
    @scala.inline
    def setIncludeExtensions(value: js.Array[String]): Self = this.set("includeExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeExtensions: Self = this.set("includeExtensions", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
