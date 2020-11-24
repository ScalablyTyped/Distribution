package typings.firebaseAnalyticsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic configuration fetched from server.
  * See https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps/getConfig
  */
@js.native
trait DynamicConfig extends js.Object {
  
  var apiKey: String = js.native
  
  var appId: String = js.native
  
  var authDomain: String = js.native
  
  var databaseURL: String = js.native
  
  var locationId: String = js.native
  
  var measurementId: String = js.native
  
  var messagingSenderId: String = js.native
  
  var projectId: String = js.native
  
  var storageBucket: String = js.native
}
object DynamicConfig {
  
  @scala.inline
  def apply(
    apiKey: String,
    appId: String,
    authDomain: String,
    databaseURL: String,
    locationId: String,
    measurementId: String,
    messagingSenderId: String,
    projectId: String,
    storageBucket: String
  ): DynamicConfig = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], authDomain = authDomain.asInstanceOf[js.Any], databaseURL = databaseURL.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any], measurementId = measurementId.asInstanceOf[js.Any], messagingSenderId = messagingSenderId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], storageBucket = storageBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicConfig]
  }
  
  @scala.inline
  implicit class DynamicConfigOps[Self <: DynamicConfig] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthDomain(value: String): Self = this.set("authDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseURL(value: String): Self = this.set("databaseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementId(value: String): Self = this.set("measurementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagingSenderId(value: String): Self = this.set("messagingSenderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageBucket(value: String): Self = this.set("storageBucket", value.asInstanceOf[js.Any])
  }
}
