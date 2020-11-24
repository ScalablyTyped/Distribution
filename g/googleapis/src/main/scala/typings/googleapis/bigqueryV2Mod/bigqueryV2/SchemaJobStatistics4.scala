package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaJobStatistics4 extends js.Object {
  
  /**
    * [Output-only] Number of files per destination URI or URI pattern
    * specified in the extract configuration. These values will be in the same
    * order as the URIs specified in the &#39;destinationUris&#39; field.
    */
  var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [Output-only] Number of user bytes extracted into the result. This is the
    * byte count as computed by BigQuery for billing purposes.
    */
  var inputBytes: js.UndefOr[String] = js.native
}
object SchemaJobStatistics4 {
  
  @scala.inline
  def apply(): SchemaJobStatistics4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatistics4]
  }
  
  @scala.inline
  implicit class SchemaJobStatistics4Ops[Self <: SchemaJobStatistics4] (val x: Self) extends AnyVal {
    
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
    def setDestinationUriFileCountsVarargs(value: String*): Self = this.set("destinationUriFileCounts", js.Array(value :_*))
    
    @scala.inline
    def setDestinationUriFileCounts(value: js.Array[String]): Self = this.set("destinationUriFileCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationUriFileCounts: Self = this.set("destinationUriFileCounts", js.undefined)
    
    @scala.inline
    def setInputBytes(value: String): Self = this.set("inputBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputBytes: Self = this.set("inputBytes", js.undefined)
  }
}
