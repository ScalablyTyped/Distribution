package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlFeature
  extends StObject
     with KmlObject {
  
  /**
    * Stores either the lookAt or camera view.
    */
  def getAbstractView(): KmlAbstractView
  
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  def getAddress(): String
  
  /**
    * Retrieves the contents of the feature's <ExtendedData> element.
    * The retrieved contents are scrubbed to remove JavaScript; CSS; and iframe, embed, and object tags. 
    * 
    * It should be safe to insert the resulting HTML into your page without concern for malicious content embedded in the feature data;
    * however any feature depending on CSS or Javascript will not work.
    */
  def getBalloonHtml(): String
  
  /**
    * Retrieves the contents of the feature's <ExtendedData> element. The contents are not scrubbed.
    * Use this method only if you trust the source of the feature data.
    */
  def getBalloonHtmlUnsafe(): String
  
  /**
    * Returns the computed style of a feature, merging any inline styles with styles imported from setHref() or a StyleUrl.
    *
    * Note: Modifying the returned KmlStyle object is undefined and not recommended.
    */
  def getComputedStyle(): KmlStyle
  
  /**
    * User-supplied text that appears in the description balloon.
    */
  def getDescription(): String
  
  /**
    * Returns the KML for a feature.
    */
  def getKml(): String
  
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  def getName(): String
  
  /**
    * Returns the next sibling node within the container.
    */
  def getNextSibling(): KmlFeature
  
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  def getOpacity(): Double
  
  /**
    * Default state of left panel.
    */
  def getOpen(): Boolean
  
  /**
    * Returns previous sibling node within the container.
    */
  def getPreviousSibling(): KmlFeature
  
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def getRegion(): KmlRegion
  
  /**
    * Specifies a short description of the feature.
    */
  def getSnippet(): String
  
  /**
    * The style based on the current mode of the Placemark.
    */
  def getStyleSelector(): KmlStyleSelector
  
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  def getStyleUrl(): String
  
  /**
    * Returns the KmlTimeStamp or KmlTimeSpan object associated with this feature.
    */
  def getTimePrimitive(): KmlTimePrimitive
  
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  def getVisibility(): Boolean
  
  /**
    * Stores either the lookAt or camera view.
    */
  def setAbstractView(abstractView: KmlAbstractView): Unit
  
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  def setAddress(address: String): Unit
  
  /**
    * User-supplied text that appears in the description balloon.
    */
  def setDescription(description: String): Unit
  
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  def setName(name: String): Unit
  
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  def setOpacity(opacity: Double): Unit
  
  /**
    * Default state of left panel.
    */
  def setOpen(open: Boolean): Unit
  
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def setRegion(region: KmlRegion): Unit
  
  /**
    * Specifies a short description of the feature.
    */
  def setSnippet(snippet: String): Unit
  
  /**
    * The style based on the current mode of the Placemark.
    */
  def setStyleSelector(styleSelector: KmlStyleSelector): Unit
  
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  def setStyleUrl(styleUrl: String): Unit
  
  /**
    * Attach a KmlTimeStamp or KmlTimeSpan object to this feature.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): Unit
  
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  def setVisibility(visibility: Boolean): Unit
}
object KmlFeature {
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
    getAbstractView: () => KmlAbstractView,
    getAddress: () => String,
    getBalloonHtml: () => String,
    getBalloonHtmlUnsafe: () => String,
    getComputedStyle: () => KmlStyle,
    getDescription: () => String,
    getId: () => String,
    getKml: () => String,
    getName: () => String,
    getNextSibling: () => KmlFeature,
    getOpacity: () => Double,
    getOpen: () => Boolean,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getPreviousSibling: () => KmlFeature,
    getRegion: () => KmlRegion,
    getSnippet: () => String,
    getStyleSelector: () => KmlStyleSelector,
    getStyleUrl: () => String,
    getTimePrimitive: () => KmlTimePrimitive,
    getType: () => String,
    getUrl: () => String,
    getVisibility: () => Boolean,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setAbstractView: KmlAbstractView => Unit,
    setAddress: String => Unit,
    setDescription: String => Unit,
    setName: String => Unit,
    setOpacity: Double => Unit,
    setOpen: Boolean => Unit,
    setRegion: KmlRegion => Unit,
    setSnippet: String => Unit,
    setStyleSelector: KmlStyleSelector => Unit,
    setStyleUrl: String => Unit,
    setTimePrimitive: KmlTimePrimitive => Unit,
    setVisibility: Boolean => Unit
  ): KmlFeature = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getAbstractView = js.Any.fromFunction0(getAbstractView), getAddress = js.Any.fromFunction0(getAddress), getBalloonHtml = js.Any.fromFunction0(getBalloonHtml), getBalloonHtmlUnsafe = js.Any.fromFunction0(getBalloonHtmlUnsafe), getComputedStyle = js.Any.fromFunction0(getComputedStyle), getDescription = js.Any.fromFunction0(getDescription), getId = js.Any.fromFunction0(getId), getKml = js.Any.fromFunction0(getKml), getName = js.Any.fromFunction0(getName), getNextSibling = js.Any.fromFunction0(getNextSibling), getOpacity = js.Any.fromFunction0(getOpacity), getOpen = js.Any.fromFunction0(getOpen), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getRegion = js.Any.fromFunction0(getRegion), getSnippet = js.Any.fromFunction0(getSnippet), getStyleSelector = js.Any.fromFunction0(getStyleSelector), getStyleUrl = js.Any.fromFunction0(getStyleUrl), getTimePrimitive = js.Any.fromFunction0(getTimePrimitive), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), getVisibility = js.Any.fromFunction0(getVisibility), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setAbstractView = js.Any.fromFunction1(setAbstractView), setAddress = js.Any.fromFunction1(setAddress), setDescription = js.Any.fromFunction1(setDescription), setName = js.Any.fromFunction1(setName), setOpacity = js.Any.fromFunction1(setOpacity), setOpen = js.Any.fromFunction1(setOpen), setRegion = js.Any.fromFunction1(setRegion), setSnippet = js.Any.fromFunction1(setSnippet), setStyleSelector = js.Any.fromFunction1(setStyleSelector), setStyleUrl = js.Any.fromFunction1(setStyleUrl), setTimePrimitive = js.Any.fromFunction1(setTimePrimitive), setVisibility = js.Any.fromFunction1(setVisibility))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlFeature]
  }
  
  extension [Self <: KmlFeature](x: Self) {
    
    inline def setGetAbstractView(value: () => KmlAbstractView): Self = StObject.set(x, "getAbstractView", js.Any.fromFunction0(value))
    
    inline def setGetAddress(value: () => String): Self = StObject.set(x, "getAddress", js.Any.fromFunction0(value))
    
    inline def setGetBalloonHtml(value: () => String): Self = StObject.set(x, "getBalloonHtml", js.Any.fromFunction0(value))
    
    inline def setGetBalloonHtmlUnsafe(value: () => String): Self = StObject.set(x, "getBalloonHtmlUnsafe", js.Any.fromFunction0(value))
    
    inline def setGetComputedStyle(value: () => KmlStyle): Self = StObject.set(x, "getComputedStyle", js.Any.fromFunction0(value))
    
    inline def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
    
    inline def setGetKml(value: () => String): Self = StObject.set(x, "getKml", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetNextSibling(value: () => KmlFeature): Self = StObject.set(x, "getNextSibling", js.Any.fromFunction0(value))
    
    inline def setGetOpacity(value: () => Double): Self = StObject.set(x, "getOpacity", js.Any.fromFunction0(value))
    
    inline def setGetOpen(value: () => Boolean): Self = StObject.set(x, "getOpen", js.Any.fromFunction0(value))
    
    inline def setGetPreviousSibling(value: () => KmlFeature): Self = StObject.set(x, "getPreviousSibling", js.Any.fromFunction0(value))
    
    inline def setGetRegion(value: () => KmlRegion): Self = StObject.set(x, "getRegion", js.Any.fromFunction0(value))
    
    inline def setGetSnippet(value: () => String): Self = StObject.set(x, "getSnippet", js.Any.fromFunction0(value))
    
    inline def setGetStyleSelector(value: () => KmlStyleSelector): Self = StObject.set(x, "getStyleSelector", js.Any.fromFunction0(value))
    
    inline def setGetStyleUrl(value: () => String): Self = StObject.set(x, "getStyleUrl", js.Any.fromFunction0(value))
    
    inline def setGetTimePrimitive(value: () => KmlTimePrimitive): Self = StObject.set(x, "getTimePrimitive", js.Any.fromFunction0(value))
    
    inline def setGetVisibility(value: () => Boolean): Self = StObject.set(x, "getVisibility", js.Any.fromFunction0(value))
    
    inline def setSetAbstractView(value: KmlAbstractView => Unit): Self = StObject.set(x, "setAbstractView", js.Any.fromFunction1(value))
    
    inline def setSetAddress(value: String => Unit): Self = StObject.set(x, "setAddress", js.Any.fromFunction1(value))
    
    inline def setSetDescription(value: String => Unit): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => Unit): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetOpacity(value: Double => Unit): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1(value))
    
    inline def setSetOpen(value: Boolean => Unit): Self = StObject.set(x, "setOpen", js.Any.fromFunction1(value))
    
    inline def setSetRegion(value: KmlRegion => Unit): Self = StObject.set(x, "setRegion", js.Any.fromFunction1(value))
    
    inline def setSetSnippet(value: String => Unit): Self = StObject.set(x, "setSnippet", js.Any.fromFunction1(value))
    
    inline def setSetStyleSelector(value: KmlStyleSelector => Unit): Self = StObject.set(x, "setStyleSelector", js.Any.fromFunction1(value))
    
    inline def setSetStyleUrl(value: String => Unit): Self = StObject.set(x, "setStyleUrl", js.Any.fromFunction1(value))
    
    inline def setSetTimePrimitive(value: KmlTimePrimitive => Unit): Self = StObject.set(x, "setTimePrimitive", js.Any.fromFunction1(value))
    
    inline def setSetVisibility(value: Boolean => Unit): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1(value))
  }
}
