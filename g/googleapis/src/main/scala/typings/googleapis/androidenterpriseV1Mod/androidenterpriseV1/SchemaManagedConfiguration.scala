package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A managed configuration resource contains the set of managed properties
  * defined by the app developer in the app&#39;s managed configurations
  * schema, as well as any configuration variables defined for the user.
  */
trait SchemaManagedConfiguration extends StObject {
  
  /**
    * Contains the ID of the managed configuration profile and the set of
    * configuration variables (if any) defined for the user.
    */
  var configurationVariables: js.UndefOr[SchemaConfigurationVariables] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfiguration&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The set of managed properties for this configuration.
    */
  var managedProperty: js.UndefOr[js.Array[SchemaManagedProperty]] = js.undefined
  
  /**
    * The ID of the product that the managed configuration is for, e.g.
    * &quot;app:com.google.android.gm&quot;.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object SchemaManagedConfiguration {
  
  inline def apply(): SchemaManagedConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfiguration]
  }
  
  extension [Self <: SchemaManagedConfiguration](x: Self) {
    
    inline def setConfigurationVariables(value: SchemaConfigurationVariables): Self = StObject.set(x, "configurationVariables", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVariablesUndefined: Self = StObject.set(x, "configurationVariables", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setManagedProperty(value: js.Array[SchemaManagedProperty]): Self = StObject.set(x, "managedProperty", value.asInstanceOf[js.Any])
    
    inline def setManagedPropertyUndefined: Self = StObject.set(x, "managedProperty", js.undefined)
    
    inline def setManagedPropertyVarargs(value: SchemaManagedProperty*): Self = StObject.set(x, "managedProperty", js.Array(value :_*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
