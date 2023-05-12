package typings.fluentBundle

import typings.fluentBundle.anon.AllowOverrides
import typings.fluentBundle.anon.Functions
import typings.fluentBundle.esmAstMod.Message
import typings.fluentBundle.esmAstMod.Pattern
import typings.fluentBundle.esmAstMod.Term
import typings.fluentBundle.esmMemoizerMod.IntlCache
import typings.fluentBundle.esmResourceMod.FluentResource
import typings.fluentBundle.esmTypesMod.FluentFunction
import typings.fluentBundle.esmTypesMod.FluentValue
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBundleMod {
  
  @JSImport("@fluent/bundle/esm/bundle", "FluentBundle")
  @js.native
  open class FluentBundle protected () extends StObject {
    /**
      * Create an instance of `FluentBundle`.
      *
      * @example
      * ```js
      * let bundle = new FluentBundle(["en-US", "en"]);
      *
      * let bundle = new FluentBundle(locales, {useIsolating: false});
      *
      * let bundle = new FluentBundle(locales, {
      *   useIsolating: true,
      *   functions: {
      *     NODE_ENV: () => process.env.NODE_ENV
      *   }
      * });
      * ```
      *
      * @param locales - Used to instantiate `Intl` formatters used by translations.
      * @param options - Optional configuration for the bundle.
      */
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, param1: Functions) = this()
    def this(locales: js.Array[String], param1: Functions) = this()
    
    /** @ignore */
    var _functions: Record[String, FluentFunction] = js.native
    
    /** @ignore */
    var _intls: IntlCache = js.native
    
    /** @ignore */
    var _messages: Map[String, Message] = js.native
    
    /** @ignore */
    var _terms: Map[String, Term] = js.native
    
    /** @ignore */
    def _transform(text: String): String = js.native
    /** @ignore */
    @JSName("_transform")
    var _transform_Original: TextTransform = js.native
    
    /** @ignore */
    var _useIsolating: Boolean = js.native
    
    /**
      * Add a translation resource to the bundle.
      *
      * @example
      * ```js
      * let res = new FluentResource("foo = Foo");
      * bundle.addResource(res);
      * bundle.getMessage("foo");
      * // → {value: .., attributes: {..}}
      * ```
      *
      * @param res
      * @param options
      */
    def addResource(res: FluentResource): js.Array[js.Error] = js.native
    def addResource(res: FluentResource, param1: AllowOverrides): js.Array[js.Error] = js.native
    
    /**
      * Format a `Pattern` to a string.
      *
      * Format a raw `Pattern` into a string. `args` will be used to resolve
      * references to variables passed as arguments to the translation.
      *
      * In case of errors `formatPattern` will try to salvage as much of the
      * translation as possible and will still return a string. For performance
      * reasons, the encountered errors are not returned but instead are appended
      * to the `errors` array passed as the third argument.
      *
      * If `errors` is omitted, the first encountered error will be thrown.
      *
      * @example
      * ```js
      * let errors = [];
      * bundle.addResource(
      *     new FluentResource("hello = Hello, {$name}!"));
      *
      * let hello = bundle.getMessage("hello");
      * if (hello.value) {
      *     bundle.formatPattern(hello.value, {name: "Jane"}, errors);
      *     // Returns "Hello, Jane!" and `errors` is empty.
      *
      *     bundle.formatPattern(hello.value, undefined, errors);
      *     // Returns "Hello, {$name}!" and `errors` is now:
      *     // [<ReferenceError: Unknown variable: name>]
      * }
      * ```
      */
    def formatPattern(pattern: Pattern): String = js.native
    def formatPattern(pattern: Pattern, args: Null, errors: js.Array[js.Error]): String = js.native
    def formatPattern(pattern: Pattern, args: Unit, errors: js.Array[js.Error]): String = js.native
    def formatPattern(pattern: Pattern, args: Record[String, FluentVariable]): String = js.native
    def formatPattern(pattern: Pattern, args: Record[String, FluentVariable], errors: js.Array[js.Error]): String = js.native
    
    /**
      * Return a raw unformatted message object from the bundle.
      *
      * Raw messages are `{value, attributes}` shapes containing translation units
      * called `Patterns`. `Patterns` are implementation-specific; they should be
      * treated as black boxes and formatted with `FluentBundle.formatPattern`.
      *
      * @param id - The identifier of the message to check.
      */
    def getMessage(id: String): js.UndefOr[Message] = js.native
    
    /**
      * Check if a message is present in the bundle.
      *
      * @param id - The identifier of the message to check.
      */
    def hasMessage(id: String): Boolean = js.native
    
    var locales: js.Array[String] = js.native
  }
  
  type FluentVariable = FluentValue | String | Double | js.Date
  
  type TextTransform = js.Function1[/* text */ String, String]
}
