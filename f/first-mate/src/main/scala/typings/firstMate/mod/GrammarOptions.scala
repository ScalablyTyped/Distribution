package typings.firstMate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrammarOptions extends js.Object {
  
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  
  var firstLineMatch: js.UndefOr[Boolean] = js.native
  
  var foldingStopMarker: js.UndefOr[String] = js.native
  
  var injectionSelector: js.UndefOr[ScopeSelector] = js.native
  
  var injections: js.UndefOr[js.Object] = js.native
  
  var maxLineLength: js.UndefOr[Double] = js.native
  
  var maxTokensPerLine: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var patterns: js.UndefOr[js.Array[js.Object]] = js.native
  
  var repository: js.UndefOr[js.Object] = js.native
  
  var scopeName: js.UndefOr[String] = js.native
}
object GrammarOptions {
  
  @scala.inline
  def apply(): GrammarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrammarOptions]
  }
  
  @scala.inline
  implicit class GrammarOptionsOps[Self <: GrammarOptions] (val x: Self) extends AnyVal {
    
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
    def setFileTypesVarargs(value: String*): Self = this.set("fileTypes", js.Array(value :_*))
    
    @scala.inline
    def setFileTypes(value: js.Array[String]): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTypes: Self = this.set("fileTypes", js.undefined)
    
    @scala.inline
    def setFirstLineMatch(value: Boolean): Self = this.set("firstLineMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLineMatch: Self = this.set("firstLineMatch", js.undefined)
    
    @scala.inline
    def setFoldingStopMarker(value: String): Self = this.set("foldingStopMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldingStopMarker: Self = this.set("foldingStopMarker", js.undefined)
    
    @scala.inline
    def setInjectionSelector(value: ScopeSelector): Self = this.set("injectionSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectionSelector: Self = this.set("injectionSelector", js.undefined)
    
    @scala.inline
    def setInjections(value: js.Object): Self = this.set("injections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjections: Self = this.set("injections", js.undefined)
    
    @scala.inline
    def setMaxLineLength(value: Double): Self = this.set("maxLineLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLineLength: Self = this.set("maxLineLength", js.undefined)
    
    @scala.inline
    def setMaxTokensPerLine(value: Double): Self = this.set("maxTokensPerLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTokensPerLine: Self = this.set("maxTokensPerLine", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPatternsVarargs(value: js.Object*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[js.Object]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatterns: Self = this.set("patterns", js.undefined)
    
    @scala.inline
    def setRepository(value: js.Object): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setScopeName(value: String): Self = this.set("scopeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeName: Self = this.set("scopeName", js.undefined)
  }
}
