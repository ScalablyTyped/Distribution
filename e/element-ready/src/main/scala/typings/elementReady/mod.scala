package typings.elementReady

import typings.std.AsyncIterable
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("element-ready", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ElementName /* <: Element */](selector: String): StoppablePromise[js.UndefOr[ElementName]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[StoppablePromise[js.UndefOr[ElementName]]]
  inline def default[ElementName /* <: Element */](selector: String, options: Options): StoppablePromise[js.UndefOr[ElementName]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StoppablePromise[js.UndefOr[ElementName]]]
  inline def default[Selector /* <: String */, ElementName /* <: Element */](selector: Selector): StoppablePromise[js.UndefOr[ElementName]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[StoppablePromise[js.UndefOr[ElementName]]]
  inline def default[Selector /* <: String */, ElementName /* <: Element */](selector: Selector, options: Options): StoppablePromise[js.UndefOr[ElementName]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StoppablePromise[js.UndefOr[ElementName]]]
  
  inline def observeReadyElements[ElementName /* <: Element */](selector: String): AsyncIterable[ElementName] = ^.asInstanceOf[js.Dynamic].applyDynamic("observeReadyElements")(selector.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[ElementName]]
  inline def observeReadyElements[ElementName /* <: Element */](selector: String, options: Options): AsyncIterable[ElementName] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeReadyElements")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[ElementName]]
  inline def observeReadyElements[Selector /* <: String */, ElementName /* <: Element */](selector: Selector): AsyncIterable[ElementName] = ^.asInstanceOf[js.Dynamic].applyDynamic("observeReadyElements")(selector.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[ElementName]]
  inline def observeReadyElements[Selector /* <: String */, ElementName /* <: Element */](selector: Selector, options: Options): AsyncIterable[ElementName] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeReadyElements")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[ElementName]]
  
  trait Options extends StObject {
    
    /**
    	A predicate function will be called for each element that matches the selector. If it returns `true`, the element will be returned.
    	@default undefined
    	For example, if the content is dynamic or a selector cannot be specific enough, you could check `.textContent` of each element and only match the one that has the required text.
    	@example
    	```html
    	<ul id="country-list">
    		<li>country a</li>
    		...
    		<li>wanted country</li>
    		...
    	</ul>
    	```
    	```
    	import elementReady from 'element-ready';
    	const wantedCountryElement = await elementReady('#country-list li', {
    		predicate: listItemElement => listItemElement.textContent === 'wanted country'
    	});
    	```
    	*/
    var predicate: js.UndefOr[js.Function1[/* element */ HTMLElement, Boolean]] = js.undefined
    
    /**
    	Automatically stop checking for the element to be ready after the DOM ready event. The promise is then resolved to `undefined`.
    	@default true
    	*/
    val stopOnDomReady: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The element that's expected to contain a match.
    	@default document
    	*/
    val target: js.UndefOr[HTMLElement | Document] = js.undefined
    
    /**
    	Milliseconds to wait before stopping the search and resolving the promise to `undefined`.
    	@default Infinity
    	*/
    val timeout: js.UndefOr[Double] = js.undefined
    
    /**
    	Since the current document’s HTML is downloaded and parsed gradually, elements may appear in the DOM before _all_ of their children are “ready”.
    	By default, `element-ready` guarantees the element and all of its children have been parsed. This is useful if you want to interact with them or if you want to `.append()` something inside.
    	By setting this to `false`, `element-ready` will resolve the promise as soon as it finds the requested selector, regardless of its content. This is ok if you're just checking if the element exists or if you want to read/change its attributes.
    	@default true
    	*/
    val waitForChildren: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPredicate(value: /* element */ HTMLElement => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setStopOnDomReady(value: Boolean): Self = StObject.set(x, "stopOnDomReady", value.asInstanceOf[js.Any])
      
      inline def setStopOnDomReadyUndefined: Self = StObject.set(x, "stopOnDomReady", js.undefined)
      
      inline def setTarget(value: HTMLElement | Document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWaitForChildren(value: Boolean): Self = StObject.set(x, "waitForChildren", value.asInstanceOf[js.Any])
      
      inline def setWaitForChildrenUndefined: Self = StObject.set(x, "waitForChildren", js.undefined)
    }
  }
  
  @js.native
  trait StoppablePromise[T]
    extends StObject
       with Promise[T] {
    
    /**
    	Stop checking for the element to be ready. The stop is synchronous and the original promise is then resolved to `undefined`.
    	Calling it after the promise has settled or multiple times does nothing.
    	*/
    def stop(): Unit = js.native
  }
}
