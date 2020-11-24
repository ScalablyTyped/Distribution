package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fixture in the test script - by reference (uri)
  */
@js.native
trait TestScriptFixture extends BackboneElement {
  
  /**
    * Contains extended information for property 'autocreate'.
    */
  var _autocreate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'autodelete'.
    */
  var _autodelete: js.UndefOr[Element] = js.native
  
  /**
    * Whether or not to implicitly create the fixture during setup
    */
  var autocreate: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not to implicitly delete the fixture during teardown
    */
  var autodelete: js.UndefOr[Boolean] = js.native
  
  /**
    * Reference of the resource
    */
  var resource: js.UndefOr[Reference] = js.native
}
object TestScriptFixture {
  
  @scala.inline
  def apply(): TestScriptFixture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptFixture]
  }
  
  @scala.inline
  implicit class TestScriptFixtureOps[Self <: TestScriptFixture] (val x: Self) extends AnyVal {
    
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
    def set_autocreate(value: Element): Self = this.set("_autocreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_autocreate: Self = this.set("_autocreate", js.undefined)
    
    @scala.inline
    def set_autodelete(value: Element): Self = this.set("_autodelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_autodelete: Self = this.set("_autodelete", js.undefined)
    
    @scala.inline
    def setAutocreate(value: Boolean): Self = this.set("autocreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocreate: Self = this.set("autocreate", js.undefined)
    
    @scala.inline
    def setAutodelete(value: Boolean): Self = this.set("autodelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutodelete: Self = this.set("autodelete", js.undefined)
    
    @scala.inline
    def setResource(value: Reference): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
