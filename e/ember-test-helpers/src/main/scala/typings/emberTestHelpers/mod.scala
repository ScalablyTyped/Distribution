package typings.emberTestHelpers

import org.scalablytyped.runtime.StringDictionary
import typings.ember.mod.default.Application
import typings.ember.mod.default.Container
import typings.ember.mod.default.EventDispatcher
import typings.ember.mod.default.Registry
import typings.ember.mod.default.Resolver
import typings.emberTestHelpers.anon.ApplicationInstancefactor
import typings.emberTestHelpers.anon.Controller
import typings.jquery.JQuery
import typings.jquery.JQuery.PlainObject
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.htmlString
import typings.jquery.JQueryStatic
import typings.rsvp.mod.default.Promise
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import typings.std.Pick
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ember-test-helpers", "TestModule")
  @js.native
  class TestModule protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String) = this()
    def this(name: String, description: js.UndefOr[scala.Nothing], callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String, callbacks: ModuleCallbacks) = this()
    
    var callbacks: ModuleCallbacks = js.native
    
    var context: TestContext = js.native
    
    var description: String = js.native
    
    def getContext(): TestContext = js.native
    
    var isIntegration: Boolean = js.native
    
    var name: String = js.native
    
    var resolver: Resolver = js.native
    
    def setContext(context: TestContext): Unit = js.native
    
    def setup(): Promise[Unit] = js.native
    def setup(assert: js.Any): Promise[Unit] = js.native
    
    var subjectName: String = js.native
    
    def teardown(): Promise[Unit] = js.native
    def teardown(assert: js.Any): Promise[Unit] = js.native
  }
  
  @JSImport("ember-test-helpers", "TestModuleForAcceptance")
  @js.native
  class TestModuleForAcceptance protected () extends TestModule {
    def this(name: String) = this()
    def this(name: String, callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String) = this()
    def this(name: String, description: js.UndefOr[scala.Nothing], callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String, callbacks: ModuleCallbacks) = this()
  }
  
  @JSImport("ember-test-helpers", "TestModuleForComponent")
  @js.native
  class TestModuleForComponent protected () extends TestModule {
    def this(name: String) = this()
    def this(name: String, callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String) = this()
    def this(name: String, description: js.UndefOr[scala.Nothing], callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String, callbacks: ModuleCallbacks) = this()
  }
  
  @JSImport("ember-test-helpers", "TestModuleForIntegration")
  @js.native
  class TestModuleForIntegration protected () extends TestModule {
    def this(name: String) = this()
    def this(name: String, callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String) = this()
    def this(name: String, description: js.UndefOr[scala.Nothing], callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String, callbacks: ModuleCallbacks) = this()
  }
  
  @JSImport("ember-test-helpers", "TestModuleForModel")
  @js.native
  class TestModuleForModel protected () extends TestModule {
    def this(name: String) = this()
    def this(name: String, callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String) = this()
    def this(name: String, description: js.UndefOr[scala.Nothing], callbacks: ModuleCallbacks) = this()
    def this(name: String, description: String, callbacks: ModuleCallbacks) = this()
  }
  
  @JSImport("ember-test-helpers", "getContext")
  @js.native
  def getContext(): js.UndefOr[TestContext] = js.native
  
  @JSImport("ember-test-helpers", "setContext")
  @js.native
  def setContext(context: TestContext): Unit = js.native
  
  @JSImport("ember-test-helpers", "setResolver")
  @js.native
  def setResolver(resolver: Resolver): Unit = js.native
  
  @JSImport("ember-test-helpers", "unsetContext")
  @js.native
  def unsetContext(): Unit = js.native
  
  @js.native
  trait ModuleCallbacks
    extends /* key */ StringDictionary[js.Any] {
    
    var afterTeardown: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
    
    var beforeSetup: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
    
    var integration: js.UndefOr[Boolean] = js.native
    
    var needs: js.UndefOr[js.Array[String]] = js.native
    
    var setup: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
    
    var teardown: js.UndefOr[js.Function1[/* assert */ js.UndefOr[js.Any], Unit]] = js.native
    
    var unit: js.UndefOr[Boolean] = js.native
  }
  object ModuleCallbacks {
    
    @scala.inline
    def apply(): ModuleCallbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleCallbacks]
    }
    
    @scala.inline
    implicit class ModuleCallbacksMutableBuilder[Self <: ModuleCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterTeardown(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterTeardown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterTeardownUndefined: Self = StObject.set(x, "afterTeardown", js.undefined)
      
      @scala.inline
      def setBeforeSetup(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeSetup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeSetupUndefined: Self = StObject.set(x, "beforeSetup", js.undefined)
      
      @scala.inline
      def setIntegration(value: Boolean): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
      
      @scala.inline
      def setNeeds(value: js.Array[String]): Self = StObject.set(x, "needs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsUndefined: Self = StObject.set(x, "needs", js.undefined)
      
      @scala.inline
      def setNeedsVarargs(value: String*): Self = StObject.set(x, "needs", js.Array(value :_*))
      
      @scala.inline
      def setSetup(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      @scala.inline
      def setTeardown(value: /* assert */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
      
      @scala.inline
      def setUnit(value: Boolean): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  @js.native
  trait TestContext extends StObject {
    
    /**
      * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
      * @param element A DOM element to wrap in a jQuery object.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      * @example ​ ````Set the background color of the page to black.
    ```javascript
    $( document.body ).css( "background", "black" );
    ```
      */
    // NOTE: `HTMLSelectElement` is both an Element and an Array-Like Object but jQuery treats it as an Element.
    @JSName("$")
    def $(element: HTMLSelectElement): JQuery[HTMLSelectElement] = js.native
    // HACK: This is the factory function returned when importing jQuery without a DOM. Declaring it separately breaks using the type parameter on JQueryStatic.
    // HACK: The discriminator parameter handles the edge case of passing a Window object to JQueryStatic. It doesn't actually exist on the factory function.
    @JSName("$")
    def $(window: Window, discriminator: Boolean): JQueryStatic = js.native
    /**
      * Returns an empty jQuery set.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.4
      */
    // tslint:disable-next-line:no-unnecessary-generics
    @JSName("$")
    def $[TElement](): JQuery[TElement] = js.native
    /**
      * Binds a function to be executed when the DOM has finished loading.
      * @param callback The function to execute when the DOM is ready.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      * @example ​ ````Execute the function when the DOM is ready to be used.
    ```javascript
    $(function() {
      // Document is ready
    });
    ```
      * @example ​ ````Use both the shortcut for $(document).ready() and the argument to write failsafe jQuery code using the $ alias, without relying on the global alias.
    ```javascript
    jQuery(function( $ ) {
      // Your code using failsafe $ alias here...
    });
    ```
      */
    // tslint:disable-next-line:no-unnecessary-generics unified-signatures
    @JSName("$")
    def $[TElement](callback: js.ThisFunction1[/* this */ Document, /* $ */ this.type, Unit]): JQuery[TElement] = js.native
    /**
      * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
      * @param element_elementArray _&#x40;param_ `element_elementArray`
      * <br>
      * * `element` — A DOM element to wrap in a jQuery object. <br>
      * * `elementArray` — An array containing a set of DOM elements to wrap in a jQuery object.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      * @example ​ ````Set the background color of the page to black.
    ```javascript
    $( document.body ).css( "background", "black" );
    ```
      * @example ​ ````Hide all the input elements within a form.
    ```javascript
    $( myForm.elements ).hide();
    ```
      */
    @JSName("$")
    def $[T /* <: Element */](element_elementArray: T): JQuery[T] = js.native
    @JSName("$")
    def $[T /* <: Element */](element_elementArray: ArrayLike[T]): JQuery[T] = js.native
    /**
      * Creates DOM elements on the fly from the provided string of raw HTML.
      * @param html _&#x40;param_ `html`
      * <br>
      * * `html (ownerDocument)` — A string of HTML to create on the fly. Note that this parses HTML, not XML. <br>
      * * `html (attributes)` — A string defining a single, standalone, HTML element (e.g. &lt;div/&gt; or &lt;div&gt;&lt;/div&gt;).
      * @param ownerDocument_attributes _&#x40;param_ `ownerDocument_attributes`
      * <br>
      * * `ownerDocument` — A document in which the new elements will be created. <br>
      * * `attributes` — An object of attributes, events, and methods to call on the newly-created element.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      * @since 1.4
      * @example ​ ````Create a div element (and all of its contents) dynamically and append it to the body element. Internally, an element is created and its innerHTML property set to the given markup.
    ```javascript
    $( "<div><p>Hello</p></div>" ).appendTo( "body" )
    ```
      * @example ​ ````Create some DOM elements.
    ```javascript
    $( "<div/>", {
      "class": "test",
      text: "Click me!",
      click: function() {
      $( this ).toggleClass( "test" );
      }
    })
      .appendTo( "body" );
    ```
      */
    // tslint:disable-next-line:no-unnecessary-generics
    @JSName("$")
    def $[TElement /* <: HTMLElement */](html: htmlString): JQuery[TElement] = js.native
    @JSName("$")
    def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: PlainObject[_]): JQuery[TElement] = js.native
    @JSName("$")
    def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: Document): JQuery[TElement] = js.native
    /**
      * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
      * @param selection An existing jQuery object to clone.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      */
    @JSName("$")
    def $[T](selection: JQuery[T]): JQuery[T] = js.native
    @JSName("$")
    def $[TElement /* <: Element */](selector: Selector, context: JQuery[HTMLElement]): JQuery[TElement] = js.native
    @JSName("$")
    def $[TElement /* <: Element */](selector: Selector, context: Selector): JQuery[TElement] = js.native
    @JSName("$")
    def $[TElement /* <: Element */](selector: Selector, context: Element): JQuery[TElement] = js.native
    @JSName("$")
    var $_Original: JQueryStatic = js.native
    /**
      * Accepts a string containing a CSS selector which is then used to match a set of elements.
      * @param selector A string containing a selector expression
      * @param context A DOM Element, Document, Selector or jQuery to use as context
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      * @example ​ ````Find all p elements that are children of a div element and apply a border to them.
    ```html
    <!doctype html>
    <html lang="en">
    <head>
      <meta charset="utf-8">
      <title>jQuery demo</title>
      <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    </head>
    <body>
    ​
    <p>one</p>
    <div><p>two</p></div>
    <p>three</p>
    ​
    <script>
    $( "div > p" ).css( "border", "1px solid gray" );
    </script>
    </body>
    </html>
    ```
      * @example ​ ````Find all inputs of type radio within the first form in the document.
    ```javascript
    $( "input:radio", document.forms[ 0 ] );
    ```
      * @example ​ ````Find all div elements within an XML document from an Ajax response.
    ```javascript
    $( "div", xml.responseXML );
    ```
    ​
      */
    // tslint:disable-next-line:no-unnecessary-generics
    @JSName("$")
    def $_TElement_Element[TElement /* <: Element */](selector: Selector): JQuery[TElement] = js.native
    @JSName("$")
    def $_TElement_Element[TElement /* <: Element */](selector: Selector, context: Document): JQuery[TElement] = js.native
    /**
      * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
      * @param object A plain object to wrap in a jQuery object.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      */
    @JSName("$")
    def $_T_PlainObjectWildcard[T /* <: PlainObject[_] */](`object`: T): JQuery[T] = js.native
    
    var application: Application = js.native
    
    def clearRender(): Unit = js.native
    
    var container: Container = js.native
    
    var dispatcher: EventDispatcher = js.native
    
    var element: Element = js.native
    
    def factory(fullName: String): js.Any = js.native
    
    def get(key: String): js.Any = js.native
    
    def getProperties[K /* <: String */](keys: K*): Pick[_, K] = js.native
    
    var inject: Controller = js.native
    
    def on(actionName: String, handler: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, _]): Unit = js.native
    
    var owner: ApplicationInstancefactor = js.native
    
    def pauseTest(): js.Promise[Unit] = js.native
    
    def register(fullName: String, factory: js.Any): Unit = js.native
    
    var registry: Registry = js.native
    
    def render(): js.Promise[Unit] = js.native
    def render(template: String): js.Promise[Unit] = js.native
    def render(
      template: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateFactory */ js.Any
    ): js.Promise[Unit] = js.native
    def render(template: js.Array[String]): js.Promise[Unit] = js.native
    
    def resumeTest(): Unit = js.native
    
    def send(actionName: String): Unit = js.native
    
    def set[V](key: String, value: V): V = js.native
    
    def setProperties[P /* <: StringDictionary[js.Any] */](hash: P): P = js.native
    
    def subject(): js.Any = js.native
    def subject(options: js.Object): js.Any = js.native
  }
}
