package typings.glimmerDi

import typings.glimmerDi.distTypesFactoryMod.Factory
import typings.glimmerDi.distTypesRegistryMod.RegistryReader
import typings.glimmerDi.distTypesResolverMod.Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesContainerMod {
  
  @JSImport("@glimmer/di/dist/types/container", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Container {
    def this(registry: RegistryReader) = this()
    def this(registry: RegistryReader, resolver: Resolver) = this()
    
    /* private */ /* CompleteClass */
    var _factoryDefinitionLookups: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lookups: Any = js.native
    
    /* private */ /* CompleteClass */
    var _registry: Any = js.native
    
    /* private */ /* CompleteClass */
    var _resolver: Any = js.native
    
    /* private */ /* CompleteClass */
    var buildFactory: Any = js.native
    
    /* private */ /* CompleteClass */
    var buildInjections: Any = js.native
    
    /* CompleteClass */
    override def defaultInjections(specifier: String): js.Object = js.native
    
    /* CompleteClass */
    override def defaultTeardown(instance: Any): Unit = js.native
    
    /* CompleteClass */
    override def factoryFor(specifier: String): Factory[Any] = js.native
    
    /* CompleteClass */
    override def lookup(specifier: String): Any = js.native
    
    /* CompleteClass */
    override def teardown(): Unit = js.native
  }
  
  trait Container extends StObject {
    
    /* private */ var _factoryDefinitionLookups: Any
    
    /* private */ var _lookups: Any
    
    /* private */ var _registry: Any
    
    /* private */ var _resolver: Any
    
    /* private */ var buildFactory: Any
    
    /* private */ var buildInjections: Any
    
    def defaultInjections(specifier: String): js.Object
    
    def defaultTeardown(instance: Any): Unit
    
    def factoryFor(specifier: String): Factory[Any]
    
    def lookup(specifier: String): Any
    
    def teardown(): Unit
  }
  object Container {
    
    inline def apply(
      _factoryDefinitionLookups: Any,
      _lookups: Any,
      _registry: Any,
      _resolver: Any,
      buildFactory: Any,
      buildInjections: Any,
      defaultInjections: String => js.Object,
      defaultTeardown: Any => Unit,
      factoryFor: String => Factory[Any],
      lookup: String => Any,
      teardown: () => Unit
    ): Container = {
      val __obj = js.Dynamic.literal(_factoryDefinitionLookups = _factoryDefinitionLookups.asInstanceOf[js.Any], _lookups = _lookups.asInstanceOf[js.Any], _registry = _registry.asInstanceOf[js.Any], _resolver = _resolver.asInstanceOf[js.Any], buildFactory = buildFactory.asInstanceOf[js.Any], buildInjections = buildInjections.asInstanceOf[js.Any], defaultInjections = js.Any.fromFunction1(defaultInjections), defaultTeardown = js.Any.fromFunction1(defaultTeardown), factoryFor = js.Any.fromFunction1(factoryFor), lookup = js.Any.fromFunction1(lookup), teardown = js.Any.fromFunction0(teardown))
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      inline def setBuildFactory(value: Any): Self = StObject.set(x, "buildFactory", value.asInstanceOf[js.Any])
      
      inline def setBuildInjections(value: Any): Self = StObject.set(x, "buildInjections", value.asInstanceOf[js.Any])
      
      inline def setDefaultInjections(value: String => js.Object): Self = StObject.set(x, "defaultInjections", js.Any.fromFunction1(value))
      
      inline def setDefaultTeardown(value: Any => Unit): Self = StObject.set(x, "defaultTeardown", js.Any.fromFunction1(value))
      
      inline def setFactoryFor(value: String => Factory[Any]): Self = StObject.set(x, "factoryFor", js.Any.fromFunction1(value))
      
      inline def setLookup(value: String => Any): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
      
      inline def set_factoryDefinitionLookups(value: Any): Self = StObject.set(x, "_factoryDefinitionLookups", value.asInstanceOf[js.Any])
      
      inline def set_lookups(value: Any): Self = StObject.set(x, "_lookups", value.asInstanceOf[js.Any])
      
      inline def set_registry(value: Any): Self = StObject.set(x, "_registry", value.asInstanceOf[js.Any])
      
      inline def set_resolver(value: Any): Self = StObject.set(x, "_resolver", value.asInstanceOf[js.Any])
    }
  }
}
