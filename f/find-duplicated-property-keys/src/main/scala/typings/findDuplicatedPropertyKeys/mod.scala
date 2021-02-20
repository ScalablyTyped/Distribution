package typings.findDuplicatedPropertyKeys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-duplicated-property-keys", JSImport.Namespace)
  @js.native
  def apply(content: String): js.Array[PropertyInfo] = js.native
  
  @js.native
  trait PropertyInfo extends StObject {
    
    /**
      * Is this property an array
      */
    var isArray: Boolean = js.native
    
    /**
      *  The key name of the duplicated property
      */
    var key: String = js.native
    
    /**
      * The number of property keys having the same key and parent object
      */
    var occurrence: Double = js.native
    
    /**
      * The parent object of a property key
      */
    var parent: PropertyInfo = js.native
    
    /**
      * Returns a list of property keys, which represents the path to the property key of the current object.
      */
    def propertyPath(): js.Array[String] = js.native
  }
  object PropertyInfo {
    
    @scala.inline
    def apply(
      isArray: Boolean,
      key: String,
      occurrence: Double,
      parent: PropertyInfo,
      propertyPath: () => js.Array[String]
    ): PropertyInfo = {
      val __obj = js.Dynamic.literal(isArray = isArray.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], occurrence = occurrence.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], propertyPath = js.Any.fromFunction0(propertyPath))
      __obj.asInstanceOf[PropertyInfo]
    }
    
    @scala.inline
    implicit class PropertyInfoMutableBuilder[Self <: PropertyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOccurrence(value: Double): Self = StObject.set(x, "occurrence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: PropertyInfo): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyPath(value: () => js.Array[String]): Self = StObject.set(x, "propertyPath", js.Any.fromFunction0(value))
    }
  }
}
