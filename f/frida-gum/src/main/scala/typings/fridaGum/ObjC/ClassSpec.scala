package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSpec[D, T, S] extends StObject {
  
  /**
    * Methods to implement.
    */
  var methods: js.UndefOr[
    StringDictionary[
      (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
    ]
  ] = js.native
  
  /**
    * Name of the class.
    *
    * Omit this if you don’t care about the globally visible name and would like the runtime to auto-generate one
    * for you.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Protocols this class conforms to.
    */
  var protocols: js.UndefOr[js.Array[Protocol]] = js.native
  
  /**
    * Super-class, or `null` to create a new root class. Omit to inherit from `NSObject`.
    */
  var `super`: js.UndefOr[Object | Null] = js.native
}
object ClassSpec {
  
  @scala.inline
  def apply[D, T, S](): ClassSpec[D, T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassSpec[D, T, S]]
  }
  
  @scala.inline
  implicit class ClassSpecMutableBuilder[Self <: ClassSpec[_, _, _], D, T, S] (val x: Self with (ClassSpec[D, T, S])) extends AnyVal {
    
    @scala.inline
    def setMethods(
      value: StringDictionary[
          (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
        ]
    ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    
    @scala.inline
    def setSuper(value: Object): Self = StObject.set(x, "super", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperNull: Self = StObject.set(x, "super", null)
    
    @scala.inline
    def setSuperUndefined: Self = StObject.set(x, "super", js.undefined)
  }
}
