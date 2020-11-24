package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about packaged medications
  */
@js.native
trait MedicationPackage extends BackboneElement {
  
  /**
    * Identifies a single production run
    */
  var batch: js.UndefOr[js.Array[MedicationPackageBatch]] = js.native
  
  /**
    * E.g. box, vial, blister-pack
    */
  var container: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * What is  in the package
    */
  var content: js.UndefOr[js.Array[MedicationPackageContent]] = js.native
}
object MedicationPackage {
  
  @scala.inline
  def apply(): MedicationPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationPackage]
  }
  
  @scala.inline
  implicit class MedicationPackageOps[Self <: MedicationPackage] (val x: Self) extends AnyVal {
    
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
    def setBatchVarargs(value: MedicationPackageBatch*): Self = this.set("batch", js.Array(value :_*))
    
    @scala.inline
    def setBatch(value: js.Array[MedicationPackageBatch]): Self = this.set("batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    
    @scala.inline
    def setContainer(value: CodeableConcept): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: MedicationPackageContent*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[MedicationPackageContent]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
}
