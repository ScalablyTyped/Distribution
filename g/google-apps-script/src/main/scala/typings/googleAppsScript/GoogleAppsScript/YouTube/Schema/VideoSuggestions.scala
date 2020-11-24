package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoSuggestions extends js.Object {
  
  var editorSuggestions: js.UndefOr[js.Array[String]] = js.native
  
  var processingErrors: js.UndefOr[js.Array[String]] = js.native
  
  var processingHints: js.UndefOr[js.Array[String]] = js.native
  
  var processingWarnings: js.UndefOr[js.Array[String]] = js.native
  
  var tagSuggestions: js.UndefOr[js.Array[VideoSuggestionsTagSuggestion]] = js.native
}
object VideoSuggestions {
  
  @scala.inline
  def apply(): VideoSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSuggestions]
  }
  
  @scala.inline
  implicit class VideoSuggestionsOps[Self <: VideoSuggestions] (val x: Self) extends AnyVal {
    
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
    def setEditorSuggestionsVarargs(value: String*): Self = this.set("editorSuggestions", js.Array(value :_*))
    
    @scala.inline
    def setEditorSuggestions(value: js.Array[String]): Self = this.set("editorSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorSuggestions: Self = this.set("editorSuggestions", js.undefined)
    
    @scala.inline
    def setProcessingErrorsVarargs(value: String*): Self = this.set("processingErrors", js.Array(value :_*))
    
    @scala.inline
    def setProcessingErrors(value: js.Array[String]): Self = this.set("processingErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingErrors: Self = this.set("processingErrors", js.undefined)
    
    @scala.inline
    def setProcessingHintsVarargs(value: String*): Self = this.set("processingHints", js.Array(value :_*))
    
    @scala.inline
    def setProcessingHints(value: js.Array[String]): Self = this.set("processingHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingHints: Self = this.set("processingHints", js.undefined)
    
    @scala.inline
    def setProcessingWarningsVarargs(value: String*): Self = this.set("processingWarnings", js.Array(value :_*))
    
    @scala.inline
    def setProcessingWarnings(value: js.Array[String]): Self = this.set("processingWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingWarnings: Self = this.set("processingWarnings", js.undefined)
    
    @scala.inline
    def setTagSuggestionsVarargs(value: VideoSuggestionsTagSuggestion*): Self = this.set("tagSuggestions", js.Array(value :_*))
    
    @scala.inline
    def setTagSuggestions(value: js.Array[VideoSuggestionsTagSuggestion]): Self = this.set("tagSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSuggestions: Self = this.set("tagSuggestions", js.undefined)
  }
}
