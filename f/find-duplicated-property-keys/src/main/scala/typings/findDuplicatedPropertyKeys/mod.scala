package typings.findDuplicatedPropertyKeys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(content: String): js.Array[PropertyInfo] = ^.asInstanceOf[js.Dynamic].apply(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertyInfo]]
  
  @JSImport("find-duplicated-property-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PropertyInfo extends StObject {
    
    /**
      *  The key name of the duplicated property
      */
    var key: String
    
    /**
      * The number of property keys having the same key and parent object
      */
    var occurrence: Double
    
    /**
      * The parent object of a property key
      */
    var parent: PropertyInfo
    
    /**
      * Returns a list of property keys, which represents the path to the property key of the current object.
      */
    def propertyPath(): js.Array[String]
  }
  object PropertyInfo {
    
    inline def apply(key: String, occurrence: Double, parent: PropertyInfo, propertyPath: () => js.Array[String]): PropertyInfo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], occurrence = occurrence.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], propertyPath = js.Any.fromFunction0(propertyPath))
      __obj.asInstanceOf[PropertyInfo]
    }
    
    extension [Self <: PropertyInfo](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOccurrence(value: Double): Self = StObject.set(x, "occurrence", value.asInstanceOf[js.Any])
      
      inline def setParent(value: PropertyInfo): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPropertyPath(value: () => js.Array[String]): Self = StObject.set(x, "propertyPath", js.Any.fromFunction0(value))
    }
  }
}
