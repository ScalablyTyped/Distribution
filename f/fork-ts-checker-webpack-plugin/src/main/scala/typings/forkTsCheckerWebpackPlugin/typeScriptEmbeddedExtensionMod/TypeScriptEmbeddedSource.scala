package typings.forkTsCheckerWebpackPlugin.typeScriptEmbeddedExtensionMod

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.Dotjs
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.Dotts
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.Dottsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeScriptEmbeddedSource extends js.Object {
  
  var extension: Dotts | Dottsx | Dotjs = js.native
  
  var sourceText: String = js.native
}
object TypeScriptEmbeddedSource {
  
  @scala.inline
  def apply(extension: Dotts | Dottsx | Dotjs, sourceText: String): TypeScriptEmbeddedSource = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], sourceText = sourceText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeScriptEmbeddedSource]
  }
  
  @scala.inline
  implicit class TypeScriptEmbeddedSourceOps[Self <: TypeScriptEmbeddedSource] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: Dotts | Dottsx | Dotjs): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceText(value: String): Self = this.set("sourceText", value.asInstanceOf[js.Any])
  }
}
