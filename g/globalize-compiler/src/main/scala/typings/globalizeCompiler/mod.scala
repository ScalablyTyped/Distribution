package typings.globalizeCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Program
import typings.globalize.distGlobalizeMod.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("globalize-compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(formattersAndParsers: js.Array[FormatterOrParserFunction]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(formattersAndParsers.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def compile(formattersAndParsers: js.Array[FormatterOrParserFunction], options: CompileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(formattersAndParsers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def compile(formattersAndParsers: StringDictionary[FormatterOrParserFunction]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(formattersAndParsers.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def compile(formattersAndParsers: StringDictionary[FormatterOrParserFunction], options: CompileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(formattersAndParsers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def compileExtracts(attributes: CompileExtractsAttributes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compileExtracts")(attributes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extract(input: String): ExtractFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(input.asInstanceOf[js.Any]).asInstanceOf[ExtractFunction]
  inline def extract(input: Program): ExtractFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(input.asInstanceOf[js.Any]).asInstanceOf[ExtractFunction]
  
  trait CompileExtractsAttributes
    extends StObject
       with CompileOptions {
    
    /**
      * an Object with CLDR data (in the JSON format) or a Function taking one argument: locale, a String; returning
      *  an Object with the CLDR data for the passed locale. Defaults to the entire supplemental data plus the entire
      *  main data for the defaultLocale.
      */
    var cldr: js.UndefOr[js.Object | (js.Function1[/* locale */ String, js.Object])] = js.undefined
    
    /**
      * a locale to be used as Globalize.locale(defaultLocale) when generating the extracted formatters and parsers.
      */
    var defaultLocale: String
    
    /**
      * an Array of extracts obtained by @see{GlobalizeCompilerStatic.extract}
      */
    var extracts: ExtractFunction | js.Array[ExtractFunction]
    
    /**
      * an Object with messages data (in the JSON format) or a Function taking one argument: locale, a String; returning
      *  an Object with the messages data for the passed locale. Defaults to {}.
      */
    var messages: js.UndefOr[js.Object | (js.Function1[/* locale */ String, js.Object])] = js.undefined
  }
  object CompileExtractsAttributes {
    
    inline def apply(defaultLocale: String, extracts: ExtractFunction | js.Array[ExtractFunction]): CompileExtractsAttributes = {
      val __obj = js.Dynamic.literal(defaultLocale = defaultLocale.asInstanceOf[js.Any], extracts = extracts.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileExtractsAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileExtractsAttributes] (val x: Self) extends AnyVal {
      
      inline def setCldr(value: js.Object | (js.Function1[/* locale */ String, js.Object])): Self = StObject.set(x, "cldr", value.asInstanceOf[js.Any])
      
      inline def setCldrFunction1(value: /* locale */ String => js.Object): Self = StObject.set(x, "cldr", js.Any.fromFunction1(value))
      
      inline def setCldrUndefined: Self = StObject.set(x, "cldr", js.undefined)
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setExtracts(value: ExtractFunction | js.Array[ExtractFunction]): Self = StObject.set(x, "extracts", value.asInstanceOf[js.Any])
      
      inline def setExtractsFunction1(value: /* globalize */ Static => js.Array[FormatterOrParserFunction]): Self = StObject.set(x, "extracts", js.Any.fromFunction1(value))
      
      inline def setExtractsVarargs(value: ExtractFunction*): Self = StObject.set(x, "extracts", js.Array(value*))
      
      inline def setMessages(value: js.Object | (js.Function1[/* locale */ String, js.Object])): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesFunction1(value: /* locale */ String => js.Object): Self = StObject.set(x, "messages", js.Any.fromFunction1(value))
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    }
  }
  
  trait CompileOptions extends StObject {
    
    /**
      * A function that replaces the default template.
      */
    var template: js.UndefOr[js.Function1[/* options */ CompileTemplateOptions, String]] = js.undefined
  }
  object CompileOptions {
    
    inline def apply(): CompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileOptions] (val x: Self) extends AnyVal {
      
      inline def setTemplate(value: /* options */ CompileTemplateOptions => String): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait CompileTemplateOptions extends StObject {
    
    /**
      * the source of the compiled formatters and parsers.
      */
    var code: String
    
    /**
      * a list of globalize runtime modules that the compiled code depends on, e.g. globalize-runtime/number.
      */
    var dependencies: js.Array[String]
  }
  object CompileTemplateOptions {
    
    inline def apply(code: String, dependencies: js.Array[String]): CompileTemplateOptions = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    }
  }
  
  type ExtractFunction = js.Function1[/* globalize */ Static, js.Array[FormatterOrParserFunction]]
  
  type FormatterOrParserFunction = js.Function1[/* repeated */ Any, Any]
}
