package typings.emberDashTestDashHelpers.emberDashTestDashHelpersMod

import org.scalablytyped.runtime.StringDictionary
import typings.ember.emberMod.default.Application
import typings.ember.emberMod.default.ApplicationInstance
import typings.ember.emberMod.default.Container
import typings.ember.emberMod.default.EventDispatcher
import typings.ember.emberMod.default.Registry
import typings.emberDashTestDashHelpers.Anon_Controller
import typings.emberDashTestDashHelpers.Anon_FactoryFor
import typings.jquery.JQuery
import typings.jquery.JQuery.PlainObject
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.htmlString
import typings.jquery.JQueryStatic
import typings.std.ArrayLike
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import typings.std.Pick
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestContext extends js.Object {
  @JSName("$")
  var $_Original: JQueryStatic = js.native
  var application: Application = js.native
  var container: Container = js.native
  var dispatcher: EventDispatcher = js.native
  var element: Element = js.native
  var inject: Anon_Controller = js.native
  var owner: ApplicationInstance with Anon_FactoryFor = js.native
  var registry: Registry = js.native
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
    * @param object A plain object to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  @JSName("$")
  def $[T /* <: PlainObject[_] */](`object`: T): JQuery[T] = js.native
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
  def $[TElement /* <: Element */](selector: Selector, context: Element): JQuery[TElement] = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    * @param selector A string containing a selector expression
    * @param context A DOM Element, Document, or jQuery to use as context
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
  def $_T_Element[T /* <: Element */](element_elementArray: T): JQuery[T] = js.native
  def clearRender(): Unit = js.native
  def factory(fullName: String): js.Any = js.native
  def get(key: String): js.Any = js.native
  def getProperties[K /* <: String */](keys: K*): Pick[_, K] = js.native
  def on(actionName: String, handler: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, _]): Unit = js.native
  def pauseTest(): js.Promise[Unit] = js.native
  def register(fullName: String, factory: js.Any): Unit = js.native
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

