package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.MapsEventListener
import typings.googleMaps.google.maps.marker.AdvancedMarkerElementOptions
import typings.googleMaps.google.maps.marker.PinElementOptions
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.Event
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object marker {
  
  @JSGlobal("google.maps.marker.AdvancedMarkerClickEvent")
  @js.native
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    *
    * This event is created from clicking an Advanced Marker. Access the
    * marker&#39;s position with <code>event.target.position</code>.
    *
    * Access by calling `const {AdvancedMarkerClickEvent} = await
    * google.maps.importLibrary("marker")`. See
    * https://developers.google.com/maps/documentation/javascript/libraries.
    */
  open class AdvancedMarkerClickEvent ()
    extends StObject
       with Event
  
  @JSGlobal("google.maps.marker.AdvancedMarkerElement")
  @js.native
  /**
    * Shows a position on a map. Note that the <code>position</code> must be
    * set for the <code>AdvancedMarkerElement</code> to display.<br> <br>
    * <strong>Note:</strong> Usage as a Web Component (e.g. using the custom
    * <code>&lt;gmp-advanced-marker</code> HTML element, is only available in
    * the <code>v=beta</code> channel).
    *
    * Access by calling `const {AdvancedMarkerElement} = await
    * google.maps.importLibrary("marker")`. See
    * https://developers.google.com/maps/documentation/javascript/libraries.
    */
  open class AdvancedMarkerElement ()
    extends StObject
       with typings.googleMaps.google.maps.marker.AdvancedMarkerElement {
    def this(options: AdvancedMarkerElementOptions) = this()
    
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
  
  @JSGlobal("google.maps.marker.PinElement")
  @js.native
  /**
    * A <code>PinElement</code> represents a DOM element that consists of a
    * shape and a glyph. The shape has the same balloon style as seen in the
    * default {@link google.maps.marker.AdvancedMarkerElement}. The glyph is an
    * optional DOM element displayed in the balloon shape. A
    * <code>PinElement</code> may have a different aspect ratio depending on
    * its {@link google.maps.marker.PinElement.scale}.
    *
    * Access by calling `const {PinElement} = await
    * google.maps.importLibrary("marker")`. See
    * https://developers.google.com/maps/documentation/javascript/libraries.
    */
  open class PinElement ()
    extends StObject
       with typings.googleMaps.google.maps.marker.PinElement {
    def this(options: PinElementOptions) = this()
    
    /**
      * Adds the given listener function to the given event name.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * This field is read-only. The DOM Element backing the view.
      */
    /* CompleteClass */
    var element: HTMLElement = js.native
  }
}
