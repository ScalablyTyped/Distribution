package typings.docusignEsign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSV extends js.Object {
  
  var CSV: String = js.native
  
  var MULTI: String = js.native
  
  var PIPES: String = js.native
  
  var SSV: String = js.native
  
  var TSV: String = js.native
}
object CSV {
  
  @scala.inline
  def apply(CSV: String, MULTI: String, PIPES: String, SSV: String, TSV: String): CSV = {
    val __obj = js.Dynamic.literal(CSV = CSV.asInstanceOf[js.Any], MULTI = MULTI.asInstanceOf[js.Any], PIPES = PIPES.asInstanceOf[js.Any], SSV = SSV.asInstanceOf[js.Any], TSV = TSV.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSV]
  }
  
  @scala.inline
  implicit class CSVOps[Self <: CSV] (val x: Self) extends AnyVal {
    
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
    def setCSV(value: String): Self = this.set("CSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMULTI(value: String): Self = this.set("MULTI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPIPES(value: String): Self = this.set("PIPES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSV(value: String): Self = this.set("SSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSV(value: String): Self = this.set("TSV", value.asInstanceOf[js.Any])
  }
}
