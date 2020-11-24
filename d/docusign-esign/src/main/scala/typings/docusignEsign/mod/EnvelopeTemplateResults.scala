package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeTemplateResults extends js.Object {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[String] = js.native
  
  /**
    * The list of requested templates.
    */
  var envelopeTemplates: js.UndefOr[js.Array[EnvelopeTemplate]] = js.native
  
  /**
    * A list of folder objects.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.native
  
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.native
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.native
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[String] = js.native
  
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[String] = js.native
  
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[String] = js.native
}
object EnvelopeTemplateResults {
  
  @scala.inline
  def apply(): EnvelopeTemplateResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeTemplateResults]
  }
  
  @scala.inline
  implicit class EnvelopeTemplateResultsOps[Self <: EnvelopeTemplateResults] (val x: Self) extends AnyVal {
    
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
    def setEndPosition(value: String): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    
    @scala.inline
    def setEnvelopeTemplatesVarargs(value: EnvelopeTemplate*): Self = this.set("envelopeTemplates", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeTemplates(value: js.Array[EnvelopeTemplate]): Self = this.set("envelopeTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeTemplates: Self = this.set("envelopeTemplates", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = this.set("folders", js.Array(value :_*))
    
    @scala.inline
    def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = this.set("folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolders: Self = this.set("folders", js.undefined)
    
    @scala.inline
    def setNextUri(value: String): Self = this.set("nextUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextUri: Self = this.set("nextUri", js.undefined)
    
    @scala.inline
    def setPreviousUri(value: String): Self = this.set("previousUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousUri: Self = this.set("previousUri", js.undefined)
    
    @scala.inline
    def setResultSetSize(value: String): Self = this.set("resultSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSetSize: Self = this.set("resultSetSize", js.undefined)
    
    @scala.inline
    def setStartPosition(value: String): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    
    @scala.inline
    def setTotalSetSize(value: String): Self = this.set("totalSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSetSize: Self = this.set("totalSetSize", js.undefined)
  }
}
