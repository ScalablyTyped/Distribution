package typings.forkTsCheckerWebpackPlugin.typeScriptEmbeddedExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeScriptEmbeddedExtensionHost extends js.Object {
  
  var embeddedExtensions: js.Array[String] = js.native
  
  def getEmbeddedSource(fileName: String): js.UndefOr[TypeScriptEmbeddedSource] = js.native
}
object TypeScriptEmbeddedExtensionHost {
  
  @scala.inline
  def apply(
    embeddedExtensions: js.Array[String],
    getEmbeddedSource: String => js.UndefOr[TypeScriptEmbeddedSource]
  ): TypeScriptEmbeddedExtensionHost = {
    val __obj = js.Dynamic.literal(embeddedExtensions = embeddedExtensions.asInstanceOf[js.Any], getEmbeddedSource = js.Any.fromFunction1(getEmbeddedSource))
    __obj.asInstanceOf[TypeScriptEmbeddedExtensionHost]
  }
  
  @scala.inline
  implicit class TypeScriptEmbeddedExtensionHostOps[Self <: TypeScriptEmbeddedExtensionHost] (val x: Self) extends AnyVal {
    
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
    def setEmbeddedExtensionsVarargs(value: String*): Self = this.set("embeddedExtensions", js.Array(value :_*))
    
    @scala.inline
    def setEmbeddedExtensions(value: js.Array[String]): Self = this.set("embeddedExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEmbeddedSource(value: String => js.UndefOr[TypeScriptEmbeddedSource]): Self = this.set("getEmbeddedSource", js.Any.fromFunction1(value))
  }
}
