package typings.emberComponent

import typings.jquery.JQueryStatic
import typings.jquery.JQuery_
import typings.jquery.JQuery_.PlainObject
import typings.jquery.JQuery_.Selector
import typings.jquery.JQuery_.htmlString
import typings.std.ArrayLike
import typings.std.Document_
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/component/-private/view-mixin", JSImport.Namespace)
@js.native
object viewMixinMod extends js.Object {
  @js.native
  trait ViewMixin extends js.Object {
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    var $_Original: JQueryStatic = js.native
    /**
      * A list of properties of the view to apply as attributes. If the property
      * is a string value, the value of that string will be applied as the value
      * for an attribute of the property's name.
      */
    var attributeBindings: js.Array[String] = js.native
    /**
      * Returns the current DOM element for the view.
      */
    var element: Element = js.native
    /**
      * The HTML `id` of the view's element in the DOM. You can provide this
      * value yourself but it must be unique (just as in HTML):
      */
    var elementId: String = js.native
    /**
      * Tag name for the view's outer element. The tag name is only used when an
      * element is first created. If you change the `tagName` for an element, you
      * must destroy and recreate the view element.
      */
    var tagName: String = js.native
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
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $(element: HTMLSelectElement): JQuery_[HTMLSelectElement] = js.native
    // HACK: This is the factory function returned when importing jQuery without a DOM. Declaring it separately breaks using the type parameter on JQueryStatic.
    // HACK: The discriminator parameter handles the edge case of passing a Window object to JQueryStatic. It doesn't actually exist on the factory function.
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $(window: Window_, discriminator: Boolean): JQueryStatic = js.native
    /**
      * Returns an empty jQuery set.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.4
      */
    // tslint:disable-next-line:no-unnecessary-generics
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[TElement](): JQuery_[TElement] = js.native
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
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[TElement](callback: js.ThisFunction1[/* this */ Document_, /* $ */ this.type, Unit]): JQuery_[TElement] = js.native
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[T /* <: Element */](element_elementArray: ArrayLike[T]): JQuery_[T] = js.native
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
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[TElement /* <: HTMLElement */](html: htmlString): JQuery_[TElement] = js.native
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: PlainObject[_]): JQuery_[TElement] = js.native
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: Document_): JQuery_[TElement] = js.native
    /**
      * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
      * @param object A plain object to wrap in a jQuery object.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      */
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[T /* <: PlainObject[_] */](`object`: T): JQuery_[T] = js.native
    /**
      * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
      * @param selection An existing jQuery object to clone.
      * @see \`{@link https://api.jquery.com/jQuery/ }\`
      * @since 1.0
      */
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[T](selection: JQuery_[T]): JQuery_[T] = js.native
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[TElement /* <: Element */](selector: Selector, context: JQuery_[HTMLElement]): JQuery_[TElement] = js.native
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $[TElement /* <: Element */](selector: Selector, context: Element): JQuery_[TElement] = js.native
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
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $_TElement_Element[TElement /* <: Element */](selector: Selector): JQuery_[TElement] = js.native
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $_TElement_Element[TElement /* <: Element */](selector: Selector, context: Document_): JQuery_[TElement] = js.native
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
    /**
      * Returns a jQuery object for this view's element. If you pass in a selector
      * string, this method will return a jQuery object, using the current element
      * as its buffer.
      */
    @JSName("$")
    def $_T_Element[T /* <: Element */](element_elementArray: T): JQuery_[T] = js.native
    /**
      * Called when the element of the view has been inserted into the DOM.
      * Override this function to do any set up that requires an element
      * in the document body.
      */
    def didInsertElement(): Unit = js.native
    /**
      * Renders the view again. This will work regardless of whether the
      * view is already in the DOM or not. If the view is in the DOM, the
      * rendering process will be deferred to give bindings a chance
      * to synchronize.
      */
    def rerender(): Unit = js.native
    /**
      * Called when the view is about to rerender, but before anything has
      * been torn down. This is a good opportunity to tear down any manual
      * observers you have installed based on the DOM state
      */
    def willClearRender(): Unit = js.native
    /**
      * Called when the element of the view is going to be destroyed. Override
      * this function to do any teardown that requires an element, like removing
      * event listeners.
      */
    def willDestroyElement(): Unit = js.native
    /**
      * Called when a view is going to insert an element into the DOM.
      */
    def willInsertElement(): Unit = js.native
  }
  
  val default: typings.emberObject.mixinMod.default[ViewMixin, typings.emberObject.mod.default] = js.native
}

