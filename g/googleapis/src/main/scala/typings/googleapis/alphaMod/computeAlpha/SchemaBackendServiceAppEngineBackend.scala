package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration of a App Engine backend.
  */
trait SchemaBackendServiceAppEngineBackend extends StObject {
  
  /**
    * Optional. App Engine app service name.
    */
  var appEngineService: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Project ID of the project hosting the app. This is the project
    * ID of this project. Reference to another project is not allowed.
    */
  var targetProject: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Version of App Engine app service. When empty, App Engine will
    * do its normal traffic split.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SchemaBackendServiceAppEngineBackend {
  
  @scala.inline
  def apply(): SchemaBackendServiceAppEngineBackend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServiceAppEngineBackend]
  }
  
  @scala.inline
  implicit class SchemaBackendServiceAppEngineBackendMutableBuilder[Self <: SchemaBackendServiceAppEngineBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppEngineService(value: String): Self = StObject.set(x, "appEngineService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppEngineServiceUndefined: Self = StObject.set(x, "appEngineService", js.undefined)
    
    @scala.inline
    def setTargetProject(value: String): Self = StObject.set(x, "targetProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetProjectUndefined: Self = StObject.set(x, "targetProject", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
