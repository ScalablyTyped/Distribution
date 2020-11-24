package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for date properties.
  */
@js.native
trait SchemaDatePropertyOptions extends js.Object {
  
  /**
    * If set, describes how the date should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaDateOperatorOptions] = js.native
}
object SchemaDatePropertyOptions {
  
  @scala.inline
  def apply(): SchemaDatePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatePropertyOptions]
  }
  
  @scala.inline
  implicit class SchemaDatePropertyOptionsOps[Self <: SchemaDatePropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setOperatorOptions(value: SchemaDateOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
  }
}
