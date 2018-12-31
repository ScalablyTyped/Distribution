package typings
package googleDashEarthLib.googleNs.earthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.KmlFeature")
@js.native
class KmlFeature () extends KmlObject {
  /**
    * Stores either the lookAt or camera view.
    */
  def getAbstractView(): KmlAbstractView = js.native
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  def getAddress(): java.lang.String = js.native
  /**
    * Retrieves the contents of the feature's <ExtendedData> element.
    * The retrieved contents are scrubbed to remove JavaScript; CSS; and iframe, embed, and object tags. 
    * 
    * It should be safe to insert the resulting HTML into your page without concern for malicious content embedded in the feature data;
    * however any feature depending on CSS or Javascript will not work.
    */
  def getBalloonHtml(): java.lang.String = js.native
  /**
    * Retrieves the contents of the feature's <ExtendedData> element. The contents are not scrubbed.
    * Use this method only if you trust the source of the feature data.
    */
  def getBalloonHtmlUnsafe(): java.lang.String = js.native
  /**
    * Returns the computed style of a feature, merging any inline styles with styles imported from setHref() or a StyleUrl.
    *
    * Note: Modifying the returned KmlStyle object is undefined and not recommended.
    */
  def getComputedStyle(): KmlStyle = js.native
  /**
    * User-supplied text that appears in the description balloon.
    */
  def getDescription(): java.lang.String = js.native
  /**
    * Returns the KML for a feature.
    */
  def getKml(): java.lang.String = js.native
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  def getName(): java.lang.String = js.native
  /**
    * Returns the next sibling node within the container.
    */
  def getNextSibling(): KmlFeature = js.native
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  def getOpacity(): scala.Double = js.native
  /**
    * Default state of left panel.
    */
  def getOpen(): scala.Boolean = js.native
  /**
    * Returns previous sibling node within the container.
    */
  def getPreviousSibling(): KmlFeature = js.native
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def getRegion(): KmlRegion = js.native
  /**
    * Specifies a short description of the feature.
    */
  def getSnippet(): java.lang.String = js.native
  /**
    * The style based on the current mode of the Placemark.
    */
  def getStyleSelector(): KmlStyleSelector = js.native
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  def getStyleUrl(): java.lang.String = js.native
  /**
    * Returns the KmlTimeStamp or KmlTimeSpan object associated with this feature.
    */
  def getTimePrimitive(): KmlTimePrimitive = js.native
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  def getVisibility(): scala.Boolean = js.native
  /**
    * Stores either the lookAt or camera view.
    */
  def setAbstractView(abstractView: KmlAbstractView): scala.Unit = js.native
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  def setAddress(address: java.lang.String): scala.Unit = js.native
  /**
    * User-supplied text that appears in the description balloon.
    */
  def setDescription(description: java.lang.String): scala.Unit = js.native
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  def setName(name: java.lang.String): scala.Unit = js.native
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  /**
    * Default state of left panel.
    */
  def setOpen(open: scala.Boolean): scala.Unit = js.native
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def setRegion(region: KmlRegion): scala.Unit = js.native
  /**
    * Specifies a short description of the feature.
    */
  def setSnippet(snippet: java.lang.String): scala.Unit = js.native
  /**
    * The style based on the current mode of the Placemark.
    */
  def setStyleSelector(styleSelector: KmlStyleSelector): scala.Unit = js.native
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  def setStyleUrl(styleUrl: java.lang.String): scala.Unit = js.native
  /**
    * Attach a KmlTimeStamp or KmlTimeSpan object to this feature.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): scala.Unit = js.native
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  def setVisibility(visibility: scala.Boolean): scala.Unit = js.native
}

