package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message for the expected URL mappings.
  */
trait SchemaUrlMapTest extends StObject {
  
  /**
    * The weight to use for the supplied host and path when using advanced
    * routing rules that involve traffic splitting.
    */
  var backendServiceWeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Description of this test case.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The expected URL that should be redirected to for the host and path being
    * tested.
    */
  var expectedUrlRedirect: js.UndefOr[String] = js.undefined
  
  /**
    * Host portion of the URL.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Path portion of the URL.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Expected BackendService resource the given URL should be mapped to.
    */
  var service: js.UndefOr[String] = js.undefined
}
object SchemaUrlMapTest {
  
  @scala.inline
  def apply(): SchemaUrlMapTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapTest]
  }
  
  @scala.inline
  implicit class SchemaUrlMapTestMutableBuilder[Self <: SchemaUrlMapTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendServiceWeight(value: Double): Self = StObject.set(x, "backendServiceWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackendServiceWeightUndefined: Self = StObject.set(x, "backendServiceWeight", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpectedUrlRedirect(value: String): Self = StObject.set(x, "expectedUrlRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUrlRedirectUndefined: Self = StObject.set(x, "expectedUrlRedirect", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
