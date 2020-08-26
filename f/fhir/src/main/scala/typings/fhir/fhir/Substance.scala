package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A homogeneous material with a definite composition
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Substance extends DomainResource {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * What class/type of substance this is
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * What substance this is
    */
  var code: CodeableConcept = js.native
  /**
    * Textual description of the substance, comments
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Composition information about the substance
    */
  var ingredient: js.UndefOr[js.Array[SubstanceIngredient]] = js.native
  /**
    * If this describes a specific package/container of the substance
    */
  var instance: js.UndefOr[js.Array[SubstanceInstance]] = js.native
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
}

object Substance {
  @scala.inline
  def apply(code: CodeableConcept): Substance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Substance]
  }
  @scala.inline
  implicit class SubstanceOps[Self <: Substance] (val x: Self) extends AnyVal {
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
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = this.set("category", js.Array(value :_*))
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setIngredientVarargs(value: SubstanceIngredient*): Self = this.set("ingredient", js.Array(value :_*))
    @scala.inline
    def setIngredient(value: js.Array[SubstanceIngredient]): Self = this.set("ingredient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIngredient: Self = this.set("ingredient", js.undefined)
    @scala.inline
    def setInstanceVarargs(value: SubstanceInstance*): Self = this.set("instance", js.Array(value :_*))
    @scala.inline
    def setInstance(value: js.Array[SubstanceInstance]): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

