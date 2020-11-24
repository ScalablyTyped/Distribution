package typings.forkTsCheckerWebpackPlugin.typeScriptConfigurationOverwriteMod

import typings.forkTsCheckerWebpackPlugin.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeScriptConfigurationOverwrite extends js.Object {
  
  var compilerOptions: js.UndefOr[js.Object] = js.native
  
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
  var `extends`: js.UndefOr[String] = js.native
  
  var files: js.UndefOr[js.Array[String]] = js.native
  
  var include: js.UndefOr[js.Array[String]] = js.native
  
  var references: js.UndefOr[js.Array[Path]] = js.native
}
object TypeScriptConfigurationOverwrite {
  
  @scala.inline
  def apply(): TypeScriptConfigurationOverwrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeScriptConfigurationOverwrite]
  }
  
  @scala.inline
  implicit class TypeScriptConfigurationOverwriteOps[Self <: TypeScriptConfigurationOverwrite] (val x: Self) extends AnyVal {
    
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
    def setCompilerOptions(value: js.Object): Self = this.set("compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerOptions: Self = this.set("compilerOptions", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setReferencesVarargs(value: Path*): Self = this.set("references", js.Array(value :_*))
    
    @scala.inline
    def setReferences(value: js.Array[Path]): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
  }
}
