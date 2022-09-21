package typings.googleEarth.global.google.earth

import typings.googleEarth.google.earth.KmlColorModeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlIconStyle")
@js.native
open class KmlIconStyle ()
  extends StObject
     with typings.googleEarth.google.earth.KmlIconStyle {
  
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
    * Color and opacity (alpha) values.
    */
  /* CompleteClass */
  override def getColor(): typings.googleEarth.google.earth.KmlColor = js.native
  
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  /* CompleteClass */
  override def getColorMode(): KmlColorModeEnum = js.native
  
  /**
    * The direction that icons are set to point, clockwise, and in degrees.
    */
  /* CompleteClass */
  override def getHeading(): Double = js.native
  
  /**
    * Specifies the position within the Icon that is anchored to the point specified in the placemark.
    * The x and y values can be specified in three different ways: as pixels, as fractions of the icon, or as inset pixels, which is an offset in pixels from the upper right corner of the icon.
    * The x and y positions can be specified in different ways.
    * For example, x can be in pixels and y can be a fraction.
    * The origin of the coordinate system is in the lower left corner of the icon.
    */
  /* CompleteClass */
  override def getHotSpot(): typings.googleEarth.google.earth.KmlVec2 = js.native
  
  /**
    * A custom Icon. In KmlIconStyle, the only child element of KmlIcon is href and href is an HTTP address or a local file specification used to load an icon.
    */
  /* CompleteClass */
  override def getIcon(): typings.googleEarth.google.earth.KmlIcon = js.native
  
  /**
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  
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
    * Resizes the icon.
    */
  /* CompleteClass */
  override def getScale(): Double = js.native
  
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
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  /* CompleteClass */
  override def setColorMode(colorMode: KmlColorModeEnum): Unit = js.native
  
  /**
    * The direction that icons are set to point, clockwise, and in degrees.
    */
  /* CompleteClass */
  override def setHeading(heading: Double): Unit = js.native
  
  /**
    * A custom Icon. In KmlIconStyle, the only child element of KmlIcon is href and href is an HTTP address or a local file specification used to load an icon.
    */
  /* CompleteClass */
  override def setIcon(icon: typings.googleEarth.google.earth.KmlIcon): Unit = js.native
  
  /**
    * Resizes the icon.
    */
  /* CompleteClass */
  override def setScale(scale: Double): Unit = js.native
}
