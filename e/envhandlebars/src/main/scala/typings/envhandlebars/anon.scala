package typings.envhandlebars

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.CompileOptions
import typings.handlebars.Handlebars.HelperDeclareSpec
import typings.handlebars.Handlebars.HelperDelegate
import typings.handlebars.Handlebars.ParseOptions
import typings.handlebars.Handlebars.ResolvePartialOptions
import typings.handlebars.Handlebars.Template
import typings.handlebars.HandlebarsTemplateDelegate
import typings.handlebars.HandlebarsTemplates
import typings.handlebars.Logger
import typings.handlebars.PrecompileOptions
import typings.handlebars.TemplateSpecification
import typings.handlebars.anon.TypeofHandlebars
import typings.handlebars.hbs.AST.Program
import typings.handlebars.hbs.AST.helpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofAST extends StObject {
    
    val helpers: typings.handlebars.hbs.AST.helpers
  }
  object TypeofAST {
    
    inline def apply(helpers: helpers): TypeofAST = {
      val __obj = js.Dynamic.literal(helpers = helpers.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofAST]
    }
    
    extension [Self <: TypeofAST](x: Self) {
      
      inline def setHelpers(value: helpers): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofH extends StObject {
    
    val AST: TypeofAST = js.native
    
    var Exception: Instantiable1[/* message */ String, typings.handlebars.mod.Exception] = js.native
    
    def K(): Unit = js.native
    
    var SafeString: Instantiable1[/* str */ String, typings.handlebars.mod.SafeString] = js.native
    
    val Utils: TypeofUtils = js.native
    
    val VERSION: String = js.native
    
    val VM: TypeofVM = js.native
    
    var Visitor: Instantiable0[typings.handlebars.mod.Visitor] = js.native
    
    def blockParams(obj: js.Array[Any], ids: js.Array[Any]): js.Array[Any] = js.native
    
    def compile[T](input: Any): HandlebarsTemplateDelegate[T] = js.native
    def compile[T](input: Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
    
    def create(): TypeofHandlebars = js.native
    
    def createFrame(`object`: Any): Any = js.native
    
    val decorators: Any = js.native
    
    def escapeExpression(str: String): String = js.native
    
    val helpers: Any = js.native
    
    def log(level: Double, obj: Any): Unit = js.native
    
    val logger: Logger = js.native
    
    def noConflict(): TypeofHandlebars = js.native
    
    def parse(input: String): Program = js.native
    def parse(input: String, options: ParseOptions): Program = js.native
    
    def parseWithoutProcessing(input: String): Program = js.native
    def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
    
    val partials: Any = js.native
    
    def precompile(input: Any): TemplateSpecification = js.native
    def precompile(input: Any, options: PrecompileOptions): TemplateSpecification = js.native
    
    def registerDecorator(name: String, fn: js.Function): Unit = js.native
    
    def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
    def registerHelper(name: HelperDeclareSpec): Unit = js.native
    
    def registerPartial(name: String, fn: Template[Any]): Unit = js.native
    def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[Any]]): Unit = js.native
    
    def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
    
    val templates: HandlebarsTemplates = js.native
    
    def unregisterDecorator(name: String): Unit = js.native
    
    def unregisterHelper(name: String): Unit = js.native
    
    def unregisterPartial(name: String): Unit = js.native
  }
  
  trait TypeofUtils extends StObject {
    
    def blockParams(obj: js.Array[Any], ids: js.Array[Any]): js.Array[Any]
    
    def createFrame(`object`: Any): Any
    
    def escapeExpression(str: String): String
    
    def extend(obj: Any, source: Any*): Any
    
    def isArray(obj: Any): Boolean
    
    def isEmpty(obj: Any): Boolean
    
    def isFunction(obj: Any): Boolean
    
    def toString(obj: Any): String
  }
  object TypeofUtils {
    
    inline def apply(
      blockParams: (js.Array[Any], js.Array[Any]) => js.Array[Any],
      createFrame: Any => Any,
      escapeExpression: String => String,
      extend: (Any, /* repeated */ Any) => Any,
      isArray: Any => Boolean,
      isEmpty: Any => Boolean,
      isFunction: Any => Boolean,
      toString_ : Any => String
    ): TypeofUtils = {
      val __obj = js.Dynamic.literal(blockParams = js.Any.fromFunction2(blockParams), createFrame = js.Any.fromFunction1(createFrame), escapeExpression = js.Any.fromFunction1(escapeExpression), extend = js.Any.fromFunction2(extend), isArray = js.Any.fromFunction1(isArray), isEmpty = js.Any.fromFunction1(isEmpty), isFunction = js.Any.fromFunction1(isFunction))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[TypeofUtils]
    }
    
    extension [Self <: TypeofUtils](x: Self) {
      
      inline def setBlockParams(value: (js.Array[Any], js.Array[Any]) => js.Array[Any]): Self = StObject.set(x, "blockParams", js.Any.fromFunction2(value))
      
      inline def setCreateFrame(value: Any => Any): Self = StObject.set(x, "createFrame", js.Any.fromFunction1(value))
      
      inline def setEscapeExpression(value: String => String): Self = StObject.set(x, "escapeExpression", js.Any.fromFunction1(value))
      
      inline def setExtend(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
      
      inline def setIsArray(value: Any => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: Any => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
      
      inline def setIsFunction(value: Any => Boolean): Self = StObject.set(x, "isFunction", js.Any.fromFunction1(value))
      
      inline def setToString_(value: Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofVM extends StObject {
    
    def resolvePartial[T](partial: Unit, context: Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
    def resolvePartial[T](partial: HandlebarsTemplateDelegate[T], context: Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
  }
}
