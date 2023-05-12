package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeElementMod {
  
  trait ElementOperations extends StObject {
    
    def setAttribute(
      name: String,
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any,
      trusting: Boolean,
      namespace: Option[String]
    ): Unit
    
    def setStaticAttribute(name: String, value: String, namespace: Option[String]): Unit
  }
  object ElementOperations {
    
    inline def apply(
      setAttribute: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any, Boolean, Option[String]) => Unit,
      setStaticAttribute: (String, String, Option[String]) => Unit
    ): ElementOperations = {
      val __obj = js.Dynamic.literal(setAttribute = js.Any.fromFunction4(setAttribute), setStaticAttribute = js.Any.fromFunction3(setStaticAttribute))
      __obj.asInstanceOf[ElementOperations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementOperations] (val x: Self) extends AnyVal {
      
      inline def setSetAttribute(
        value: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any, Boolean, Option[String]) => Unit
      ): Self = StObject.set(x, "setAttribute", js.Any.fromFunction4(value))
      
      inline def setSetStaticAttribute(value: (String, String, Option[String]) => Unit): Self = StObject.set(x, "setStaticAttribute", js.Any.fromFunction3(value))
    }
  }
}
