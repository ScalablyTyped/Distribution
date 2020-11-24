package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for the expected URL mappings.
  */
@js.native
trait SchemaUrlMapTest extends js.Object {
  
  /**
    * The weight to use for the supplied host and path when using advanced
    * routing rules that involve traffic splitting.
    */
  var backendServiceWeight: js.UndefOr[Double] = js.native
  
  /**
    * Description of this test case.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The expected URL that should be redirected to for the host and path being
    * tested.
    */
  var expectedUrlRedirect: js.UndefOr[String] = js.native
  
  /**
    * Host portion of the URL.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Path portion of the URL.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Expected BackendService resource the given URL should be mapped to.
    */
  var service: js.UndefOr[String] = js.native
}
object SchemaUrlMapTest {
  
  @scala.inline
  def apply(): SchemaUrlMapTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapTest]
  }
  
  @scala.inline
  implicit class SchemaUrlMapTestOps[Self <: SchemaUrlMapTest] (val x: Self) extends AnyVal {
    
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
    def setBackendServiceWeight(value: Double): Self = this.set("backendServiceWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendServiceWeight: Self = this.set("backendServiceWeight", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpectedUrlRedirect(value: String): Self = this.set("expectedUrlRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedUrlRedirect: Self = this.set("expectedUrlRedirect", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
