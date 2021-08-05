package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A managed property of a managed configuration. The property must match one
  * of the properties in the app restrictions schema of the product. Exactly
  * one of the value fields must be populated, and it must match the
  * property&#39;s type in the app restrictions schema.
  */
trait SchemaManagedProperty extends StObject {
  
  /**
    * The unique key that identifies the property.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The boolean value - this will only be present if type of the property is
    * bool.
    */
  var valueBool: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The bundle of managed properties - this will only be present if type of
    * the property is bundle.
    */
  var valueBundle: js.UndefOr[SchemaManagedPropertyBundle] = js.undefined
  
  /**
    * The list of bundles of properties - this will only be present if type of
    * the property is bundle_array.
    */
  var valueBundleArray: js.UndefOr[js.Array[SchemaManagedPropertyBundle]] = js.undefined
  
  /**
    * The integer value - this will only be present if type of the property is
    * integer.
    */
  var valueInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * The string value - this will only be present if type of the property is
    * string, choice or hidden.
    */
  var valueString: js.UndefOr[String] = js.undefined
  
  /**
    * The list of string values - this will only be present if type of the
    * property is multiselect.
    */
  var valueStringArray: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaManagedProperty {
  
  inline def apply(): SchemaManagedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedProperty]
  }
  
  extension [Self <: SchemaManagedProperty](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValueBool(value: Boolean): Self = StObject.set(x, "valueBool", value.asInstanceOf[js.Any])
    
    inline def setValueBoolUndefined: Self = StObject.set(x, "valueBool", js.undefined)
    
    inline def setValueBundle(value: SchemaManagedPropertyBundle): Self = StObject.set(x, "valueBundle", value.asInstanceOf[js.Any])
    
    inline def setValueBundleArray(value: js.Array[SchemaManagedPropertyBundle]): Self = StObject.set(x, "valueBundleArray", value.asInstanceOf[js.Any])
    
    inline def setValueBundleArrayUndefined: Self = StObject.set(x, "valueBundleArray", js.undefined)
    
    inline def setValueBundleArrayVarargs(value: SchemaManagedPropertyBundle*): Self = StObject.set(x, "valueBundleArray", js.Array(value :_*))
    
    inline def setValueBundleUndefined: Self = StObject.set(x, "valueBundle", js.undefined)
    
    inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
    
    inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
    
    inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
    
    inline def setValueStringArray(value: js.Array[String]): Self = StObject.set(x, "valueStringArray", value.asInstanceOf[js.Any])
    
    inline def setValueStringArrayUndefined: Self = StObject.set(x, "valueStringArray", js.undefined)
    
    inline def setValueStringArrayVarargs(value: String*): Self = StObject.set(x, "valueStringArray", js.Array(value :_*))
    
    inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
  }
}
