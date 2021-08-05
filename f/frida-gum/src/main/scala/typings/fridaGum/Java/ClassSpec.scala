package typings.fridaGum.Java

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassSpec extends StObject {
  
  /**
    * Name and type of each field to expose.
    */
  var fields: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Interfaces implemented by this class.
    */
  var implements: js.UndefOr[js.Array[typings.fridaGum.anon.Wrapper]] = js.undefined
  
  /**
    * Methods to implement. Use the special name `$init` to define one or more constructors.
    */
  var methods: js.UndefOr[
    StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]]
  ] = js.undefined
  
  /**
    * Name of the class.
    */
  var name: String
  
  /**
    * Super-class. Omit to inherit from `java.lang.Object`.
    */
  var superClass: js.UndefOr[typings.fridaGum.anon.Wrapper] = js.undefined
}
object ClassSpec {
  
  inline def apply(name: String): ClassSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSpec]
  }
  
  extension [Self <: ClassSpec](x: Self) {
    
    inline def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setImplements(value: js.Array[typings.fridaGum.anon.Wrapper]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    inline def setImplementsUndefined: Self = StObject.set(x, "implements", js.undefined)
    
    inline def setImplementsVarargs(value: typings.fridaGum.anon.Wrapper*): Self = StObject.set(x, "implements", js.Array(value :_*))
    
    inline def setMethods(value: StringDictionary[MethodImplementation[js.Object] | MethodSpec | js.Array[MethodSpec]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSuperClass(value: typings.fridaGum.anon.Wrapper): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    inline def setSuperClassUndefined: Self = StObject.set(x, "superClass", js.undefined)
  }
}
