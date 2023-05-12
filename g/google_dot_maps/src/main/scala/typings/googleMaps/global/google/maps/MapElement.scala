package typings.googleMaps.global.google.maps

import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLSlotElement
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
  
  /* standard dom */
  /* CompleteClass */
  var ariaAtomic: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaAutoComplete: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaBusy: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaChecked: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaColCount: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaColIndex: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaColSpan: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaCurrent: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaDisabled: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaExpanded: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaHasPopup: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaHidden: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaInvalid: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaKeyShortcuts: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaLabel: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaLevel: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaLive: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaModal: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaMultiLine: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaMultiSelectable: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaOrientation: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaPlaceholder: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaPosInSet: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaPressed: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaReadOnly: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRequired: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRoleDescription: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRowCount: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRowIndex: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaRowSpan: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaSelected: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaSetSize: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaSort: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaValueMax: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaValueMin: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaValueNow: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var ariaValueText: String | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  var contentEditable: String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var enterKeyHint: String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var innerHTML: String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var inputMode: String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  
  /** Returns the first following sibling that is an element, and null otherwise. */
  /* standard dom */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  
  /** Returns the first preceding sibling that is an element, and null otherwise. */
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
  
  /* standard dom */
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}
