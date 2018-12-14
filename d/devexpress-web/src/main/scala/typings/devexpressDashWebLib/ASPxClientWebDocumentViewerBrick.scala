package typings
package devexpressDashWebLib

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
  var content: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
       * Provides access to a brick's height.
       * Value: An integer value that specifies the brick height.
       */
  var height: scala.Double
  /**
       * Provides access to a brick's left horizontal coordinate.
       * Value: An integer value that specifies the brick's left coordinate.
       */
  var left: scala.Double
  /**
       * Provides access to navigation settings of the current brick.
       * Value: An object that provides a brick's navigation settings.
       */
  var navigation: ASPxClientWebDocumentViewerBrickNavigation
  /**
       * Provides access to a value that specifies whether or not the right-to-left feature is enabled for a brick.
       * Value: true, if the right-to-left feature is enabled; otherwise, false.
       */
  var rtl: scala.Boolean
  /**
       * Provides access to a brick's top vertical coordinate.
       * Value: An integer value that specifies the brick's top coordinate.
       */
  var top: scala.Double
  /**
       * Provides access to a brick's width.
       * Value: An integer value that specifies the brick width.
       */
  var width: scala.Double
}

