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
    
    @scala.inline
    def apply(helpers: helpers): TypeofAST = {
      val __obj = js.Dynamic.literal(helpers = helpers.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofAST]
    }
    
    @scala.inline
    implicit class TypeofASTMutableBuilder[Self <: TypeofAST] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHelpers(value: helpers): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
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
    
    def blockParams(obj: js.Array[js.Any], ids: js.Array[js.Any]): js.Array[js.Any] = js.native
    
    def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
    def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
    
    def create(): TypeofHandlebars = js.native
    
    def createFrame(`object`: js.Any): js.Any = js.native
    
    val decorators: js.Any = js.native
    
    def escapeExpression(str: String): String = js.native
    
    val helpers: js.Any = js.native
    
    def log(level: Double, obj: js.Any): Unit = js.native
    
    val logger: Logger = js.native
    
    def noConflict(): TypeofHandlebars = js.native
    
    def parse(input: String): Program = js.native
    def parse(input: String, options: ParseOptions): Program = js.native
    
    def parseWithoutProcessing(input: String): Program = js.native
    def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
    
    val partials: js.Any = js.native
    
    def precompile(input: js.Any): TemplateSpecification = js.native
    def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = js.native
    
    def registerDecorator(name: String, fn: js.Function): Unit = js.native
    
    def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
    def registerHelper(name: HelperDeclareSpec): Unit = js.native
    
    def registerPartial(name: String, fn: Template[js.Any]): Unit = js.native
    def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[js.Any]]): Unit = js.native
    
    def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
    
    val templates: HandlebarsTemplates = js.native
    
    def unregisterDecorator(name: String): Unit = js.native
    
    def unregisterHelper(name: String): Unit = js.native
    
    def unregisterPartial(name: String): Unit = js.native
  }
  
  trait TypeofUtils extends StObject {
    
    def blockParams(obj: js.Array[js.Any], ids: js.Array[js.Any]): js.Array[js.Any]
    
    def createFrame(`object`: js.Any): js.Any
    
    def escapeExpression(str: String): String
    
    def extend(obj: js.Any, source: js.Any*): js.Any
    
    def isArray(obj: js.Any): Boolean
    
    def isEmpty(obj: js.Any): Boolean
    
    def isFunction(obj: js.Any): Boolean
    
    def toString(obj: js.Any): String
  }
  object TypeofUtils {
    
    @scala.inline
    def apply(
      blockParams: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any],
      createFrame: js.Any => js.Any,
      escapeExpression: String => String,
      extend: (js.Any, /* repeated */ js.Any) => js.Any,
      isArray: js.Any => Boolean,
      isEmpty: js.Any => Boolean,
      isFunction: js.Any => Boolean,
      toString_ : js.Any => String
    ): TypeofUtils = {
      val __obj = js.Dynamic.literal(blockParams = js.Any.fromFunction2(blockParams), createFrame = js.Any.fromFunction1(createFrame), escapeExpression = js.Any.fromFunction1(escapeExpression), extend = js.Any.fromFunction2(extend), isArray = js.Any.fromFunction1(isArray), isEmpty = js.Any.fromFunction1(isEmpty), isFunction = js.Any.fromFunction1(isFunction))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[TypeofUtils]
    }
    
    @scala.inline
    implicit class TypeofUtilsMutableBuilder[Self <: TypeofUtils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockParams(value: (js.Array[js.Any], js.Array[js.Any]) => js.Array[js.Any]): Self = StObject.set(x, "blockParams", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateFrame(value: js.Any => js.Any): Self = StObject.set(x, "createFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEscapeExpression(value: String => String): Self = StObject.set(x, "escapeExpression", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtend(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "extend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsArray(value: js.Any => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: js.Any => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFunction(value: js.Any => Boolean): Self = StObject.set(x, "isFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToString_(value: js.Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofVM extends StObject {
    
    def resolvePartial[T](partial: Unit, context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
    def resolvePartial[T](partial: HandlebarsTemplateDelegate[T], context: js.Any, options: ResolvePartialOptions): HandlebarsTemplateDelegate[T] = js.native
  }
}
