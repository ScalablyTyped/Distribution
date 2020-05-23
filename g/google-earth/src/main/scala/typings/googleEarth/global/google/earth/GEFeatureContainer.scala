package typings.googleEarth.global.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.earth.GEFeatureContainer")
@js.native
class GEFeatureContainer ()
  extends typings.googleEarth.google.earth.GESchemaObjectContainer[typings.googleEarth.google.earth.KmlFeature] {
  /**
    * Adds a node to the end of the list of children of a specified feature.
    * Returns the appended object.
    */
  /* CompleteClass */
  override def appendChild(`object`: typings.googleEarth.google.earth.KmlFeature): Unit = js.native
  /**
    * List of features (for KmlContainer), or list of features, styles, and schemas (for KmlDocument).
    * Returns true if there are any child nodes.
    */
  /* CompleteClass */
  override def getChildNodes(): typings.googleEarth.google.earth.KmlObjectList[typings.googleEarth.google.earth.KmlFeature] = js.native
  /**
    * First child in the list of objects.
    */
  /* CompleteClass */
  override def getFirstChild(): typings.googleEarth.google.earth.KmlFeature = js.native
  /**
    * Last child in the list of objects.
    */
  /* CompleteClass */
  override def getLastChild(): typings.googleEarth.google.earth.KmlFeature = js.native
  /**
    * Returns true if the container is not empty.
    */
  /* CompleteClass */
  override def hasChildNodes(): Boolean = js.native
  /**
    * Inserts a child before the referenced child in the list of objects.
    */
  /* CompleteClass */
  override def insertBefore(
    newChild: typings.googleEarth.google.earth.KmlFeature,
    refChild: typings.googleEarth.google.earth.KmlFeature
  ): Unit = js.native
  /**
    * Removes a node from the list of children of a specified object.
    */
  /* CompleteClass */
  override def removeChild(oldChild: typings.googleEarth.google.earth.KmlFeature): Unit = js.native
  /**
    * Replaces existing child in the list of features.
    * Returns the old child.
    */
  /* CompleteClass */
  override def replaceChild(
    newChild: typings.googleEarth.google.earth.KmlFeature,
    oldChild: typings.googleEarth.google.earth.KmlFeature
  ): Unit = js.native
}

