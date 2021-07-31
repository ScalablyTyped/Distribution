package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * App Engine Routing.  For more information about services, versions, and
  * instances see [An Overview of App
  * Engine](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine),
  * [Microservices Architecture on Google App
  * Engine](https://cloud.google.com/appengine/docs/python/microservices-on-app-engine),
  * [App Engine Standard request
  * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed),
  * and [App Engine Flex request
  * routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
  */
trait SchemaAppEngineRouting extends StObject {
  
  /**
    * Output only. The host that the job is sent to.  For more information
    * about how App Engine requests are routed, see
    * [here](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
    * The host is constructed as:   * `host =
    * [application_domain_name]`&lt;/br&gt;   `| [service] + &#39;.&#39; +
    * [application_domain_name]`&lt;/br&gt;   `| [version] + &#39;.&#39; +
    * [application_domain_name]`&lt;/br&gt;   `| [version_dot_service]+
    * &#39;.&#39; + [application_domain_name]`&lt;/br&gt;   `| [instance] +
    * &#39;.&#39; + [application_domain_name]`&lt;/br&gt;   `|
    * [instance_dot_service] + &#39;.&#39; +
    * [application_domain_name]`&lt;/br&gt;   `| [instance_dot_version] +
    * &#39;.&#39; + [application_domain_name]`&lt;/br&gt;   `|
    * [instance_dot_version_dot_service] + &#39;.&#39; +
    * [application_domain_name]`  * `application_domain_name` = The domain name
    * of the app, for   example &lt;app-id&gt;.appspot.com, which is associated
    * with the   job&#39;s project ID.  * `service =` service  * `version =`
    * version  * `version_dot_service =`   version `+ &#39;.&#39; +`   service
    * * `instance =` instance  * `instance_dot_service =`   instance `+
    * &#39;.&#39; +`   service  * `instance_dot_version =`   instance `+
    * &#39;.&#39; +`   version  * `instance_dot_version_dot_service =` instance
    * `+ &#39;.&#39; +`   version `+ &#39;.&#39; +`   service   If service is
    * empty, then the job will be sent to the service which is the default
    * service when the job is attempted.  If version is empty, then the job
    * will be sent to the version which is the default version when the job is
    * attempted.  If instance is empty, then the job will be sent to an
    * instance which is available when the job is attempted.  If service,
    * version, or instance is invalid, then the job will be sent to the default
    * version of the default service when the job is attempted.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * App instance.  By default, the job is sent to an instance which is
    * available when the job is attempted.  Requests can only be sent to a
    * specific instance if [manual scaling is used in App Engine
    * Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes).
    * App Engine Flex does not support instances. For more information, see
    * [App Engine Standard request
    * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed)
    * and [App Engine Flex request
    * routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * App service.  By default, the job is sent to the service which is the
    * default service when the job is attempted.
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * App version.  By default, the job is sent to the version which is the
    * default version when the job is attempted.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SchemaAppEngineRouting {
  
  @scala.inline
  def apply(): SchemaAppEngineRouting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppEngineRouting]
  }
  
  @scala.inline
  implicit class SchemaAppEngineRoutingMutableBuilder[Self <: SchemaAppEngineRouting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
