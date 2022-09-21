package typings.diLite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiLite {
  
  @js.native
  trait CreateContext extends StObject {
    
    def clear(): Unit = js.native
    
    def create[T](name: String, args: Any): T = js.native
    
    def entry[T](name: String): T = js.native
    
    def get(name: String): Any = js.native
    
    def has(name: String): Boolean = js.native
    
    def initialize(): Unit = js.native
    
    def inject[T](name: String, o: T, dependencies: String): T = js.native
    
    var map: Dictionary[Any] = js.native
    
    def ready[T](o: js.Function): T = js.native
    def ready[T](o: Any): T = js.native
    
    def register[T](name: String, service: T): Entry = js.native
  }
  
  trait DiLiteStatic extends StObject {
    
    def createContext(): CreateContext
    
    def dependencyExpression(depExp: String): String
    
    def entry(name: String, ctx: CreateContext): Any
    
    var factory: FactoryEnum
    
    var strategy: StrategyEnum
    
    var utils: Utils
    
    var version: String
  }
  object DiLiteStatic {
    
    inline def apply(
      createContext: () => CreateContext,
      dependencyExpression: String => String,
      entry: (String, CreateContext) => Any,
      factory: FactoryEnum,
      strategy: StrategyEnum,
      utils: Utils,
      version: String
    ): DiLiteStatic = {
      val __obj = js.Dynamic.literal(createContext = js.Any.fromFunction0(createContext), dependencyExpression = js.Any.fromFunction1(dependencyExpression), entry = js.Any.fromFunction2(entry), factory = factory.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiLiteStatic]
    }
    
    extension [Self <: DiLiteStatic](x: Self) {
      
      inline def setCreateContext(value: () => CreateContext): Self = StObject.set(x, "createContext", js.Any.fromFunction0(value))
      
      inline def setDependencyExpression(value: String => String): Self = StObject.set(x, "dependencyExpression", js.Any.fromFunction1(value))
      
      inline def setEntry(value: (String, CreateContext) => Any): Self = StObject.set(x, "entry", js.Any.fromFunction2(value))
      
      inline def setFactory(value: FactoryEnum): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: StrategyEnum): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setUtils(value: Utils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  @js.native
  trait Entry extends StObject {
    
    def args[T](): T = js.native
    def args[T](a: T): Entry = js.native
    
    def create(newArgs: Any): Entry = js.native
    
    def dependencies[T](): T = js.native
    def dependencies[T](d: T): Entry = js.native
    
    def factory(f: js.Function): Entry = js.native
    def factory[T](): T = js.native
    
    def `object`[T](): T = js.native
    def `object`[T](o: T): Entry = js.native
    
    def strategy[T](): T = js.native
    def strategy[T](s: js.Function): Entry = js.native
    
    def `type`[T](): T = js.native
    def `type`[T](t: T): Entry = js.native
  }
  
  trait FactoryEnum extends StObject {
    
    def func[T](`type`: T, args: Any): T
  }
  object FactoryEnum {
    
    inline def apply(func: (Any, Any) => Any): FactoryEnum = {
      val __obj = js.Dynamic.literal(func = js.Any.fromFunction2(func))
      __obj.asInstanceOf[FactoryEnum]
    }
    
    extension [Self <: FactoryEnum](x: Self) {
      
      inline def setFunc(value: (Any, Any) => Any): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait StrategyEnum extends StObject {
    
    def proto[TObject, TType](name: String, `object`: TObject, `type`: TType, args: Any, ctx: CreateContext, dependencies: Any): TObject = js.native
    
    def singleton[TObject, TType](name: String, `object`: TObject, `type`: TType, args: Any): TObject = js.native
    def singleton[TObject, TType](name: String, `object`: TObject, `type`: TType, args: Any, ctx: Unit, dependencies: Any): TObject = js.native
    def singleton[TObject, TType](name: String, `object`: TObject, `type`: TType, args: Any, ctx: CreateContext): TObject = js.native
    def singleton[TObject, TType](name: String, `object`: TObject, `type`: TType, args: Any, ctx: CreateContext, dependencies: Any): TObject = js.native
  }
  
  trait Utils extends StObject {
    
    def invokeStmt(args: Any, op: String): String
  }
  object Utils {
    
    inline def apply(invokeStmt: (Any, String) => String): Utils = {
      val __obj = js.Dynamic.literal(invokeStmt = js.Any.fromFunction2(invokeStmt))
      __obj.asInstanceOf[Utils]
    }
    
    extension [Self <: Utils](x: Self) {
      
      inline def setInvokeStmt(value: (Any, String) => String): Self = StObject.set(x, "invokeStmt", js.Any.fromFunction2(value))
    }
  }
}
