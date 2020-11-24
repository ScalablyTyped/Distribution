package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerFormsResponse extends js.Object {
  
  /**
    * The last index position in the result set.
    */
  var endPosition: js.UndefOr[Double] = js.native
  
   // int32
  /**
    * The URI for the next chunk of records based on the search request. It is `null` if this is the last set of results for the search.
    */
  var nextUri: js.UndefOr[String] = js.native
  
  /**
    * An array of PowerForm objects.
    */
  var powerForms: js.UndefOr[js.Array[/* Contains details about a PowerForm. */ PowerForm]] = js.native
  
  /**
    * The URI for the prior chunk of records based on the search request. It is `null` if this is the first set of results for the search.
    */
  var previousUri: js.UndefOr[String] = js.native
  
  /**
    * The number of results in this response. Because you can filter which entries are included in the response, this value is always less than or equal to the `totalSetSize`.
    */
  var resultSetSize: js.UndefOr[Double] = js.native
  
   // int32
  /**
    * The starting index position of the current result set.
    */
  var startPosition: js.UndefOr[Double] = js.native
  
   // int32
  /**
    * The total number of items in the result set. This value is always greater than or equal to the value of `resultSetSize`.
    */
  var totalSetSize: js.UndefOr[Double] = js.native
}
object PowerFormsResponse {
  
  @scala.inline
  def apply(): PowerFormsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormsResponse]
  }
  
  @scala.inline
  implicit class PowerFormsResponseOps[Self <: PowerFormsResponse] (val x: Self) extends AnyVal {
    
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
    def setEndPosition(value: Double): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPosition: Self = this.set("endPosition", js.undefined)
    
    @scala.inline
    def setNextUri(value: String): Self = this.set("nextUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextUri: Self = this.set("nextUri", js.undefined)
    
    @scala.inline
    def setPowerFormsVarargs(value: (/* Contains details about a PowerForm. */ PowerForm)*): Self = this.set("powerForms", js.Array(value :_*))
    
    @scala.inline
    def setPowerForms(value: js.Array[/* Contains details about a PowerForm. */ PowerForm]): Self = this.set("powerForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerForms: Self = this.set("powerForms", js.undefined)
    
    @scala.inline
    def setPreviousUri(value: String): Self = this.set("previousUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousUri: Self = this.set("previousUri", js.undefined)
    
    @scala.inline
    def setResultSetSize(value: Double): Self = this.set("resultSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSetSize: Self = this.set("resultSetSize", js.undefined)
    
    @scala.inline
    def setStartPosition(value: Double): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartPosition: Self = this.set("startPosition", js.undefined)
    
    @scala.inline
    def setTotalSetSize(value: Double): Self = this.set("totalSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSetSize: Self = this.set("totalSetSize", js.undefined)
  }
}
