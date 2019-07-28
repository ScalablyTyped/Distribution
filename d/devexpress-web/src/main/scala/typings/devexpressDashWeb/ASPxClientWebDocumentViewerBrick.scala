package typings.devexpressDashWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about a visual brick used to render a report control to construct a document in the Web Document Viewer.
  */
trait ASPxClientWebDocumentViewerBrick extends js.Object {
  /**
    * Provides access to a brick's content.
    * Value: A dictionary that stores content keys along with the corresponding contents.
    */
  var content: StringDictionary[String]
  /**
    * Provides access to a brick's height.
    * Value: An integer value that specifies the brick height.
    */
  var height: Double
  /**
    * Provides access to a brick's left horizontal coordinate.
    * Value: An integer value that specifies the brick's left coordinate.
    */
  var left: Double
  /**
    * Provides access to navigation settings of the current brick.
    * Value: An object that provides a brick's navigation settings.
    */
  var navigation: ASPxClientWebDocumentViewerBrickNavigation
  /**
    * Provides access to a value that specifies whether or not the right-to-left feature is enabled for a brick.
    * Value: true, if the right-to-left feature is enabled; otherwise, false.
    */
  var rtl: Boolean
  /**
    * Provides access to a brick's top vertical coordinate.
    * Value: An integer value that specifies the brick's top coordinate.
    */
  var top: Double
  /**
    * Provides access to a brick's width.
    * Value: An integer value that specifies the brick width.
    */
  var width: Double
}

object ASPxClientWebDocumentViewerBrick {
  @scala.inline
  def apply(
    content: StringDictionary[String],
    height: Double,
    left: Double,
    navigation: ASPxClientWebDocumentViewerBrickNavigation,
    rtl: Boolean,
    top: Double,
    width: Double
  ): ASPxClientWebDocumentViewerBrick = {
    val __obj = js.Dynamic.literal(content = content, height = height, left = left, navigation = navigation, rtl = rtl, top = top, width = width)
  
    __obj.asInstanceOf[ASPxClientWebDocumentViewerBrick]
  }
}

