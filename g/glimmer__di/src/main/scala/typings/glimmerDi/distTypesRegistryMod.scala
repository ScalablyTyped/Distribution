package typings.glimmerDi

import typings.glimmerDi.distTypesFactoryMod.FactoryDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegistryMod {
  
  @JSImport("@glimmer/di/dist/types/registry", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Registry {
    def this(options: RegistryOptions) = this()
    
    /* CompleteClass */
    override def registeredInjections(specifier: String): js.Array[Injection] = js.native
    
    /* CompleteClass */
    override def registeredOption(specifier: String, option: String): Any = js.native
    
    /* CompleteClass */
    override def registeredOptions(specifier: String): Any = js.native
    
    /* CompleteClass */
    override def registration(specifier: String): Any = js.native
  }
  
  trait Injection extends StObject {
    
    var property: String
    
    var source: String
  }
  object Injection {
    
    inline def apply(property: String, source: String): Injection = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Injection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Injection] (val x: Self) extends AnyVal {
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegistrationOptions extends StObject {
    
    var instantiate: js.UndefOr[Boolean] = js.undefined
    
    var singleton: js.UndefOr[Boolean] = js.undefined
  }
  object RegistrationOptions {
    
    inline def apply(): RegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistrationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistrationOptions] (val x: Self) extends AnyVal {
      
      inline def setInstantiate(value: Boolean): Self = StObject.set(x, "instantiate", value.asInstanceOf[js.Any])
      
      inline def setInstantiateUndefined: Self = StObject.set(x, "instantiate", js.undefined)
      
      inline def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
      
      inline def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    }
  }
  
  @js.native
  trait Registry
    extends StObject
       with RegistryAccessor {
    
    /* private */ var _fallback: Any = js.native
    
    /* private */ var _registeredInjections: Any = js.native
    
    /* private */ var _registeredOptions: Any = js.native
    
    /* private */ var _registrations: Any = js.native
    
    def register(specifier: String, factoryDefinition: FactoryDefinition[Any]): Unit = js.native
    def register(specifier: String, factoryDefinition: FactoryDefinition[Any], options: RegistrationOptions): Unit = js.native
  }
  
  @js.native
  trait RegistryAccessor
    extends StObject
       with RegistryReader
       with RegistryWriter
  
  trait RegistryOptions extends StObject {
    
    var fallback: js.UndefOr[RegistryReader] = js.undefined
  }
  object RegistryOptions {
    
    inline def apply(): RegistryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegistryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistryOptions] (val x: Self) extends AnyVal {
      
      inline def setFallback(value: RegistryReader): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
  
  trait RegistryReader extends StObject {
    
    def registeredInjections(specifier: String): js.Array[Injection]
    
    def registeredOption(specifier: String, option: String): Any
    
    def registeredOptions(specifier: String): Any
    
    def registration(specifier: String): Any
  }
  object RegistryReader {
    
    inline def apply(
      registeredInjections: String => js.Array[Injection],
      registeredOption: (String, String) => Any,
      registeredOptions: String => Any,
      registration: String => Any
    ): RegistryReader = {
      val __obj = js.Dynamic.literal(registeredInjections = js.Any.fromFunction1(registeredInjections), registeredOption = js.Any.fromFunction2(registeredOption), registeredOptions = js.Any.fromFunction1(registeredOptions), registration = js.Any.fromFunction1(registration))
      __obj.asInstanceOf[RegistryReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistryReader] (val x: Self) extends AnyVal {
      
      inline def setRegisteredInjections(value: String => js.Array[Injection]): Self = StObject.set(x, "registeredInjections", js.Any.fromFunction1(value))
      
      inline def setRegisteredOption(value: (String, String) => Any): Self = StObject.set(x, "registeredOption", js.Any.fromFunction2(value))
      
      inline def setRegisteredOptions(value: String => Any): Self = StObject.set(x, "registeredOptions", js.Any.fromFunction1(value))
      
      inline def setRegistration(value: String => Any): Self = StObject.set(x, "registration", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RegistryWriter extends StObject {
    
    def register(specifier: String, factory: Any): Unit = js.native
    def register(specifier: String, factory: Any, options: RegistrationOptions): Unit = js.native
    
    def registerInjection(specifier: String, property: String, source: String): Unit = js.native
    
    def registerOption(specifier: String, option: String, value: Any): Unit = js.native
    
    def unregister(specifier: String): Unit = js.native
    
    def unregisterOption(specifier: String, option: String): Unit = js.native
  }
}
