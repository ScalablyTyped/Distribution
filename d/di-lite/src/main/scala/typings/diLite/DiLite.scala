package typings.diLite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiLite {
  
  @js.native
  trait CreateContext extends StObject {
    
    def clear(): Unit = js.native
    
    def create[T](name: String, args: js.Any): T = js.native
    
    def entry[T](name: String): T = js.native
    
    def get(name: String): js.Any = js.native
    
    def has(name: String): Boolean = js.native
    
    def initialize(): Unit = js.native
    
    def inject[T](name: String, o: T, dependencies: String): T = js.native
    
    var map: Dictionary[js.Any] = js.native
    
    def ready[T](o: js.Any): T = js.native
    def ready[T](o: js.Function): T = js.native
    
    def register[T](name: String, service: T): Entry = js.native
  }
  
  trait DiLiteStatic extends StObject {
    
    def createContext(): CreateContext
    
    def dependencyExpression(depExp: String): String
    
    def entry(name: String, ctx: CreateContext): js.Any
    
    var factory: FactoryEnum
    
    var strategy: StrategyEnum
    
    var utils: Utils
    
    var version: String
  }
  object DiLiteStatic {
    
    @scala.inline
    def apply(
      createContext: () => CreateContext,
      dependencyExpression: String => String,
      entry: (String, CreateContext) => js.Any,
      factory: FactoryEnum,
      strategy: StrategyEnum,
      utils: Utils,
      version: String
    ): DiLiteStatic = {
      val __obj = js.Dynamic.literal(createContext = js.Any.fromFunction0(createContext), dependencyExpression = js.Any.fromFunction1(dependencyExpression), entry = js.Any.fromFunction2(entry), factory = factory.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiLiteStatic]
    }
    
    @scala.inline
    implicit class DiLiteStaticMutableBuilder[Self <: DiLiteStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateContext(value: () => CreateContext): Self = StObject.set(x, "createContext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDependencyExpression(value: String => String): Self = StObject.set(x, "dependencyExpression", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEntry(value: (String, CreateContext) => js.Any): Self = StObject.set(x, "entry", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFactory(value: FactoryEnum): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategy(value: StrategyEnum): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtils(value: Utils): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  @js.native
  trait Entry extends StObject {
    
    def args[T](): T = js.native
    def args[T](a: T): Entry = js.native
    
    def create(newArgs: js.Any): Entry = js.native
    
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
    
    def func[T](`type`: T, args: js.Any): T
  }
  object FactoryEnum {
    
    @scala.inline
    def apply(func: (js.Any, js.Any) => js.Any): FactoryEnum = {
      val __obj = js.Dynamic.literal(func = js.Any.fromFunction2(func))
      __obj.asInstanceOf[FactoryEnum]
    }
    
    @scala.inline
    implicit class FactoryEnumMutableBuilder[Self <: FactoryEnum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunc(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "func", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait StrategyEnum extends StObject {
    
    def proto[TObject, TType](
      name: String,
      `object`: TObject,
      `type`: TType,
      args: js.Any,
      ctx: CreateContext,
      dependencies: js.Any
    ): TObject = js.native
    
    def singleton[TObject, TType](name: String, `object`: TObject, `type`: TType, args: js.Any): TObject = js.native
    def singleton[TObject, TType](name: String, `object`: TObject, `type`: TType, args: js.Any, ctx: Unit, dependencies: js.Any): TObject = js.native
    def singleton[TObject, TType](name: String, `object`: TObject, `type`: TType, args: js.Any, ctx: CreateContext): TObject = js.native
    def singleton[TObject, TType](
      name: String,
      `object`: TObject,
      `type`: TType,
      args: js.Any,
      ctx: CreateContext,
      dependencies: js.Any
    ): TObject = js.native
  }
  
  trait Utils extends StObject {
    
    def invokeStmt(args: js.Any, op: String): String
  }
  object Utils {
    
    @scala.inline
    def apply(invokeStmt: (js.Any, String) => String): Utils = {
      val __obj = js.Dynamic.literal(invokeStmt = js.Any.fromFunction2(invokeStmt))
      __obj.asInstanceOf[Utils]
    }
    
    @scala.inline
    implicit class UtilsMutableBuilder[Self <: Utils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvokeStmt(value: (js.Any, String) => String): Self = StObject.set(x, "invokeStmt", js.Any.fromFunction2(value))
    }
  }
}
