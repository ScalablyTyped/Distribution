package typings.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlNetworkLink")
@js.native
open class KmlNetworkLink ()
  extends StObject
     with typings.googleEarth.google.earth.KmlNetworkLink {
  
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def click(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user double clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def dblclick(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Test whether this object is the same as another object.
    * Useful for Chrome and Safari, where the comparison a==b sometimes fails for plugin objects.
    */
  /* CompleteClass */
  override def equals(compareTo: typings.googleEarth.google.earth.KmlObject): Boolean = js.native
  
  /**
    * Stores either the lookAt or camera view.
    */
  /* CompleteClass */
  override def getAbstractView(): typings.googleEarth.google.earth.KmlAbstractView = js.native
  
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  /* CompleteClass */
  override def getAddress(): String = js.native
  
  /**
    * Retrieves the contents of the feature's <ExtendedData> element.
    * The retrieved contents are scrubbed to remove JavaScript; CSS; and iframe, embed, and object tags. 
    * 
    * It should be safe to insert the resulting HTML into your page without concern for malicious content embedded in the feature data;
    * however any feature depending on CSS or Javascript will not work.
    */
  /* CompleteClass */
  override def getBalloonHtml(): String = js.native
  
  /**
    * Retrieves the contents of the feature's <ExtendedData> element. The contents are not scrubbed.
    * Use this method only if you trust the source of the feature data.
    */
  /* CompleteClass */
  override def getBalloonHtmlUnsafe(): String = js.native
  
  /**
    * Returns the computed style of a feature, merging any inline styles with styles imported from setHref() or a StyleUrl.
    *
    * Note: Modifying the returned KmlStyle object is undefined and not recommended.
    */
  /* CompleteClass */
  override def getComputedStyle(): typings.googleEarth.google.earth.KmlStyle = js.native
  
  /**
    * User-supplied text that appears in the description balloon.
    */
  /* CompleteClass */
  override def getDescription(): String = js.native
  
  /**
    * A value of 1 causes Google Earth to fly to the view of the LookAt or Camera in the NetworkLinkControl (if it exists).
    */
  /* CompleteClass */
  override def getFlyToView(): Boolean = js.native
  
  /**
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  
  /**
    * Returns the KML for a feature.
    */
  /* CompleteClass */
  override def getKml(): String = js.native
  
  /**
    * Specifies the location of any of the following:
    *
    * * KML files fetched by network links
    * * Image files used by icons in icon styles, ground overlays, and screen overlays
    * * Model files used in the Model object
    */
  /* CompleteClass */
  override def getLink(): typings.googleEarth.google.earth.KmlLink = js.native
  
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  /* CompleteClass */
  override def getName(): String = js.native
  
  /**
    * Returns the next sibling node within the container.
    */
  /* CompleteClass */
  override def getNextSibling(): typings.googleEarth.google.earth.KmlFeature = js.native
  
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  /* CompleteClass */
  override def getOpacity(): Double = js.native
  
  /**
    * Default state of left panel.
    */
  /* CompleteClass */
  override def getOpen(): Boolean = js.native
  
  /**
    * The document that owns the KML object.
    */
  /* CompleteClass */
  override def getOwnerDocument(): typings.googleEarth.google.earth.KmlDocument = js.native
  
  /**
    * The parent node of the KML object.
    */
  /* CompleteClass */
  override def getParentNode(): typings.googleEarth.google.earth.KmlObject = js.native
  
  /**
    * Returns previous sibling node within the container.
    */
  /* CompleteClass */
  override def getPreviousSibling(): typings.googleEarth.google.earth.KmlFeature = js.native
  
  /**
    * A value of 0 leaves the visibility of features within the control of the Google Earth user.
    * Set the value to 1 to reset the visibility of features each time the NetworkLink is refreshed.
    * For example, suppose a Placemark within the linked KML file has visibility set to 1 and the NetworkLink has refreshVisibility set to 1.
    * When the file is first loaded into Google Earth, the user can clear the check box next to the item to turn off display in the 3D viewer.
    * However, when the NetworkLink is refreshed, the Placemark will be made visible again, since its original visibility state was TRUE.
    */
  /* CompleteClass */
  override def getRefreshVisibility(): Boolean = js.native
  
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  /* CompleteClass */
  override def getRegion(): typings.googleEarth.google.earth.KmlRegion = js.native
  
  /**
    * Specifies a short description of the feature.
    */
  /* CompleteClass */
  override def getSnippet(): String = js.native
  
  /**
    * The style based on the current mode of the Placemark.
    */
  /* CompleteClass */
  override def getStyleSelector(): typings.googleEarth.google.earth.KmlStyleSelector = js.native
  
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  /* CompleteClass */
  override def getStyleUrl(): String = js.native
  
  /**
    * Returns the KmlTimeStamp or KmlTimeSpan object associated with this feature.
    */
  /* CompleteClass */
  override def getTimePrimitive(): typings.googleEarth.google.earth.KmlTimePrimitive = js.native
  
  /**
    * The interface name (i.e. 'KmlPlacemark') of the object.
    */
  /* CompleteClass */
  override def getType(): String = js.native
  
  /**
    * The unique URL of the KML object.
    * This is the base address joined with the ID using the # character.
    *
    * For example: http://www.google.com/bar.kml#atlantis
    */
  /* CompleteClass */
  override def getUrl(): String = js.native
  
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  /* CompleteClass */
  override def getVisibility(): Boolean = js.native
  
  /**
    * Triggers an event when the user presses the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mousedown(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse inside Google Earth.
    */
  /* CompleteClass */
  override def mousemove(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse off of the object in Google Earth.
    */
  /* CompleteClass */
  override def mouseout(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse pointer over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseover(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user releases the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseup(event: typings.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Permanently deletes an object, allowing its ID to be reused.
    * Attempting to access the object once it is released will result in an error.
    */
  /* CompleteClass */
  override def release(): Unit = js.native
  
  /**
    * Sets the link, refreshVisibility, and flyToView for the network link.
    */
  /* CompleteClass */
  override def set(link: typings.googleEarth.google.earth.KmlLink, refreshVisibility: Boolean, flyToView: Boolean): Unit = js.native
  
  /**
    * Stores either the lookAt or camera view.
    */
  /* CompleteClass */
  override def setAbstractView(abstractView: typings.googleEarth.google.earth.KmlAbstractView): Unit = js.native
  
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  /* CompleteClass */
  override def setAddress(address: String): Unit = js.native
  
  /**
    * User-supplied text that appears in the description balloon.
    */
  /* CompleteClass */
  override def setDescription(description: String): Unit = js.native
  
  /**
    * A value of 1 causes Google Earth to fly to the view of the LookAt or Camera in the NetworkLinkControl (if it exists).
    */
  /* CompleteClass */
  override def setFlyToView(flyToView: Boolean): Unit = js.native
  
  /**
    * Specifies the location of any of the following:
    *
    * * KML files fetched by network links
    * * Image files used by icons in icon styles, ground overlays, and screen overlays
    * * Model files used in the Model object
    */
  /* CompleteClass */
  override def setLink(link: typings.googleEarth.google.earth.KmlLink): Unit = js.native
  
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  /* CompleteClass */
  override def setName(name: String): Unit = js.native
  
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  /* CompleteClass */
  override def setOpacity(opacity: Double): Unit = js.native
  
  /**
    * Default state of left panel.
    */
  /* CompleteClass */
  override def setOpen(open: Boolean): Unit = js.native
  
  /**
    * A value of 0 leaves the visibility of features within the control of the Google Earth user.
    * Set the value to 1 to reset the visibility of features each time the NetworkLink is refreshed.
    * For example, suppose a Placemark within the linked KML file has visibility set to 1 and the NetworkLink has refreshVisibility set to 1.
    * When the file is first loaded into Google Earth, the user can clear the check box next to the item to turn off display in the 3D viewer.
    * However, when the NetworkLink is refreshed, the Placemark will be made visible again, since its original visibility state was TRUE.
    */
  /* CompleteClass */
  override def setRefreshVisibility(refreshVisibility: Boolean): Unit = js.native
  
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  /* CompleteClass */
  override def setRegion(region: typings.googleEarth.google.earth.KmlRegion): Unit = js.native
  
  /**
    * Specifies a short description of the feature.
    */
  /* CompleteClass */
  override def setSnippet(snippet: String): Unit = js.native
  
  /**
    * The style based on the current mode of the Placemark.
    */
  /* CompleteClass */
  override def setStyleSelector(styleSelector: typings.googleEarth.google.earth.KmlStyleSelector): Unit = js.native
  
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  /* CompleteClass */
  override def setStyleUrl(styleUrl: String): Unit = js.native
  
  /**
    * Attach a KmlTimeStamp or KmlTimeSpan object to this feature.
    */
  /* CompleteClass */
  override def setTimePrimitive(timePrimitive: typings.googleEarth.google.earth.KmlTimePrimitive): Unit = js.native
  
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  /* CompleteClass */
  override def setVisibility(visibility: Boolean): Unit = js.native
}
