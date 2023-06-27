package typings.googleMaps.global.google.maps

import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLSlotElement
import typings.std.StylePropertyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.MapElement")
@js.native
/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  *
  * MapElement is an <code>HTMLElement</code> subclass for rendering maps.
  * After loading the <code>maps</code> library, a map can be created in
  * HTML. For example:<br> <code>&lt;gmp-map
  * center=&quot;37.4220656,-122.0840897&quot; zoom=&quot;10&quot;
  * map-id=&quot;DEMO_MAP_ID&quot;&gt;&lt;/gmp-map&gt;</code><br> <br>
  * Internally, it uses {@link google.maps.Map}, which can be accessed with
  * the <code>innerMap</code> property.
  *
  * Access by calling `const {MapElement} = await
  * google.maps.importLibrary("maps")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class MapElement ()
  extends StObject
     with typings.googleMaps.google.maps.MapElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAtomic) */
  /* standard dom */
  /* CompleteClass */
  var ariaAtomic: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAutoComplete) */
  /* standard dom */
  /* CompleteClass */
  var ariaAutoComplete: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBusy) */
  /* standard dom */
  /* CompleteClass */
  var ariaBusy: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaChecked) */
  /* standard dom */
  /* CompleteClass */
  var ariaChecked: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColCount) */
  /* standard dom */
  /* CompleteClass */
  var ariaColCount: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColIndex) */
  /* standard dom */
  /* CompleteClass */
  var ariaColIndex: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColSpan) */
  /* standard dom */
  /* CompleteClass */
  var ariaColSpan: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaCurrent) */
  /* standard dom */
  /* CompleteClass */
  var ariaCurrent: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDisabled) */
  /* standard dom */
  /* CompleteClass */
  var ariaDisabled: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaExpanded) */
  /* standard dom */
  /* CompleteClass */
  var ariaExpanded: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHasPopup) */
  /* standard dom */
  /* CompleteClass */
  var ariaHasPopup: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHidden) */
  /* standard dom */
  /* CompleteClass */
  var ariaHidden: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaInvalid: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaKeyShortcuts) */
  /* standard dom */
  /* CompleteClass */
  var ariaKeyShortcuts: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLabel) */
  /* standard dom */
  /* CompleteClass */
  var ariaLabel: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLevel) */
  /* standard dom */
  /* CompleteClass */
  var ariaLevel: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLive) */
  /* standard dom */
  /* CompleteClass */
  var ariaLive: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaModal) */
  /* standard dom */
  /* CompleteClass */
  var ariaModal: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiLine) */
  /* standard dom */
  /* CompleteClass */
  var ariaMultiLine: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiSelectable) */
  /* standard dom */
  /* CompleteClass */
  var ariaMultiSelectable: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaOrientation) */
  /* standard dom */
  /* CompleteClass */
  var ariaOrientation: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPlaceholder) */
  /* standard dom */
  /* CompleteClass */
  var ariaPlaceholder: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPosInSet) */
  /* standard dom */
  /* CompleteClass */
  var ariaPosInSet: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPressed) */
  /* standard dom */
  /* CompleteClass */
  var ariaPressed: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaReadOnly) */
  /* standard dom */
  /* CompleteClass */
  var ariaReadOnly: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRequired) */
  /* standard dom */
  /* CompleteClass */
  var ariaRequired: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRoleDescription) */
  /* standard dom */
  /* CompleteClass */
  var ariaRoleDescription: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowCount) */
  /* standard dom */
  /* CompleteClass */
  var ariaRowCount: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowIndex) */
  /* standard dom */
  /* CompleteClass */
  var ariaRowIndex: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowSpan) */
  /* standard dom */
  /* CompleteClass */
  var ariaRowSpan: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSelected) */
  /* standard dom */
  /* CompleteClass */
  var ariaSelected: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSetSize) */
  /* standard dom */
  /* CompleteClass */
  var ariaSetSize: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSort) */
  /* standard dom */
  /* CompleteClass */
  var ariaSort: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueMax) */
  /* standard dom */
  /* CompleteClass */
  var ariaValueMax: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueMin) */
  /* standard dom */
  /* CompleteClass */
  var ariaValueMin: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueNow) */
  /* standard dom */
  /* CompleteClass */
  var ariaValueNow: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueText) */
  /* standard dom */
  /* CompleteClass */
  var ariaValueText: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/assignedSlot) */
  /* standard dom */
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val attributeStyleMap: StylePropertyMap = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/contentEditable) */
  /* standard dom */
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/enterKeyHint) */
  /* standard dom */
  /* CompleteClass */
  var enterKeyHint: String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/innerHTML) */
  /* standard dom */
  /* CompleteClass */
  var innerHTML: String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode) */
  /* standard dom */
  /* CompleteClass */
  var inputMode: String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/isContentEditable) */
  /* standard dom */
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/nextElementSibling)
    */
  /* standard dom */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/previousElementSibling)
    */
  /* standard dom */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  var role: String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/style) */
  /* standard dom */
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}
