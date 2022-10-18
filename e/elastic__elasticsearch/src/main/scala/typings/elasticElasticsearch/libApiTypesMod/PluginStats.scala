package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginStats extends StObject {
  
  var classname: String
  
  var description: String
  
  var elasticsearch_version: VersionString
  
  var extended_plugins: js.Array[String]
  
  var has_native_controller: Boolean
  
  var java_version: VersionString
  
  var licensed: Boolean
  
  var name: Name
  
  var `type`: String
  
  var version: VersionString
}
object PluginStats {
  
  inline def apply(
    classname: String,
    description: String,
    elasticsearch_version: VersionString,
    extended_plugins: js.Array[String],
    has_native_controller: Boolean,
    java_version: VersionString,
    licensed: Boolean,
    name: Name,
    `type`: String,
    version: VersionString
  ): PluginStats = {
    val __obj = js.Dynamic.literal(classname = classname.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], elasticsearch_version = elasticsearch_version.asInstanceOf[js.Any], extended_plugins = extended_plugins.asInstanceOf[js.Any], has_native_controller = has_native_controller.asInstanceOf[js.Any], java_version = java_version.asInstanceOf[js.Any], licensed = licensed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginStats]
  }
  
  extension [Self <: PluginStats](x: Self) {
    
    inline def setClassname(value: String): Self = StObject.set(x, "classname", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setElasticsearch_version(value: VersionString): Self = StObject.set(x, "elasticsearch_version", value.asInstanceOf[js.Any])
    
    inline def setExtended_plugins(value: js.Array[String]): Self = StObject.set(x, "extended_plugins", value.asInstanceOf[js.Any])
    
    inline def setExtended_pluginsVarargs(value: String*): Self = StObject.set(x, "extended_plugins", js.Array(value*))
    
    inline def setHas_native_controller(value: Boolean): Self = StObject.set(x, "has_native_controller", value.asInstanceOf[js.Any])
    
    inline def setJava_version(value: VersionString): Self = StObject.set(x, "java_version", value.asInstanceOf[js.Any])
    
    inline def setLicensed(value: Boolean): Self = StObject.set(x, "licensed", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
