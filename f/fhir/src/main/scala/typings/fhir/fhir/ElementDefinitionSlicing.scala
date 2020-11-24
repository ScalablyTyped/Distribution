package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This element is sliced - slices follow
  */
@js.native
trait ElementDefinitionSlicing extends Element {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'ordered'.
    */
  var _ordered: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'rules'.
    */
  var _rules: js.UndefOr[Element] = js.native
  
  /**
    * Text description of how slicing works (or not)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Element values that are used to distinguish the slices
    */
  var discriminator: js.UndefOr[js.Array[ElementDefinitionSlicingDiscriminator]] = js.native
  
  /**
    * If elements must be in same order as slices
    */
  var ordered: js.UndefOr[Boolean] = js.native
  
  /**
    * closed | open | openAtEnd
    */
  var rules: code = js.native
}
object ElementDefinitionSlicing {
  
  @scala.inline
  def apply(rules: code): ElementDefinitionSlicing = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionSlicing]
  }
  
  @scala.inline
  implicit class ElementDefinitionSlicingOps[Self <: ElementDefinitionSlicing] (val x: Self) extends AnyVal {
    
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
    def setRules(value: code): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_ordered(value: Element): Self = this.set("_ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_ordered: Self = this.set("_ordered", js.undefined)
    
    @scala.inline
    def set_rules(value: Element): Self = this.set("_rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_rules: Self = this.set("_rules", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDiscriminatorVarargs(value: ElementDefinitionSlicingDiscriminator*): Self = this.set("discriminator", js.Array(value :_*))
    
    @scala.inline
    def setDiscriminator(value: js.Array[ElementDefinitionSlicingDiscriminator]): Self = this.set("discriminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscriminator: Self = this.set("discriminator", js.undefined)
    
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
  }
}
